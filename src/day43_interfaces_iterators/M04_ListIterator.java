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

        ListIterator lit1= liste.listIterator(); // list iterator döndüren, lit1 adýnda list iterator methodu oluþturduk.

        while(lit1.hasNext()){
            temp=(Integer)lit1.next()+3;
            lit1.set(temp);  // list1 üzerinden set methodunu girebilmemiz için objeye ihtiyacýmýz var
                             // obje demek non-primitive data türü demek, onun içn tempe atayacaðýmýz deðeri normal int
            // deðilde wrapper class ten Integer ile yapmayý tercih ettik. wrapper Integer eklemediðimizde;
            // lit1.next() bize obje getiriyordu, integer atama yapýnca uyumlu deðil diyordu. onun için;
            // temp'in data türü integer olduðu için, integer da objenin child'i olduðu için objeyi cast yapabiliriz
            // integer'i 3 arttýrýp, listIterator'daki set metodu ile arttýrdýðýmýz deðerin atamasýný yaptýk
        }
        System.out.println(liste); // [13, 23, 33]
    }
}









