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
        // yukarýdaki satisfiyati burada declare edilmis, yukarýsý ile burasý ayný variable deðildir.
        // iste bu farklý satis fiyatlari icin java pass by value kullanýyor.
        //java variable ý buraya gecirmez, ama variable ýn deðerini gecirir, biz gözlerimizle satisFiyati görürüz ama java burada 100 görür.
        //yani satisFiyatinin bir kopyasýný gecirir diyebiliriz.
        //bundan sonra bu scope ta kullanacaðýmýz deðisiklikler benim main body mde yazan deðerimi deðil buradaki deðeri kullanir.
        //buradaki satisFiyatinin adýný xyz de yapabilirsin hangi isim oldugu hic bir önemi yok,
        //farkli methodlara gidis yapýyor olsak bile ayný isimleri kullanýrýz ki karýsýklýk olmasýn. tek amac budur
        // ne yazarsanýz yazýn java sizin satisFiyati parametresi olustururken bunun deðirini buraya gecirir
        //ve siz arka arkaya isterseniz 5 kere indirim yapýn her seferinde indirimliFiyat 75 yazar.


        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}

        /*
        Programlama dillerinde bir method cagrildiginda original data’nin nasil kullanilacagi iki sekilde
        belirlenebilir.

        Pass By Value : Primitive bir data’yi parametre olarak bir method’a gonderdigimizde Java original
                        variable yerine ayni degere sahip kopya bir variable olusturur ve method icerisinde kopya variable
                        uzerinden islem yapilir.

        Pass By Reference : de ise method cagrildiginda, data’nin original degeri ile islem yapilir. Eger method
                            icerisinde data degistirilirse original deger de degismis olur.
        Bu iki alternative gozonune alindiginda Java Pass By Value ozelligini kullanmaktadir.
         */
