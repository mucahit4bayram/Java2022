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
        staticMethod();  // static method'u çaðýrdýk !!! burada static method'a gider. 32. satýr !!!
        staticSayi=12;   // burada yeni deðer atamasý yapýldýðý için 19. satýrda yazdýrýldýðýnda sonuç 12 oldu
        System.out.println(staticSayi); // 12
        C02_StaticVariables obje1=new C02_StaticVariables();// static olmayan methodu çaðýramadýðýmýz için
        obje1.staticOlmayanMethod();                        // obje1 üzerinden static olmayan methodu çaðýrdýk. sonraki aþamada java 54. satýra yani staticolmayan methoda iner.
        System.out.println(staticSayi); // 20 ( en son atama yapýlarak 20 olmuþtu / 55. satýr)
        /*
     *** instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
         istenen satira kadar kodu takip etmeliyiz

     *** Static variable'da ise class'in en basindan baslayarak
         istenen satira kadar kodu tekip edip
         static variable'in son degerini bulmamiz gerekir
         */
    }
    public static void staticMethod(){
        System.out.println(staticSayi); // 10 staticSayi nin deðeri 11. satýrdan itibaren deðiþmediði için 10 yazdýrdý.
                                        // ve geldiðimiz yere yani 17. satýra geri döndü
    }
    public void staticOlmayanMethod(){
        /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler

                                !!! Ö N E M L Ý !!!

        METHODLAR SADECE BÝZ ÇAÐIRDIÐIMIZDA ÇALIÞIR.
        CLASS'I ÇALIÞTIRDIÐIMIZDA STATÝK METHOD ÇALIÞMAZ.
        CLASS'I ÇALIÞTIRDIÐIMIZDA YUKARIDAN AÞAÐIYA BAÞLAR MAÝN METHOD ÇALIÞIR. YAZDIRMA VE ATAMALAR BÝTER.
        MAÝN METHOD BÝTER, CLASS'IN ÇALIÞMASI BÝTER.
        DOLAYISIYLA MAÝN METHODUN DIÞINDAKÝ YAZDIRMALAR ÇALIÞMAZ. ÇÜNKÜ ÇAÐIRMADIK..

        farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz.


         */
        System.out.println(staticSayi); // 12
        staticSayi=20; // staticSayýya yeni bir deðer atadýk. java buna da itiraz etmiyor. çünkü static sayýlar heryerden
                       // kullanýlabilir.
        //staticSayý'lar okulun adý gibidir deðiþtimi herkes için deðiþir. obje gibi deðildir.
        //staticolmayan methodun sonuna geldik. çaðrýldýðýmýz yere geri dönüyoruz. 21. satýr
    }
}