package Bai2;

import java.awt.*;
import java.util.Scanner;

public class Hang {
    public static int iD;

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        Hang.iD = iD;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(String nhomHang) {
        this.nhomHang = nhomHang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int maHang;
    public String tenHang;
    public String nhomHang;
    public int giaBan;

    public Hang(){
        this.maHang=iD++;
    }

    public Hang(int maHang, String tenHang, String nhomHang, int giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
    }

    public void AddHang(){
        Scanner sc=new Scanner(System.in);
        this.setMaHang(maHang);
        System.out.println("Nhap ten hang");
        this.setTenHang(sc.nextLine());
        System.out.println("Nhom hang:");
        String[] arr = {"Hang thoi trang", "Hàng tiêu dùng", "Hàng điện máy", "Hàng gia dụng"};
        boolean kt = true;
        do {
            kt = true;
            int a = 0;
            System.out.println("Chon khách hàng:");
            System.out.println("1.Hàng thời trang:");
            System.out.println("2.Hàng tiêu dùng");
            System.out.println("3.Hàng điện máy");
            System.out.println("4.Hàng gia dụng");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    this.setNhomHang(arr[0]);
                    break;
                case 2:
                    this.setNhomHang(arr[1]);
                    break;
                case 3:
                    this.setNhomHang(arr[2]);
                    break;
                case 4:
                    this.setNhomHang(arr[3]);
                    break;
                default:
                    System.out.println("Khong co danh muc vua nhap, vui long nhap lai!");
                    kt = false;
                    break;
            }
        }
        while (!kt) ;
        System.out.println("Giá bán:");
        this.setGiaBan(sc.nextInt());
    }

    public String toString(){
        return "Hang{" +
                "ma hang=" + maHang +
                ", ten hang='" + tenHang + '\'' +
                ", nhom hang='" + nhomHang + '\'' +
                ", gia ban='" + giaBan +
                '}';
    }


}
