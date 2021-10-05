package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sach {
    public static int iD;
    public int maSach;
    public String tenSach;
    public String tacGia;
    public String chuyenNganh;
    public String namXuatBan;

    public Sach(int maSach, String tenSach, String tacGia, String chuyenNganh, String namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.namXuatBan = namXuatBan;
    }

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        Sach.iD = iD;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }


    public Sach(){
            this.maSach=iD++;
    }


    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

//    ArrayList<Sach> saches = new ArrayList<Sach>();

//    public void run(){
//        while (true) {
//            System.out.println("Danh sach chuc nang:");
//            System.out.println("1.Them ban sachs");
//            System.out.println("2.In ra danh sach sach");
//
//
//            boolean flag = true;
//            do {
//                flag = true;
//                int chosse = 0;
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Chon chuc nang");
//                chosse = scanner.nextInt();
//                switch (chosse) {
//                    case 1:
//                        add();
//                        break;
//                    case 2:
//                        output();
//                        break;
//                    default:
//                        System.out.println("Khong co danh muc vua nhap, vui long nhap lai!");
//                        flag = false;
//                        break;
//                }
//            }
//            while (!flag);
//        }
//    }
    public void addsach() {
        Scanner scanner = new Scanner(System.in);
        this.setMaSach(iD);
        System.out.println("Ten sach");
        this.setTenSach(scanner.nextLine());
        System.out.println("Tac gia:");
        this.setTacGia(scanner.nextLine());
        System.out.println("Nam sb:");
        this.setNamXuatBan(scanner.nextLine());
        System.out.println("chuyen nganh:");
        String[] arr = {"Khoa hoc tu nhien", "Van hoc-Nghe thuat", "Dien tu vien thong", "Cong nghe thong tin"};
        boolean kt = true;
        do {
            kt = true;
            int a = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Chon loai sach:");
            System.out.println("1.Khoa hoc tu nhien:");
            System.out.println("2.Van hoc-Nghe thuat");
            System.out.println("3.Dien tu vien thong");
            System.out.println("4.Cong nghe thong tin");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    this.setChuyenNganh(arr[0]);
                    break;
                case 2:
                    this.setChuyenNganh(arr[1]);
                    break;
                case 3:
                    this.setChuyenNganh(arr[2]);
                    break;
                case 4:
                    this.setChuyenNganh(arr[2]);
                    break;
                default:
                    System.out.println("Khong co danh muc vua nhap, vui long nhap lai!");
                    kt = false;
                    break;
            }
        }
        while (!kt) ;

    }
    @Override
    public String toString() {
        return "Sach{" +
                "ma=" + maSach +
                ", ten='" + tenSach + '\'' +
                ", tacgia='" + tacGia + '\'' +
                ", loai='" + chuyenNganh + '\'' +
                ", namxb=" + namXuatBan +
                '}';
    }
}
