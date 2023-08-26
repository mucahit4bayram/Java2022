package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullan�lmaya ba�lanm��t�r.
    2) Functional Programming'de "Ne yap�lacak" (What to do) �zerine yo�unla��l�r.
       Structured Programming "Nas�l yap�lacak" (How to do) �zerine yo��nla��l�r.
    3) Functional Programming, Arrays ve Collections ile kullan�l�r.
       (Collections : nesnelerden olu�an bir toplulu�u bir arada tutan yap�lardir.)
    4) "entrySet() methodu ile ==> Map, Set'e d�n��t�r�lerek Functional Programming'de kullan�labilir.
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
    // 1) Ard���k list elementlerini ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list){
    /*
    *** Static yaparsak; obje olu�turmadan class i�erisinde kullanabiliriz. Static olmazsa main metod i�erisinde obje olu�turmal�y�z.
    *** Metodu static yapt���m�zda ba�ka class larda kullan�ld���nda bir birini etkileyerek s�k�nt� olu�turabilir.
    *** void yaparsak; bize herhangi bir�ey d�nd�rmeyecek (return yapmayacak).
    *** Method return type verirse; o methodu kullanarak �zerinde �al��ma yapabiliriz.
        ekleme yap�labilir, concatination yap�labilir, matematiksel i�lem yap�labilir.
     */

        for(Integer w : list){ // listin her eleman�n� Integer w kontainer in i�ine koyuyoruz.

            System.out.print(w+" ");

        }
    }

    // 1) List elementlerini ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));

        /* stream() : collection'dan elementleri ak��a dahil etmek i�in ve methodlara ula�mak i�in kullan�l�r.
           t  ==> lambda expression, collection dan al�nan her bir eleman� ifade ediyor.

        */
    }

    // 2) �ift say� olan list elemanlar�n� ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for(Integer w : list){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    // 2) �ift say� olan �ift list elemanlar�n� ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
       /* filter () : Dizimiz veya Collection��m�z �zerinde bizim belirtece�imiz ko�ullar do�rultusunda
                      filtreleme i�lemi yapmam�za yarayan bir yap�d�r.
          Bu i�lem sonras� belirtti�imiz ko�ula uygun olmayan elemanlar bir sonraki a�amada kullan�lamazlar.
          Art�k elimizde filtrelenmi�/s�z�lm��/elenmi� bir veri vard�r
       */

    // 3) Tek list elemanlar�n�n karelerini ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));

    }
        /* map () : Elemanlar�n de�erlerini de�i�tirebilmemiz i�in map methodunu kullanmal�y�z.
        */

    // 4) Tek list elementlerinin k�plerini tekrars�z olarak ayn� sat�rda aralar�nda bo�luk b�rakarak yazd�ran bir method olu�turun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }
        /* distinct () : Stream i�erisinde bulunan ve tekrar eden elemanlar varsa bunlar� distinct metodu ile
                         ��kartabilir ve elimizde tekrar etmeyen birbirinden farkl� elemanlar bar�ndan bir veri setimiz kal�r
        */

    // 5) Tekrars�z �ift elemanlar�n karelerinin toplam�n� hesaplayan bir method olu�turun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); // toplamada ba�lang�� de�eri 0 girilir.

        System.out.println(toplam);

        /* reduce : indirgeme demektir. kullan�m�; elemanlar� teker teker i�ler. Bir �nceki ad�mda elde edilen sonu�,
                    bir sonraki elemanla i�lemle tutulur. Ba�lang�� de�eri belirtilmelidir;
                    - toplamada ba�lang�� de�eri 0 girilir.
                    - �arpmada ba�lang�� de�eri 1 girilir.
                      t ==> ba�lang�� de�erini al�yor. sonraki i�lemde u dan gelen de�eri al�yor.
                      u ==> method da yap�lan i�lemden gelen de�eri al�yor.
        */
    }

    // 6) Tekrars�z �ift elemanlar�n k�p�n�n �arp�m�n� hesaplayan bir method olu�turun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)-> t*u); // �arpmada ba�lang�� de�eri 1 girilir.

        System.out.println(carpim);
    }

    // 7) List elemanlar� aras�ndan en b�y�k de�eri bulan bir method olu�turun.
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

    // 8) List elemanlar� aras�ndan en k���k de�eri bulan bir method olu�turun.(2 Yol ile)
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
        reverseOrder() => Comparator Class��n�n bir methodudur. Do�al s�ralaman�n tersini (b�y�kten k����e)
                          uygulayan bir Comparator (kar��la�t�r�c�) d�nd�r�r.
        */
    }

    // 9) List elemanlar� aras�ndan 7'den b�y�k, �ift, en k���k de�eri bulan bir method olu�turun.
    // 1. Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list){

        Integer min =  list.
                stream().
                distinct().
                filter(t->t%2==0). // �ift olanlar� filtrele
                filter(t->t>7).    // bu elemanlardan 7 den b�y�k olan� ver
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
                sorted(Comparator.reverseOrder()). // testen s�ralad�k. (b�y�kten k����e)
                reduce(Integer.MAX_VALUE,(t,u)->u);// bu method asl�nda bize sonuncu eleman� veriyor(s�ralaman�n sonuncu)

        System.out.println(min);
    }
    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){

        Integer min = list.
                        stream().
                        filter(t->t%2==0). // 1. filtreleme
                        filter(t->t>7).    // 2. filtreleme
                        sorted().          // s�ralama yapt�k (k���kten b�y�p�e)
                        findFirst().       // birinci eleman / en k�����
                        get();             // buldu�umuzu almak i�in get diyoruz.

        System.out.println(min);
    }

    // 10) Ters s�ralama ile tekrars�z ve 5'ten b�y�k elemanlar�n yar� de�erlerini(elaman�n ikiye b�l�m sonucunu) bulan bir method olu�turun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double> sonuc =  list.
                stream().
                distinct().                        // tekrars�z
                filter(t-> t>5).                   // 5 den b�y�k
                map(t->t/2.0).                     // i�leme sokulaca�� i�in map
                sorted(Comparator.reverseOrder()). // b�y�kten k����e s�rala
                collect(Collectors.toList());      // collect ==> her bir de�eri toplay�p listin i�ine koyuyor

        System.out.println(sonuc);
        /*
         Collectors.toList() => ��eleri koleksiyonlarda toplamak, ��eleri �e�itli kriterlere g�re �zetlemek gibi �e�itli
                                yararl� azaltma i�lemlerini uygulayan Collector Uygulamalar�.
         */

    }
}
