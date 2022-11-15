/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Controlador;
import Vista.*;
/**
 *
 * @author Cris
 */
public class MenuOpciones extends javax.swing.JFrame {
    
    private  Registroproducto producto;//objeto formulario productos
    private Registrodevoluciones devolucion;
    private Registroproveedor proveedor;
    private Registroempleado empleado;
    private Registrocliente cliente;
    private Registrocategoria categoria;

    
    public MenuOpciones() {
        initComponents();
        this.setLocation(425,200);
        
        setTitle("Menu Opciones Surtidora EL Gustazo ");//Agrego el titulo al MDI
        producto= new Registroproducto();
        
        //Agrego los Jinternarframe al desktopPane del MDI
        desktopPane.add(producto);
        
         
        devolucion= new Registrodevoluciones();
        
        //Agrego los Jinternarframe al desktopPane del MDI
        desktopPane.add(devolucion);
        
        
        proveedor= new Registroproveedor();
        
        //Agrego los Jinternarframe al desktopPane del MDI
        desktopPane.add(proveedor);
        
        empleado= new Registroempleado();
        
        desktopPane.add(empleado);
        
        cliente = new Registrocliente();
        
        desktopPane.add(cliente);
        
        
        categoria = new Registrocategoria();
        
        desktopPane.add(categoria);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Productos = new javax.swing.JMenu();
        Proveedores = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/fondos-para-páginas-web-12.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 470);

        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/ventas.png"))); // NOI18N
        Productos.setMnemonic('f');
        Productos.setText("Productos");
        Productos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        menuBar.add(Productos);

        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosss/thefreeforty_register_icon-icons.com_66338 (1).png"))); // NOI18N
        Proveedores.setMnemonic('e');
        Proveedores.setText("Proveedores");
        Proveedores.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresMouseClicked(evt);
            }
        });
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        menuBar.add(Proveedores);

        jMenu1.setText("jMenu1");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menuBar.add(jMenu1);

        jMenu2.setText("jMenu2");
        menuBar.add(jMenu2);

        jMenu3.setText("jMenu3");
        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
  
    }//GEN-LAST:event_ProveedoresActionPerformed

    private void ProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresMouseClicked
        
    }//GEN-LAST:event_ProveedoresMouseClicked

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
       producto.ObtenerDatos();
        producto.setVisible(true);
    }//GEN-LAST:event_ProductosMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Productos;
    private javax.swing.JMenu Proveedores;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
