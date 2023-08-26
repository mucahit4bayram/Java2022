package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        // verilen iki say�y� carp�p
        // sonucu bize d�nd�ren bir method olu�turun.

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1,sayi2);
        System.out.println("Illada sonucu g�reyim diyenlere : " + sonuc);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc = sayi1*sayi2;
        System.out.println("Illada sonucu g�reyim diyenlere di�er method i�inde : " + sonuc);
        return sonuc;
    }

}
