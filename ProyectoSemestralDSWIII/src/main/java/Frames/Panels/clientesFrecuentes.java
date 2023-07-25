/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frames.Panels;

import Entidades.Cliente;
import Entidades.Producto;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class clientesFrecuentes extends javax.swing.JPanel {
    
    private List<Producto> obtenerProductosFrecuentes(){
        List<Producto> productosFrecuentes = new ArrayList<>();
        
        productosFrecuentes.add(new Producto("Mogu Mogu", "1234567890", 2.50, 1.25));
        productosFrecuentes.add(new Producto("Lasagna", "0987654321", 7.00, 5.00));
        
        return productosFrecuentes;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(525, 429));

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Productos Frecuentes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Descuento por cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream:ProyectoSemestralDSWIII/src/main/java/Frames/clientesFrecuentes.java
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addGap(91, 91, 91))
=======
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(83, 83, 83))
>>>>>>> Stashed changes:ProyectoSemestralDSWIII/src/main/java/Frames/Panels/clientesFrecuentes.java
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream:ProyectoSemestralDSWIII/src/main/java/Frames/clientesFrecuentes.java
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        List<Producto> productosFrecuentes = obtenerProductosFrecuentes();
        
        for (Producto producto : productosFrecuentes){
            Object[] rowData = {producto.getNombre(), producto.getCodigoBarras(), producto.getPrecioEstándar(), producto.getPrecioDescuento()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        List<Cliente> clientesConDescuento = obtenerClientesConDescuento();
        for (Cliente cliente : clientesConDescuento) {
           Object[] rowData = {cliente.getNombre(), cliente.getDescuento()};
            model.addRow(rowData);
        }
=======
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
>>>>>>> Stashed changes:ProyectoSemestralDSWIII/src/main/java/Frames/Panels/clientesFrecuentes.java
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private static class Producto {

        private String nombre;
        private int codigoBarras;
        private double precioEstandar;
        private double precioDescuento;

        public Producto(String mogu_Mogu, String string, double par, double par1) {
        }

        private String getNombre() {
            return nombre;
        }
        
        private void setNombre(String nombre){
            this.nombre = nombre;
        }

        private int getCodigoBarras() {
            return codigoBarras;
        }
        
        private void setCodigoBarras(int codigoBarras){
            this.codigoBarras = codigoBarras;
        }

        private double getPrecioEstándar() {
            return precioEstandar;
        }
        
        private void setPrecioEstandar(double precioEstandar){
            this.precioEstandar = precioEstandar;
        }

        private double getPrecioDescuento() {
            return precioDescuento;
        }
        
        private void setPrecioDescuento(double precioDescuento){
            this.precioDescuento = precioDescuento;
        }
    }
}
