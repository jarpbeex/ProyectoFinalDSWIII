/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author laure
 */
public class Compra {
    private int numeroCompra;
    private Cliente cliente;
    private int productosComprados;
    private double costoTotal;
    private double itbmsCobrado;
    
    
    public Compra(int numeroCompra, Cliente cliente, int productosComprados, double costoTotal, double itbmsCobrado){
        this.numeroCompra = numeroCompra;
        this.cliente = cliente;
        this.productosComprados = productosComprados;
        this.costoTotal = costoTotal;
        this.itbmsCobrado = itbmsCobrado;
    } 
    
    
    public int getNumeroCompra(){
        return numeroCompra;
    }
    
    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }    
    
    public Cliente getCliente (){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public int getProductosComprados (){
        return productosComprados;
    }
    
    public void setProductosComprados(int productosComprados){
        this.productosComprados = productosComprados;
    }
    
    public double getCostoTotal (){
        return costoTotal;
    }
    
    public void setCostoTotal(double costoTotal){
        this.costoTotal = costoTotal;
    }
    
    public double getItbmsCobrado (){
        return itbmsCobrado;
    }
    
    public void setItbmsCobrado(double itbmsCobrado){
        this.itbmsCobrado = itbmsCobrado;
    }
}

