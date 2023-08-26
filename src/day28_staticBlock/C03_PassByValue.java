package day27_staticKeyword.day28_staticBlock;

public class C03_PassByValue {

    public static void main(String[] args) {

         /*
          %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=60;

        double indirimliFiyat= indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
    }
    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {
        // yukar�daki satisfiyati burada declare edilmis, yukar�s� ile buras� ayn� variable de�ildir.
        // iste bu farkl� satis fiyatlari icin java pass by value kullan�yor.
        //java variable � buraya gecirmez, ama variable �n de�erini gecirir, biz g�zlerimizle satisFiyati g�r�r�z ama java burada 100 g�r�r.
        //yani satisFiyatinin bir kopyas�n� gecirir diyebiliriz.
        //bundan sonra bu scope ta kullanaca��m�z de�isiklikler benim main body mde yazan de�erimi de�il buradaki de�eri kullanir.
        //buradaki satisFiyatinin ad�n� xyz de yapabilirsin hangi isim oldugu hic bir �nemi yok,
        //farkli methodlara gidis yap�yor olsak bile ayn� isimleri kullan�r�z ki kar�s�kl�k olmas�n. tek amac budur
        // ne yazarsan�z yaz�n java sizin satisFiyati parametresi olustururken bunun de�irini buraya gecirir
        //ve siz arka arkaya isterseniz 5 kere indirim yap�n her seferinde indirimliFiyat 75 yazar.


        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}

        /*
        Programlama dillerinde bir method cagrildiginda original data�nin nasil kullanilacagi iki sekilde
        belirlenebilir.

        Pass By Value : Primitive bir data�yi parametre olarak bir method�a gonderdigimizde Java original
                        variable yerine ayni degere sahip kopya bir variable olusturur ve method icerisinde kopya variable
                        uzerinden islem yapilir.

        Pass By Reference : de ise method cagrildiginda, data�nin original degeri ile islem yapilir. Eger method
                            icerisinde data degistirilirse original deger de degismis olur.
        Bu iki alternative gozonune alindiginda Java Pass By Value ozelligini kullanmaktadir.
         */
