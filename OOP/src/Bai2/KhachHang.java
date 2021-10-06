package Bai2;

import java.util.Scanner;

public class KhachHang extends Nguoi{
    public String loaiKh;
    public String getLoaiKh() {
        return loaiKh;
    }

    public void setLoaiKh(String loaiKh) {
        this.loaiKh = loaiKh;
    }



    public KhachHang() {
    }

    public KhachHang(int ma, String hoTen, String diaChi, String sDT, String loaiKh) {
        super(ma, hoTen, diaChi, sDT);
        this.loaiKh = loaiKh;
    }

    public void Addkh(){
        Scanner sc=new Scanner(System.in);
        this.setMa(Ma);
        System.out.println("Tên khách hàng:");
        this.setHoTen(sc.nextLine());
        System.out.println("Dia chi:");
        this.setDiaChi(sc.nextLine());
        System.out.println("SĐT:");
        this.setsDT(sc.nextLine());
        System.out.println("Loai KH:");
        String[] arr = {"Mua lẻ", "Mua buôn"};
        boolean kt = true;
        do {
            kt = true;
            int a = 0;
            System.out.println("Chon loai khach hàng:");
            System.out.println("1.Mua lẻ:");
            System.out.println("2.Mua buon");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    this.setLoaiKh(arr[0]);
                    break;
                case 2:
                    this.setLoaiKh(arr[1]);
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
    public String toString(){
        return "KhachHang{" +
                "ma=" + Ma +
                ", ten='" + hoTen + '\'' +
                ", diachi='" + diaChi + '\'' +
                ", sdt='" + sDT +'\'' +
                ", loai='" + loaiKh +
                '}';
    }
}
