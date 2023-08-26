package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*
                 /-/-/ Nested Ternary Operators ( İç İçe Üçlü Operatörler ) /-/-/

        Soru2 : Kullanicidan bir harf isteyin
        kucuk harf ise consola “Kucuk Harf” , ,
        buyuk harfse consola “Buyuk Harf”
        yoksa “girdiginiz karakter harf degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        /*
        String sonuc = (harf>='a' && harf<='z') ? ("Küçük Harf") :
        ("Büyük Harf veya geçersiz karakter");
        işi çözmez bizden büyük harfse ---> "Buyuk harf"
                          geçersizse   ---> "girdiğiniz karakter harf değil"
        yazdırın deniyor.
        String le yazılan yere yeni bir ternary daha yazdırmamız gerekiyor
        */

        String sonuc = (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                       ((harf>='A' && harf<='Z') ? "Buyuk harf" : "Gecersiz karakter");

        String sonuc2 =  harf>='a' && harf<='z' ? "Kucuk Harf" :
                         harf>='A' && harf<='Z' ? "Buyuk harf" : "Gecersiz karakter";

        System.out.println("sonuc :" + sonuc);
        System.out.println("sonuc2 :" + sonuc2);




    }
}
