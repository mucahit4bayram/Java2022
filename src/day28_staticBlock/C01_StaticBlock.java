package day27_staticKeyword.day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method'dan bile once)

        static block class olusturuldugunda calisir
        genellikle de class'la ilgili �n ayarlamalar veya static variable'lara deger atamak icin kullanilir.

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
            *** static kelimesi bir variable�i veya Method�u Class�a baglamak icin kullanilir.

            *** Bir variable veya Method static olarak etiketlendiginde o artik class�in elemani olur
                ve ona ulasmak icin object olusturmamiza gerek kalmaz.

            *** Instance variable�a ulasmak icin ise MUTLAKA object olusturmaliyiz

            --------------------------------------------
            * Static Methods :
            1) Return Type�dan once static keyword kullanarak, static method olusturabiliriz

            2) Static Method�lar static variable (class variables) lari direk kullanabilirler

            3) Static Method�lar static ve non-static method�lardan cagrilabilir.
            --------------------------------------------
            * Static Variables :
            1) Class yuklendiginde, memory�de static variable�lar olusturulur.

            2) Static variable�lar bir tane olusturulur ve class�daki tum objeler onu gorur ve kullanir.

            3) Memory kullanimi static variable�lar icin sadece bir kere olur.

            4) Static variable�lar static veya static olmayan methodlarin icinde kullanilabilir.

            5) Static variable�lara baska classlardan sadece class ismi kullanilarak ulasilabilir,
               obje olusturmaya gerek yoktur.
            ----------------------------------------------
            * Static Blocks :

            1) Static block static variable�lara deger atamasi
            yapmak icin kullanilir.

            2) Static block, class ilk calistirilmaya baslandiginda
            calisir ve static variable�lara ilk deger atamasi
            yapar (initialize)

            3) Static block�lar constructor�lardan, tum
            method�lardan ve main method�dan once calisir.

            4) Eger 1'den fazla static block varsa ustteki blok
            daha once calisir.
         */
