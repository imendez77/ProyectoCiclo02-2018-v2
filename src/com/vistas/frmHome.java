package com.vistas;

import javax.swing.JOptionPane;
import com.vistas.*;

/**
 *
 * @author Isra Méndez
 */
public class frmHome extends javax.swing.JFrame {

    public frmHome() {
        initComponents();
    }

    public void rol(String user, int rol) {
        this.lblUser.setText(user);
        if (rol == 1) {
            this.lblRol.setText("Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnInicio = new javax.swing.JMenu();
        btnLogoutfrm = new javax.swing.JMenuItem();
        btnExitmdi = new javax.swing.JMenuItem();
        btnSistema = new javax.swing.JMenu();
        btnUsuarios = new javax.swing.JMenuItem();
        btnRoles = new javax.swing.JMenuItem();
        btnProfesionales = new javax.swing.JMenu();
        btnEmpresa = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(2, 2));

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setMinimumSize(new java.awt.Dimension(763, 422));
        desktopPane.setName(""); // NOI18N

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Bienvenido:");

        lblRol.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblRol.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Vacantes Profesionales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRol)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRol))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-página-principal-24 (1).png"))); // NOI18N
        btnInicio.setMnemonic('f');
        btnInicio.setText("Inicio");

        btnLogoutfrm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-exportar-24.png"))); // NOI18N
        btnLogoutfrm.setMnemonic('o');
        btnLogoutfrm.setText("Logout");
        btnLogoutfrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutfrmActionPerformed(evt);
            }
        });
        btnInicio.add(btnLogoutfrm);

        btnExitmdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-apagar-24.png"))); // NOI18N
        btnExitmdi.setMnemonic('x');
        btnExitmdi.setText("Exit");
        btnExitmdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitmdiActionPerformed(evt);
            }
        });
        btnInicio.add(btnExitmdi);

        menuBar.add(btnInicio);

        btnSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-configuración-3-24.png"))); // NOI18N
        btnSistema.setMnemonic('f');
        btnSistema.setText("Sistema");

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-usuario-de-género-neutro-30 (1).png"))); // NOI18N
        btnUsuarios.setMnemonic('o');
        btnUsuarios.setText("Gestión de Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        btnSistema.add(btnUsuarios);

        btnRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-grupo-de-usuarios-hombre-hombre-24.png"))); // NOI18N
        btnRoles.setMnemonic('o');
        btnRoles.setText("Gestión de Roles");
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });
        btnSistema.add(btnRoles);

        menuBar.add(btnSistema);

        btnProfesionales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-trabajador-de-sexo-masculino-24.png"))); // NOI18N
        btnProfesionales.setMnemonic('f');
        btnProfesionales.setText("Profesionales");
        menuBar.add(btnProfesionales);

        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-organización-24.png"))); // NOI18N
        btnEmpresa.setMnemonic('f');
        btnEmpresa.setText("Empresa");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnEmpresa.add(jMenuItem1);

        menuBar.add(btnEmpresa);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitmdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitmdiActionPerformed
        int yesnot = JOptionPane.showConfirmDialog(this, "¿Está seguro de que quiere salir del sistema?", "¡Advertencia!", JOptionPane.YES_NO_OPTION);

        if (yesnot == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitmdiActionPerformed

    private void btnLogoutfrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutfrmActionPerformed
        int yesnot = JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar la sesión?", "¡Advertencia!", JOptionPane.YES_NO_OPTION);

        if (yesnot == 0) {
            this.setVisible(false);
            frmInicio inicio = null;
            inicio.setVisible(true);
        }

    }//GEN-LAST:event_btnLogoutfrmActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        desktopPane.removeAll();
        desktopPane.updateUI();
        frmUsuario frmU = null;
        desktopPane.add(frmU);
        frmU.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed

    }//GEN-LAST:event_btnRolesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmEmpresa emp = new FrmEmpresa();
        desktopPane.add(emp);
        emp.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenu btnEmpresa;
    private javax.swing.JMenuItem btnExitmdi;
    private javax.swing.JMenu btnInicio;
    private javax.swing.JMenuItem btnLogoutfrm;
    private javax.swing.JMenu btnProfesionales;
    private javax.swing.JMenuItem btnRoles;
    private javax.swing.JMenu btnSistema;
    private javax.swing.JMenuItem btnUsuarios;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRol;
    public javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
