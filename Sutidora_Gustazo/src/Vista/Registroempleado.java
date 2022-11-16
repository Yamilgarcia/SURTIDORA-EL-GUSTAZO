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
public class Registroempleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registroempleado
     */
    public Registroempleado() {
        initComponents();
        jTextIDempleado.setEnabled(false);
        llenarcombo();
        jTextidturno.setEnabled(false);

    }
        public void llenarcombo() {

        List<Turnos> turnos = new DAOturno().ObtenerDatos();
        for (int i = 0; i < turnos.size(); i++) {

            jComboBoxturno.addItem(new Turnos (turnos.get(i).getID_turnos(),
            turnos.get(i).getNomb(),turnos.get(i).getHrainicio(),turnos.get(i).getHrafinali()));
        }

        int id = jComboBoxturno.getItemAt(jComboBoxturno.getSelectedIndex()).getID_turnos();

        jTextidturno.setText("" + id);
    }

    public void limpiarCampos() {

        jTextnomb1.setText("");
        jTextnomb2.setText("");
        jTextapell1.setText("");
        jTextapell2.setText("");
        jTextdirec.setText("");
        jTextnumcelu.setText("");

    }

    public void obtenerDatos() {

        List<Empleados> empleado = new DAOEmpleado().ObtenerDatos();

        DefaultTableModel modelo = new DefaultTableModel();

        String[] columnas = {"ID", "Nomb1", "Nomb2", "Apell1", "Apell2", "Telefono", "Direc", "ID Turno"};

        modelo.setColumnIdentifiers(columnas);
        for (Empleados prov : empleado) {

            String[] renglon = {Integer.toString(prov.getID_empleado()), prov.getNomb1(), prov.getNomb2(), prov.getApell1(), prov.getApell2(), prov.getNumcelu(), prov.getDirec(),
                Integer.toString(prov.getID_turnos())};
            modelo.addRow(renglon);

        }

        jTable1empleado.setModel(modelo);
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
        SegunNombre1 = new javax.swing.JLabel();
        lavelapellido1 = new javax.swing.JLabel();
        PrimNombre1 = new javax.swing.JLabel();
        lavelapellido = new javax.swing.JLabel();
        SegunNombre2 = new javax.swing.JLabel();
        PrimNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextnomb2 = new javax.swing.JTextField();
        jTextnomb1 = new javax.swing.JTextField();
        jTextapell1 = new javax.swing.JTextField();
        jTextnumcelu = new javax.swing.JTextField();
        jTextapell2 = new javax.swing.JTextField();
        jTextdirec = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1empleado = new javax.swing.JTable();
        jTextidturno = new javax.swing.JTextField();
        jComboBoxturno = new javax.swing.JComboBox<>();
        jTextIDempleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtoneditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SegunNombre1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SegunNombre1.setForeground(new java.awt.Color(255, 255, 255));
        SegunNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SegunNombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/home_home_page_house_page_home_icon_127147.png"))); // NOI18N
        SegunNombre1.setText("Dirección:");
        jPanel1.add(SegunNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        lavelapellido1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lavelapellido1.setForeground(new java.awt.Color(255, 255, 255));
        lavelapellido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        lavelapellido1.setText("Primer Apellido :");
        jPanel1.add(lavelapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 30));

        PrimNombre1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        PrimNombre1.setForeground(new java.awt.Color(255, 255, 255));
        PrimNombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        PrimNombre1.setText("Primer Nombre :");
        jPanel1.add(PrimNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        lavelapellido.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lavelapellido.setForeground(new java.awt.Color(255, 255, 255));
        lavelapellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        lavelapellido.setText("Segundo Apellido:");
        jPanel1.add(lavelapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        SegunNombre2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SegunNombre2.setForeground(new java.awt.Color(255, 255, 255));
        SegunNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SegunNombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/Phone_31105.png"))); // NOI18N
        SegunNombre2.setText("N-Telefóno:");
        jPanel1.add(SegunNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        PrimNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        PrimNombre.setForeground(new java.awt.Color(255, 255, 255));
        PrimNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/usuario (1).png"))); // NOI18N
        PrimNombre.setText("Segundo Nombre:");
        jPanel1.add(PrimNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/3592854-add-user-business-man-employee-general-human-member-office_107767.png"))); // NOI18N
        jLabel2.setText("Registro Empleado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jTextnomb2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextnomb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 180, 30));

        jTextnomb1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jTextnomb1.setFocusable(false);
        jPanel1.add(jTextnomb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, 30));

        jTextapell1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextapell1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, 30));

        jTextnumcelu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jTextnumcelu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnumceluActionPerformed(evt);
            }
        });
        jPanel1.add(jTextnumcelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 180, 30));

        jTextapell2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextapell2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 180, 30));

        jTextdirec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.add(jTextdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 180, 30));

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 110, 40));

        jButtonActualizar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 110, 40));

        jTable1empleado.setBackground(new java.awt.Color(204, 204, 204));
        jTable1empleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1empleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 850, 210));

        jTextidturno.setBackground(new java.awt.Color(204, 204, 204));
        jTextidturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidturnoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextidturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 180, 30));

        jComboBoxturno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxturnoItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBoxturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 180, 30));

        jTextIDempleado.setBackground(new java.awt.Color(204, 204, 204));
        jTextIDempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextIDempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/employee_account_business_time_clock_icon_124657.png"))); // NOI18N
        jLabel3.setText("Turno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel4.setText(" ID Turno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 130, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/product_traceability_icon_149892.png"))); // NOI18N
        jLabel5.setText("ID Empleado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jButtoneditar.setBackground(new java.awt.Color(0, 153, 153));
        jButtoneditar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButtoneditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtoneditar.setText("Editar");
        jButtoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 860, 550));

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

        String nomb1 = jTextnomb1.getText();
        String nomb2 = jTextnomb2.getText();
        String apell1 = jTextapell1.getText();
        String apell2 = jTextapell2.getText();
        String direc = jTextdirec.getText();
        String num = jTextnumcelu.getText();
        String id_turno = jTextidturno.getText();

        if (nomb1.contentEquals("") || nomb2.contentEquals("")
                || direc.contentEquals("") || num.contentEquals("")
                || apell1.contentEquals("") || apell2.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        } else {
            try {
                int id_turn = Integer.parseInt(id_turno);
                Empleados em = new DAOEmpleado().Insertar(nomb1, nomb2, apell1, apell2, num, direc, id_turn);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }

        obtenerDatos();
        limpiarCampos();


    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxturnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxturnoItemStateChanged
      int id = jComboBoxturno.getItemAt(jComboBoxturno.getSelectedIndex()).getID_turnos();

        jTextidturno.setText("" + id);

    }//GEN-LAST:event_jComboBoxturnoItemStateChanged

    private void jTextidturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidturnoActionPerformed

    private void jTextIDempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDempleadoActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizarEmpleado();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextnumceluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnumceluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnumceluActionPerformed

    private void jButtoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditarActionPerformed

        int fila = this.jTable1empleado.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");

        } else {

            try {
                int idem = Integer.parseInt((String) this.jTable1empleado.getValueAt(fila, 0).toString());
                String primNomb = (String) this.jTable1empleado.getValueAt(fila, 1);
                String seguNomb = (String) this.jTable1empleado.getValueAt(fila, 2);
                String primApell = (String) this.jTable1empleado.getValueAt(fila, 3);
                String seguApell = (String) this.jTable1empleado.getValueAt(fila, 4);
                String nuCel = (String) this.jTable1empleado.getValueAt(fila, 5);
                String direci = (String) this.jTable1empleado.getValueAt(fila, 6);
                int idturn = Integer.parseInt((String) this.jTable1empleado.getValueAt(fila, 7).toString());

                jTextIDempleado.setText("" + idem);
                jTextnomb1.setText("" + primNomb);
                jTextnomb2.setText("" + seguNomb);
                jTextapell1.setText("" + primApell);
                jTextapell2.setText("" + seguApell);
                jTextnumcelu.setText("" + nuCel);
                jTextdirec.setText("" + direci);
                jTextidturno.setText("" + idturn);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtoneditarActionPerformed

    public void actualizarEmpleado() {
        int idem = Integer.parseInt(this.jTextIDempleado.getText());
        String primNomb = this.jTextnomb1.getText();
        String seguNomb = this.jTextnomb2.getText();
        String primApell = this.jTextapell1.getText();
        String seguApell = this.jTextapell2.getText();
        String nuCel = this.jTextnumcelu.getText();
        String direci = this.jTextdirec.getText();
        int idturn = Integer.parseInt(this.jTextidturno.getText());

        DAOEmpleado dao = new DAOEmpleado();
        int emmp = dao.Actualizar(idem, primNomb, seguNomb, primApell, seguApell, nuCel, direci, idturn);
        if (emmp == 1) {
            JOptionPane.showMessageDialog(rootPane, "¡Registro Actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡OCURRIO UN ERROR!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrimNombre;
    private javax.swing.JLabel PrimNombre1;
    private javax.swing.JLabel SegunNombre1;
    private javax.swing.JLabel SegunNombre2;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JComboBox<Turnos> jComboBoxturno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1empleado;
    private javax.swing.JTextField jTextIDempleado;
    private javax.swing.JTextField jTextapell1;
    private javax.swing.JTextField jTextapell2;
    private javax.swing.JTextField jTextdirec;
    private javax.swing.JTextField jTextidturno;
    private javax.swing.JTextField jTextnomb1;
    private javax.swing.JTextField jTextnomb2;
    private javax.swing.JTextField jTextnumcelu;
    private javax.swing.JLabel lavelapellido;
    private javax.swing.JLabel lavelapellido1;
    // End of variables declaration//GEN-END:variables
}
