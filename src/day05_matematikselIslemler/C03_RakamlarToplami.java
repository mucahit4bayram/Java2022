package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        /*
        sayi = 538
        Herhani bir sayının birler basamağını bulmak için       --->  %10 alınır  ------> 8 (birler basamağı)
        Birler basamağını yok etmek için sayıyı (10'a böleriz ) --->  /10         ------> 53 (sayi = 53)
        //-/-/     /10 bize son basamak hariç kalan sayıyı verir./-/-/-//
        //-/-/     %10 bize son basamağı verir.                  /-/-/-//
                                               sayi = 53        --->  %10 alınır  ------> 3 (birler basamağı)
                                                                --->  /10         ------> 5 (sayi = 5)
                                               sayi = 5         --->  %10 alınır  ------> 5 (birler basamağı)
                                                                --->  /10         ------> 0 (sayi = 0)

                                                sayi = 538 -----> rakamlarToplamı = 8+3+5
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz ");

        int sayi = scan.nextInt();  //

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int ilkGirilenSayi = sayi; // kullanıcının girdiği sayıyı "ilkGirilenSayı" ya atayarak
                                   // geçici bir değişken olarak burada tutmuş olduk.
                                   // yazdırma esnasında kullanacağız.

        // kullanıcının girdiği sayıyı 5267 olarak varsayalım.

        // şuanda sayi 5267, birler ba.=0 , rakamlar top.=0

        birlerBasamagi = sayi % 10; //7

        System.out.println(birlerBasamagi);  // 7
        System.out.println(rakamlarToplami); // 0

        rakamlarToplami += birlerBasamagi; // rak.top=7  (increment)

        sayi /= 10;                        // 10'a bölerek birler basamağından kurtulduk.

        // şuanda sayi 526, birler b.=7, rak.top=7 (atanmış değerleri)

        birlerBasamagi = sayi % 10; //6    //6 ile işimiz bitti 10'a bölerek kurtulalım.

        rakamlarToplami += birlerBasamagi;   // 13

        System.out.println(birlerBasamagi);  // 6
        System.out.println(rakamlarToplami); // 13

        sayi /= 10;

        // şuanda sayı 52, birler b.=6, rak.top=13  (atanmış değerleri)

        birlerBasamagi = sayi % 10; //2

        rakamlarToplami += birlerBasamagi; // 13+2=15

        System.out.println(birlerBasamagi);  // 2
        System.out.println(rakamlarToplami); // 15

        sayi /= 10;  //5

        // şuanda sayı 5, birler b.=2, rak.top=15  (atanmış değerleri)

        birlerBasamagi = sayi % 10; //5

        rakamlarToplami += birlerBasamagi; // 15+5 =20

        System.out.println(birlerBasamagi);  // 5
        System.out.println(rakamlarToplami); // 20

        sayi /= 10; //0

        // şuanda sayı 0, birler b.=5, rak.top=20  (atanmış değerleri)

        // !!! atanmış değer olan "sayi" = 0 olana kadar %10 ve /10 işlemine devam ediyoruz !!!

        System.out.println(ilkGirilenSayi + " sayının rakamlar toplami : " + rakamlarToplami);

        /*
        bir sayının tek mi?, çift mi? olduğunu anlamak için;
        sayi% 2 ye bakılır ---> sonuç 0 ise çift
                           ---> sonuç 0 değil ise tektir.

        sayı 3'e tam bölünüyor mu? sorulursa
        sayi% 3 e bakılır  ---> sonuç 0 ise tam bölünür
                           ---> sonuç 0 değil ise bölünmez.

         // int sayi = 23;
            System.out.println(sayi /5); // 4  (int olduğu için küsaratı siler)
            System.out.println(sayi %5);//3

         */
        //---------------------//
        /*
        		// verilen bir integer'in birler basamagindaki rakami yazdirin

		int sayi=1469;

		System.out.println("verilen sayinin birler basamagi : "+sayi%10);

		// verilen sayinin birler basamagi haric geriye kalan basamaklari yazdirin

		System.out.println(sayi/10); // 146
		System.out.println(sayi);// 1469

		System.out.println(sayi/=10); //146
		System.out.println(sayi); // 146

		// sayi/10 ile sayi/=10 arasindaki fark nedir?
		// = isareti atama(assignment) demektir
		// bir islemde = isareti varsa orada deger kalici olarak degisir
		// = isareti yoksa sadece o anlik matematiksel bir islem yapar
		// sayi/10 yazilirsa sayinin degeri degismez
		// sayi/=10 yazilirsa sayi 10 a bolunur ve yeni deger olarak sayiya atanir
         */


    }
}
