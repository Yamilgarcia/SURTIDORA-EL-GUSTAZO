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
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


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
        jTextIDCategoria.setEnabled(false);

        llenarcombo();
    }

    public void llenarcombo() {

        List<Tipocategoria> categorias = new DAOtipocategoria().ObtenerDatos();
        for (int i = 0; i < categorias.size(); i++) {

            jComboBoxCategoria.addItem(new Tipocategoria(categorias.get(i).getID_categoria(), 
            categorias.get(i).getNomb()));
        }

        int id = jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getID_categoria();

        jTextIDCategoria.setText("" + id);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextfechavenci = new javax.swing.JTextField();
        jTextcanti = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextPreciovent = new javax.swing.JTextField();
        jTextpreciocom = new javax.swing.JTextField();
        jTextIDProducto = new javax.swing.JTextField();
        jTextIDCategoria = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaProdu = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextfechavenci1 = new javax.swing.JTextField();
        jTextcanti1 = new javax.swing.JTextField();
        jTextPreciovent1 = new javax.swing.JTextField();
        jTextNombre1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDescrip1 = new javax.swing.JTextArea();
        jTextpreciocom1 = new javax.swing.JTextField();
        jButtonGuardar1 = new javax.swing.JButton();
        jComboBoxCategoria1 = new javax.swing.JComboBox<>();
        jButtonEditar1 = new javax.swing.JButton();
        jButtonEliminar1 = new javax.swing.JButton();
        jButtonActualizar1 = new javax.swing.JButton();
        jTextIDProducto1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextIDCategoria1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablaProdu1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/select_product_ecommerce_item_icon_192433.png"))); // NOI18N
        jLabel2.setText("Registro de productos");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/productos.png"))); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jLabel4.setText("Precio venta:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jLabel5.setText("Precio compra:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/descripcion.png"))); // NOI18N
        jLabel6.setText("Descripción:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/business_packages_boxes_products_sellingproducts_thereport_2344.png"))); // NOI18N
        jLabel7.setText("Cantidad:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/categorias (1).png"))); // NOI18N
        jLabel8.setText("Categoria:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/calendar_alert_notification_date_appointment_icon_153130.png"))); // NOI18N
        jLabel12.setText("Fecha Venci:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel9.setText("ID_categoria:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel11.setText("ID_Producto :");

        jTextfechavenci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jTextcanti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jTextNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jTextPreciovent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jTextpreciocom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

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

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");

        jButtonEditar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEditar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");

        jButtonEliminar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");

        jButtonActualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1038, 812));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/select_product_ecommerce_item_icon_192433.png"))); // NOI18N
        jLabel10.setText("Registro de productos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 310, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/productos.png"))); // NOI18N
        jLabel13.setText("Nombre:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jLabel14.setText("Precio venta:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N
        jLabel15.setText("Precio compra:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/descripcion.png"))); // NOI18N
        jLabel16.setText("Descripción:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/business_packages_boxes_products_sellingproducts_thereport_2344.png"))); // NOI18N
        jLabel17.setText("Cantidad:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/categorias (1).png"))); // NOI18N
        jLabel18.setText("Categoria:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 120, -1));

        jTextfechavenci1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextfechavenci1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 220, 30));

        jTextcanti1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextcanti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 30));

        jTextPreciovent1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextPreciovent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        jTextNombre1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/calendar_alert_notification_date_appointment_icon_153130.png"))); // NOI18N
        jLabel19.setText("Fecha Venci:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 150, 30));

        jTextAreaDescrip1.setColumns(20);
        jTextAreaDescrip1.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDescrip1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 230, -1));

        jTextpreciocom1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextpreciocom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, 30));

        jButtonGuardar1.setBackground(new java.awt.Color(0, 153, 0));
        jButtonGuardar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar1.setText("Guardar");
        jButtonGuardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardar1MouseClicked(evt);
            }
        });
        jButtonGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 100, 40));

        jComboBoxCategoria1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCategoria1ItemStateChanged(evt);
            }
        });
        jComboBoxCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoria1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 130, 30));

        jButtonEditar1.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEditar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEditar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar1.setText("Editar");
        jButtonEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 100, 40));

        jButtonEliminar1.setBackground(new java.awt.Color(204, 0, 0));
        jButtonEliminar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar1.setText("Eliminar");
        jButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 100, 40));

        jButtonActualizar1.setBackground(new java.awt.Color(0, 153, 153));
        jButtonActualizar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonActualizar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar1.setText("Actualizar");
        jButtonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 100, 40));

        jTextIDProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDProducto1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextIDProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel20.setText("ID_Producto :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 30));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel21.setText("ID_categoria:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 150, -1));
        jPanel1.add(jTextIDCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 220, 30));

        jTablaProdu1.setBackground(new java.awt.Color(204, 204, 204));
        jTablaProdu1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTablaProdu1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 840, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 840, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardar1MouseClicked
        //captura datos de la caja de texto

    }//GEN-LAST:event_jButtonGuardar1MouseClicked

    private void jButtonGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardar1ActionPerformed
        String nomB = jTextNombre.getText();
        String precioven = jTextPreciovent.getText();
        String Precomp = jTextpreciocom.getText();
        String cant = jTextcanti.getText();
        String fechaven = jTextfechavenci.getText();

        String descrip = jTextAreaDescrip.getText();
        String id_categ = jTextIDCategoria.getText();

        //Comprueba que las cajas de texto no esten vacias
        if (nomB.contentEquals("") || precioven.contentEquals("")
            || Precomp.contentEquals("") || fechaven.contentEquals("")) {
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
                Productos pr = new DAOProductos().Insertar(nomB, preven, preco, can, fech, descrip, id_cat);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }

        ObtenerDatos();//llama este metodo para que se muestre el nuevo
        //metodo de registro en la tabla del formulario
        limpiarcampo();
    }//GEN-LAST:event_jButtonGuardar1ActionPerformed

    private void jComboBoxCategoria1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCategoria1ItemStateChanged
        int id = jComboBoxCategoria.getItemAt(jComboBoxCategoria.getSelectedIndex()).getID_categoria();

        jTextIDCategoria.setText("" + id);
    }//GEN-LAST:event_jComboBoxCategoria1ItemStateChanged

    private void jComboBoxCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoria1ActionPerformed

    }//GEN-LAST:event_jComboBoxCategoria1ActionPerformed

    private void jButtonEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar1ActionPerformed
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
    }//GEN-LAST:event_jButtonEditar1ActionPerformed

    private void jButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar1ActionPerformed
        int fila = this.jTablaProdu.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");
        }
        else{
            int id= Integer.parseInt((String)this.jTablaProdu.getValueAt(fila, 0).toString());
            DAOProductos dao= new DAOProductos();
            dao.Eliminar(id);
            ObtenerDatos();
        }
    }//GEN-LAST:event_jButtonEliminar1ActionPerformed

    private void jButtonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizar1ActionPerformed
        actualizarproducto();
        ObtenerDatos();
        limpiarcampo();
    }//GEN-LAST:event_jButtonActualizar1ActionPerformed

    private void jTextIDProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDProducto1ActionPerformed

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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonActualizar1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEditar1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminar1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardar1;
    private javax.swing.JComboBox<Tipocategoria> jComboBoxCategoria;
    private javax.swing.JComboBox<Tipocategoria> jComboBoxCategoria1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablaProdu;
    private javax.swing.JTable jTablaProdu1;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextArea jTextAreaDescrip1;
    private javax.swing.JTextField jTextIDCategoria;
    private javax.swing.JTextField jTextIDCategoria1;
    private javax.swing.JTextField jTextIDProducto;
    private javax.swing.JTextField jTextIDProducto1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombre1;
    private javax.swing.JTextField jTextPreciovent;
    private javax.swing.JTextField jTextPreciovent1;
    private javax.swing.JTextField jTextcanti;
    private javax.swing.JTextField jTextcanti1;
    private javax.swing.JTextField jTextfechavenci;
    private javax.swing.JTextField jTextfechavenci1;
    private javax.swing.JTextField jTextpreciocom;
    private javax.swing.JTextField jTextpreciocom1;
    // End of variables declaration//GEN-END:variables

}

