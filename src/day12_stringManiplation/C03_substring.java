package day12_stringManiplation;

public class C03_substring {
    public static void main(String[] args) {

        /*
        17) substring() : Index kullanarak verilen String'in istenen parçasını almamızı sağlar

        - Parametre olarak 1 sayı girilirse, girilen index'den String'in sonuna kadar bölümü
        - Parametre olarak 2 sayı girilirse, girilen 1.sayıdaki indexden (inxlusive) başlayıp,
          2.sayıya kadar (exclusive) karakteri bize döndürür.
         */

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = "1234 6589 7458 9658";

        System.out.println(isim.substring(3));                     // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // fil

        System.out.println(isim.substring(2,4));  // le

        // isim ve soyismin ilk harfi büyük harf, geriye kalan *
        // kredi kartının ilk dört rakamı görünsün geriye kalan *

        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf = soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar = soyisim.substring(1).replaceAll("\\w","*");

        String kkIlkDort = kartNo.substring(0,4);
        String kkGeriyeKalanlar = " **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+soyisimIlkHarf+soyisimGeriyeKalanlar+" "
                +kkIlkDort+kkGeriyeKalanlar); // S******* K******* 1234 **** **** ****

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+soyisimIlkHarf+soyisimGeriyeKalanlar+
                "\n"+kkIlkDort+kkGeriyeKalanlar);
        // S******* K*******
        // 1234 **** **** ****


    }
}
