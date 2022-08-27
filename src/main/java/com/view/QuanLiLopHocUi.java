/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import com.Model.LopHoc;
import com.Model.boMon;
import com.Service.Impl.LopHocServiceImpl;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anhkon
 */
public class QuanLiLopHocUi extends javax.swing.JFrame {

    private LopHocServiceImpl lstLopHocServiceImpl = new LopHocServiceImpl();
    private DefaultTableModel dtm;
    private DefaultComboBoxModel defaultComboBoxModel;
    private DefaultTableModel defaultTableModel;

    public QuanLiLopHocUi() {
        initComponents();
        loadData(lstLopHocServiceImpl.getList());
        loadCbb(lstLopHocServiceImpl.addCBb());

    }

    public void loadCbb(ArrayList<boMon> list) {
        defaultComboBoxModel = (DefaultComboBoxModel) cbbBoMon.getModel();
        for (boMon x : list) {
            defaultComboBoxModel.addElement(x.getMaBoMon());
        }
    }

    public void loadData(ArrayList<LopHoc> list) {
        defaultTableModel = (DefaultTableModel) tblLopHoc.getModel();
        defaultTableModel.setRowCount(0);
        for (LopHoc l : list) {
            defaultTableModel.addRow(new Object[]{
                l.getMaLopHoc(),
                l.getTenLop(),
                l.getbMon().getTenBoMon(),
                l.getsiSO()
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        txtTenLop = new javax.swing.JTextField();
        cbbBoMon = new javax.swing.JComboBox<>();
        txtSiSo = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLopHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quản lí lớp học");

        jLabel2.setText("Mã lớp");

        jLabel3.setText("Tên lớp");

        jLabel4.setText("Mã bộ môn");

        jLabel5.setText("Sĩ số");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lớp", "Tên lớp", "Tên bộ môn", "Sĩ số"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLopHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLopHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLopHoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaLop)
                            .addComponent(txtTenLop)
                            .addComponent(cbbBoMon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSiSo))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnSearch)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(32, 32, 32)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String tenLop = txtTenLop.getText();
        String siSo = txtSiSo.getText();
        String MaBoMon = cbbBoMon.getSelectedItem().toString();
        if (tenLop.isEmpty() || siSo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        }
        try {
            int SiSo = Integer.parseInt(siSo);
            if (SiSo <= 0) {
                JOptionPane.showMessageDialog(this, "Sĩ số phải là số dương");
                return;

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Sĩ số phải là số");
        }
        LopHoc lopHoc = new LopHoc();
        lopHoc.setTenLop(tenLop);
        lopHoc.setsiSO(Integer.parseInt(siSo));
        boMon bm = new boMon();
        bm.setMaBoMon(MaBoMon);
        lopHoc.setbMon(bm);

        if (lstLopHocServiceImpl.them(lopHoc)) {
            JOptionPane.showMessageDialog(this, "Them thanh cong");
            loadData(lstLopHocServiceImpl.getList());
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void tblLopHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopHocMouseClicked
        // TODO add your handling code here:
        int row = tblLopHoc.getSelectedRow();
        int maBoMon = cbbBoMon.getSelectedIndex();
        String id = tblLopHoc.getValueAt(row, 0).toString();
        String tenLop = tblLopHoc.getValueAt(row, 1).toString();
        String TenBoMon = tblLopHoc.getValueAt(row, 2).toString();
        String SiSo = tblLopHoc.getValueAt(row, 3).toString();

        txtMaLop.setText(id);
        txtTenLop.setText(tenLop);
        txtSiSo.setText(SiSo);
        if (TenBoMon.equalsIgnoreCase("JAVA")) {
            cbbBoMon.setSelectedIndex(0);
        }

    }//GEN-LAST:event_tblLopHocMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String maLop = txtMaLop.getText();
        String tenLop = txtTenLop.getText();
        String siSo = txtSiSo.getText();
        String MaBoMon = cbbBoMon.getSelectedItem().toString();
        LopHoc lopHoc = new LopHoc();
        lopHoc.setTenLop(tenLop);
        lopHoc.setMaLopHoc(Integer.parseInt(maLop));
        lopHoc.setsiSO(Integer.parseInt(siSo));
        boMon bm = new boMon();
        bm.setMaBoMon(MaBoMon);
        lopHoc.setbMon(bm);
        if (lstLopHocServiceImpl.sua(maLop, lopHoc)) {
            JOptionPane.showMessageDialog(this, "Update thanh cong");
            loadData(lstLopHocServiceImpl.getList());
        }


    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String maLop = txtMaLop.getText();
        LopHoc lopHoc = new LopHoc();
        lopHoc.setMaLopHoc(Integer.parseInt(maLop));
        if (lstLopHocServiceImpl.xoa(lopHoc)) {
            JOptionPane.showMessageDialog(this, "Xoa thanh cong");
            loadData(lstLopHocServiceImpl.getList());
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String maLop = txtMaLop.getText();
//        LopHoc lopHoc = new LopHoc();
//        lopHoc.setMaLopHoc(Integer.parseInt(maLop));
        loadData(lstLopHocServiceImpl.timKiem(Integer.parseInt(maLop)));
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiLopHocUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiLopHocUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiLopHocUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiLopHocUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiLopHocUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbBoMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLopHoc;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtSiSo;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
