package Bai2;

import Bai1.BanDoc;
import Bai1.MuonSach;
import Bai1.Sach;

import java.util.Scanner;

public class QuanLy {
    public static Hang[] hangs;
    public static KhachHang[] khachHangs;
    public static MuaHang[] muaHangs;
    public void run(){
        while (true) {
            System.out.println("Danh sach chuc nang:");
            System.out.println("1.Them khách hàng");
            System.out.println("2.In ra danh sach khách hàng");
            System.out.println("3.Them hàng hóa");
            System.out.println("4.In ra danh hàng hóa");
            System.out.println("5.Nhap hoa don");
            System.out.println("6.In danh sách mua hàng");
            System.out.println("7.Sx theo ten khách hàng");
            System.out.println("8.Sx theo ten hang");
            System.out.println("9. In hóa đơn");
            boolean flag = true;
            do {
                flag = true;
                int chosse = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chon chuc nang");
                chosse = scanner.nextInt();
                switch (chosse) {
                    case 1:
                        ThemKH();
                        break;
                    case 2:
                        HienThiKH();
                        break;
                    case 3:
                        ThemHang();
                        break;
                    case 4:
                        HienThiHang();
                        break;
                    case 5:
                        HoaDon();
                        break;
                    case 6:
                        output();
                        break;
                    case 7:
                        SXTenKH();
                        break;
                    case 8:
                        SXTenH();
                        break;
                    case 9:
                        SXTenH();
                        break;
                    default:
                        System.out.println("Khong co danh muc vua nhap, vui long nhap lai!");
                        flag = false;
                        break;
                }
            }
            while (!flag);
        }
    }
    public void ThemKH(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so lương khách:");
        int a=sc.nextInt();
        khachHangs =new KhachHang[a];
        for(int i=0; i<a; i++){
            KhachHang khachHang=new KhachHang();
            khachHang.Addkh();
            khachHangs[i]=khachHang;
        }
    }
    public void HienThiKH(){
        System.out.println("Danh sách khách hàng");
        for(KhachHang khachHang: khachHangs){
                System.out.println(khachHang);
        }
    }

    public void ThemHang(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so lương hàng:");
        int a=sc.nextInt();
        hangs =new Hang[a];
        for(int i=0; i<a; i++){
            Hang hang=new Hang();
            hang.AddHang();
            hangs[i]=hang;
        }
    }
    public void HienThiHang(){
        System.out.println("Danh sách hàng");
        for(Hang hang: hangs){
            System.out.println(hang);
        }
    }
    public KhachHang TimKiemKH(int id){
        for(KhachHang khachHang:khachHangs){
            if(khachHang.getMa()==id){
                return khachHang;
            }
        }
        return null;
    }
    public Hang TimKiemH(int id){
        for(Hang hang:hangs){
            if(hang.getMaHang()==id){
                return hang;
            }
        }
        return null;
    }

    public void HoaDon(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap người so muốn mua hàng:");
        boolean flag=false;
        int a;
        do {
            a = sc.nextInt();
            if (a > khachHangs.length) {
                System.out.println("nhap lại số khách hàng:");
                flag = true;
            }
            else flag=false;
        }while (flag);
        muaHangs=new MuaHang[a];
        int tong=0;
        for(int i=0; i<a; i++){
            System.out.println("Nhap id khách:");
            int d;
            KhachHang khachHang;
            boolean kt=false;
            do{
                d=sc.nextInt();
                khachHang=TimKiemKH(d);
                if(khachHang==null){
                    System.out.println("nhap lại id:");
                    kt=true;
                }
                else
                    kt=false;
            }while (kt);
            System.out.println("Nhap so lương mat hang can mua:");
            int b;
            do {
                b=sc.nextInt();
                if(b<0 || b>10){
                    System.out.println("nhap lại so lương mat hang can mua:");
                    flag=true;
                }
                else
                    flag=false;
            }while (flag);
            Hang[] hangs=new Hang[b];
            int [] ListSL=new int[b];
            for(int j=0; j<b; j++){
                System.out.println("Nhập id hàng can muon");
                int id=sc.nextInt();
                Hang hang=TimKiemH(id);
                int c;
                System.out.println("Nhap so lương:");
                    c=sc.nextInt();
                ListSL[j]=c;
                hangs[j]=hang;
            }

            MuaHang muaHang= new MuaHang(khachHang, hangs,ListSL);
            muaHangs[i]=muaHang;
        }
    }
    public void output(){
        for(MuaHang muaHang:muaHangs)
        {
            System.out.println(muaHang);
        }
    }

    public void SXTenKH(){
        MuaHang tam=new MuaHang();
        for(int i=0; i<muaHangs.length-1; i++){
            for(int j=i+1; j<muaHangs.length; j++)
            {
                if(muaHangs[i].getKhachHang().getHoTen().compareTo(muaHangs[j].getKhachHang().getHoTen())>0)
                {
                    tam=muaHangs[i];
                    muaHangs[i]=muaHangs[j];
                    muaHangs[j]=tam;
                }
            }
        }
    }
    public void SXTenH(){
        MuaHang tam=new MuaHang();
        for(int i=0; i<muaHangs.length; i++){
            hangs=muaHangs[i].getHangs();
            Hang tg=new Hang();
            for(int j=0; j<muaHangs[i].getHangs().length-1; j++){
                for(int k=j+1; j<muaHangs[i].getHangs().length; k++){
                    if(hangs[j].getTenHang().compareTo(hangs[k].getTenHang())>0){
                        tg=hangs[j];
                        hangs[j]=hangs[k];
                        hangs[k]=tg;
                    }
                }
            }
        }
        }

        public void XuatHD() {
            for (int i = 0; i < muaHangs.length; i++) {
                hangs = muaHangs[i].getHangs();
                int []Listsl=muaHangs[i].getSoluong();
                int tonggia=0;
                for (int j = 0; j < muaHangs[i].getHangs().length; j++) {
                     {
                            tonggia=tonggia+hangs[j].getGiaBan()*Listsl[j];
                    }
                }
                System.out.println(muaHangs[i]+" tong tien"+tonggia);
            }
        }



}
