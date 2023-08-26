package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        /*
        verilen yükseklik ve boy dperine göre *'lardan oluþan bir dikdörtgen oluþturalým
        yükseklik :3 boy:4
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
            System.out.println("");  // alt satýra geçmek için yazdýk
        }
    }
}
