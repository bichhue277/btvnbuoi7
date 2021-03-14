package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    List<TSKhoiA> khoiA = new ArrayList<>();
    List<TSKhoiB> khoiB = new ArrayList<>();
    List<TSKhoiC> khoiC = new ArrayList<>();
    //Thêm mới thí sinh.

    public void addTSKhoiA(TSKhoiA objKhoiA){khoiA.add(objKhoiA);}
    public void addTSKhoiB(TSKhoiB objKhoiB){khoiB.add(objKhoiB);}
    public void addTSKhoiC(TSKhoiC objKhoiC){khoiC.add(objKhoiC);}

    //Hiện thị thông tin của thí sinh và khối thi của thí sinh.

    public void showA(TSKhoiA obj) {
        System.out.println(String.format("Số báo danh: %s",obj.SoBaoDanh));
        System.out.println(String.format("Họ và tên: %s",obj.HoTen));
        System.out.println(String.format("Địa chỉ: %s",obj.DiaChi));
        System.out.println(String.format("Mức ưu tiên: %s",obj.MucUuTien));
        System.out.println("Điểm toán: "+ obj.Toan);
        System.out.println("Điểm lý: "+ obj.Ly);
        System.out.println("Điểm hóa: "+ obj.Hoa);
    }
    public void showB(TSKhoiB obj) {
        System.out.println(String.format("Số báo danh: %s",obj.SoBaoDanh));
        System.out.println(String.format("Họ và tên: %s",obj.HoTen));
        System.out.println(String.format("Địa chỉ: %s",obj.DiaChi));
        System.out.println(String.format("Mức ưu tiên: %s",obj.MucUuTien));
        System.out.println("Điểm toán: "+ obj.Toan);
        System.out.println("Điểm lý: "+ obj.Sinh);
        System.out.println("Điểm hóa: "+ obj.Hoa);
    }
    public void showC(TSKhoiC obj) {
        System.out.println(String.format("Số báo danh: %s",obj.SoBaoDanh));
        System.out.println(String.format("Họ và tên: %s",obj.HoTen));
        System.out.println(String.format("Địa chỉ: %s",obj.DiaChi));
        System.out.println(String.format("Mức ưu tiên: %s",obj.MucUuTien));
        System.out.println("Điểm toán: "+ obj.Van);
        System.out.println("Điểm lý: "+ obj.Su);
        System.out.println("Điểm hóa: "+ obj.Dia);
    }
    public void ShowInfo()
    {
        for (TSKhoiA objKhoiA: khoiA) {
            showA(objKhoiA);
        }
        for (TSKhoiB objKhoiB: khoiB) {
            showB(objKhoiB);
        }
        for (TSKhoiC objKhoiC: khoiC) {
            showC(objKhoiC);
        }
    }

    //Tìm kiếm theo số báo danh.
    public void Find(String SBD)
    {
        List<TSKhoiA> objFind =khoiA.stream().filter(a->a.SoBaoDanh.equals(SBD)).collect(Collectors.toList());
        List<TSKhoiB> objFindB = khoiB.stream().filter(b->b.SoBaoDanh.equals(SBD)).collect(Collectors.toList());
        List<TSKhoiC> objFindC = khoiC.stream().filter(c->c.SoBaoDanh.equals(SBD)).collect(Collectors.toList());
        if (objFind.size()>0)
        {
            showA(objFind.get(0));
        }else if (objFindB.size()>0)
        {
            showB(objFindB.get(0));
        }else if (objFindC.size()>0)
        {
            showC(objFindC.get(0));
        }else
        {
            System.out.println("Không tìm thấy thí sinh với số báo danh là " + SBD);
        }
    }

    public void ThiSinhTrungTuyen()
    {
        Collections.sort(khoiA);
        Collections.sort(khoiB);
        Collections.sort(khoiC);
        for (TSKhoiA object: khoiA) {
            double tong = object.Toan + object.Ly + object.Hoa;
            if (tong>15) {
                showA(object);
                System.out.println("Tổng điểm là " + tong);
            }
        }


        for (TSKhoiB object: khoiB) {
            double tong = object.Toan + object.Sinh + object.Hoa;
            if (tong>15) {
                showB(object);
                System.out.println("Tổng điểm là " + tong);
            }
        }
        for (TSKhoiC object: khoiC) {
            double tong = object.Van + object.Su + object.Dia;
            if (tong>15) {
                showC(object);
                System.out.println("Tổng điểm là " + tong);
            }
        }
    }

    public static void main(String[] args)
    {
        TuyenSinh tuyenSinh =new TuyenSinh();

        TSKhoiA objKhoiA1 = new TSKhoiA("A01","Nguyễn Văn A","Hà Nội","1",4,5,5);

        TSKhoiA objKhoiA2 = new TSKhoiA("A02","Nguyễn Văn B","Hà Nội","1",7,7,6);

        TSKhoiA objKhoiA3 = new TSKhoiA("A03","Nguyễn Văn C","Hà Nội","1",7,7,9);

        TSKhoiB objKhoiB1 = new TSKhoiB("B01","Nguyễn Văn A","Hà Nội","1",5,4,5);

        TSKhoiB objKhoiB2 = new TSKhoiB("B02","Nguyễn Văn B","Hà Nội","1",5,8,5);

        TSKhoiB objKhoiB3 = new TSKhoiB("B03","Nguyễn Văn C","Hà Nội","1",5,8,6);

        TSKhoiC objKhoiC1 = new TSKhoiC("C01","Nguyễn Văn A","Hà Nội","1",5,7,5);

        TSKhoiC objKhoiC2 = new TSKhoiC("C02","Nguyễn Văn A","Hà Nội","1",6,3,5);

        TSKhoiC objKhoiC3 = new TSKhoiC("C03","Nguyễn Văn A","Hà Nội","1",6,6,5);

        //System.out.println("Số thí sinh khối A trước add: "+ tuyenSinh.khoiA.size());
       // System.out.println("Số thí sinh khối B trước add: "+ tuyenSinh.khoiB.size());
        //System.out.println("Số thí sinh khối C trước add: "+ tuyenSinh.khoiC.size());
        // add
        tuyenSinh.addTSKhoiA(objKhoiA1);
        tuyenSinh.addTSKhoiA(objKhoiA2);
        tuyenSinh.addTSKhoiA(objKhoiA3);
        tuyenSinh.addTSKhoiB(objKhoiB1);
        tuyenSinh.addTSKhoiB(objKhoiB2);
        tuyenSinh.addTSKhoiB(objKhoiB3);
        tuyenSinh.addTSKhoiC(objKhoiC1);
        tuyenSinh.addTSKhoiC(objKhoiC2);
        tuyenSinh.addTSKhoiC(objKhoiC3);

        //System.out.println("Số thí sinh khối A sau add: "+ tuyenSinh.khoiA.size());
        //System.out.println("Số thí sinh khối B sau add: "+ tuyenSinh.khoiB.size());
        //System.out.println("Số thí sinh khối C sau add: "+ tuyenSinh.khoiC.size());

        // show
        //tuyenSinh.ShowInfo();
        // tìm kiếm thí sinh theo SBD
        //tuyenSinh.Find("C01");

        //thí sinh trúng tuyển
        tuyenSinh.ThiSinhTrungTuyen();
    }
}
