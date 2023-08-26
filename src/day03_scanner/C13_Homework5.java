package day03_scanner;


import java.util.Scanner;

public class C13_Homework5 {
    public static void main(String[] args) {

        //Kullanıcıdan ismini ve soyismini isteyip aşağıdaki şekilde yazdırın
        // İsminiz : Mehmet
        // Soyisminiz : Bulut
        // Kursumuza katiliminiz alınmıştır, teşekkür ederiz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz : ");
        String isim = scan.next();
        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();

       // isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);

        System.out.println("Lutfen soyisminizi yaziniz : ");
        String soyisim = scan.next();
        soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();

        //soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1);


        /*
        s1 = name.substring(0, 1).toUpperCase() + name.substring(1);
         */

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz :" + soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz ");

        scan.close();

    }
}
