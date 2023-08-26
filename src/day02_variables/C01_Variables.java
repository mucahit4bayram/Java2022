package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {



        /*     /-/-/ Variables (Değişken)  /-/-/

        Değişkenler programlamada geçici bilgileri sakladığımız ve programcı tarafından belirlenen yapılardır.
        Değişkenler programlamanın temel yapısını oluşturmaktadır.
        Değişkenler sayesinde program içinde yaptığımız işlemleri hafıza da tutar ve gerektiği yerlerde kullanırız.
        Değişkenlerin 4 özelliği bulunur - Veri Tipi, İsim, Değer ve Adres.
        /*
        Java'da, tüm değişkenler kullanılmadan önce deklare edilmelidir.(variable declaration)
        Variable declaration için iki şeyi bilmemiz gerekiyor.
        1- Data type (data türü)
        2- Variable Name (değişken ismi)
         */


             int             not             =                     60             ;

        //data turu       variable ismi   asigment sign      variable değeri işlem bitti işareti

        int not2 = 70;

        // veriable değer
        // java önce değeri hesaplar sonra assing işlemini yapar

        // not2'yi 90 yapalım

        not2 = 90;

        // yeni bir variable oluşturalım değeri ilk iki variable'in ortalaması olsun

        int ort = (not + not2) / 2;

        System.out.println(ort);     // 75

        // "" içerisinde yazılan herşey metindir, java "" içinde ne görürse onu yazdırır
        // eğer bir variable in değerini yazdırmak istiyorsanız
        // "" olmadan variable ismini yazmalısınız

        System.out.println("ortalama :" + (ort)); // ortalama :75


        int sayi;       // ; yazim dilindeki . gibidir. java ;'u gorunce o satirdaki kod yaziliminin bittigini anlar

        sayi=27;

        System.out.print(sayi);      // println degil de print yazarsak yazdirma isleminden sonra alt satira gecmez

        char ilkHarf='M';                        //!!! Ö N E M L İ !!!//

        System.out.println(ilkHarf);  // println yazinca yazma isleminden sonra alt satira gecer

        double sayiDouble = 5.34;

        System.out.println(sayiDouble);        // 5.34

        System.out.println(sayi + sayiDouble); // 32.34

        System.out.println(sayi + ilkHarf);    //27 + 77 =104
        // Eger bir toplama isleminde char degisken kullanilirsa karakterin Ascii degeri ile toplama yapar !!!!

        /*  /-/-/ Variable Değer Atama (Assignment)   /-/-/

        * İlk önce declaration, daha sonra atama yapılabilir.
        String isim;
        boolean ogrenciMi;
        int not;
        double ortalama;

        isim = "Mehmet";
        ogrenciMi = false;
        not = 85;
        ortalama = 78.3;

        * Bir defa declaration yapıldıktan sonra, birden fazla atama yapılabilir.Java son değeri tutar, öncekini siler.
        int level = 1;
        level = 2;
        level = 3;

        * Ayni data türünde birden fazla variable tek komutla deklare edilebilir.
        int level,yas,maas;
        level = 5;
        yas = 20;
        maas = 10000;

        * Aynı data türünde biden fazla variable tek komutla deklare edilip değer atanabilir.
        int level =5, yas=20, maas=10000;

         */

    }
}
