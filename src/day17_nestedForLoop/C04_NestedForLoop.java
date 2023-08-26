package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a g�re *'lardan olu�an bir ��gen olu�turun.
        �rnek input = 4 ise

        *
        * *
        * * *
        * * * *

         */
        /*
        bir sat�rda ka� tane * olaca��n� sat�r say�s�na g�re anl�yoruz. yani d�� looptan anl�yoruz.
        1. sat�rda 1 y�ld�z
        2. sat�rda 2 y�ld�z
        3. sat�rda 3 y�ld�z
         */

        int input = 4;

        for (int i = 1; i <=4 ; i++) {       // input kadar sat�r var.
            for (int j = 1; j <=i ; j++) {   // her sat�rda i kadar * var.
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
