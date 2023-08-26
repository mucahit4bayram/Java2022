package day08_ifStatements;

import java.util.Scanner;

public class C05_NesnedIfELseStatements {
    public static void main(String[] args) {

        /*   /-/-/ İç içe if…else Blokları (Nested If) /-/-/

        Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”
        degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”
        degilse “Gecersiz Sifre” yazdirin.
         */

        // ilk harf büyük mü küçük mü?
        // ilk harf A veya z mi?

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String sifre =scan.nextLine();
        char ilkHarf =sifre.charAt(0);

        if (ilkHarf>'A' && ilkHarf<='Z') {  // ilk harfi büyük harf olan kelimeler
            if(ilkHarf=='A') {
                System.out.println("Gecerli sifre");
            }else{
                System.out.println("Gecersiz sifre");

            }

        }else if(ilkHarf>='a' && ilkHarf<='z') {  // ilk harf küçük
            if (ilkHarf == 'z') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        }else{
            System.out.println("Lutfen ilk karakter icin sadece harf kullanın");




        }
    }
}
