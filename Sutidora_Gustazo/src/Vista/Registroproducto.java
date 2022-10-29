/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class Registroproducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registroproducto
     */
    public Registroproducto() {
        initComponents();
        //Aqui abajo ira lo del ID
        //jtextIdProduto.setEnable(False);
    }

    public void limpiarcampo() {
        jTextNombre.setText("");
        jTextPreciovent.setText("");
        jTextpreciocom.setText("");
        jTextcanti.setText("");
        jTextfechavenci.setText("");
        jTextAreaDescrip.setText("");
    }

    //Metodo para listar dentro de la tabla
    public void ObtenerDatos() {
        //Se crea una lista que almacena los datos obtenidos
        List<Productos> product = new DAOProductos().ObtenerDatos();
        //Define el modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        //Arreglo con nombres las columnas de la tabla
        String[] columnas = {"Nombres", "PrecioVent", "PrecioCom", "Cantidad",
            "Fechavenci", "Descripcion"};

        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for (Productos p : product) {//Recorre cada elemento de las lista y los agrega
            //al modelo de la tabla

            String[] renglon = {(p.getNomb()), p.getPreciovent(), p.getPreciocom(), p.getCanti(), p.getFechavenci().toString(),
                p.getDescrip()};
            modelo.addRow(renglon); 

        }
        jTablaProdu.setModel(modelo);//Ubica los datos del modelo en la tabla

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextfechavenci = new javax.swing.JTextField();
        jTextcanti = new javax.swing.JTextField();
        jTextPreciovent = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextcategoria = new javax.swing.JTextField();
        jTextproveedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jTextpreciocom = new javax.swing.JTextField();
        jButtonBuscarcatego = new javax.swing.JButton();
        jButtonBuscarprovee = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaProdu = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio venta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio compra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripción:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedor:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jTextfechavenci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextfechavenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 230, -1));

        jTextcanti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextcanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, -1));

        jTextPreciovent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextPreciovent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, -1));

        jTextNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, -1));

        jTextcategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 230, -1));

        jTextproveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 230, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Venci:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jTextpreciocom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextpreciocom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, -1));

        jButtonBuscarcatego.setText("jButton1");
        jPanel1.add(jButtonBuscarcatego, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 40, -1));

        jButtonBuscarprovee.setText("jButton1");
        jPanel1.add(jButtonBuscarprovee, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, -1));

        jButtonGuardar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 110, 40));

        jButtonCancelar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonCancelar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 110, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablaProdu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTablaProdu);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 700, 348));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Productos Registrados");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 700, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura-madera-en-negro_2560x1600_xtrafondos.com.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        //captura datos de la caja de texto

        String nomb = jTextNombre.getText();
        String precioven = jTextPreciovent.getText();
        String Precomp = jTextpreciocom.getText();
        String cant = jTextcanti.getText();
        String fechaven = jTextfechavenci.getText();
        String areaDescr = jTextAreaDescrip.getText();
        
        //Comprueba que las cajas de texto no esten vacias
        if(nomb.contentEquals("")||precioven.contentEquals("")||
                Precomp.contentEquals("")||fechaven.contentEquals("")||areaDescr.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        }else{
            try{
                //convierte de string a Date
                Date fech=Date.valueOf(fechaven);// usar formato de fecha: yyyy-mm-dd
                //objeto para acceder al metodo insertar de DAOProducto
                Productos pr = new DAOProductos().Insertar(nomb, precioven, precioven, cant, fech, Precomp);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
                
                
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }
        
        ObtenerDatos();//llama este metodo para que se muestre el nuevo
        //metodo de registro en la tabla del formulario
        limpiarcampo();
        
       
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarcatego;
    private javax.swing.JButton jButtonBuscarprovee;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaProdu;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPreciovent;
    private javax.swing.JTextField jTextcanti;
    private javax.swing.JTextField jTextcategoria;
    private javax.swing.JTextField jTextfechavenci;
    private javax.swing.JTextField jTextpreciocom;
    private javax.swing.JTextField jTextproveedor;
    // End of variables declaration//GEN-END:variables
}
