package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir array�in boyutunu ve tum elementlerini alarak bir array olusturup,
        bu array�i bize donduren bir method olusturun
       */

        int [] sayilar = arrayOlustur(); // say�lar ad�nda bir array d�nd�rs�n, arrayOlustur methodundan
                                         // arrayOlustur methoduna bir�ey g�nderemiyoruz. ��nk� o bize d�nd�recek



        System.out.println("int [] sayilar =" + Arrays.toString(sayilar)); // olu�turulan array� yazd�ral�m
    }

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz : "); // kullan�c�dan olu�turaca��m�z array in
                                                                             // uzunlu�unu alal�m
        int uzunluk = scan.nextInt();

        int [] olusturulan = new int[uzunluk]; // kullan�c�dan ald���m�z uzunlu�a g�re int array olu�turduk.

        for (int i = 0; i < uzunluk; i++) {    // uzunluk say�s�nca, kullan�c�dan eleman alal�m
            System.out.println(i + ". index icin sayi giriniz : ");
            olusturulan [i] = scan.nextInt();  // kullan�c�dan ald���m�z eleman� olusturulan arrayin [i]. indexine atad�k


        }

        return olusturulan;
    }
}
