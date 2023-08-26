package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
          Collections <dataTuru> nu Object secmeniz durumunda
          Collection'a farkli data turlerinden objeler koymaniza izin verir
          Bu depolama acisindan bize esneklik saglar
          Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
          cok fazla casting yapmamiz gerekebilir
         */
        List<String> liste = new ArrayList();
        // liste.add(5);    // list'imiz stringlerden oluþtuðu için integer ekleyemeyiz
        // liste.add('s');  // char da ekleyemeyiz
        // liste.add(true); // boolean da ekleyemeyiz

        List<Object> list = new ArrayList(); // data türü olarak object yazarsak, object data türlerinin atasýdýr.
        //List liste = new ArrayList(); bu þekilde de yazabiliriz (object) olarak kabul ediyor
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list); // [5, s, true, Ali]

        //*** bu collections ýn özelliði. collections farklý data türlerini barýndýrabilir.
        //*** farklý data türünde elemanlar eklersek iþlem yaparken java sorun oluþturabilir.
        //*** casting yapmak zorunda kalabiliriz, casting yaparken sorun yaþayabiliriz.
        //*** amacýnýz sadece depolamaksa kullanmak mantýklý
        //*** yazdýrmada sorun yok, iþlem yaparsak sorun

        list.set(0,(Integer)list.get(0)+5); // list in 0. indexi, integer olan 5'e, 5 daha eklemek istersek
                                            // casting yapmak zorundayýz, kabul etmiyor.
        list.set(3,list.get(3)+" Can");     // 3. indexteki string olan "Ali"'yi, "Ali Can" yapmak istersek
                                            // casting istemedi
        list.set(2,!(Boolean)list.get(2));  // boolean'ý false yapmak için casting istedi.

        System.out.println(list);           // [10, s, false, Ali Can]


        Set<Object> set1= new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
    }
}
