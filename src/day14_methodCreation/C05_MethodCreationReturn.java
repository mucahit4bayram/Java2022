package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        E�er bir class'�n i�erisinde herhangi bir hesaplama yap�p bunu da kal�c� olarak saklamak istersek
        kodumuzu sade ve anla��l�r tutmak i�in i�lemi bir method'da yap�p sonucunu main method'a d�nd�rebiliriz.
        Return type'� void olmayan bir method'un sonucunu main method'da bir variable'a atama yaparsak
        program�n geri kalan�nda bu yeni degeri kullanma �ans�m�z olur.
         */

        // Kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacag�m�z formatta bize d�nduren bir method olu�turun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("Girdiginiz sehir :"+ sehir);
        System.out.println("Girdiginiz tarih :"+ tarih);

    }

    public static String tarihAl() {

        String tarih = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("yil giriniz");

        int yil = scan.nextInt();

        if (yil>1900 && yil<2100) {
            tarih = yil + "-";

        }else{
            System.out.println("yil icin gecerli bir sayi yazmalisiniz (1900-2100");

        }
        System.out.println("Kacinci ay oldugunu tamsayi olarak yaziniz");

        int ay = scan.nextInt();

        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");

        } else if (ay<10) {
            tarih = tarih+"0"+ay+"-";   // 1 den 10a kadar olan aylar�n ba��na 0 eklemek i�in yapt�k

        }else{
            tarih = tarih+ay+"-";       // 10, 11 ve 12 i�in buras� �al��acak

        }
        System.out.println("lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz");

        int gun = scan.nextInt();

        if (gun<=0 || gun>31){
            System.out.println("gun no olarak 1-31 arasinda sayi girilmelidir");

        }else if (gun<10){
            tarih = tarih+"0"+gun;

        }else{
            tarih = tarih+gun;
        }
        return tarih;
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi = scan.next().toUpperCase();

        return sehirAdi;
    }
}
