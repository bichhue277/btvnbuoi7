package org.example;

public class QuanLyThiSinh implements Comparable<QuanLyThiSinh>{
    public String SoBaoDanh;
    public String HoTen;
    public String DiaChi;
    public String MucUuTien;
    public double Tong;



    @Override
    public int compareTo(QuanLyThiSinh o) {
        double check = o.Tong - Tong;
        if(check < 0) {
            return -1;
        } else if(check > 0) {
            return 1;
        }
        return 0;
    }
}
