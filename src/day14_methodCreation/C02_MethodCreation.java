package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;
import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // Verilen 3 basamakli bir sayiyin
        // rakamlar� toplamini yazdiran bir method olusturalim

        int input = 432;

        rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("Nuri");

    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp = input;    // Girilen sayiyi bir degere kaydetmeliyiz,
                             // yazd�r�rken ... girilen say�n�n rakamlar toplam� diye yazd�r�rken kullanaca��z.
                             // input de�eri %10 ve /10 yap�ld�k�a 0 olana kadar erir biter.

        birlerBasamagi=input%10;          // birler basama��n� ald�k
        rakamlarToplami+=birlerBasamagi;
        input/=10;                        // birler basama��ndan kurtulduk

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz " + temp+ " sayisinin rakamlar toplami : "+ rakamlarToplami);

    }

}
