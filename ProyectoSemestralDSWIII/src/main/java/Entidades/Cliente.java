/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Cliente {
    private String cedula;
    private String nombre;
    private String fecha_nacimiento;
    private String genero;
    private String correo;
    private String telefono;
    private String provincia;
    private String ciudad;
    private String corregimiento;
    private String tipo_cliente;
    
    public Cliente(String cedula, String nombre, String fecha_nacimiento, String genero, String correo, String telefono, String provincia, String ciudad, String corregimiento, String tipo_cliente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.corregimiento = corregimiento;
        this.tipo_cliente = tipo_cliente;
    }
    
    public Cliente() {
        cedula = "";
        nombre = "";
        fecha_nacimiento = "";
        genero = "";
        correo = "";
        telefono = "";
        provincia = "";
        ciudad = "";
        corregimiento = "";
        tipo_cliente = "";
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    /**
     *
     * @return
     */
    
    public double getDescuento() {
        if ("VIP".equals(tipo_cliente)){
            return 0.2; //Descuento del 20%
        } else if ("Frecuente".equals(tipo_cliente)){
            return 0.1; //Descuento del 10%
        } else {
            return 0.0; //Sin descuento
        }
    }    
}
