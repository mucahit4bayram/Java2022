package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Kullanýcýdan aldýðýnýz bir ismin, verilen array'de olup olmadýðýný kontrol edip,
        bize true veya false soncu döndüren bir method oluþturun.
         */

        String[] isimler = {"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim = scan.nextLine();

        boolean sonuc = contains(isimler,arananIsim);// true/false döndüreceði için boolean sonuc adýnda
                                                     // contains methodu oluþturmalýyýz.
        if  (sonuc) { // sonucu yazdýralým
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede yok");
        }
    }
    public static boolean contains(String[] isimler, String arananIsim){
        boolean sonucMethod = false; // deðer atamadýðýmýzda sonuç olmadýðý için return kýsmýnda itiraz oluþuyor.
                                    // bizde false atadýk
        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananIsim)){ // isimlerin [i] indexindeki isim arananÝsme eþitse sonuç true olacak
                                                          // büyük/küçük harf sýkýntý olmasýn diye equalsIgnoreCase kullandýk
                sonucMethod = true;
            }
        }
        return sonucMethod;
    }
}
           /*
           Array 'de contains diye bir method yok. String de vardý. þimdi kendimiz Array'de contains methodu oluþturduk.
            */
