package com.cebe;
import java.util.Scanner;
public class Kıra {
    public static void main(String[] args) {
        System.out.println("Kişi sayısını giriniz: ");
        int kisi=new Scanner(System.in).nextInt();

        System.out.println("Lütfen kirayı giriniz: ");
        int kira=new Scanner(System.in).nextInt();

        int toplam=0;
        int i;
        System.out.println("Lütfen fatura sayısını giriniz: ");
        int fatura=new Scanner(System.in).nextInt();
        for(i=1;i<=fatura;i++){
            System.out.println(i+".Fatura tutarını giriniz: ");
            int tutar=new Scanner(System.in).nextInt();
            toplam=toplam+tutar;
        }
        toplam=toplam+kira;
        System.out.println("Toplam gideriniz: "+toplam);

        int kisibasi=toplam/kisi;
        System.out.println("Kişi başı düşen tutar: "+kisibasi);
    }
}
