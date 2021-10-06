package Bai2;

public class Nguoi {
    public static int iD;

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        Nguoi.iD = iD;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int ma) {
        Ma = ma;
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

    public int Ma;
    public String hoTen;
    public String diaChi;
    public String sDT;

    public Nguoi() {
        this.Ma=iD++;
    }

    public Nguoi(int ma, String hoTen, String diaChi, String sDT) {
        this.Ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
    }

    @Override
    public String toString(){
        return "Nguoi{" +
                "ma=" + Ma +
                ", ten='" + hoTen + '\'' +
                ", diachi='" + diaChi + '\'' +
                ", sdt='" + sDT +
                '}';
    }


}
