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
       public void limpiarCampos(){
        
        jTextcanti.setText("");
        jTextfecha.setText("");
        jTextAreadescrip.setText("");
       



    }
        public void obtenerDatos(){
        List<Devoluciones> devoluciones=new DAODevoluciones().ObtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String[] columnas={"ID","Descripcion","Cantidad", "Fecha","ID producto"};
        
        modelo.setColumnIdentifiers(columnas);
        for (Devoluciones devo:devoluciones){
            
            String [] renglon={Integer.toString(devo.getID_devolu()),devo.getDescrip(),Float.toString(devo.getCanti()), 
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreadescrip = new javax.swing.JTextArea();
        jTextproveedor = new javax.swing.JTextField();
        jButtonproveedor = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledevolucion = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextfecha = new javax.swing.JTextField();
        jTextcanti = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextiddevolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextiddevoluActionPerformed(evt);
            }
        });
        jPanel1.add(jTextiddevolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, 30));

        jTextidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidproductoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 160, 30));

        jTextAreadescrip.setColumns(20);
        jTextAreadescrip.setRows(5);
        jScrollPane2.setViewportView(jTextAreadescrip);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        jTextproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextproveedorActionPerformed(evt);
            }
        });
        jPanel1.add(jTextproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 160, 30));

        jButtonproveedor.setText("Buscar prod");
        jButtonproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonproveedorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 40, -1));

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 840, 150));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID_Producto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proveedores:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Descripcion:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        jPanel1.add(jTextfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));
        jPanel1.add(jTextcanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura-madera-en-negro_2560x1600_xtrafondos.com.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextiddevoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextiddevoluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextiddevoluActionPerformed

    private void jTextidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidproductoActionPerformed

    private void jTextproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextproveedorActionPerformed

    private void jButtonproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonproveedorActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
             String descriP=jTextAreadescrip.getText();
             String fechA=jTextfecha.getText();
             String cantI=jTextcanti.getText();
             String id_produc =jTextidproducto.getText();
             
             
        if (cantI.contentEquals("")||fechA.contentEquals("")||
            descriP.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");
        }else {
            try{
                Float Canti = Float.valueOf(cantI);
                Date fecH = Date.valueOf(fechA);
                int id_producto=Integer.parseInt(id_produc);
                
                Devoluciones dv =new DAODevoluciones().Insertar(descriP, Canti, fecH, id_producto);
                JOptionPane.showMessageDialog(rootPane, "Registro Agregado");
            }catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego al registro");
            }
        }
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonproveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabledevolucion;
    private javax.swing.JTextArea jTextAreadescrip;
    private javax.swing.JTextField jTextcanti;
    private javax.swing.JTextField jTextfecha;
    private javax.swing.JTextField jTextiddevolu;
    private javax.swing.JTextField jTextidproducto;
    private javax.swing.JTextField jTextproveedor;
    // End of variables declaration//GEN-END:variables
}
