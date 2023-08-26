package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {


        // Soru 4) Verilen bir array’de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler ={"Istanbul", "Ankara","Mersin","Konya","Kastamonu"};

        String istenmeyenHarf="r";

        // istemediðimiz harf deðiþeceði için,  kalanlarýn kaç tane olduðunu baþtan bilmemiz mümkün deðil
        // Array'dan elementi alacaðýz, eðer bu harfi içeriyorsa listeye koymayacaðýz, içermiyorsa koyacaðýz

        List<String> kalanlar=new ArrayList<>();        // harfi içermeyenleri koymak için yeni list oluþturalým

        for (int i = 0; i < sehirler.length; i++) {     // þehirlerin length ine kadar loop oluþturuyoruz
            if (!sehirler[i].contains(istenmeyenHarf)){ // istenmeyen harfi içermiyorsa
                kalanlar.add(sehirler[i]);              // kalanlar listesine ekle
            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler, listeye eklenmis olacak

        System.out.println(kalanlar);                   // [Istanbul, Konya, Kastamonu]

        // yeni bir array olusturup, listeyi ona aktaralim
        String[] kalanlarArrayi=new String[kalanlar.size()]; // kalanlar isminde string bir array oluþturduk
                                                             // uzunluðuda listemin uzunluðu kadar olacak
                                                             // array oluþturmak için uzunluða ihtiyacýmýz var

        // kalanlar listesindeki elementleri array'a atmak için for loop oluþturuyoruz.
        for (int i = 0; i <kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);               // kalanlar array'inin i. elemaný olarak,
                                                             // kalanlar listesindeki i. indexteki elementi atayacaðým
        }
        // sehirler array'inin yeni degerini atayalim
        sehirler=kalanlarArrayi;

        System.out.println("sehirler array'inin son hali : " + Arrays.toString(sehirler));
                                                             // [Istanbul, Konya, Kastamonu]
    }
}