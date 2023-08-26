package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        // verilen iki sayýyý carpýp
        // sonucu bize döndüren bir method oluþturun.

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1,sayi2);
        System.out.println("Illada sonucu göreyim diyenlere : " + sonuc);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc = sayi1*sayi2;
        System.out.println("Illada sonucu göreyim diyenlere diðer method içinde : " + sonuc);
        return sonuc;
    }

}
