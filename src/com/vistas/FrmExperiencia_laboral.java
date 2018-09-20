package com.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.dao.DAOExperiencia_laboral;
import com.modelo.Experiencia_laboral;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author HP
 */
public class FrmExperiencia_laboral extends javax.swing.JInternalFrame {
    String columnas[]={"Id","Empresa","Cargo","Tiempo laborado","Descripcion","Salario","Fecha creacion","Fecha Modificacion"};
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    DAOExperiencia_laboral dao = new DAOExperiencia_laboral();
    ArrayList<Object[]>data = new ArrayList<>();
    /**
     * Creates new form FrmExperiencia_laboral
     */
    public FrmExperiencia_laboral() {
        initComponents();
        initComponents();
        initComponents();
        actualizar();
        bottons(1);
    }
    public void actualizar(){
        this.data = dao.mostrar();
        this.modelo.setNumRows(0);
        
         for (Object [] dato : this.data) {//es un foreach
            this.modelo.addRow(dato);//de tipo objeto
        }
        this.tblRegistros.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdExperiencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTiempoLab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        txtIdR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(843, 508));
        setPreferredSize(new java.awt.Dimension(843, 508));

        jLabel1.setText("Id Experiencia laboral");

        txtIdExperiencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdExperienciaMouseClicked(evt);
            }
        });

        jLabel2.setText("Empresa:");

        txtEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpresaMouseClicked(evt);
            }
        });

        jLabel3.setText("Cargo:");

        txtCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCargoMouseClicked(evt);
            }
        });

        jLabel4.setText("Tiempo laborado:");

        txtTiempoLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTiempoLabMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Experiencia Laboral");

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);

        jLabel6.setText("Descripcion:");

        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseClicked(evt);
            }
        });

        jLabel7.setText("Salario:");

        txtSalario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalarioMouseClicked(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-guardar-24.png"))); // NOI18N
        btnInsert.setText("Guardar");
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-cancelar-24.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-editar-archivo-24.png"))); // NOI18N
        btnModify.setText("Modificar");
        btnModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyMouseClicked(evt);
            }
        });
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

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-documento-24.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        btnNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNewKeyPressed(evt);
            }
        });

        btnReporte.setText("Ver");
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteMouseClicked(evt);
            }
        });
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        txtIdR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdRMouseClicked(evt);
            }
        });

        jLabel8.setText("Ingrese el id de la persona que desea visualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6))
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTiempoLab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel5)))
                        .addGap(51, 51, 51)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReporte))
                            .addComponent(jLabel8))
                        .addContainerGap(571, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTiempoLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnInsert)
                    .addComponent(btnCancel)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdExperienciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdExperienciaMouseClicked
        this.txtIdExperiencia.setEditable(false);
    }//GEN-LAST:event_txtIdExperienciaMouseClicked

    private void txtEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpresaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaMouseClicked

    private void txtCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCargoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoMouseClicked

    private void txtTiempoLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTiempoLabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoLabMouseClicked

    private void txtDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionMouseClicked

    private void txtSalarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioMouseClicked

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        Experiencia_laboral expL = new Experiencia_laboral(this.txtEmpresa.getText(), this.txtCargo.getText(),this.txtTiempoLab.getText(),this.txtDescripcion.getText(),this.txtSalario.getText());
        if (dao.insertar(expL)) {
            JOptionPane.showMessageDialog(null, "Datos insertados exitosamente", "SUCCESS", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Error", "FAILED", 0);
        }
        actualizar();
        clean();
        bottons(1);
    }//GEN-LAST:event_btnInsertMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        clean();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        bottons(1);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyMouseClicked

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        Experiencia_laboral expL = new Experiencia_laboral(Integer.parseInt(this.txtIdExperiencia.getText()),this.txtEmpresa.getText(), this.txtCargo.getText(),this.txtTiempoLab.getText(),this.txtDescripcion.getText(),this.txtSalario.getText());
        if (dao.modificar(expL)) {
            JOptionPane.showMessageDialog(null, "Datos modificados exitosamente", "SUCCESS", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar datos", "FAILED", 0);
        }
        actualizar();
        clean();
        bottons(1);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Experiencia_laboral expL = new Experiencia_laboral(Integer.parseInt(this.txtIdExperiencia.getText()));
        int yesnot = JOptionPane.showConfirmDialog(this, "Esta seguro que quiere eliminar este registro?", "WARNING!", JOptionPane.YES_NO_OPTION);
        if(yesnot==0)
        {
            if (dao.eliminar(expL)) {
                JOptionPane.showMessageDialog(null, "Dato eliminado exitosamente", "Exito", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Error al borrar datos", "Error", 0);
            }
            actualizar();
            clean();

        }else{
            clean();

        }
        bottons(1);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        clean();
        bottons(3);
    }//GEN-LAST:event_btnNewMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNewKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewKeyPressed

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        bottons(2);

        this.txtIdExperiencia.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 0).toString());
        this.txtEmpresa.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 1).toString());
        this.txtCargo.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 2).toString());
        this.txtTiempoLab.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 3).toString());
        this.txtDescripcion.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 4).toString());
        this.txtSalario.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 5).toString());

    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void btnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseClicked
        int id=Integer.parseInt(txtIdR.getText());
        Map parametros = new HashMap();
        parametros.put("id", id);

        Connection conexion = null;
        JasperReport reporte;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_vacantes_p",
                "root",
                "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            reporte = JasperCompileManager.compileReport("src/reportes/Experiencia_laboral.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(reporte,parametros,conexion);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            ///  Logger.getLogger(reporte.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnReporteMouseClicked

    private void txtIdRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed
    
    public void clean()
    {
        this.txtIdExperiencia.setText("");
        this.txtEmpresa.setText("");
        this.txtCargo.setText("");
        this.txtTiempoLab.setText("");
        this.txtDescripcion.setText("");
        this.txtSalario.setText("");
    }
    
    public void bottons(int opc)
    {
        if(opc==1)
        {
            this.btnDelete.setEnabled(false);
            this.btnInsert.setEnabled(false);
            this.btnModify.setEnabled(false);
            this.btnNew.setEnabled(true);
            this.btnCancel.setEnabled(false);
            
            this.txtIdExperiencia.setEnabled(false);
            this.txtEmpresa.setEnabled(false);
            this.txtCargo.setEnabled(false);
            this.txtTiempoLab.setEnabled(false);
            this.txtDescripcion.setEnabled(false);
            this.txtSalario.setEnabled(false);
            
            
            
        }else if(opc==2){
            this.btnDelete.setEnabled(true);
            this.btnInsert.setEnabled(false);
            this.btnModify.setEnabled(true);
            this.btnNew.setEnabled(false);
            this.btnCancel.setEnabled(true);
            
            this.txtIdExperiencia.setEnabled(true);
            this.txtEmpresa.setEnabled(true);
            this.txtCargo.setEnabled(true);
            this.txtTiempoLab.setEnabled(true);
            this.txtDescripcion.setEnabled(true);
            this.txtSalario.setEnabled(true);
        }else if(opc==3){
            this.btnDelete.setEnabled(false);
            this.btnInsert.setEnabled(true);
            this.btnModify.setEnabled(false);
            this.btnNew.setEnabled(false);
            this.btnCancel.setEnabled(true);
            
            this.txtIdExperiencia.setEnabled(true);
            this.txtEmpresa.setEnabled(true);
            this.txtCargo.setEnabled(true);
            this.txtTiempoLab.setEnabled(true);
            this.txtDescripcion.setEnabled(true);
            this.txtSalario.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtIdExperiencia;
    private javax.swing.JTextField txtIdR;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTiempoLab;
    // End of variables declaration//GEN-END:variables
}