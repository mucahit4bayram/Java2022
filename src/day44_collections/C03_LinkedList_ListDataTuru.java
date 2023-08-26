package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        /*    /-/-/ Collection : nesnelerden oluþan bir topluluðu bir arada tutan yapýlardýr. /-/-/

    *** Set (Küme) : Collection içerisindeki herhangi bir yapýnýn adýnda Set kelimesi geçiyorsa aklýmýza unique gelecek
                     yani, set'in içerisinde tekrar þansý yok, ne varsa bitane var. Ýllada ikinciyi eklerseniz birinciyi
                     siler o artýk yine bir tane olur.(e-devlette iki tane ayný TC numarasý olmaz)

    *** Queue (Sýra / Kuyruk) : Herhangi bir yerde Queue yapýsý geçiyorsa, bir sýra olduðu dikkatimizi çekecek,
                                yemekhane kuyruðu gibi. ama araya girmek yok, ya baþtan ya sondan.
                                Queue kuyruk demektir, sira onemlidir. gelen sona gelir, giden bastan gider


    *** Linked (Baðlý / Halay) : Önemli olan halay gibi birbirine baðlý olmasý.Eklemek ve çýkartmak çok kolaydýr.

    *** Tree (Doðal Sýralý) : Herhangi bir yerde Tree yapýsý geçiyorsa, doðal sýralý olduðu aklýmýza gelmeli.
                              Ekleme çýkarmada yavaþtýr, her seferde sýralmayla uðraþýr.

    *** Hash : Belli bir algoritma çerçevesinde herþeyi yerli yerine yerleþtiriyor. Ekleme çýkarmada çok hýzlýdýr.
         */

        LinkedList<String> ll1 = new LinkedList(); // ll1, LinkedList'teki tüm metodlarý kullanabilir.

        List<String> ll2 = new LinkedList();  // ll2, List interface'indeki metodlarý kullanýr.

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2); // [Berk, Done, Enes, Ayse]

        System.out.println(ll2.remove(3)); // Ayse
        // eger Listemiz Integer elementlerden olusuyorsa
        // direk sayi yazarsak index olarak kabul eder
        // bir variable'a atama yapar ve remove'da o variabe'in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal")); // false

        System.out.println(ll2.isEmpty()); // false

        ll2.set(1,"Serap");
        System.out.println(ll2); // [Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1); //[Berk, Ismail]
        ll2.retainAll(ll1); // ll2 deki tum elementleri ll1 ile karsilastirir
                            // ll1'de olmayanlari siler

        System.out.println(ll2); // [Berk]

        System.out.println(ll2.hashCode()); // 2066939

        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 131726141
    }
}