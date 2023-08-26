package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak bir array olusturup,
        bu array’i bize donduren bir method olusturun
       */

        int [] sayilar = arrayOlustur(); // sayýlar adýnda bir array döndürsün, arrayOlustur methodundan
                                         // arrayOlustur methoduna birþey gönderemiyoruz. çünkü o bize döndürecek



        System.out.println("int [] sayilar =" + Arrays.toString(sayilar)); // oluþturulan arrayý yazdýralým
    }

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz : "); // kullanýcýdan oluþturacaðýmýz array in
                                                                             // uzunluðunu alalým
        int uzunluk = scan.nextInt();

        int [] olusturulan = new int[uzunluk]; // kullanýcýdan aldýðýmýz uzunluða göre int array oluþturduk.

        for (int i = 0; i < uzunluk; i++) {    // uzunluk sayýsýnca, kullanýcýdan eleman alalým
            System.out.println(i + ". index icin sayi giriniz : ");
            olusturulan [i] = scan.nextInt();  // kullanýcýdan aldýðýmýz elemaný olusturulan arrayin [i]. indexine atadýk


        }

        return olusturulan;
    }
}
