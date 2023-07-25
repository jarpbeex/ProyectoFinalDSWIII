/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author laure
 */
public class ClienteFrecuente extends Cliente{
     private int numeroMembresia;
    private double cantidadPromedioGastada;
    private String productosFrecuentes;
    private int descuento;

    public ClienteFrecuente(int id, String nombre, String fechaNacimiento, String genero, String cedula, String correo, String telefono, String provincia, String ciudad, String corregimiento, int numeroMembresia, double cantidadPromedioGastada, String productosFrecuentes, int descuento) {
        this.numeroMembresia = numeroMembresia;
        this.cantidadPromedioGastada = cantidadPromedioGastada;
        this.productosFrecuentes = productosFrecuentes;
        this.descuento = descuento;
    }
    
    public int getNumeroMembresia(){
        return numeroMembresia;
    }
    
    public void setNumeroMembresia(int numeroMembresia){
        this.numeroMembresia = numeroMembresia;
    }

    public double getCantidadPromedioGastada() {
        return cantidadPromedioGastada;
    }

    public void setCantidadPromedioGastada(double cantidadPromedioGastada) {
        this.cantidadPromedioGastada = cantidadPromedioGastada;
    }

    public String getProductosFrecuentes() {
        return productosFrecuentes;
    }

    public void setProductosFrecuentes(String productosFrecuentes) {
        this.productosFrecuentes = productosFrecuentes;
    }
    
    public int getDescuento(){
        return descuento;
    }
    
    public void setDescuento(int descuento){
        this.descuento = descuento;
    }
}

