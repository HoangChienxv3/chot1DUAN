/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniForm;

import DAO.BanHangDao;
import DAO.HoaDonBHDao;
import HanhDong.hanhDongBanHang;
import Helper.HanhDong;
import Helper.shareHelper;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Ban;
import model.HoaDonBH;
import model.KhuVuc;

/**
 *
 * @author CHIEN
 */
public class ChuyenBanMni extends javax.swing.JFrame {

    BanHangDao BHDao = new BanHangDao();
    HoaDonBHDao HDDao = new HoaDonBHDao();

    DefaultComboBoxModel comboMode;
    List<Ban> lstBan = new ArrayList<>();
    String MaHD;
    Integer MaBan;

    /**
     * Creates new form ChuyenBanMni
     */
    public ChuyenBanMni(String maHD, Integer maBan) {
        MaHD = maHD;
        MaBan = maBan;
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    void init() {
        loadDataToComBoKV();
        loadDataToListBan();
        LoadBanToPanel();
    }

    public void loadDataToComBoKV() {
        comboMode = (DefaultComboBoxModel) cbxKhuVuc.getModel();
        comboMode = (DefaultComboBoxModel) cbxKhuVuc.getModel();
        BHDao.loadDataToComBoKhuVuc(comboMode);
    }

    //load list ban
    public void loadDataToListBan() {
        lstBan.removeAll(lstBan);
        lstBan = BHDao.selectListBan();
    }

    //lấy bàn
    public Ban getBanBH() {
        KhuVuc kv = (KhuVuc) comboMode.getElementAt(cbxKhuVuc.getSelectedIndex());
        return BHDao.getBan(lbTenBan.getText(), kv.getMaKhuVuc());
    }
    //bàn
    GridBagConstraints gbcBan = new GridBagConstraints();

    public void LoadBanToPanel() {
        gbcBan.insets = new Insets(3, 3, 3, 3);
        int x = 0, y = 0;
        pnBan.removeAll();

        //
        KhuVuc kv = (KhuVuc) comboMode.getElementAt(cbxKhuVuc.getSelectedIndex());;
        //
        for (int i = 0; i < lstBan.size(); i++) {
            Ban ban = lstBan.get(i);

            Integer makv = ban.getMaKhuVuc();

            if (makv.equals(kv.getMaKhuVuc())) {

                gbcBan.gridx = x;
                gbcBan.gridy = y;
                ++x;
                if (x % 9 == 0) {
                    x = 0;
                    ++y;
                }
                pnBan.add(taoBan(ban), gbcBan);
            }
        }
        pnBan.validate();
        pnBan.repaint();
    }

    //tạo button ban
    public JButton taoBan(Ban ban) {
        JButton btBan = new JButton();
        btBan.setText(ban.getTenBan());
        btBan.setPreferredSize(new Dimension(100, 100));
        btBan.setIcon(shareHelper.getIcon());
        btBan.setBackground(Color.white);
        btBan.setVerticalTextPosition(JLabel.BOTTOM);
        btBan.setHorizontalTextPosition(JLabel.CENTER);
        if (ban.isTrangThai()) {
            btBan.setBackground(Color.red);
        } else {
            btBan.setBackground(Color.white);
        }
        //xử lý sự kiện
        btBan.addActionListener((ae) -> {
            lbTenBan.setText(btBan.getText());
            KhuVuc kv = (KhuVuc) comboMode.getElementAt(cbxKhuVuc.getSelectedIndex());;
            if (lbTenBan.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Bạn hãy chọn bàn chuyển đến");
            } else {
                if (!ban.isTrangThai()) {
                    ///code chuyển bàn

                } else {
                    JOptionPane.showMessageDialog(this, "Bạn hãy chọn bàn đã không người ngồi");
                }
            }
            System.out.println(HanhDong.MaHD);
        });
        return btBan;
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
        jPanel2 = new javax.swing.JPanel();
        cbxKhuVuc = new javax.swing.JComboBox<>();
        lbTenBan = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnBan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1000, 450));
        setMinimumSize(new java.awt.Dimension(1000, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 450));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(107, 70, 52));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 450));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 450));

        cbxKhuVuc.setBackground(new java.awt.Color(204, 204, 255));
        cbxKhuVuc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cbxKhuVuc.setForeground(new java.awt.Color(107, 70, 52));
        cbxKhuVuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khu vực", "tầng 1", "tầng 2", "sân thượng" }));
        cbxKhuVuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxKhuVucItemStateChanged(evt);
            }
        });
        cbxKhuVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKhuVucActionPerformed(evt);
            }
        });

        lbTenBan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTenBan.setForeground(new java.awt.Color(255, 255, 255));

        btnHuy.setBackground(new java.awt.Color(204, 0, 0));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/huy.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXacNhan.setBackground(new java.awt.Color(126, 199, 47));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dangNhap.png"))); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        pnBan.setBackground(new java.awt.Color(212, 181, 152));
        pnBan.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(pnBan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTenBan, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXacNhan)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHuy)
                        .addComponent(btnXacNhan))
                    .addComponent(cbxKhuVuc)
                    .addComponent(lbTenBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxKhuVucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxKhuVucItemStateChanged
        // TODO add your handling code here:
        LoadBanToPanel();
    }//GEN-LAST:event_cbxKhuVucItemStateChanged

    private void cbxKhuVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKhuVucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKhuVucActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnHuyActionPerformed
    //cập nhập hóa đơn
    public void updateBanHoaDon(Integer maBan) {
        HDDao.updateMabanHoadon(MaHD, maBan, lbTenBan.getText());
    }

    //cap nhap trang thái bàn
    public void updateTrangThaiBan(Integer maBanchuyendi, Integer maBanchuyenden) {
        BHDao.updateTrangThaiNgoiTheoMa(0, maBanchuyendi);
        BHDao.updateTrangThaiNgoiTheoMa(1, maBanchuyenden);
    }
    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (lbTenBan.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn hãy chọn bàn chuyển đến");
        } else {
            Ban bn = getBanBH();
            if (!bn.isTrangThai()) {
                //code chuyển bàn
                updateBanHoaDon(bn.getMaBan());
                updateTrangThaiBan(MaBan, bn.getMaBan());
                JOptionPane.showMessageDialog(this, "Chuyển thành công");
//                KhuVuc kv = (KhuVuc) comboMode.getElementAt(cbxKhuVuc.getSelectedIndex());;
//                hanhDongBanHang.kvDC = kv;
                hanhDongBanHang.LoadBanToPanel();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Bạn hãy chọn bàn không người ngồi");
            }
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ChuyenBanMni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChuyenBanMni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChuyenBanMni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChuyenBanMni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChuyenBanMni().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbxKhuVuc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTenBan;
    private javax.swing.JPanel pnBan;
    // End of variables declaration//GEN-END:variables
}
