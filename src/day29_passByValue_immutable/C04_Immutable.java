package day29_passByValue_immutable;

public class C04_Immutable {

    public static void main(String[] args) {

        /*
         Immutable : degistirilemez
         mutable   : degistirilebilir
         en meshur immutable class : String
         */
        String str= "Yildiz Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();

        System.out.println(str); // Yildiz Bank

        str.substring(3,5); // sout olmadigindan yazdirmaz, yazdýrsaydýk sonuç // di olurdu

        System.out.println(str); // Yildiz Bank

        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb); // Java Bank

        sb.reverse();

        System.out.println(sb); // knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.

        // **** StringBuilder'da bir atama olmasada bir method çalýþýyorsa String deðiþiyor.

        // **** String immutable olduðu için deðiþtirilemiyor.

        /*
        Immutable (deðiþmez) class’lar, objeleri bir kez oluþturulduktan sonra
        deðiþtiremedigimiz class’lardir.

        Mutable (deðiþebilir) class’lar ise tam tersi olarak, olusturdugumuz
        objeleri deðiþtirebildigimiz class’lardir.

        NOT :   Immutable class’dan olusturulan objeler de immutable olurlar.

                Bu tur bir object’i oluþturabiliriz, fakat onlarý deðiþtiremeyiz.
                Immutable bir objeyi deðiþtirmek istersek, Java o objeyi klonlar ve yapilan
                degisiklikleri klonlanmis yeni obje uzerinde gerceklestirir.

                Peki böyle bir duruma niçin ihtiyacýmýz olur diye bir soru sorarsak,
                cevabý thread safe (guvenli es zamanli calisma) konusudur.

                Immutable nesnelerin deðerleri deðiþmeyeceði için üzerinde kaç tane thread
                çalýþýrsa çalýþsýn hep ayný deðerler üzerinden iþlem yapýlacaktýr.

        Java’da yaygýn olanlarýndan örnek verecek olursak

        String ve tüm Wrapper (Integer, Long, Double, Byte….) class’lar immutable sýnýflardýr.

        Date, StringBuilder,StringBuffer, Arrays ve ArrayList mutable Class’lardandýr.

         */



    }
}
