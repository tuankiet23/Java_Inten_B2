package Bai2;

import java.util.Arrays;

public class MuaHang {
    private KhachHang khachHang;
    private Hang[] hangs;
    private int []soluong;

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Hang[] getHangs() {
        return hangs;
    }

    public void setHangs(Hang[] hangs) {
        this.hangs = hangs;
    }

    public int[] getSoluong() {
        return soluong;
    }

    public void setSoluong(int[] soluong) {
        this.soluong = soluong;
    }
    public MuaHang(){}

    public MuaHang(KhachHang khachHang, Hang[] hangs, int[] soluong) {
        this.khachHang = khachHang;
        this.hangs = hangs;
        this.soluong = soluong;
    }

    public String toString(){
        return "Mua hàng{" +
                "Khách hàng=" + khachHang +
                ", Hàng=" + Arrays.toString(hangs) +
                ", SoLuong=" + Arrays.toString(soluong) +
                '}';
    }


}
