package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
        kullan�c�dan toplanmak �zere say�lar al�n
        say�lar�n toplam� 500'� dahil ge�ince say�lar�n toplam�n� ve ka� say� topland���n� �u �ekilde yazd�r�n;

        13 say� girdiniz ve toplamlar� 567

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
