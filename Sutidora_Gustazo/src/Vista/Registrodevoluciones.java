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
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledevolucion = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextfecha = new javax.swing.JTextField();
        jTextcanti = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextiddevolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextiddevoluActionPerformed(evt);
            }
        });
        jPanel1.add(jTextiddevolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 220, 30));

        jTextidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidproductoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 220, 30));

        jTextAreadescrip.setColumns(20);
        jTextAreadescrip.setRows(5);
        jScrollPane2.setViewportView(jTextAreadescrip);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, 90));

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 100, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 840, 150));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/business_packages_boxes_products_sellingproducts_thereport_2344.png"))); // NOI18N
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 40));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel11.setText("ID_Producto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/time_date_may_19653.png"))); // NOI18N
        jLabel12.setText("Fecha:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/descripcion.png"))); // NOI18N
        jLabel13.setText("Descripcion:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 40));
        jPanel1.add(jTextfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 220, 30));
        jPanel1.add(jTextcanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 220, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/3440901-box-carton-delivery-ecommerce-package-return-shipping_107530.png"))); // NOI18N
        jLabel3.setText("Devoluciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabledevolucion;
    private javax.swing.JTextArea jTextAreadescrip;
    private javax.swing.JTextField jTextcanti;
    private javax.swing.JTextField jTextfecha;
    private javax.swing.JTextField jTextiddevolu;
    private javax.swing.JTextField jTextidproducto;
    // End of variables declaration//GEN-END:variables
}
