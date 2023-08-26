package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {

        int sayi=10;
        boolean guzelMi=true;
        char sayim='3';

        System.out.println(sayi);             // 10
        System.out.println("sayi");           // sayi
        System.out.println("sayi : " + sayi); // sayi :10

        //---------------------------//

        String ismim="Mehmet";
        String soyisim="Bulutluoz";

        System.out.print(ismim);
        System.out.println(soyisim);
                                        // MehmetBulutluoz // ilk yazd�rmada print kullan�ld��� i�in alt sat�ra ge�medi

        System.out.println(ismim + ' ' + soyisim);  // Mehmet Bulutluoz
        // String degiskenlerde + islemi yaparsak, Java degiskenleri art arda ekler

        char bosluk = ' ';

        System.out.println(ismim+bosluk+soyisim);   // Mehmet Bulutluoz

        //---------------------------//
        String isim1="Java";
        String isim2="Guzel";

        System.out.println(isim1+" " + isim2); // Java Guzel

        int sayi1=5;
        int sayi2=7;

        System.out.println(sayi1+sayi2+isim1); // 12Java   (ilk �nce soldaki i�lemi yapt� 5+7=12)
        System.out.println(isim1+sayi1+sayi2); // Java57   (ilk i�leme giren veri tipi string oldu�u i�in di�erlerinide
                                                      //    kendine benzetti)

        /*
        - Primitive (ilkel) Data Types : blooean, char, byte, short, int, long, float, double
        - Non Primitive Data Types : String
          ilerleyen derslerde g�rece�imiz primitive olmayan Array,  List, Object gibi her data non primitive'dir.
         */



    }
}
