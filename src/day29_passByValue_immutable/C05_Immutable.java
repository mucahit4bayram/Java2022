package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {
        /*
        String’de yaptigimiz degisikligin kalici olmasi icin assignment yapabiliriz.
        Bu durumda da String immutable oldugu icin Java atadigimiz yeni deger icin klon bir variable olusturur ve
        yeni degeri yeni klonlanmis String’e assign eder, referansin isaret ettigi object de yeni klon object olur.
         */

        String isim= "Mine";

        isim=isim.toUpperCase();  // böyle atama yaparsak kalýcý olarak deðiþir.

        System.out.println(isim); // MINE

        isim="Mevlut";

        System.out.println(isim); // Mevlut

        for (int i = 0; i <100 ; i++) {
            isim += ".";
        }
        System.out.println(isim);


    }
}

        /*
                Önceki Dersten Aklýmýzda Kalanlar

        1. Immutable Class degistirilemeyen class demektir. Bu class’lardan olusturulan objeler de
        immutable olurlar.

        2. Bugune kadar kullandigimiz class’lardan immutable olan en meshur class String class’idir.

        3. String class’indan olusturdugumuz objelerde, String method’lari calistirdigimizda, objemiz
        degismez.

                String str= “Java Candir”;
                str.toLowercase();
                str.replace(“Java”, “C#”);
                str.substring(0,2);
                sout(str) ? “Java Candir”

             O method’lar calistirldiklari satirda str’in bir kopyasi uzerinde calisirlar ve o kopya uzerinde
        degisiklikler yaparlar. O satirda yazdirir veya bir String variable’a atama yaparsak, method’un
        sonucunu yazdirir veya atama yaparlar.

        Ancak o satir gectikten sonra str yazdirdigimizda degismedigini goruruz.

        4. String method’larinda yasadigimiz bu durum mutable olan ArrayList, Array veya StringBuilder’da
        yasanmaz. Onlarda method calistiginda yapilan degisiklikler kalici olur.
         */