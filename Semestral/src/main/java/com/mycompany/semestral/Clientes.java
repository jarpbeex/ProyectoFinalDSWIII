
package com.mycompany.semestral;


public class Clientes {
    
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String genero;
    private String correo;
    private String telefono;
    private String provincia;
    private String ciudad;
    private String corregimiento;
    private String tipoCliente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorregimiento() {
        return corregimiento;
    }

    public void setCorregimiento(String corregimiento) {
        this.corregimiento = corregimiento;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Clientes(String nombre, String cedula, String fechaNacimiento, String genero, String correo, String telefono, String provincia, String ciudad, String corregimiento, String tipoCliente) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.corregimiento = corregimiento;
        this.tipoCliente = tipoCliente;
    }
    public Clientes() {
        this.nombre ="";
        this.cedula = "";
        this.fechaNacimiento = "";
        this.genero = "";
        this.correo = "";
        this.telefono = "";
        this.provincia = "";
        this.ciudad = "";
        this.corregimiento = "";
        this.tipoCliente = ""; 
    }
    
}