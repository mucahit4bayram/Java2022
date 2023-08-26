package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiðiniz deger sadece rakamlardan olusmalidir.");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");

        }


        System.out.println("Sayinin karesi : " + sayi*sayi);

        /*
        Kullanýcýdan String olarak bir deðer alýyor ve bunu integer'a çeviriyorsak NumberFormatException ile
        karþýlaþabileceðimizi öngörüyoruz.
        NFE aldýðýmýzda kodun durmamasýný istiyorsak try catch ile çevreleyebiliriz.

        Eðer bilmediðim bir exception daha oluþursa kodum durmasýn istiyorsak
        bir kere daha catch cümlesi ekleyip ona en geniþ Exception'i yazdýrabiliriz.

         */


    }
}
