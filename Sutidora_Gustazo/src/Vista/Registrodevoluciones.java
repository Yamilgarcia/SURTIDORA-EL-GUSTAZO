/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class Registrodevoluciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrodevoluciones
     */
    public Registrodevoluciones() {
        initComponents();
        jTextiddevolu.setEnabled(false);
    }

    public void limpiarCampos() {

        jTextcanti.setText("");
        jTextfecha.setText("");
        jTextAreaDescripcion.setText("");

    }

    public void obtenerDatos() {
        List<Devoluciones> devoluciones = new DAODevoluciones().ObtenerDatos();

        DefaultTableModel modelo = new DefaultTableModel();

        String[] columnas = {"ID", "Descripcion", "Cantidad", "Fecha", "ID producto"};

        modelo.setColumnIdentifiers(columnas);
        for (Devoluciones devo : devoluciones) {

            String[] renglon = {Integer.toString(devo.getID_devolu()), devo.getDescrip(), Float.toString(devo.getCanti()),
                devo.getFecha().toString(),
                Integer.toString(devo.getID_producto())};

            modelo.addRow(renglon);

        }

        jTabledevolucion.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextiddevolu = new javax.swing.JTextField();
        jTextidproducto = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledevolucion = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jTextfecha = new javax.swing.JTextField();
        jTextcanti = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextiddevolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextiddevoluActionPerformed(evt);
            }
        });
        jPanel1.add(jTextiddevolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, 30));

        jTextidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidproductoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 180, 30));

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 110, 40));

        jTabledevolucion.setBackground(new java.awt.Color(204, 204, 204));
        jTabledevolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTabledevolucion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 780, 150));

        jButtonEditar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEditar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 110, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/business_packages_boxes_products_sellingproducts_thereport_2344.png"))); // NOI18N
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 40));

        jButtonActualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 110, 40));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel11.setText("ID_Producto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/time_date_may_19653.png"))); // NOI18N
        jLabel12.setText("Fecha:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/descripcion.png"))); // NOI18N
        jLabel13.setText("Descripcion:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 40));

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jPanel1.add(jTextAreaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 180, -1));
        jPanel1.add(jTextfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 180, 30));
        jPanel1.add(jTextcanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/3440901-box-carton-delivery-ecommerce-package-return-shipping_107530.png"))); // NOI18N
        jLabel3.setText("Devoluciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 400));
        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextiddevoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextiddevoluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextiddevoluActionPerformed

    private void jTextidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidproductoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String descriP = jTextAreaDescripcion.getText();
        String fechA = jTextfecha.getText();
        String cantI = jTextcanti.getText();
        String id_produc = jTextidproducto.getText();

        if (cantI.contentEquals("") || fechA.contentEquals("")
                || descriP.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");
        } else {
            try {
                Float Canti = Float.valueOf(cantI);
                Date fecH = Date.valueOf(fechA);
                int id_producto = Integer.parseInt(id_produc);

                Devoluciones dv = new DAODevoluciones().Insertar(descriP, Canti, fecH, id_producto);
                JOptionPane.showMessageDialog(rootPane, "Registro Agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego al registro");
            }
        }
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int fila = this.jTabledevolucion.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");
        } else {
            try {
                int idDev = Integer.parseInt((String) this.jTabledevolucion.getValueAt(fila, 0).toString());
                String descripp = (String) this.jTabledevolucion.getValueAt(fila, 1);
                float cant = Float.parseFloat((String) this.jTabledevolucion.getValueAt(fila, 2).toString());
                Date fechh = Date.valueOf((String) this.jTabledevolucion.getValueAt(fila, 3).toString());
                int idprod = Integer.parseInt((String) this.jTabledevolucion.getValueAt(fila, 4).toString());

                jTextiddevolu.setText("" + idDev);
                jTextAreaDescripcion.setText("" + descripp);
                jTextcanti.setText("" + cant);
                jTextfecha.setText(String.valueOf(fechh));
                jTextidproducto.setText("" + idprod);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarDevoluciones();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    public void actualizarDevoluciones() {
        int idDev = Integer.parseInt(this.jTextiddevolu.getText());
        
        float cant = Float.parseFloat(this.jTextcanti.getText());
        Date fechh = Date.valueOf(this.jTextfecha.getText());
        String descripp = this.jTextAreaDescripcion.getText();
        int idprod = Integer.parseInt(this.jTextidproducto.getText());

        DAODevoluciones dao = new DAODevoluciones();
        int Devoll = dao.Actualizar(idDev, descripp, cant, fechh, idprod);
        if (Devoll == 1) {
            JOptionPane.showMessageDialog(rootPane, "¡Registro Actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡OCURRIO UN ERROR!");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabledevolucion;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextcanti;
    private javax.swing.JTextField jTextfecha;
    private javax.swing.JTextField jTextiddevolu;
    private javax.swing.JTextField jTextidproducto;
    // End of variables declaration//GEN-END:variables
}
