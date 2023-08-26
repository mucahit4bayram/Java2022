package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {


        // Soru 4) Verilen bir array�de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler ={"Istanbul", "Ankara","Mersin","Konya","Kastamonu"};

        String istenmeyenHarf="r";

        // istemedi�imiz harf de�i�ece�i i�in,  kalanlar�n ka� tane oldu�unu ba�tan bilmemiz m�mk�n de�il
        // Array'dan elementi alaca��z, e�er bu harfi i�eriyorsa listeye koymayaca��z, i�ermiyorsa koyaca��z

        List<String> kalanlar=new ArrayList<>();        // harfi i�ermeyenleri koymak i�in yeni list olu�tural�m

        for (int i = 0; i < sehirler.length; i++) {     // �ehirlerin length ine kadar loop olu�turuyoruz
            if (!sehirler[i].contains(istenmeyenHarf)){ // istenmeyen harfi i�ermiyorsa
                kalanlar.add(sehirler[i]);              // kalanlar listesine ekle
            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler, listeye eklenmis olacak

        System.out.println(kalanlar);                   // [Istanbul, Konya, Kastamonu]

        // yeni bir array olusturup, listeyi ona aktaralim
        String[] kalanlarArrayi=new String[kalanlar.size()]; // kalanlar isminde string bir array olu�turduk
                                                             // uzunlu�uda listemin uzunlu�u kadar olacak
                                                             // array olu�turmak i�in uzunlu�a ihtiyac�m�z var

        // kalanlar listesindeki elementleri array'a atmak i�in for loop olu�turuyoruz.
        for (int i = 0; i <kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);               // kalanlar array'inin i. eleman� olarak,
                                                             // kalanlar listesindeki i. indexteki elementi atayaca��m
        }
        // sehirler array'inin yeni degerini atayalim
        sehirler=kalanlarArrayi;

        System.out.println("sehirler array'inin son hali : " + Arrays.toString(sehirler));
                                                             // [Istanbul, Konya, Kastamonu]
    }
}