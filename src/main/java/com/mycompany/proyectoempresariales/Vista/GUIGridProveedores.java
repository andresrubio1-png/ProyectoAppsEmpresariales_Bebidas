/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoempresariales.Vista;

import com.mycompany.proyectoempresariales.Modelo.Proveedor;
import com.mycompany.proyectoempresariales.Controlador.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ISABELLA
 */
public class GUIGridProveedores extends javax.swing.JFrame implements IGuiCambiable {

    private IGuiService guiService = GuiService.getInstance();
    private IBebidaService bebidaService = BebidaService.getInstance();
    private IProveedorService proveedorService = ProveedorService.getInstance();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUIGridProveedores.class.getName());

    /**
     * Creates new form GUIGridProveedores
     */
    public GUIGridProveedores() {
        initComponents();
        setLocationRelativeTo(this);
        guiService.registrarGUI(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Proveedores");

        tblProveedores.setBackground(new java.awt.Color(255, 255, 239));
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Telefono", "Estado", "Cantidad Gaseosas"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(this::btnListarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(238, 238, 238))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnListar)
                                .addGap(290, 290, 290))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        getValues();
    }//GEN-LAST:event_btnListarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        guiService.eliminarGUI(this);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedores;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cambio() {
        getValues();
    }

    private void getValues() {
        List<Proveedor> lista = proveedorService.listarProveedores();
        DefaultTableModel modelo = (DefaultTableModel) tblProveedores.getModel();
        modelo.setRowCount(0);
        for (Proveedor p : lista) {
            modelo.addRow(new Object[]{
            p.getCodigo(),
            p.getNombre(),
            p.getTelefono(),
            p.getEstado(),
            p.getGaseosas() != null ? p.getGaseosas().size() : 0
            });
        }
    }
}
