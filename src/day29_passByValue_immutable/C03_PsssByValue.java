package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PsssByValue {
    public static void main(String[] args) {

        /*
          bir list olusturalim
          iki ayri method'dan birinde
          sadece elemanlari degistirelim

          digerinde yeni bir list atayip,
          ayni sayida yeni eleman ekleyelim

          ve her iki method call'dan sonra kendi listemizi
          main method icerisinde kontrol edelim
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list : " + list); // [Ali, Veli, Can]


        elemanlariDegistir(list);


        System.out.println("eleman degistir methodundan sonra list : " + list);
        // [ Oguz, Murat, Fatih]    // *** listenin kendisi de�i�meyip elemanlar de�i�ti�i i�in ��kt�da de�i�ti
                                    //     yani [Ali, Veli, Can] olmad�

        listDegistir(list);


        System.out.println("list degistir methodundan sonra list : " + list);
        // [ Oguz, Murat, Fatih]  enson bildi�inden devam etti.
        //  **** Method da yeni list olu�turuldu�u i�in onu kabul etmedi(o pass by value).
        //       yani [Nutella, Cay, Cokokrem] i kabul etmedi
    }
    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();        // *** yeni array list olu�turduk. 3 eleman atad�k
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degistir methodunda : " + list); // methodun i�inde yazd�rd�k
        // [Nutella, Cay, Cokokrem]   // main methoddaki liste bakal�m
    }
    public static void elemanlariDegistir(List<String> list) {
        list.set(0,"Oguz");             // *** list'imizi g�ncelledik
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("eleman degistir methodunda : " + list);
        // [ Oguz, Murat, Fatih]        // *** list'imizin kendini de�i�tirmeyip elemanlar�n� de�i�tirdi�imiz i�in
                                        //     ��kt�da yeni elemanlar� g�rd�k.
                                        //     main methoddaki as�l listemizin ��kt�s�na bakal�m.

    }
}

        /*
    ilk basta list : [Ali, Veli, Can]                               // ilk ba�ta

    eleman degistir methodunda : [Oguz, Murat, Fatih]               // eleman de�i�tir methodunda
                                                       // eleman de�i�tir methodundan sonra, main method'a d�nd���m�zde
                                                       // list de�i�meyip i�indeki elemanlar de�i�ti�i i�in
                                                       // [Oguz, Murat, Fatih] i kabul etti
    eleman degistir methodundan sonra list : [Oguz, Murat, Fatih]   // eleman de�i�tir methodundan sonra

    list degistir methodunda : [Nutella, Cay, Cokokrem]             // yeni list olu�turup yeni elemanlar atad���m�zda

    list degistir methodundan sonra list : [Oguz, Murat, Fatih]     // main methoddaki list de�i�medi
                                                                    // senin atad���n yeni listi ben kabul etmiyorum
                                                                    // o passByValue bende ge�erli de�il.

         */
