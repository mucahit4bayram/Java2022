package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        /*
        9 dan 190 a kadar 7 nin kati olan tüm tamsayýlarý ekrana yazdýrýnýz.
         */

        int bas = 9;
        int bitis = 190 ;

        int temp = bas;

        // while loop ile;

        while (temp<bitis){
            if (temp%7==0){
                System.out.print(temp + " ");

            }
            temp++;
        }
        // do while ile yapalým;
        System.out.println("");
        temp = bas ;

        do {
            if (temp%7==0){
                System.out.print(temp + " ");

            }
            temp++;
        } while (temp<bitis);
    }
}
