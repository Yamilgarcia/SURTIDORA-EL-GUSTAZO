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
public class Registrocategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrocategoria
     */
    public Registrocategoria() {
        initComponents();
        jTextidcategoria.setEnabled(false);;
    }
   public void limpiarcampos(){
   jTextnomb.setText("");
   
   
   
   }
    public void obtenerDatos(){
        
        List<Tipocategoria> categoria=new DAOtipocategoria().ObtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
       String[] columnas={"ID","Categoria"};
        
        modelo.setColumnIdentifiers(columnas);
        for (Tipocategoria  cate:categoria){
            
             String[]renglon = {Integer.toString(cate.getID_categoria()),cate.getNomb()};
               
                 modelo.addRow(renglon);

             }
                 
             
        jTablecategorias.setModel(modelo);

     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextidcategoria = new javax.swing.JTextField();
        jTextnomb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecategorias = new javax.swing.JTable();
        jButtonactualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/categorias (1)_1.png"))); // NOI18N
        jLabel2.setText("Tipo Categoría");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel3.setText("ID Categoría:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/productos.png"))); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 120, 30));
        jPanel1.add(jTextidcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 30));
        jPanel1.add(jTextnomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 150, 30));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, 40));

        jTablecategorias.setBackground(new java.awt.Color(153, 153, 153));
        jTablecategorias.setForeground(new java.awt.Color(255, 255, 255));
        jTablecategorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablecategorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 640, 160));

        jButtonactualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonactualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonactualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonactualizar.setText("Actualizar");
        jButtonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomb=jTextnomb.getText();
        if(nomb.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        }else{
            try{
                Tipocategoria tc = new DAOtipocategoria().Insertar(nomb);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
             }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }

        obtenerDatos();
        limpiarcampos();    
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          int fila = this.jTablecategorias.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");

        } else {

            try {
                int idem = Integer.parseInt((String) this.jTablecategorias.getValueAt(fila, 0).toString());
                String primNomb = (String) this.jTablecategorias.getValueAt(fila, 1);
            

                jTextidcategoria.setText("" + idem);
                jTextnomb.setText("" + primNomb);
                

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonactualizarActionPerformed
        actualizarcategoria();
        obtenerDatos();
        limpiarcampos();
    }//GEN-LAST:event_jButtonactualizarActionPerformed
     public void actualizarcategoria() {
        int idcate = Integer.parseInt(this.jTextidcategoria.getText());
        String Nomb = this.jTextnomb.getText();
        

        DAOtipocategoria dao = new DAOtipocategoria();
        int categ = dao.actualizar(idcate, Nomb);
        if (categ == 1) {
            JOptionPane.showMessageDialog(rootPane, "¡Registro Actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡OCURRIO UN ERROR!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecategorias;
    private javax.swing.JTextField jTextidcategoria;
    private javax.swing.JTextField jTextnomb;
    // End of variables declaration//GEN-END:variables
}
