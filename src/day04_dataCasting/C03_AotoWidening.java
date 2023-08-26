package day04_dataCasting;

public class C03_AotoWidening {
    public static void main(String[] args) {

        // AotoWidening (Otomatik Genişletme) //

        // dar veri türündeki bir değer, geniş veri türündeki variable'a
        // otomatik olarak assing eder.

        // !!!  byte < short < int < long < float(ondalık) < double(ondalık)  !!! //
        /*
            byte num1 = 12;
            short num2 = num1;  //12
            int num3 = num2;    //12
            float num4 = num3;  //12.0
            double num5 = num4; //12.0
          */

        byte sayi1 = 23;
        short sayi2 = 55;

        int sayi3 = sayi1 + sayi2; // 78

        double sayi4 = sayi1 * sayi2; // 1265.0

        // sayi4 = sayi2 / sayi1; //2.391.. sayi4 double olduğu için sonc 2.0 çıktı. veri kaybı var.
        // data casting le veri kaybını önleyebiliriz.
        // sayılar byte ve short olduğu için küsüratı almadı 2 oldu, double çevirince 2.0 oldu
        // sayılardan biri yada ikisi double olsaydı veri kaybı olmazdı...
        /*
        önce işlem sonra atama olduğu için, işlem yapılan sayılar ondalıklı olmadığından sonuç tam sayı çıkıyor,
        sonrasında ondalıklı sayıya atanınca da sonuç ondalıklı çıkıyor.
         */

        // sayi4 = sayi2/sayi1; ----> snuç 2.0 (veri kaybı oldu)

        sayi4 = (double) sayi2 / sayi1; // sayi2 yi double yaptık ----> sonuç 2,391...
                                        // double bir sayıyı byte bölünce geniş olana göre hareket etti
                                        // sayi2 double Casting yapıldı, atama olmadığı için kalıcı değer olmaz.
        System.out.println("sayi4: " + sayi4);



        int sayi5= 51;
        int sayi6= 25;
        int sayi7= sayi5/sayi6;

        System.out.println("sayi7 :" + sayi7); // 2






    }
}
