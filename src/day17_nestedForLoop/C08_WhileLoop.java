package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanýcýdan toplanmak üzere sayýlar alýn
        sayýlarýn toplamý 500'ü dahil geçince sayýlarýn toplamýný ve kaç sayý toplandýðýný þu þekilde yazdýrýn;

        13 sayý girdiniz ve toplamlarý 567

         */

        int toplam = 0;
        int sayi = 0;
        int sayac = 0;
        Scanner scan = new Scanner(System.in);

        while (toplam < 500) {

            System.out.println("Lutfen toplamak icin sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;

        }
        System.out.println(sayac + " sayi girdiniz ve toplamlari : " + toplam);
    }
}
