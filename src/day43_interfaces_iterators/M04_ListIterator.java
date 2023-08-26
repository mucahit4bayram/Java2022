package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class M04_ListIterator {
    public static void main(String[] args) {
        /*
         ListIterator Iterator'interface'nin child interface'dir
         ama daha cok method'a sahiptir
         */

        List<Integer> liste= new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]
        Integer temp;

        ListIterator lit1= liste.listIterator(); // list iterator d�nd�ren, lit1 ad�nda list iterator methodu olu�turduk.

        while(lit1.hasNext()){
            temp=(Integer)lit1.next()+3;
            lit1.set(temp);  // list1 �zerinden set methodunu girebilmemiz i�in objeye ihtiyac�m�z var
                             // obje demek non-primitive data t�r� demek, onun i�n tempe atayaca��m�z de�eri normal int
            // de�ilde wrapper class ten Integer ile yapmay� tercih ettik. wrapper Integer eklemedi�imizde;
            // lit1.next() bize obje getiriyordu, integer atama yap�nca uyumlu de�il diyordu. onun i�in;
            // temp'in data t�r� integer oldu�u i�in, integer da objenin child'i oldu�u i�in objeyi cast yapabiliriz
            // integer'i 3 artt�r�p, listIterator'daki set metodu ile artt�rd���m�z de�erin atamas�n� yapt�k
        }
        System.out.println(liste); // [13, 23, 33]
    }
}









