package day04_dataCasting;

public class C05_Homework2 {
    public static void main(String[] args) {

        /*  Narrowing (Daraltma)
        int veri türünde bir değişken oluşturun ve adım adım narrowing yapın ve yazdırın.
         */

        int sayi1 = 140;
        short sayi2 = (short)sayi1;
        byte sayi3 = (byte) sayi2;

        System.out.println("sayi1 = " + sayi1); // 140
        System.out.println("sayi2 = " + sayi2); // 140
        System.out.println("sayi3 = " + sayi3); // -116


    }
}
