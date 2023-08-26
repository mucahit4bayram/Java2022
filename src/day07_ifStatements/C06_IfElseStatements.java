package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */
        /*
        NOT : birden fazla if - else if birbirine bağlanmışsa son durum önemlidir.
        eğer else ile bitiyorsa bütün ihtimaller kapsaniyor demektir.
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<0) {
            System.out.println("lutfen gecerli bir yas giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsın, " + (65 - yas) + " yıl daha calismalisin");
        } else{
            System.out.println("Emekli olabilirsin");
        }
    }
}
