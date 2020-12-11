/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author CHIEN
 */
public class ChuyenDoi {
    public static String chuyenDoiTien(double tien){
        NumberFormat fomater = new DecimalFormat("###,###,###,###");
        return fomater.format(tien);
    }
}
