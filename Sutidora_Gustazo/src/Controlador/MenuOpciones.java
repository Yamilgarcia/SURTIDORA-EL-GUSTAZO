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

    
    public MenuOpciones() {
        initComponents();
        
        setTitle("Menu Opciones Surtidora EL Gustazo ");//Agrego el titulo al MDI
        producto= new Registroproducto();
        
        //Agrego los Jinternarframe al desktopPane del MDI
        desktopPane.add(producto);
        
         
        devolucion= new Registrodevoluciones();
        
        //Agrego los Jinternarframe al desktopPane del MDI
        desktopPane.add(devolucion);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        VerProductosMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Venta");
        fileMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        openMenuItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Nueva");
        fileMenu.add(openMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Registro");
        editMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        VerProductosMenuItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        VerProductosMenuItem.setMnemonic('t');
        VerProductosMenuItem.setText("Ver Productos");
        VerProductosMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerProductosMenuItemMouseClicked(evt);
            }
        });
        VerProductosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProductosMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(VerProductosMenuItem);

        copyMenuItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Proveedores");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Devolucion");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Empleados");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerProductosMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerProductosMenuItemMouseClicked
        //Llamo al metodo obtener datos para mostrarlos en la tabla del formulario
  
        
        
    }//GEN-LAST:event_VerProductosMenuItemMouseClicked

    private void VerProductosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProductosMenuItemActionPerformed
        producto.ObtenerDatos();
        producto.setVisible(true);
        
       
    }//GEN-LAST:event_VerProductosMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
       devolucion.obtenerDatos();
        devolucion.setVisible(true);
    }//GEN-LAST:event_pasteMenuItemActionPerformed

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
    private javax.swing.JMenuItem VerProductosMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
