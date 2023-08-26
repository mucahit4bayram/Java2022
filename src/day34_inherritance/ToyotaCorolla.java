package day34_inherritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class'dan parent class'a eriþimde access modifier kurallarýný bypass edemeyiz.
        örneðin parent class'daki private class üyelerini child class'dan kullanamayýz.
        ayný þekilde parent ve child farklý package'larda ise parent class'daki default
        access modifier'i olan class üyelerini child class'dan kullanamayýz.
         */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model belirtilmedi

    }
}
