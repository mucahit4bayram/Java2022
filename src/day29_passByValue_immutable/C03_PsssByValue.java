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
        // [ Oguz, Murat, Fatih]    // *** listenin kendisi deðiþmeyip elemanlar deðiþtiði için çýktýda deðiþti
                                    //     yani [Ali, Veli, Can] olmadý

        listDegistir(list);


        System.out.println("list degistir methodundan sonra list : " + list);
        // [ Oguz, Murat, Fatih]  enson bildiðinden devam etti.
        //  **** Method da yeni list oluþturulduðu için onu kabul etmedi(o pass by value).
        //       yani [Nutella, Cay, Cokokrem] i kabul etmedi
    }
    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();        // *** yeni array list oluþturduk. 3 eleman atadýk
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degistir methodunda : " + list); // methodun içinde yazdýrdýk
        // [Nutella, Cay, Cokokrem]   // main methoddaki liste bakalým
    }
    public static void elemanlariDegistir(List<String> list) {
        list.set(0,"Oguz");             // *** list'imizi güncelledik
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("eleman degistir methodunda : " + list);
        // [ Oguz, Murat, Fatih]        // *** list'imizin kendini deðiþtirmeyip elemanlarýný deðiþtirdiðimiz için
                                        //     çýktýda yeni elemanlarý gördük.
                                        //     main methoddaki asýl listemizin çýktýsýna bakalým.

    }
}

        /*
    ilk basta list : [Ali, Veli, Can]                               // ilk baþta

    eleman degistir methodunda : [Oguz, Murat, Fatih]               // eleman deðiþtir methodunda
                                                       // eleman deðiþtir methodundan sonra, main method'a döndüðümüzde
                                                       // list deðiþmeyip içindeki elemanlar deðiþtiði için
                                                       // [Oguz, Murat, Fatih] i kabul etti
    eleman degistir methodundan sonra list : [Oguz, Murat, Fatih]   // eleman deðiþtir methodundan sonra

    list degistir methodunda : [Nutella, Cay, Cokokrem]             // yeni list oluþturup yeni elemanlar atadýðýmýzda

    list degistir methodundan sonra list : [Oguz, Murat, Fatih]     // main methoddaki list deðiþmedi
                                                                    // senin atadýðýn yeni listi ben kabul etmiyorum
                                                                    // o passByValue bende geçerli deðil.

         */
