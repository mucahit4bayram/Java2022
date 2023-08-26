package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi =10;

        System.out.println("pre-increment : " + ++sayi); // 1- önce artırma       // 11
                                                         // 2- sonra yazdırma

        System.out.println("post-incremet : " + sayi++); // 1- önce yazdırma      // 11
                                                         // 2- sonra artırma

        // pos-incremet 'den sonra sayı bir artarak 12 oldu

        System.out.println("post-incremet'den sonra : " + sayi);     // 12

        /*
        sayi++; //13           // burada her halükarda artırma var.
        ++sayi; //14

                               // işin içine yazdırma yada atama eklenince sıralama devreye giriyor
         */
    }
}
