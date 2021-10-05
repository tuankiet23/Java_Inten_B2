package Bai1;

import javax.management.MBeanNotificationInfo;
import java.util.List;
import java.util.Scanner;

public class QLMuonSach {
    private static BanDoc[] banDocs;
    private static Sach[] saches;
    private static MuonSach[] muonSaches;

    public void run(){
        while (true) {
            System.out.println("Danh sach chuc nang:");
            System.out.println("1.Them ban doc");
            System.out.println("2.In ra danh sach ban doc");
            System.out.println("3.Them sách");
            System.out.println("4.In ra danh sach sach");
            System.out.println("5.Nhap ds muon");
            System.out.println("6.Danh sach muon");
            System.out.println("7.Sx theo ten");
            System.out.println("8.Tim kiem ten");
            boolean flag = true;
            do {
                flag = true;
                int chosse = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chon chuc nang");
                chosse = scanner.nextInt();
                switch (chosse) {
                    case 1:
                        AddBanDoc();
                        break;
                    case 2:
                        outputbd();
                        break;
                    case 3:
                        AddSach();
                        break;
                    case 4:
                        outputsach();
                        break;
                    case 5:
                        muonSach();
                        break;
                    case 6:
                        output();
                        break;
                    case 7:
                        sapxepten();
                        break;
                    case 8:
                        tkten();
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

    public void AddBanDoc(){
        System.out.println("Nhap so ban doc:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        banDocs =new BanDoc[a];
        for(int i=0; i<a; i++){
            BanDoc banDoc=new BanDoc();
            banDoc.addbandoc();
            banDocs[i]=banDoc;
        }
    }

    public void outputbd(){
        for(BanDoc banDoc: banDocs){
            System.out.println(banDoc.maBD+"  "+banDoc.hoTen+" "+banDoc.diaChi+" "+banDoc.sDT+" "+banDoc.loaiBD);
        }
    }

    public void AddSach(){
        System.out.println("Nhap so lương sách cần nhập:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        saches =new Sach[a];
        for(int i=0; i<a; i++){
            Sach sach=new Sach();
            sach.addsach();
            saches[i]=sach;
        }
    }
    public void outputsach(){
        for(Sach sach:saches){
            System.out.println(sach.maSach+"  "+sach.tenSach+" "+sach.tacGia+" "+sach.chuyenNganh+" "+sach.namXuatBan);
        }
    }
    public Sach timkiemSach(int id){
        for(Sach sach:saches){
            if(sach.getMaSach()==id){
                return sach;
            }
        }
    return null;
    }

    public BanDoc timkiembd(int idbd){
        for(BanDoc banDoc: banDocs){
            if(banDoc.getMaBD()==idbd)
                return banDoc;
        }
        return null;
    }

    public void muonSach(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong nguoi muon sach");
        boolean flag=false;
        int a;
       do {
            a = sc.nextInt();
            if (a > banDocs.length) {
                System.out.println("nhap lại số người mượn sach:");
                flag = true;
            }
            else flag=false;
        }while (flag);
       
        muonSaches=new MuonSach[a];
        for(int i=0; i<a; i++){
            System.out.println("Nhap id nguoi cần mượn:");
            int d;
            BanDoc banDoc;
            boolean kt=false;
            do{
                d=sc.nextInt();
                 banDoc=timkiembd(d);
                if(banDoc==null){
                    System.out.println("nhap lại id:");
                    kt=true;
                }
                else
                kt=false;
            }while (kt);


            System.out.println("Nhap so lương đầu sách cần mượn:");
            int b;
            do {
                b=sc.nextInt();
                if(b<0 || b>5){
                    System.out.println("nhap lại soluong dau sach can muon:");
                    flag=true;
                }
                else
                    flag=false;
            }while (flag);
            Sach[] saches1=new Sach[b];
            int [] ListSL=new int[b];
            for(int j=0; j<b; j++){
                System.out.println("Nhập id sach can muon");
                int id=sc.nextInt();
                Sach sach=timkiemSach(id);
                int c;
                System.out.println("Nhap so lương sach can muon:");
                do {
                    c=sc.nextInt();
                    if(c<0 || c>3){
                        System.out.println("nhap lại sl:");
                        flag=true;
                    }
                    else
                        flag=false;
                }while (flag);
                ListSL[j]=c;
                saches1[j]=sach;
            }

            MuonSach muonSach= new MuonSach(banDoc, saches1,ListSL);
            muonSaches[i]=muonSach;
        }
    }
    public void output(){
        for(MuonSach muonSach:muonSaches)
        {
            System.out.println(muonSach);
        }
    }

    public void sapxepten(){
        MuonSach tam=new MuonSach();
        for(int i=0; i<muonSaches.length-1; i++){
            for(int j=i+1; j<muonSaches.length; j++)
            {
                if(muonSaches[i].getBanDoc().getHoTen().compareTo(muonSaches[j].getBanDoc().getHoTen())>0)
                {
                    tam=muonSaches[i];
                    muonSaches[i]=muonSaches[j];
                    muonSaches[j]=tam;
                }
            }
        }
    }

    public void tkten(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten tk:");
        String ten=sc.nextLine();
        for(int i=0; i<muonSaches.length; i++){
            if(muonSaches[i].getBanDoc().getHoTen().equals(ten)==true)
                System.out.println(muonSaches[i]);
        }
    }


    public void sapxepsl(){
        MuonSach tam=new MuonSach();
        for(int i=0; i<muonSaches.length-1; i++){
            for(int j=i+1; j<muonSaches.length; j++)
            {

                {
                    tam=muonSaches[i];
                    muonSaches[i]=muonSaches[j];
                    muonSaches[j]=tam;
                }
            }
        }
    }
   public int tong(int k) {
        int [] a=muonSaches[k].getSoluong();
        System.out.println(a);

//        int a=0;
//        for (int i = 0; i < muonSaches[k].getSoluong().length; i++) {
//                    a=a+ muonSaches[k].getSoluong().;
//        }
        return 0;
    }





}
