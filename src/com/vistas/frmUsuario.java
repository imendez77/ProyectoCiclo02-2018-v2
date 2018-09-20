package com.vistas;

import com.modelo.Usuario;
import com.dao.DAOUsuario;
import com.dao.DAORol;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Isra Mendez
 */
public class frmUsuario extends javax.swing.JInternalFrame {
    DAOUsuario dao = new DAOUsuario();
    DAORol daor = new DAORol();
    
    String rows[] = {"Código", "Email", "Username", "Password", "Estado", "ID Rol", "F. Creación", "F. Eliminación", "F. Modificación"};
    DefaultTableModel model = new DefaultTableModel(rows, 0);
    ArrayList<Object[]> data = new ArrayList<>();
    
    public frmUsuario() {
        initComponents();
        load();
        buttons(1);
        this.txtCodigou.setEnabled(false);
    }

    public void load()
    {
        this.data = dao.mostrar();
        this.model.setNumRows(0);
        for (Object[] dt : this.data) {
            this.model.addRow(dt);
        }
        this.tableDUsuarios.setModel(model);
        
    }
    
    public void clean()
    {
        this.lblPass.setText("...");
        this.txtCodigou.setText("");
        this.txtUsername.setText("");
        this.txtCorreo.setText("");
        this.txtPass.setText("");
        this.txtRPass.setText("");
        this.cmbRol.setSelectedIndex(0);
    }
    
    public void buttons(int opc)
    {
        if(opc==1)
        {
            this.btnCancel.setEnabled(false);
            this.btnDelete.setEnabled(false);
            this.btnSave.setEnabled(false);
            this.btnModify.setEnabled(false);
            this.btnNew.setEnabled(true);
            
            this.cmbRol.setEnabled(false);
            this.txtUsername.setEnabled(false);
            this.txtCorreo.setEnabled(false);
            this.txtPass.setEnabled(false);
            this.txtRPass.setEnabled(false);
        }else if(opc==2){
            this.btnCancel.setEnabled(true);
            this.btnDelete.setEnabled(false);
            this.btnSave.setEnabled(true);
            this.btnModify.setEnabled(false);
            this.btnNew.setEnabled(false);
            
            this.cmbRol.setEnabled(true);
            this.txtUsername.setEnabled(true);
            this.txtCorreo.setEnabled(true);
            this.txtPass.setEnabled(true);
            this.txtRPass.setEnabled(true);
        }else if(opc==3){
            this.btnCancel.setEnabled(true);
            this.btnDelete.setEnabled(true);
            this.btnSave.setEnabled(false);
            this.btnModify.setEnabled(true);
            this.btnNew.setEnabled(false);
            
            this.cmbRol.setEnabled(true);
            this.txtUsername.setEnabled(true);
            this.txtCorreo.setEnabled(true);
            this.txtPass.setEnabled(true);
            this.txtRPass.setEnabled(true);
        }
    }
    
    public String contraseñas()
    {
        String newPass="";
        
        if(this.txtRPass.getText().equals(this.txtPass.getText()))
        {
            newPass = this.txtPass.getPassword().toString();
            this.lblPass.setText("Las contraseñas coinciden");
            this.btnSave.setEnabled(true);
        }else
        {
            this.lblPass.setText("Las contraseñas no coinciden");
            this.btnSave.setEnabled(false);
        }
        
        return newPass;
    }
    
    public boolean validar()
    {
        int value=0;
        if(this.cmbRol.getSelectedIndex()==1)
        {
            value=1;
        }
        else{
            value=0;
        }
        if(this.txtCorreo.getText().isEmpty() ||  contraseñas().isEmpty() || this.txtUsername.getText().isEmpty())
        {
            value=1;
        }
        else
        {
            value=0;
        }
        if(value==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDUsuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigou = new javax.swing.JTextField();
        cmbRol = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(763, 422));
        setMinimumSize(new java.awt.Dimension(763, 422));
        setPreferredSize(new java.awt.Dimension(763, 422));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Usuarios");

        tableDUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDUsuarios);

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-documento-24.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-guardar-24.png"))); // NOI18N
        btnSave.setText("Agregar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-cancelar-24.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-editar-archivo-24.png"))); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-basura-24.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("E-mail:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Repita");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Rol:");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña:");

        txtRPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRPassFocusLost(evt);
            }
        });
        txtRPass.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtRPassInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtRPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRPassActionPerformed(evt);
            }
        });
        txtRPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRPassKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña:");

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPass.setText("...");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Código");

        cmbRol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Profesional", "Empresa" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(txtCodigou, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtRPass, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPass)
                        .addGap(175, 175, 175))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDUsuariosMouseClicked
        buttons(3);
        
        this.txtCodigou.setText(this.tableDUsuarios.getValueAt(tableDUsuarios.getSelectedRow(), 0).toString());
        this.txtCorreo.setText(this.tableDUsuarios.getValueAt(tableDUsuarios.getSelectedRow(), 1).toString());
        this.txtUsername.setText(this.tableDUsuarios.getValueAt(tableDUsuarios.getSelectedRow(), 2).toString());
        this.txtPass.setText(this.tableDUsuarios.getValueAt(tableDUsuarios.getSelectedRow(), 3).toString());
        this.txtRPass.setText(this.tableDUsuarios.getValueAt(tableDUsuarios.getSelectedRow(), 4).toString());
        
        String rol = this.tableDUsuarios.getValueAt(tableDUsuarios.getSelectedRow(), 5).toString();
        if(rol.equals("1"))
        {
            this.cmbRol.setSelectedItem("Administrador");
        }else if(rol.equals("2")){
            this.cmbRol.setSelectedItem("Profesional");
        }else if(rol.equals("3")){
            this.cmbRol.setSelectedItem("Empresa");
        }
        
    }//GEN-LAST:event_tableDUsuariosMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        buttons(2);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clean();
        buttons(1);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int id_rol=0;
        String rol = this.cmbRol.getSelectedItem().toString();
        if(rol.equals("Administrador"))
        {
            id_rol = 1;
        }else if(rol.equals("Profesional")){
            id_rol = 2;
        }else if(rol.equals("Empresa")){
            id_rol = 3;
        }
        try {
            Usuario user = new Usuario(Integer.parseInt(this.txtCodigou.getText()), this.txtUsername.getText(), this.txtPass.getText(), this.txtCorreo.getText(), id_rol);
        
        if(dao.modificar(user))
        {
            JOptionPane.showMessageDialog(null, "Modificado Exitosamente", "SUCCESS", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se pudo modificar", "FAILED", 0);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar: "+e.getMessage(), "FAILED", 0);
        }
        load();
        clean();
        buttons(1);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validar())
        {
            int id_rol=0;
            String rol = this.cmbRol.getSelectedItem().toString();
            if(rol.equals("Administrador"))
            {
                id_rol = 1;
            }else if(rol.equals("Profesional")){
                id_rol = 2;
            }else if(rol.equals("Empresa")){
                id_rol = 3;
            }


            try {
                Usuario user = new Usuario(Integer.parseInt(this.txtCodigou.getText()), this.txtUsername.getText(), this.txtPass.getText(), this.txtCorreo.getText(), id_rol);

                if(dao.insertar(user))
                {
                    JOptionPane.showMessageDialog(null, "Insertado Exitosamente", "SUCCESS", 1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se pudo insertar", "FAILED", 0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo insertar: "+e.getMessage(), "FAILED", 0);
            }
            load();
            clean();
            buttons(1);
        }else{
            JOptionPane.showMessageDialog(null, "Debe completar y seleccionar todos los campos", "FAILED", 0);
        }  
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRPassActionPerformed
        
    }//GEN-LAST:event_txtRPassActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Usuario user = new Usuario(Integer.parseInt(this.txtCodigou.getText()));
        
            if(dao.eliminar(user))
            {
                JOptionPane.showMessageDialog(null, "Eliminado Exitosamente", "SUCCESS", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar", "FAILED", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar: "+e.getMessage(), "FAILED", 0);
        }
        load();
        clean();
        buttons(1);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtRPassInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtRPassInputMethodTextChanged
       
    }//GEN-LAST:event_txtRPassInputMethodTextChanged

    private void txtRPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRPassKeyTyped
        
    }//GEN-LAST:event_txtRPassKeyTyped

    private void txtRPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRPassFocusLost
        contraseñas();
    }//GEN-LAST:event_txtRPassFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JTable tableDUsuarios;
    private javax.swing.JTextField txtCodigou;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
