/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author laure
 */
public class Producto {
    private String nombre;
    private int codigoBarras;
    private double precioEstandar;
    private double precioDescuento;

    public Producto(String nombre, int codigoBarras, double precioEstandar, double precioDescuento) {
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precioEstandar = precioEstandar;
        this.precioDescuento = precioDescuento;
    }
    
    private String getNombre(){
        return nombre;
    }
    
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    private int getCodigoBarras(){
        return codigoBarras;
    }
    
    private void setCodigoBarras(int codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    
    private double getPrecioEstandar(){
        return precioEstandar;
    }
    
    private void setPrecioEstandar(double precioEstandar){
        this.precioEstandar = precioEstandar;
    }
    
    private double getPrecioDescuento(){
        return precioDescuento;
    }
    
    private void setPrecioDescuento(double precioDescuento){
        this.precioDescuento = precioDescuento;
    }
}


