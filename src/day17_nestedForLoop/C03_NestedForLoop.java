package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        /*
        verilen y�kseklik ve boy dperine g�re *'lardan olu�an bir dikd�rtgen olu�tural�m
        y�kseklik :3 boy:4
        ****
        ****
        ****

         */

        int yukseklik=3;
        int boy =4;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("*");
            }
            System.out.println("");  // alt sat�ra ge�mek i�in yazd�k
        }
    }
}
