package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Kullan�c�dan ald���n�z bir ismin, verilen array'de olup olmad���n� kontrol edip,
        bize true veya false soncu d�nd�ren bir method olu�turun.
         */

        String[] isimler = {"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim = scan.nextLine();

        boolean sonuc = contains(isimler,arananIsim);// true/false d�nd�rece�i i�in boolean sonuc ad�nda
                                                     // contains methodu olu�turmal�y�z.
        if  (sonuc) { // sonucu yazd�ral�m
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede yok");
        }
    }
    public static boolean contains(String[] isimler, String arananIsim){
        boolean sonucMethod = false; // de�er atamad���m�zda sonu� olmad��� i�in return k�sm�nda itiraz olu�uyor.
                                    // bizde false atad�k
        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananIsim)){ // isimlerin [i] indexindeki isim aranan�sme e�itse sonu� true olacak
                                                          // b�y�k/k���k harf s�k�nt� olmas�n diye equalsIgnoreCase kulland�k
                sonucMethod = true;
            }
        }
        return sonucMethod;
    }
}
           /*
           Array 'de contains diye bir method yok. String de vard�. �imdi kendimiz Array'de contains methodu olu�turduk.
            */
