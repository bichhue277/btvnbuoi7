package org.example;

public class TSKhoiC extends QuanLyThiSinh{
    public double Van;
    public double Su;
    public double Dia;
    public TSKhoiC(String SBD,String hoTen, String address,String uuTien, double van,double su, double dia)
    {
        SoBaoDanh = SBD;
        HoTen=hoTen;
        DiaChi=address;
        MucUuTien=uuTien;
        Van = van;
        Su = su;
        Dia = dia;
        Tong = van+su+dia;
    }
}
