package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydanListOlusturma {
    public static void main(String[] args) {

        /*
        Ýçinde 200 tane 1000'den küçük pozitif tamsayi olan bir list oluþturun
        kullanýcýdan bir sayý isteyip listede olup olmadýðýný kullanýcýya yazalým
         */

        Random rnd = new Random(); // random'un özelliði rastgele sayý üretir
                                   // rnd.nextInt()          ===> 0 ile 1 arasýnda sayý üretir
                                   // rnd.nextInt(int bound) ===> girdiðimiz int sýnýra göre tam sayý üretir

        int sayi = 0;              // random objesinden gelen sayýlarý içine koymamýz için oluþturduk

        List<Integer> sayiListesi = new ArrayList<>(); // 200 adet sayýyý koyabileceðimiz list oluþturduk

        while (sayiListesi.size()<200){        // 200 adet sayý oluþturana kadar devam etsin

            sayi = rnd.nextInt(1000);    // 1000'den küçük sayýlar üretecek ve sayýnýn içine koyacaðýz
            // üretilen sayýlar içerisinde ayný sayýyý üretme ihtimali olabileceði için, listemizin unique olabilmesi
            // için eklenen sayýlarý kontrol etmeliyiz.

            if (!sayiListesi.contains(sayi)){  // sayý listede yoksa ekleyeceðiz, varsa eklemeyeceðiz
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);  // while loop bittiðinde, 200 adet unique sayý üreten liste hazýr oldu

        boolean bildiMi = false;          // oluþturacaðýmýz while loop'u kontrol için boolean oluþturduk


        int tahminSayisi = 1 ;            // kaç tahminde bulduðunu saymak için oluþturduk

        Scanner scan = new Scanner(System.in); // kullanýcýdan sayý alalým

        while (!bildiMi) { // bildinMi == false da yazabiliriz
            // boolean ---> false olduðu müddetçe çalýþmasý lazým
            // while loop ---> false iken çalýþmaz. while loop'un içi true olduðu müddetçe çalýþýr.
            // bundan dolayý while loop'un için !bildinMi yaptýk!!!

            System.out.println("Lutfen bir sayi tahmininde bulunun :");
            sayi = scan.nextInt();

            // listemizden bir sayýyý bulup bulmadýðýný kontrol etmeliyiz

            if (sayiListesi.contains(sayi)) { // kullanýcýnýn girdiði sayýyý içeriyorsa

                System.out.println("Tebrikler"+ tahminSayisi + " adet tahminde listeden bir sayi buldunuz");

                bildiMi=true; // bildiyse oyunu bitirmemiz gerekiyor


            }else {   // sayýyý bulamadýysa
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");

                tahminSayisi++; // tahmin sayýsýný 1 arttýracaðýz
            }
        }

    }
}
