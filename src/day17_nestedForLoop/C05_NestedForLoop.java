package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a göre *'lardan oluþan aþaðýdaki þekli oluþturun

        input =4
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

        */
        // artan kýsmý nested for loop ile yapalým

        int input =4;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {   // üçgen olduðu için 1 den baþlayacak i ye kadar.
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = input-1; i >=1 ; i--) { // ters üçgene geçtiði için 3 den bire kadar yani input-1 den 1 e kadar.
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

