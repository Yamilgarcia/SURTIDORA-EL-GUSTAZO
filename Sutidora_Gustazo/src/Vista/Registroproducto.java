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
public class Registroproducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registroproducto
     */
    public Registroproducto() {
        initComponents();

        jTextIDProducto.setEnabled(false);
//        jTextIDCategoria.setEnabled(false);

//        llenarcombo();
    }

    public void llenarcombo() {

//        List<Tipocategoria> categorias = new DAOtipocategoria().ObtenerDatos();
//        for (int i = 0; i < categorias.size(); i++) {
//
//            jComboBoxCategoria.addItem(new Tipocategoria(categorias.get(i).getID_categoria(),
//                    categorias.get(i).getNomb()));
//        }
//
//        int id = jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getID_categoria();
//
//        jTextIDCategoria.setText("" + id);
    }

    public void limpiarcampo() {
        jTextIDProducto.setText("");
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
        String[] columnas = {"ID_Producto", "Nombres", "PrecioVent", "PrecioCom", "Cantidad",
            "ID categoria", "Descripcion", "Fechavenci"};

        //Establece los nombres definidos de las columnas
        modelo.setColumnIdentifiers(columnas);
        for (Productos p : product) {//Recorre cada elemento de las lista y los agrega
            //al modelo de la tabla

            String[] renglon = {Integer.toString(p.getID_producto()), p.getNomb(), Float.toString(p.getPreciovent()),
                Float.toString(p.getPreciocom()), Float.toString(p.getCanti()), Integer.toString(p.getID_categoria()),
                p.getDescrip(), p.getFechavenci().toString()};
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
        jTextfechavenci = new javax.swing.JTextField();
        jTextcanti = new javax.swing.JTextField();
        jTextPreciovent = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jTextpreciocom = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextIDProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextIDCategoria = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaProdu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/select_product_ecommerce_item_icon_192433.png"))); // NOI18N
        jLabel2.setText("Registro de productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/productos.png"))); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jLabel4.setText("Precio venta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jLabel5.setText("Precio compra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/descripcion.png"))); // NOI18N
        jLabel6.setText("Descripción:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/business_packages_boxes_products_sellingproducts_thereport_2344.png"))); // NOI18N
        jLabel7.setText("Cantidad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/categorias (1).png"))); // NOI18N
        jLabel8.setText("Categoria:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jTextfechavenci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextfechavenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 230, -1));

        jTextcanti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextcanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, -1));

        jTextPreciovent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextPreciovent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, -1));

        jTextNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/calendar_alert_notification_date_appointment_icon_153130.png"))); // NOI18N
        jLabel12.setText("Fecha Venci:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 30));

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jTextpreciocom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextpreciocom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 210, -1));

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 0));
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
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 110, 40));

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCategoriaItemStateChanged(evt);
            }
        });
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 140, 30));

        jButtonEditar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEditar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 110, 40));

        jButtonEliminar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 110, 40));

        jButtonActualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 408, -1, 40));

        jTextIDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 210, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel11.setText("ID_Producto :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel9.setText("ID_categoria:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));
        jPanel1.add(jTextIDCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 230, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Productos Registrados");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 30));

        jTablaProdu.setBackground(new java.awt.Color(204, 204, 204));
        jTablaProdu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(jTablaProdu);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 850, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 850, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 850, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nomb = jTextNombre.getText();
        String precioven = jTextPreciovent.getText();
        String Precomp = jTextpreciocom.getText();
        String cant = jTextcanti.getText();
        String fechaven = jTextfechavenci.getText();
        String categ = jComboBoxCategoria.getSelectedItem().toString();
        String descrip = jTextAreaDescrip.getText();
        String id_categ = jTextIDCategoria.getText();

        //Comprueba que las cajas de texto no esten vacias
        if (nomb.contentEquals("") || precioven.contentEquals("")
                || Precomp.contentEquals("") || fechaven.contentEquals("") || descrip.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        } else {
            try {
                //convierte de string a Date
                Date fech = Date.valueOf(fechaven);// usar formato de fecha: yyyy-mm-dd
                //objeto para acceder al metodo insertar de DAOProducto
                Float preven = Float.valueOf(precioven);
                Float preco = Float.valueOf(Precomp);
                Float can = Float.valueOf(cant);
                int id_cat = Integer.parseInt(id_categ);
                Productos pr = new DAOProductos().Insertar(nomb, preven, preco, can, fech, descrip, id_cat);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }

        ObtenerDatos();//llama este metodo para que se muestre el nuevo
        //metodo de registro en la tabla del formulario
        limpiarcampo();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        //captura datos de la caja de texto


    }//GEN-LAST:event_jButtonGuardarMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int fila = this.jTablaProdu.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla primero");
        } else {
            int id = Integer.parseInt((String) this.jTablaProdu.getValueAt(fila, 0).toString());
            DAOProductos dao = new DAOProductos();
            dao.Eliminar(id);
            ObtenerDatos();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextIDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDProductoActionPerformed
        
    }//GEN-LAST:event_jTextIDProductoActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed


    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaItemStateChanged
//        int id = jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getID_categoria();
//
//        jTextIDCategoria.setText("" + id);
    }//GEN-LAST:event_jComboBoxCategoriaItemStateChanged

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int fila = this.jTablaProdu.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");
        } else {
            try {
                int idpr = Integer.parseInt((String) this.jTablaProdu.getValueAt(fila, 0).toString());
                String nom = (String) this.jTablaProdu.getValueAt(fila, 1);
                float precven = Float.parseFloat((String) this.jTablaProdu.getValueAt(fila, 2).toString());
                float preccom = Float.parseFloat((String) this.jTablaProdu.getValueAt(fila, 3).toString());
                float can = Float.parseFloat((String) this.jTablaProdu.getValueAt(fila, 4).toString());
                int idcate = Integer.parseInt((String) this.jTablaProdu.getValueAt(fila, 5).toString());
                String descrr = (String) this.jTablaProdu.getValueAt(fila, 6);
                Date fecven = Date.valueOf((String) this.jTablaProdu.getValueAt(fila, 7).toString());

                jTextIDProducto.setText("" + idpr);
                jTextNombre.setText("" + nom);
                jTextPreciovent.setText("" + precven);
                jTextpreciocom.setText("" + preccom);
                jTextcanti.setText("" + can);
                jTextIDCategoria.setText("" + idcate);
                jTextAreaDescrip.setText("" + descrr);
                jTextfechavenci.setText(String.valueOf(fecven));

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    public void actualizarproducto() {
        int idpr = Integer.parseInt(this.jTextIDProducto.getText());
        String nom = this.jTextNombre.getText();
        float precven = Float.parseFloat(this.jTextPreciovent.getText());
        float preccom = Float.parseFloat(this.jTextpreciocom.getText());
        float cant = Float.parseFloat(this.jTextcanti.getText());
        int idcate = Integer.parseInt(this.jTextIDCategoria.getText());
        String descrr = this.jTextAreaDescrip.getText();
        Date fecven = Date.valueOf(this.jTextfechavenci.getText());

        DAOProductos dao = new DAOProductos();
        int prodd = dao.Actualizar(idpr, nom, precven, preccom, cant, fecven, descrr, idcate);
        if (prodd == 1) {
            JOptionPane.showMessageDialog(rootPane, "¡Producto Actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrio un ERROR!");
        }
    }


    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarproducto();
        ObtenerDatos();
        limpiarcampo();
    }//GEN-LAST:event_jButtonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextIDCategoria;
    private javax.swing.JTextField jTextIDProducto;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPreciovent;
    private javax.swing.JTextField jTextcanti;
    private javax.swing.JTextField jTextfechavenci;
    private javax.swing.JTextField jTextpreciocom;
    // End of variables declaration//GEN-END:variables
}
