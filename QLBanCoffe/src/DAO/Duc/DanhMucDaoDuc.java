/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Duc;

import Helper.jdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.DanhMuc;

/**
 *
 * @author CHIEN
 */
public class DanhMucDaoDuc {
    public DanhMuc readDanhMucFromResultSet(ResultSet rs) throws SQLException {
        DanhMuc mode = new DanhMuc();
        mode.setMaDanhMuc(rs.getInt(1));
        mode.setTenDanhMuc(rs.getString(2));

        return mode;
    }
     //lấy list danh sách danh mục
    public List<DanhMuc> selectDanhMuc(String sql, Object... args) {
        List<DanhMuc> danhMuc = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    danhMuc.add(readDanhMucFromResultSet(rs));

                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return danhMuc;
    }
    //truy vấn danh sách danh mục
    public List<DanhMuc> selectListDanhMuc() {
        String sql = "select * from DanhMuc\n"
                + "where TrangThaiHD = 1";
        return selectDanhMuc(sql);
    }

    //load danh mục vào combo
    public void LoadDataToComBoDanhMuc(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
        DanhMuc DMT = new DanhMuc();
        DMT.setTenDanhMuc("Tất cả các món");
        cbx.addElement(DMT);
        List<DanhMuc> danhMuc = selectListDanhMuc();
        for (int i = 0; i < danhMuc.size(); i++) {
            DanhMuc dm = danhMuc.get(i);
            cbx.addElement(dm);
        }
    }
}
