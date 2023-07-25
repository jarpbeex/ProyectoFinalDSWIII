/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author laure
 */
public class ClienteVIP extends Cliente{
     private int numeroMembresia;
    private double cantidadProm;
    private double cantidadCredito;
    private int descuento;
    private String asesorAsignado;
    private String productosFrecuentes;
    
    
    public ClienteVIP(int id, String nombre, String fecha_nac, String genero, String cedula, String correo, String telefono, String provincia, String ciudad, String corregimiento, int numeroMembresia, double cantidadProm, double cantidadCredito, int descuento, String asesorAsignado, String productosFrecuentes){
        this.numeroMembresia = numeroMembresia;
        this.cantidadProm = cantidadProm;
        this.cantidadCredito = cantidadCredito;
        this.descuento = descuento;
        this.asesorAsignado = asesorAsignado;
        this.productosFrecuentes = productosFrecuentes;
    }


        public int getNumeroMembresia() {
        return numeroMembresia;
    }

    public void setNumeroMembresia(int numeroMembresia) {
        this.numeroMembresia = numeroMembresia;
    }

    public double getCantidadProm() {
        return cantidadProm;
    }

    public void setCantidadProm(double cantidadCredito) {
        this.cantidadProm = cantidadCredito;
    }
    
    public double getCantidadCredito(){
        return cantidadCredito;
    }
    
    public void setCantidadCredito(double cantidadCredito){
        this.cantidadCredito = cantidadCredito;
    }
    
    public int getDescuento(){
        return descuento;
    }
    
    public void setDescuento(int descuento){
        this.descuento = descuento;
    }

    public String getAsesorAsignado() {
        return asesorAsignado;
    }

    public void setAsesorAsignado(String asesorAsignado) {
        this.asesorAsignado = asesorAsignado;
    }
    
    public String getProductosFrecuentes(){
        return productosFrecuentes;
    }
    
    public void setProductosFrecuentes(String productosFrecuentes){
        this.productosFrecuentes = productosFrecuentes;
    }
}
