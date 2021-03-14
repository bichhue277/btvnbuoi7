package org.example;

public class TSKhoiB extends QuanLyThiSinh{
    public double Toan;
    public double Hoa;
    public double Sinh;

    public TSKhoiB(String SBD,String hoTen, String address,String uuTien, double toan,double sinh, double hoa)
    {
        SoBaoDanh = SBD;
        HoTen=hoTen;
        DiaChi=address;
        MucUuTien=uuTien;
        Toan = toan;
        Sinh = sinh;
        Hoa = hoa;
        Tong = toan+hoa+sinh;
    }
}
