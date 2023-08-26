package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";
        int sayi1 = 5;
        int sayi2 = 4;

        // yukarıdaki variable'leri kullanarak istenen metinleri yazdıralım

        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2);   // Java Guzeldir 54
        System.out.println(str1 + " " + str2 + " " + (sayi1 + sayi2)); // Java Guzeldir 9
        System.out.println(sayi1 + sayi2 + " " + str1);                // 9 Java
        System.out.println("" + sayi1 + sayi2 + " " + str2);           // 54 Guzeldir

        System.out.println(str1.concat(str2));                     // JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2));     // Java Guzeldir

        System.out.println(str1 + " " + sayi1 +" "+str2);          // Java 5 Guzeldir
        System.out.println(str1+" "+(sayi1+sayi2)+sayi2);          // Java 94
        System.out.println(str1+" "+(sayi1-sayi2)+(sayi1+sayi2));  // Java 19

        /*
         * kural1) Eger toplanan degerlerden bir tanesi bile String ise Java toplama degil
		  		   concatenation(Birlestirme) yapar

		 * kural2) Eger toplanan degerlerin ikisi de matematiksel islemse Java toplar

		 * kural3) Eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler
		  		   belirlenip o islemler icin parantez kullanilabilir

		 * kural4) Matematiksel bir islemde char degisken kullanilirsa, Java char'in ascii degerini
		  		   isleme alir

		 * kural5) char bir degisken ile String bir degisken toplanirsa concatenation olur

         */



    }

}
