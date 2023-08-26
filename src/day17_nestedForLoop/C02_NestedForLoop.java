package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*           /-/-/ Nested for Loop /-/-/

        Bazen tek bir loop ile istedi�imiz sonu�lara ula�amay�z.
        �zellikle iki boyutlu �ekiller �izdirmek veya �arp�m tablosu gibi sayi ikilileri olu�turmak i�in nested loop
        kullanmam�z gerekir.
         */

        // verilen say�ya g�re �arp�m tablosu olu�turun
        /*
        input 3
        1 2 3
        2 4 6
        3 6 9
         */

        int input = 4;                                         // d�rtgen ��kt�larda //

        for (int i = 1; i <=input ; i++) {      // i sat�rlar� kontrol ediyor - (d�� for loop) - y�kseklik

            for (int j = 1; j <=input; j++) {   // j s�tunlar� kontrol ediyor - (i� for loop) -  boy

                System.out.print(i*j +" ");
            }
            System.out.println("");  // alt sat�ra ge�mek i�in yazd�k.

        }
    }
}
