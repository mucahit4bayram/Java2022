package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydanListOlusturma {
    public static void main(String[] args) {

        /*
        ��inde 200 tane 1000'den k���k pozitif tamsayi olan bir list olu�turun
        kullan�c�dan bir say� isteyip listede olup olmad���n� kullan�c�ya yazal�m
         */

        Random rnd = new Random(); // random'un �zelli�i rastgele say� �retir
                                   // rnd.nextInt()          ===> 0 ile 1 aras�nda say� �retir
                                   // rnd.nextInt(int bound) ===> girdi�imiz int s�n�ra g�re tam say� �retir

        int sayi = 0;              // random objesinden gelen say�lar� i�ine koymam�z i�in olu�turduk

        List<Integer> sayiListesi = new ArrayList<>(); // 200 adet say�y� koyabilece�imiz list olu�turduk

        while (sayiListesi.size()<200){        // 200 adet say� olu�turana kadar devam etsin

            sayi = rnd.nextInt(1000);    // 1000'den k���k say�lar �retecek ve say�n�n i�ine koyaca��z
            // �retilen say�lar i�erisinde ayn� say�y� �retme ihtimali olabilece�i i�in, listemizin unique olabilmesi
            // i�in eklenen say�lar� kontrol etmeliyiz.

            if (!sayiListesi.contains(sayi)){  // say� listede yoksa ekleyece�iz, varsa eklemeyece�iz
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);  // while loop bitti�inde, 200 adet unique say� �reten liste haz�r oldu

        boolean bildiMi = false;          // olu�turaca��m�z while loop'u kontrol i�in boolean olu�turduk


        int tahminSayisi = 1 ;            // ka� tahminde buldu�unu saymak i�in olu�turduk

        Scanner scan = new Scanner(System.in); // kullan�c�dan say� alal�m

        while (!bildiMi) { // bildinMi == false da yazabiliriz
            // boolean ---> false oldu�u m�ddet�e �al��mas� laz�m
            // while loop ---> false iken �al��maz. while loop'un i�i true oldu�u m�ddet�e �al���r.
            // bundan dolay� while loop'un i�in !bildinMi yapt�k!!!

            System.out.println("Lutfen bir sayi tahmininde bulunun :");
            sayi = scan.nextInt();

            // listemizden bir say�y� bulup bulmad���n� kontrol etmeliyiz

            if (sayiListesi.contains(sayi)) { // kullan�c�n�n girdi�i say�y� i�eriyorsa

                System.out.println("Tebrikler"+ tahminSayisi + " adet tahminde listeden bir sayi buldunuz");

                bildiMi=true; // bildiyse oyunu bitirmemiz gerekiyor


            }else {   // say�y� bulamad�ysa
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");

                tahminSayisi++; // tahmin say�s�n� 1 artt�raca��z
            }
        }

    }
}
