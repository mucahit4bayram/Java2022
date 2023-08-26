package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullanýlmaya baþlanmýþtýr.
    2) Functional Programming'de "Ne yapýlacak" (What to do) üzerine yoðunlaþýlýr.
       Structured Programming "Nasýl yapýlacak" (How to do) üzerine yoðýnlaþýlýr.
    3) Functional Programming, Arrays ve Collections ile kullanýlýr.
       (Collections : nesnelerden oluþan bir topluluðu bir arada tutan yapýlardir.)
    4) "entrySet() methodu ile ==> Map, Set'e dönüþtürülerek Functional Programming'de kullanýlabilir.
     */

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);


        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional:");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman01(liste);
        getMaxEleman02(liste);
        getMinEleman01(liste);
        getMinEleman02(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }
    // 1) Ardýþýk list elementlerini ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list){
    /*
    *** Static yaparsak; obje oluþturmadan class içerisinde kullanabiliriz. Static olmazsa main metod içerisinde obje oluþturmalýyýz.
    *** Metodu static yaptýðýmýzda baþka class larda kullanýldýðýnda bir birini etkileyerek sýkýntý oluþturabilir.
    *** void yaparsak; bize herhangi birþey döndürmeyecek (return yapmayacak).
    *** Method return type verirse; o methodu kullanarak üzerinde çalýþma yapabiliriz.
        ekleme yapýlabilir, concatination yapýlabilir, matematiksel iþlem yapýlabilir.
     */

        for(Integer w : list){ // listin her elemanýný Integer w kontainer in içine koyuyoruz.

            System.out.print(w+" ");

        }
    }

    // 1) List elementlerini ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));

        /* stream() : collection'dan elementleri akýþa dahil etmek için ve methodlara ulaþmak için kullanýlýr.
           t  ==> lambda expression, collection dan alýnan her bir elemaný ifade ediyor.

        */
    }

    // 2) Çift sayý olan list elemanlarýný ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for(Integer w : list){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    // 2) Çift sayý olan çift list elemanlarýný ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
       /* filter () : Dizimiz veya Collection’ýmýz üzerinde bizim belirteceðimiz koþullar doðrultusunda
                      filtreleme iþlemi yapmamýza yarayan bir yapýdýr.
          Bu iþlem sonrasý belirttiðimiz koþula uygun olmayan elemanlar bir sonraki aþamada kullanýlamazlar.
          Artýk elimizde filtrelenmiþ/süzülmüþ/elenmiþ bir veri vardýr
       */

    // 3) Tek list elemanlarýnýn karelerini ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));

    }
        /* map () : Elemanlarýn deðerlerini deðiþtirebilmemiz için map methodunu kullanmalýyýz.
        */

    // 4) Tek list elementlerinin küplerini tekrarsýz olarak ayný satýrda aralarýnda boþluk býrakarak yazdýran bir method oluþturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }
        /* distinct () : Stream içerisinde bulunan ve tekrar eden elemanlar varsa bunlarý distinct metodu ile
                         çýkartabilir ve elimizde tekrar etmeyen birbirinden farklý elemanlar barýndan bir veri setimiz kalýr
        */

    // 5) Tekrarsýz çift elemanlarýn karelerinin toplamýný hesaplayan bir method oluþturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); // toplamada baþlangýç deðeri 0 girilir.

        System.out.println(toplam);

        /* reduce : indirgeme demektir. kullanýmý; elemanlarý teker teker iþler. Bir önceki adýmda elde edilen sonuç,
                    bir sonraki elemanla iþlemle tutulur. Baþlangýç deðeri belirtilmelidir;
                    - toplamada baþlangýç deðeri 0 girilir.
                    - çarpmada baþlangýç deðeri 1 girilir.
                      t ==> baþlangýç deðerini alýyor. sonraki iþlemde u dan gelen deðeri alýyor.
                      u ==> method da yapýlan iþlemden gelen deðeri alýyor.
        */
    }

    // 6) Tekrarsýz çift elemanlarýn küpünün çarpýmýný hesaplayan bir method oluþturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)-> t*u); // çarpmada baþlangýç deðeri 1 girilir.

        System.out.println(carpim);
    }

    // 7) List elemanlarý arasýndan en büyük deðeri bulan bir method oluþturun.
    // 1. Yol:
    public static void getMaxEleman01(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u );

        System.out.println(max);
    }

    // 2. Yol:
    public static void getMaxEleman02(List<Integer> list){

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);

        System.out.println("max = " + max);
    }

    // 8) List elemanlarý arasýndan en küçük deðeri bulan bir method oluþturun.(2 Yol ile)
    // 1. Yol:
    public static void getMinEleman01(List<Integer> list) {

        Integer min = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u );

        System.out.println("min = " + min);
    }
    // 2. Yol:
    public static void getMinEleman02(List<Integer> list){

        Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);

        System.out.println("min = " + min);
        /*
        reverseOrder() => Comparator Class’ýnýn bir methodudur. Doðal sýralamanýn tersini (büyükten küçüðe)
                          uygulayan bir Comparator (karþýlaþtýrýcý) döndürür.
        */
    }

    // 9) List elemanlarý arasýndan 7'den büyük, çift, en küçük deðeri bulan bir method oluþturun.
    // 1. Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list){

        Integer min =  list.
                stream().
                distinct().
                filter(t->t%2==0). // çift olanlarý filtrele
                filter(t->t>7).    // bu elemanlardan 7 den büyük olaný ver
                reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min);
    }

    //2. Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list){

        Integer min = list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.reverseOrder()). // testen sýraladýk. (büyükten küçüðe)
                reduce(Integer.MAX_VALUE,(t,u)->u);// bu method aslýnda bize sonuncu elemaný veriyor(sýralamanýn sonuncu)

        System.out.println(min);
    }
    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){

        Integer min = list.
                        stream().
                        filter(t->t%2==0). // 1. filtreleme
                        filter(t->t>7).    // 2. filtreleme
                        sorted().          // sýralama yaptýk (küçükten büyüpðe)
                        findFirst().       // birinci eleman / en küçüðü
                        get();             // bulduðumuzu almak için get diyoruz.

        System.out.println(min);
    }

    // 10) Ters sýralama ile tekrarsýz ve 5'ten büyük elemanlarýn yarý deðerlerini(elamanýn ikiye bölüm sonucunu) bulan bir method oluþturun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double> sonuc =  list.
                stream().
                distinct().                        // tekrarsýz
                filter(t-> t>5).                   // 5 den büyük
                map(t->t/2.0).                     // iþleme sokulacaðý için map
                sorted(Comparator.reverseOrder()). // büyükten küçüðe sýrala
                collect(Collectors.toList());      // collect ==> her bir deðeri toplayýp listin içine koyuyor

        System.out.println(sonuc);
        /*
         Collectors.toList() => Öðeleri koleksiyonlarda toplamak, öðeleri çeþitli kriterlere göre özetlemek gibi çeþitli
                                yararlý azaltma iþlemlerini uygulayan Collector Uygulamalarý.
         */

    }
}
