package DAOInterfaces;

import DAO.ConexionOracle;
import DAOProyecto.Registrar;
import static DaoProyecto.Main.content;
import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOcinemaImpl extends ConexionOracle implements DAOcinema {

@Override
public boolean validarCredenciales(String correo, String contraseña) {
    String query = "SELECT * FROM usuario WHERE correo = ? AND contraseña = ?";
    boolean resultado = false;

    try (Connection con = this.conectar();
         PreparedStatement ps = con.prepareStatement(query)) {
        ps.setString(1, correo);
        ps.setString(2, contraseña);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                resultado = true;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error en la consulta SQL: " + e.getMessage());
    }

    return resultado;
}

@Override
public boolean insertarUsuario(Registrar iniciar) throws SQLException {
    String query = "{call crearUsuario(?,?,?,?,?,?,?,?,?,?)}";

    try (Connection con = this.conectar();
         CallableStatement cs = con.prepareCall(query)) {
         
        cs.setInt(1, iniciar.getId_tipo_documento());
        cs.setString(2, iniciar.getNumero_documento());
        cs.setString(3, iniciar.getNombre_usuario());
        cs.setString(4, iniciar.getApellido_paterno_usuario());
        cs.setString(5, iniciar.getApellido_materno_usuario());
        cs.setInt(6, iniciar.getTelefono());
        cs.setDate(7, Date.valueOf(iniciar.getFecha_nacimiento()));
        cs.setString(8, iniciar.getCorreo());
        cs.setString(9, iniciar.getContraseña());
        cs.setString(10, iniciar.getSexo());

        JOptionPane.showMessageDialog(null, "Llamando al procedimiento almacenado");
        int resultado = cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Resultado de la ejecución: " + resultado);

        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear el usuario.");
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al crear usuario: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
 }   

@Override
public void ShowPanel(JPanel p) {
        p.setSize(750, 640);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

@Override
public void GetUsers(JTable visor) throws SQLException {
        try {
            String sql = "SELECT * FROM Usuario ORDER BY id_usuario";
            ConexionOracle con = new ConexionOracle();
            Connection conexion = con.conectar();
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nro. DNI");
            modelo.addColumn("Nombre");
            modelo.addColumn("A. Paterno");
            modelo.addColumn("A. Materno");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Fecha Nac.");
            modelo.addColumn("Correo");
            modelo.addColumn("Contraseña");
            modelo.addColumn("Sexo");
            visor.setModel(modelo);
            
            String[] datos = new String[10];
            
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                modelo.addRow(datos);
            }
            
            rs.close();
            st.close();
            con.desconectar();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
   }
}