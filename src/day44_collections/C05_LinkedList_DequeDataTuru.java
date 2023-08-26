package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim"); // sondaki Selim i sildi
        System.out.println(ll4.removeFirstOccurrence("Hasan")); // false

        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop()); // Cavidan
        // pop(); LinkedList'in ba��ndaki elementi silip, bize d�nd�r�r.

        ll4.remove();
        System.out.println(ll4); // [Selim, Tevfik]

        ll4.removeFirst();
        System.out.println(ll4); // [Tevfik]

        ll4.removeLast();
        System.out.println(ll4); // []

        // Deque iki tarafl� queue demektir, dolay�s�yla her methodun first ve last'� var
    }
}
