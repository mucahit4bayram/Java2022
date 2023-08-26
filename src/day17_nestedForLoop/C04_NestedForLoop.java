package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a göre *'lardan oluþan bir üçgen oluþturun.
        örnek input = 4 ise

        *
        * *
        * * *
        * * * *

         */
        /*
        bir satýrda kaç tane * olacaðýný satýr sayýsýna göre anlýyoruz. yani dýþ looptan anlýyoruz.
        1. satýrda 1 yýldýz
        2. satýrda 2 yýldýz
        3. satýrda 3 yýldýz
         */

        int input = 4;

        for (int i = 1; i <=4 ; i++) {       // input kadar satýr var.
            for (int j = 1; j <=i ; j++) {   // her satýrda i kadar * var.
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
