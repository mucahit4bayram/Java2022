package day34_inherritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class'dan parent class'a eri�imde access modifier kurallar�n� bypass edemeyiz.
        �rne�in parent class'daki private class �yelerini child class'dan kullanamay�z.
        ayn� �ekilde parent ve child farkl� package'larda ise parent class'daki default
        access modifier'i olan class �yelerini child class'dan kullanamay�z.
         */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model belirtilmedi

    }
}
