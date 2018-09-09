package com.vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Isra Méndez
 */
public class frmHome extends javax.swing.JFrame {
    frmInicio inicio = new frmInicio();

    public frmHome() {
        initComponents();
    }
    
    public void rol(String user, int rol)
    {
        this.lblUser.setText(user);
        if(rol==1)
        {
            this.lblRol.setText("Administrador");        
        }
        else if(rol==2)
        {
            this.lblRol.setText("Profesional");        
        }
        else if(rol==3)
        {
            this.lblRol.setText("Empresa");
        }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        btnLogoutfrm = new javax.swing.JMenuItem();
        btnExitmdi = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Vacantes Profesionales");

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Bienvenido:");

        lblRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRol.setText("jLabel3");

        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        btnLogoutfrm.setMnemonic('o');
        btnLogoutfrm.setText("Logout");
        btnLogoutfrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutfrmActionPerformed(evt);
            }
        });
        fileMenu.add(btnLogoutfrm);

        btnExitmdi.setMnemonic('x');
        btnExitmdi.setText("Exit");
        btnExitmdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitmdiActionPerformed(evt);
            }
        });
        fileMenu.add(btnExitmdi);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRol)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(jLabel3)
                    .addComponent(lblRol))
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitmdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitmdiActionPerformed
        int yesnot = JOptionPane.showConfirmDialog(this, "¿Está seguro de que quiere salir del sistema?", "¡Advertencia!", JOptionPane.YES_NO_OPTION);
        
        if(yesnot==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitmdiActionPerformed

    private void btnLogoutfrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutfrmActionPerformed
        int yesnot = JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar la sesión?", "¡Advertencia!", JOptionPane.YES_NO_OPTION);
        
        if(yesnot==0)
        {
            this.setVisible(false);
            inicio.setVisible(true);
        }
        
    }//GEN-LAST:event_btnLogoutfrmActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExitmdi;
    private javax.swing.JMenuItem btnLogoutfrm;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblRol;
    public javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
