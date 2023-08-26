package day04_dataCasting;

public class C05_Homework1 {
    public static void main(String[] args) {

        /* Widining (Genişletme)
           byte veri tipinde bir değişken oluşturun, short, int, float ve double data tiplerinde birer değişken
           oluşturup adım adım widening yapın ve yazdırın.
        */

        byte sayi1 = 126;
        System.out.println("Sayi : " + sayi1); // 126

        short sayi2 = sayi1;
        System.out.println("Sayi : " + sayi2); // 126

        int sayi3 = sayi2;
        System.out.println("Sayi : " + sayi3); // 126

        float sayi4 = sayi3;
        System.out.println("Sayi : " + sayi4); // 126.0

        double sayi5 = sayi4;
        System.out.println("Sayi : " + sayi5); // 126.0


    }
}
