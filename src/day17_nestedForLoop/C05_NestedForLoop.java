package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a g�re *'lardan olu�an a�a��daki �ekli olu�turun

        input =4
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

        */
        // artan k�sm� nested for loop ile yapal�m

        int input =4;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {   // ��gen oldu�u i�in 1 den ba�layacak i ye kadar.
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = input-1; i >=1 ; i--) { // ters ��gene ge�ti�i i�in 3 den bire kadar yani input-1 den 1 e kadar.
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

