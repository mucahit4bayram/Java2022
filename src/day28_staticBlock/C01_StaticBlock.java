package day27_staticKeyword.day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method'dan bile once)

        static block class olusturuldugunda calisir
        genellikle de class'la ilgili  ayarlamalar veya static variable'lara deger atamak icin kullanilir.

        static block'larin class icerisinde nerede oldugu onemli degildir
        once static block'lar calisir

        birden fazla static block varsa, yukaridan asagi dogru calisir
         */

        System.out.println("static blok calisti");
        sayi=10;
    }
    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altindaki static block calisti");
    }
}

        /*
            *** static kelimesi bir variable段 veya Method置 Class誕 baglamak icin kullanilir.

            *** Bir variable veya Method static olarak etiketlendiginde o artik class段n elemani olur
                ve ona ulasmak icin object olusturmamiza gerek kalmaz.

            *** Instance variable誕 ulasmak icin ise MUTLAKA object olusturmaliyiz

            --------------------------------------------
            * Static Methods :
            1) Return Type壇an once static keyword kullanarak, static method olusturabiliriz

            2) Static Method値ar static variable (class variables) lari direk kullanabilirler

            3) Static Method値ar static ve non-static method値ardan cagrilabilir.
            --------------------------------------------
            * Static Variables :
            1) Class yuklendiginde, memory壇e static variable値ar olusturulur.

            2) Static variable値ar bir tane olusturulur ve class壇aki tum objeler onu gorur ve kullanir.

            3) Memory kullanimi static variable値ar icin sadece bir kere olur.

            4) Static variable値ar static veya static olmayan methodlarin icinde kullanilabilir.

            5) Static variable値ara baska classlardan sadece class ismi kullanilarak ulasilabilir,
               obje olusturmaya gerek yoktur.
            ----------------------------------------------
            * Static Blocks :

            1) Static block static variable値ara deger atamasi
            yapmak icin kullanilir.

            2) Static block, class ilk calistirilmaya baslandiginda
            calisir ve static variable値ara ilk deger atamasi
            yapar (initialize)

            3) Static block値ar constructor値ardan, tum
            method値ardan ve main method壇an once calisir.

            4) Eger 1'den fazla static block varsa ustteki blok
            daha once calisir.
         */
