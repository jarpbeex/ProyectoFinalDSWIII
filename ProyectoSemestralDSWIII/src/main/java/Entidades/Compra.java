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
    private String codigoCompra;
    private String cedula;
    private int productosComprados;
    private double costoTotal;
    private double itbmsCobrado;

    public Compra(String codigoCompra, String cedula, int productosComprados, double costoTotal, double itbmsCobrado) {
        this.codigoCompra = codigoCompra;
        this.cedula = cedula;
        this.productosComprados = productosComprados;
        this.costoTotal = costoTotal;
        this.itbmsCobrado = itbmsCobrado;
    }
    
    public Compra(){
        codigoCompra = "";
        cedula = "";
        productosComprados = 0;
        costoTotal = 0.0;
        itbmsCobrado = 0.0;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String numeroCompra) {
        this.codigoCompra = numeroCompra;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(int productosComprados) {
        this.productosComprados = productosComprados;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getItbmsCobrado() {
        return itbmsCobrado;
    }

    public void setItbmsCobrado(double itbmsCobrado) {
        this.itbmsCobrado = itbmsCobrado;
    }
    
    
    
}

