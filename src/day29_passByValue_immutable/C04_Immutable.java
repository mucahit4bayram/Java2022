package day29_passByValue_immutable;

public class C04_Immutable {

    public static void main(String[] args) {

        /*
         Immutable : degistirilemez
         mutable   : degistirilebilir
         en meshur immutable class : String
         */
        String str= "Yildiz Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();

        System.out.println(str); // Yildiz Bank

        str.substring(3,5); // sout olmadigindan yazdirmaz, yazd�rsayd�k sonu� // di olurdu

        System.out.println(str); // Yildiz Bank

        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb); // Java Bank

        sb.reverse();

        System.out.println(sb); // knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.

        // **** StringBuilder'da bir atama olmasada bir method �al���yorsa String de�i�iyor.

        // **** String immutable oldu�u i�in de�i�tirilemiyor.

        /*
        Immutable (de�i�mez) class�lar, objeleri bir kez olu�turulduktan sonra
        de�i�tiremedigimiz class�lardir.

        Mutable (de�i�ebilir) class�lar ise tam tersi olarak, olusturdugumuz
        objeleri de�i�tirebildigimiz class�lardir.

        NOT :   Immutable class�dan olusturulan objeler de immutable olurlar.

                Bu tur bir object�i olu�turabiliriz, fakat onlar� de�i�tiremeyiz.
                Immutable bir objeyi de�i�tirmek istersek, Java o objeyi klonlar ve yapilan
                degisiklikleri klonlanmis yeni obje uzerinde gerceklestirir.

                Peki b�yle bir duruma ni�in ihtiyac�m�z olur diye bir soru sorarsak,
                cevab� thread safe (guvenli es zamanli calisma) konusudur.

                Immutable nesnelerin de�erleri de�i�meyece�i i�in �zerinde ka� tane thread
                �al���rsa �al��s�n hep ayn� de�erler �zerinden i�lem yap�lacakt�r.

        Java�da yayg�n olanlar�ndan �rnek verecek olursak

        String ve t�m Wrapper (Integer, Long, Double, Byte�.) class�lar immutable s�n�flard�r.

        Date, StringBuilder,StringBuffer, Arrays ve ArrayList mutable Class�lardand�r.

         */



    }
}
