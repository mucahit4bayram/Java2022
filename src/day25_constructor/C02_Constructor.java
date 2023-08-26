package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        // Car class'indan bir obje olusturalim

             C01         obj1        =   new         C01()    ;
        // class adi  objenin adi     keyword      constructor

        Scanner scan = new Scanner(System.in);
        Random rnd= new Random();
        List<String> list= new ArrayList<>();

        // List<String> list2=new List<>();

        /*
        Javada bir obje olusturabilmek icin mutlaka constructor kullanmalisiniz
         */

        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // Araba dan deneme method calisir


        // Bir obje olustururken eger obje icin kendi class'inda belirlenen degerleri kullanmak istiyorsam
        // hic bir degeri kendim atamadan obje olusturabilirim
        // bu durumda hic bir parametre kullanilmadigi icin default constructor yeterli olacaktir


        // Eger obje olusturdugum class'daki degerleri kullanmak yerine kendi degerlerimle bir obje
        // olusturmak istersem o zaman parametreli constructor olusturmam gerekir



    }
}
