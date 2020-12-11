/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbancoffe;

import DAO.DangNhapDao;
import Helper.shareHelper;
import java.sql.Connection;
import javax.swing.JOptionPane;
import miniForm.guiGmail;
import model.TaiKhoanMode;

/**
 *
 * @author CHIEN
 */
public class DangNhapDialog extends javax.swing.JDialog {

    /**
     * Creates new form DangNhapDialog
     */
    static TaiKhoanMode tk = new TaiKhoanMode();
    DangNhapDao dao = new DangNhapDao();

    public DangNhapDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lamMoiLoi();
    }

    public void lamMoiLoi() {
        lbLoiMatKhau.setText("");
        lbLoiTenDangNhap.setText("");
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tpwPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        lbLoiTenDangNhap = new javax.swing.JLabel();
        lbLoiMatKhau = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 800, 2);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 70, 52)));
        jPanel2.setMaximumSize(new java.awt.Dimension(360, 350));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(99, 72, 62));
        jLabel2.setText("Đăng Nhập");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(99, 72, 62));
        jLabel5.setText("Tên đăng nhập");

        txtTenDangNhap.setBackground(new java.awt.Color(247, 225, 207));
        txtTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenDangNhap.setForeground(new java.awt.Color(99, 72, 62));
        txtTenDangNhap.setText("Chien");
        txtTenDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDangNhapActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(99, 72, 62));
        jLabel6.setText("Mật khẩu");

        tpwPass.setBackground(new java.awt.Color(247, 225, 207));
        tpwPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tpwPass.setText("123");
        tpwPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpwPassActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 72, 62));
        jLabel7.setText("Quên mật khẩu?");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        lbLoiTenDangNhap.setForeground(new java.awt.Color(204, 0, 51));
        lbLoiTenDangNhap.setText("Lỗi tên đăng nhập");

        lbLoiMatKhau.setForeground(new java.awt.Color(204, 0, 51));
        lbLoiMatKhau.setText("Lỗi mật khẩu");

        btnDangNhap.setBackground(new java.awt.Color(107, 70, 52));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dangNhap.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDangNhap)
                            .addComponent(tpwPass)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLoiTenDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnDangNhap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbLoiTenDangNhap))
                .addGap(10, 10, 10)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbLoiMatKhau))
                .addGap(10, 10, 10)
                .addComponent(tpwPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(420, 50, 360, 370);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(770, 0, 20, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo1.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 30, 400, 420);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/uong-cafe-benh-vien-an-viet.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 450);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDangNhapActionPerformed

    private void tpwPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpwPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpwPassActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        guiGmail gm = new guiGmail();
        gm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked
    //
  
    public void loginDN() {
        String tenDN = txtTenDangNhap.getText();
        String matKhau = new String(tpwPass.getPassword());
        try {
            tk = dao.findByTenTaiKhoan(tenDN);
            //
            if (tk != null) {
                lbLoiTenDangNhap.setText("");
                if (tk.getMatKhau().equals(matKhau)) {
                    lbLoiMatKhau.setText("");
                    shareHelper.User = tk;
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                    this.dispose();
                } else {
                    lbLoiMatKhau.setText("Sai mật khẩu");
                }
            } else {
                lbLoiTenDangNhap.setText("Sai tài khoản");
                lbLoiMatKhau.setText("");
            }
        } catch (Exception e) {
        }
    }

    //
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        loginDN();
        System.out.println(shareHelper.User.toString());
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapDialog dialog = new DangNhapDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLoiMatKhau;
    private javax.swing.JLabel lbLoiTenDangNhap;
    private javax.swing.JPasswordField tpwPass;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
