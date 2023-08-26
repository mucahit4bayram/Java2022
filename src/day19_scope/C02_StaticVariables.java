package day19_scope;

public class C02_StaticVariables {
    static int staticSayi=10;
    String isim="Mehmet";
    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor
     */
    public static void main(String[] args) {
       /*
       bir variable static olusturulduysa
       objeler icin degil class icin gecerlidir
        */
        System.out.println(staticSayi); // 10
        staticMethod();  // static method'u �a��rd�k !!! burada static method'a gider. 32. sat�r !!!
        staticSayi=12;   // burada yeni de�er atamas� yap�ld��� i�in 19. sat�rda yazd�r�ld���nda sonu� 12 oldu
        System.out.println(staticSayi); // 12
        C02_StaticVariables obje1=new C02_StaticVariables();// static olmayan methodu �a��ramad���m�z i�in
        obje1.staticOlmayanMethod();                        // obje1 �zerinden static olmayan methodu �a��rd�k. sonraki a�amada java 54. sat�ra yani staticolmayan methoda iner.
        System.out.println(staticSayi); // 20 ( en son atama yap�larak 20 olmu�tu / 55. sat�r)
        /*
     *** instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
         istenen satira kadar kodu takip etmeliyiz

     *** Static variable'da ise class'in en basindan baslayarak
         istenen satira kadar kodu tekip edip
         static variable'in son degerini bulmamiz gerekir
         */
    }
    public static void staticMethod(){
        System.out.println(staticSayi); // 10 staticSayi nin de�eri 11. sat�rdan itibaren de�i�medi�i i�in 10 yazd�rd�.
                                        // ve geldi�imiz yere yani 17. sat�ra geri d�nd�
    }
    public void staticOlmayanMethod(){
        /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler

                                !!! � N E M L � !!!

        METHODLAR SADECE B�Z �A�IRDI�IMIZDA �ALI�IR.
        CLASS'I �ALI�TIRDI�IMIZDA STAT�K METHOD �ALI�MAZ.
        CLASS'I �ALI�TIRDI�IMIZDA YUKARIDAN A�A�IYA BA�LAR MA�N METHOD �ALI�IR. YAZDIRMA VE ATAMALAR B�TER.
        MA�N METHOD B�TER, CLASS'IN �ALI�MASI B�TER.
        DOLAYISIYLA MA�N METHODUN DI�INDAK� YAZDIRMALAR �ALI�MAZ. ��NK� �A�IRMADIK..

        farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz.


         */
        System.out.println(staticSayi); // 12
        staticSayi=20; // staticSay�ya yeni bir de�er atad�k. java buna da itiraz etmiyor. ��nk� static say�lar heryerden
                       // kullan�labilir.
        //staticSay�'lar okulun ad� gibidir de�i�timi herkes i�in de�i�ir. obje gibi de�ildir.
        //staticolmayan methodun sonuna geldik. �a�r�ld���m�z yere geri d�n�yoruz. 21. sat�r
    }
}