/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.jdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.SuKien;

/**
 *
 * @author CHIEN
 */
public class SuKienDao {

    //LỖI LÀM LẠI
    //đọc 1 sự kiện từ bản ghi
    public SuKien readSuKienFromResultSet(ResultSet rs) throws SQLException {
        SuKien mode = new SuKien();
        mode.setMaSuKien(rs.getString(1));
        mode.setTenSuKien(rs.getString(2));
        mode.setUuDai(rs.getInt(3));
        mode.setTgBatDau(rs.getString(4));
        mode.setTgKetThuc(rs.getString(5));
        mode.setLoaiSuKien(rs.getBoolean(6));

        System.out.println(mode);

        return mode;
    }

    //lấy list danh sách sự kiện
    public List<SuKien> selectSuKien(String sql, Object... args) {
        List<SuKien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = jdbcHelper.executeQuery(sql);
                while (rs.next()) {
                    list.add(readSuKienFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;
    }

    //load data to combo
    public void LoadDataToComBo(DefaultComboBoxModel cbx) {
        cbx.removeAllElements();
        String sql = "select * from SuKien\n"
                + "where TrangThai = 1";
        List<SuKien> list = selectSuKien(sql);
        for (int i = 0; i < list.size(); i++) {
            SuKien sk = list.get(i);
            cbx.addElement(sk);
        }
    }


}
