package day06_concatenation;

public class C00_NotDonusumler {
    public static void main(String[] args) {

        /*               //-/-/ DÖNÜŞÜMLER /-/-//

           /-/-/ String tipinden int tipine dönüştürme  /-/-/

        Bu dönüştürme işlemi için iki yol vardır. Bunlar parseInt ve valueOf metotlarıdır.
        valueOf diğerine göre yavaştır ve Integer tipinde bir nesne döndürür.
        parseInt hızlı ve int tipinde bir veri döndürür.
        */

        String a = "5";
        String b = "25";
        System.out.println("a+b: " + a+b);   // 525

        String ornek = "5";
        int yenia = Integer.parseInt(ornek);
        int yenib = Integer.valueOf(ornek);
        System.out.println("yenia: " + yenia);       // 5
        System.out.println("yenib: " + yenib);       // 5
        System.out.println("yenia+yenib: " + (yenia+yenib)); // 10
        System.out.println("yenia+yenib: " + yenia+yenib);   // 55

        /*
        String x= "Enes";
        int y = Integer.valueOf(x);
        int z = Integer.parseInt(x);
        System.out.println(x);          // Eğer bir rakam string tipinde tanımlanmışsa int'e çevrilebilir.
        System.out.println(z);          // String kelime olarak tanımlanmışsa int'e çevrilmez. Hata verir.
        */

       //    /-/-/ Int tipinden String tipine dönüştürme /-/-/

       // Bu dönüştürme işlemi için iki yol vardır. Bunlar toString ve valueOf metotlarıdır.
       // Yukarıdaki gibi bunda da hız farkları vardır.

        int sayi2 = 5;
        String yeni3= String.valueOf(sayi2);
        System.out.println("yeni3: " + yeni3); // 5

        /*
          /-/-/ Double tipinden int tipine dönüştürme /-/-/
        Bu dönüştürme işlemini virgülden sonraya kalan sayıları yok etmek için kullanacağız.
        Çünkü int tipi ondalık sayı almıyor fakat double, virgüllü sayı almaktadır.
        */
        double sayi3 = 201.8;
        int yeni4 = (int)sayi3;

        System.out.println("yeni4: " + yeni4); // 201

          //-/-/ Int tipinden double tipine dönüştürme /-/-/
        // Double virgüllü bir sayı olduğundan dönüştürme sonrası int tipinde virgül olmadığı için virgül ekleyecektir.

        int sayi4 = 1234;
        double yeni5 = (double)sayi4;

        System.out.println("yeni5: " + yeni5);// 1234.0

           //-/-/ Float tipinden long tipine dönüştürme /-/-/

        float sayi5 = 12.3f;
        long yeni6 = (long)sayi5;

        System.out.println("yeni6: " + yeni6); // 12

           //-/-/ Long tipinden float tipine dönüştürme /-/-/

        long sayi6 = 123;
        float yeni7 = (float)sayi6;

        System.out.println("yeni7: " + yeni7); // 123.0

           //-/-/ Long tipinden String tipine dönüştürme /-/-/

        long x = 123;
        String deger1 = Long.toString(x);

        System.out.println("deger1: " + deger1);   // 123
        System.out.println("deger 1+5: " + deger1+5); // 1235

          //-/-/ Float tipinden String tipine dönüştürme /-/-/

        float y = 123f;
        String deger2 = Float.toString(y);

        System.out.println("deger2: " + deger2);   // 123.0
        System.out.println("deger 2+5: " + deger2+5); // 123.05

          //-/-/ Byte tipinden String tipine dönüştürme  /-/-/

        byte z = 10;
        String deger3 = Byte.toString(z);

        System.out.println("deger3: " + deger3); //10


    }
}
