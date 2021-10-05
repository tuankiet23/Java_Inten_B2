package Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MuonSach {
    private BanDoc banDoc;
    private Sach[] saches;
    private int[] soluong;


    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach[] getSaches() {
        return saches;
    }

    public void setSaches(Sach[] saches) {
        this.saches = saches;
    }

    public int[] getSoluong() {
        return soluong;
    }

    public void setSoluong(int[] soluong) {
        this.soluong = soluong;
    }


    public MuonSach(){}

    public MuonSach(BanDoc banDoc, Sach[] saches, int[] soluong) {
        this.banDoc = banDoc;
        this.saches = saches;
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "MuonSach{" +
                "BanDoc=" + banDoc +
                ", saches=" + Arrays.toString(saches) +
                ", SoLuong=" + Arrays.toString(soluong) +
                '}';
    }
}
