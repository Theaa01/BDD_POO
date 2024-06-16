package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionOracle {
    
    //Variables de conexion
    private final String DRIVER="oracle.jdbc.OracleDriver";
    private final String URL="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private final String USER="CONEXION_CINE";
    private final String PASSWORD="123";

    public Connection cadena; 
    
    public ConexionOracle(){
        this.cadena = null;
    }
    
    public Connection conectar() throws SQLException{
        
        try{            
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL,USER,PASSWORD);
            
            
        }catch(ClassNotFoundException | SQLException e){            
            JOptionPane.showMessageDialog(null,"Problemas de Conexion");
            System.exit(0);
        }        
        return this.cadena;        
    }
    
    public void desconectar(){
        try{
            this.cadena.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Conexion Terminada");
        }        
    }    
    
}