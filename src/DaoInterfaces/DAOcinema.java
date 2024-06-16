package DAOInterfaces;
import DAOProyecto.Registrar;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JTable;

public interface DAOcinema {   
    boolean insertarUsuario(Registrar iniciar) throws SQLException;
    boolean validarCredenciales(String correo, String contraseña) throws SQLException;
    public void ShowPanel(JPanel p) ;
    public void GetUsers(JTable visor) throws SQLException;
}