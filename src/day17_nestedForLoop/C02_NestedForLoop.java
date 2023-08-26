package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*           /-/-/ Nested for Loop /-/-/

        Bazen tek bir loop ile istediðimiz sonuçlara ulaþamayýz.
        Özellikle iki boyutlu þekiller çizdirmek veya çarpým tablosu gibi sayi ikilileri oluþturmak için nested loop
        kullanmamýz gerekir.
         */

        // verilen sayýya göre çarpým tablosu oluþturun
        /*
        input 3
        1 2 3
        2 4 6
        3 6 9
         */

        int input = 4;                                         // dörtgen çýktýlarda //

        for (int i = 1; i <=input ; i++) {      // i satýrlarý kontrol ediyor - (dýþ for loop) - yükseklik

            for (int j = 1; j <=input; j++) {   // j sütunlarý kontrol ediyor - (iç for loop) -  boy

                System.out.print(i*j +" ");
            }
            System.out.println("");  // alt satýra geçmek için yazdýk.

        }
    }
}
