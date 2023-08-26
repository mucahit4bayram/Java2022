package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        /*    /-/-/ Collection : nesnelerden olu�an bir toplulu�u bir arada tutan yap�lard�r. /-/-/

    *** Set (K�me) : Collection i�erisindeki herhangi bir yap�n�n ad�nda Set kelimesi ge�iyorsa akl�m�za unique gelecek
                     yani, set'in i�erisinde tekrar �ans� yok, ne varsa bitane var. �llada ikinciyi eklerseniz birinciyi
                     siler o art�k yine bir tane olur.(e-devlette iki tane ayn� TC numaras� olmaz)

    *** Queue (S�ra / Kuyruk) : Herhangi bir yerde Queue yap�s� ge�iyorsa, bir s�ra oldu�u dikkatimizi �ekecek,
                                yemekhane kuyru�u gibi. ama araya girmek yok, ya ba�tan ya sondan.
                                Queue kuyruk demektir, sira onemlidir. gelen sona gelir, giden bastan gider


    *** Linked (Ba�l� / Halay) : �nemli olan halay gibi birbirine ba�l� olmas�.Eklemek ve ��kartmak �ok kolayd�r.

    *** Tree (Do�al S�ral�) : Herhangi bir yerde Tree yap�s� ge�iyorsa, do�al s�ral� oldu�u akl�m�za gelmeli.
                              Ekleme ��karmada yava�t�r, her seferde s�ralmayla u�ra��r.

    *** Hash : Belli bir algoritma �er�evesinde her�eyi yerli yerine yerle�tiriyor. Ekleme ��karmada �ok h�zl�d�r.
         */

        LinkedList<String> ll1 = new LinkedList(); // ll1, LinkedList'teki t�m metodlar� kullanabilir.

        List<String> ll2 = new LinkedList();  // ll2, List interface'indeki metodlar� kullan�r.

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