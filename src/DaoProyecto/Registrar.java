
package DAOProyecto;

import java.sql.Date;

public class Registrar {
    private int id_tipo_documento;
    private int id_usuario;
    private String numero_documento;
    private String nombre_usuario;
    private String apellido_paterno_usuario;
    private String apellido_materno_usuario;
    private int telefono;
    private String fecha_nacimiento;
    private String correo;
    private String contraseña;
    private String sexo;

    public Registrar() {
        //Constructor vacio
    }

    public Registrar(int id_tipo_documento, int id_usuario, String numero_documento, String nombre_usuario, String apellido_paterno_usuario, String apellido_materno_usuario, int telefono, String fecha_nacimiento, String correo, String contraseña, String sexo) {
        this.id_tipo_documento = id_tipo_documento;
        this.id_usuario = id_usuario;
        this.numero_documento = numero_documento;
        this.nombre_usuario = nombre_usuario;
        this.apellido_paterno_usuario = apellido_paterno_usuario;
        this.apellido_materno_usuario = apellido_materno_usuario;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.contraseña = contraseña;
        this.sexo = sexo;  
    }
 
    public int getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(int id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_paterno_usuario() {
        return apellido_paterno_usuario;
    }

    public void setApellido_paterno_usuario(String apellido_paterno_usuario) {
        this.apellido_paterno_usuario = apellido_paterno_usuario;
    }

    public String getApellido_materno_usuario() {
        return apellido_materno_usuario;
    }

    public void setApellido_materno_usuario(String apellido_materno_usuario) {
        this.apellido_materno_usuario = apellido_materno_usuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFecha_nacimiento(Date sqlDate) {
        
    }

}
