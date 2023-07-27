/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frames.Panels;

import Entidades.Cliente;
import Modelos.CrearDatos;
import Modelos.MostrarDatos;

/**
 *
 * @author josue
 */
public class clientesBusqueda extends javax.swing.JPanel {

    /**
     * Creates new form panelBusqueda
     */
    public clientesBusqueda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        seleccionBusqueda = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));

        tablaBusqueda.setBackground(new java.awt.Color(153, 153, 153));
        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaBusqueda);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });

        seleccionBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por cedula", "Por nombre", "Por ciudad", "Por tipo de cliente" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(botonBuscar)
                .addGap(27, 27, 27)
                .addComponent(seleccionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoBuscar)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String decision = seleccionBusqueda.getSelectedItem().toString();
        if (decision == "Por cedula"){
            CrearDatos.buscarXCedula(campoBuscar.getText(), tablaBusqueda);
        }if (decision == "Por nombre"){
            CrearDatos.buscarXNombre(campoBuscar.getText(), tablaBusqueda);
        }if (decision == "Por ciudad"){
            CrearDatos.buscarXCiudad(campoBuscar.getText(), tablaBusqueda);
        }else if (decision == "Por tipo de cliente"){
            CrearDatos.buscarXTipoCliente(campoBuscar.getText(), tablaBusqueda);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campoBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccionBusqueda;
    private javax.swing.JTable tablaBusqueda;
    // End of variables declaration//GEN-END:variables
}
