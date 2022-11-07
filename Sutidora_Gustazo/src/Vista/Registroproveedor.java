/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cris
 */
public class Registroproveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registroproveedor
     */
    public Registroproveedor() {
        initComponents();

    }

    public void limpiarCampos() {

        jTextRuc.setText("");
        jTextNomb.setText("");
        jTextdirec.setText("");
        jTextnumcelu.setText("");

    }

    public void obtenerDatos() {

        List<Proveedores> proved = new DAOProveedores().ObtenerDatos();

        DefaultTableModel modelo = new DefaultTableModel();

        String[] columnas = {"RUC", "Nombre", "Dirección", "Teléfono"};

        modelo.setColumnIdentifiers(columnas);
        for (Proveedores provedo : proved) {

            String[] renglon = {provedo.getRuc(), provedo.getNomb(), provedo.getDirec(), provedo.getNumcelu()};
            modelo.addRow(renglon);

        }

        jTableproveedores.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextNomb = new javax.swing.JTextField();
        jTextnumcelu = new javax.swing.JTextField();
        jTextdirec = new javax.swing.JTextField();
        jTextRuc = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableproveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Proveedor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RUC:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefono:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jTextNomb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 210, -1));

        jTextnumcelu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextnumcelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 210, -1));

        jTextdirec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 210, -1));

        jTextRuc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, -1));

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 110, 40));

        jTableproveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableproveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 840, 150));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        String ruc = jTextRuc.getText();
        String nombr = jTextNomb.getText();
        String direcci = jTextdirec.getText();
        String numcelur = jTextnumcelu.getText();

        if (ruc.contentEquals("") || nombr.contentEquals("") || direcci.contentEquals("") || numcelur.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        } else {

            try {
                Proveedores pro = new DAOProveedores().Insertar(ruc, nombr, numcelur, direcci);
                JOptionPane.showMessageDialog(rootPane, "Registro Agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableproveedores;
    private javax.swing.JTextField jTextNomb;
    private javax.swing.JTextField jTextRuc;
    private javax.swing.JTextField jTextdirec;
    private javax.swing.JTextField jTextnumcelu;
    // End of variables declaration//GEN-END:variables

}
