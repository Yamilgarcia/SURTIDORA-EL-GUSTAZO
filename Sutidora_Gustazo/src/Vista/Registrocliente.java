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
public class Registrocliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrocliente
     */
    public Registrocliente() {
        initComponents();
        jTextIDcliente.setEnabled(false);
    }
     public void limpiarCampos(){
      jTextcedula.setText("");
      jTextnomb1.setText("");
      jTextnomb2.setText("");
      jTextapell1.setText("");
      jTextapell2.setText("");
      jTextdirec.setText("");
      jTextnumcelu.setText("");

        
        
      }

     public void obtenerDatos(){
        
        List<Clientes> cliente=new DAOClientes().ObtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
       String[] columnas={"ID","Cedula","Nombre1","Nombre2","Apellido1","Apellido1","Teléfono","Dirección"};
        
        modelo.setColumnIdentifiers(columnas);
        for (Clientes  clien:cliente){
            
             String[]renglon = {Integer.toString(clien.getID_cliente()), clien.getCedula(),clien.getNomb1(),clien.getNomb2(),clien.getApell1(),clien.getApell2(),clien.getNumcelu(),clien.getDirec()};
               
                 modelo.addRow(renglon);

             }
                 
             
        jTableclientes.setModel(modelo);
       

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
        jButton1 = new javax.swing.JButton();
        jButtoneditar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableclientes = new javax.swing.JTable();
        jTextnomb2 = new javax.swing.JTextField();
        jTextnomb1 = new javax.swing.JTextField();
        jTextapell1 = new javax.swing.JTextField();
        jTextapell2 = new javax.swing.JTextField();
        jTextdirec = new javax.swing.JTextField();
        jTextnumcelu = new javax.swing.JTextField();
        jTextcedula = new javax.swing.JTextField();
        jButtonactualizar = new javax.swing.JButton();
        jTextIDcliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/user_customer_man_14016.png"))); // NOI18N
        jLabel2.setText("Registro Cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 220, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        jLabel3.setText("Primer Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        jLabel4.setText("Segundo Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        jLabel5.setText("Primer Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        jLabel6.setText("Segundo Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/home_home_page_house_page_home_icon_127147.png"))); // NOI18N
        jLabel7.setText("Direccion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/Phone_31105.png"))); // NOI18N
        jLabel8.setText("N-Telefóno:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/identity_id_card_icon_134197.png"))); // NOI18N
        jLabel9.setText("Cedula:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 110, 40));

        jButtoneditar.setBackground(new java.awt.Color(0, 153, 153));
        jButtoneditar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtoneditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtoneditar.setText("Editar");
        jButtoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 110, 40));

        jTableclientes.setBackground(new java.awt.Color(204, 204, 204));
        jTableclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableclientes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 477, 860, 210));
        jPanel1.add(jTextnomb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 180, 30));
        jPanel1.add(jTextnomb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 30));
        jPanel1.add(jTextapell1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, 30));

        jTextapell2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextapell2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextapell2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 180, 30));

        jTextdirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdirecActionPerformed(evt);
            }
        });
        jPanel1.add(jTextdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 180, 30));
        jPanel1.add(jTextnumcelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 180, 30));

        jTextcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcedulaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 180, 30));

        jButtonactualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonactualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonactualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonactualizar.setText("Actualizar");
        jButtonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 110, 40));
        jPanel1.add(jTextIDcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel10.setText("ID Cliente:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula = jTextcedula.getText();
        String nomb1 = jTextnomb1.getText();
        String nomb2= jTextnomb2.getText();
        String  apell1=jTextapell1.getText();
        String  apell2=jTextapell2.getText();
        String  direC= jTextdirec.getText();
        String  numcelu= jTextnumcelu.getText();

        if(nomb1.contentEquals("")||
            direC.contentEquals("")||numcelu.contentEquals("")||
            apell1.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        }else{
            try{

                Clientes cl =new DAOClientes().Insertar(cedula, nomb1, nomb2, apell1, apell2, numcelu, direC);
                        
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");

            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }

        obtenerDatos();
        limpiarCampos();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextdirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdirecActionPerformed

    private void jTextcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcedulaActionPerformed

    private void jButtoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditarActionPerformed
              int fila = this.jTableclientes.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");

        } else {

            try {
                int idclien = Integer.parseInt((String) this.jTableclientes.getValueAt(fila, 0).toString());
                String cedula= (String) this.jTableclientes.getValueAt(fila, 1);
                String primNomb = (String) this.jTableclientes.getValueAt(fila, 2);
                String seguNomb = (String) this.jTableclientes.getValueAt(fila, 3);
                String primApell = (String) this.jTableclientes.getValueAt(fila, 4);
                String seguApell = (String) this.jTableclientes.getValueAt(fila, 5);
                String nuCel = (String) this.jTableclientes.getValueAt(fila, 6);
                String direci = (String) this.jTableclientes.getValueAt(fila, 7);
                
                jTextIDcliente.setText(""+ idclien);
                jTextcedula.setText("" + cedula);
                jTextnomb1.setText("" + primNomb);
                jTextnomb2.setText("" + seguNomb);
                jTextapell1.setText("" + primApell);
                jTextapell2.setText("" + seguApell);
                jTextnumcelu.setText("" + nuCel);
                jTextdirec.setText("" + direci);
                

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
             
        }

    }//GEN-LAST:event_jButtoneditarActionPerformed
        public void actualizarCliente() {
        int idclien = Integer.parseInt(this.jTextIDcliente.getText());       
        String cedulA= this.jTextcedula.getText();
        String nomB1 = this.jTextnomb1.getText();
        String nomB2 = this.jTextnomb2.getText();
        String Apell1 = this.jTextapell1.getText();
        String Apell2 = this.jTextapell2.getText();
        String numcelU = this.jTextnumcelu.getText();
        String direC = this.jTextdirec.getText();
        
        

        DAOClientes dao = new DAOClientes();
        int client = dao.Actualizar(idclien, cedulA, nomB1, nomB2, Apell1, Apell2, numcelU, direC);
        if (client == 1) {
            JOptionPane.showMessageDialog(rootPane, "¡Registro Actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡OCURRIO UN ERROR!");
        }
    }
    private void jButtonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonactualizarActionPerformed
       actualizarCliente();
       obtenerDatos();
       limpiarCampos();
    }//GEN-LAST:event_jButtonactualizarActionPerformed

    private void jTextapell2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextapell2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextapell2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonactualizar;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableclientes;
    private javax.swing.JTextField jTextIDcliente;
    private javax.swing.JTextField jTextapell1;
    private javax.swing.JTextField jTextapell2;
    private javax.swing.JTextField jTextcedula;
    private javax.swing.JTextField jTextdirec;
    private javax.swing.JTextField jTextnomb1;
    private javax.swing.JTextField jTextnomb2;
    private javax.swing.JTextField jTextnumcelu;
    // End of variables declaration//GEN-END:variables
}
