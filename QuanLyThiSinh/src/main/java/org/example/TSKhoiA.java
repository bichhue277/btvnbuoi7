package org.example;

public class TSKhoiA extends QuanLyThiSinh {
    public double Toan;
    public double Ly;
    public double Hoa;

    public TSKhoiA(String SBD,String hoTen, String address,String uuTien, double toan,double ly, double hoa)
    {
        SoBaoDanh = SBD;
        HoTen=hoTen;
        DiaChi=address;
        MucUuTien=uuTien;
        Toan=toan;
        Ly = ly;
        Hoa = hoa;
        Tong = toan + ly + hoa;
    }
}
