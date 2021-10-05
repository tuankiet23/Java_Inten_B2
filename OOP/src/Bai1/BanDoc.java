package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class BanDoc {
    public int maBD;
    public String hoTen;
    public String diaChi;
    public String sDT;
    public String loaiBD;
    public static int iD=10000;

    public BanDoc(int maBD, String hoTen, String diaChi, String sDT, String loaiBD) {
        this.maBD = maBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.loaiBD = loaiBD;
    }
    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getLoaiBD() {
        return loaiBD;
    }

    public void setLoaiBD(String loaiBD) {
        this.loaiBD = loaiBD;
    }

    public BanDoc(){
        this.maBD=iD++;
    }


        public void addbandoc() {
            Scanner scanner = new Scanner(System.in);
            this.setMaBD(this.maBD);
            System.out.println("Ho ten:");
            this.setHoTen(scanner.nextLine());
            System.out.println("Dia chi:");
            this.setDiaChi(scanner.nextLine());
            System.out.println("SDT:");
            this.setsDT(scanner.nextLine());
            String[] arr = {"Sinh vien", "Hoc vien cao hoc", "Giao vien"};

            boolean kt = true;
            do {
                kt = true;
                int a = 0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Chon loai ban doc:");
                System.out.println("1.Sinh vien:");
                System.out.println("2.Hoc vien cao hoc");
                System.out.println("3.Giao vien");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        this.setLoaiBD(arr[0]);
                        break;
                    case 2:
                        this.setLoaiBD(arr[1]);
                        break;
                    case 3:
                        this.setLoaiBD(arr[2]);
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
        return "Bandoc{" +
                "MaBD=" + maBD +
                ", ten='" + hoTen + '\'' +
                ", diachi='" + diaChi + '\'' +
                ", sdt='" + sDT + '\'' +
                ", Loai='" + loaiBD + '\'' +
                '}';
    }

}
