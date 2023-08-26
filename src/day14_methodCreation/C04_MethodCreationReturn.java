package day14_methodCreation;

public class C04_MethodCreationReturn {

    // verilen isim ve soyismi ilk harfi buyuk
    // geriye kalanlari * olacak sekilde degistirip
    // bize bu halini donduren bi method olusturun
    // NOT: programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

    public static void main(String[] args) {

        String isim = "Enes";
        String soyisim = "Bozkurt";

        String gizliIsim = isimGizle(isim,soyisim); // E*** B******


        /*  /-/-/ !!! � N E M L � !!! /-/-/

        �al��t�rd���m�z method'un sonucunu String olarak gizliIsim'e atad�ktan sonra, yani yukar�daki i�lemi
        yapt�ktan sonra method olu�turunca
        return type void yerine String oldu.
         */
        /*
        bu method'un amac� yazd�rmak de�il. bir de�i�iklik yap�p , de�i�tirilmi� hali geri d�nd�rmek.
         */


        System.out.println(isim+ " "+ soyisim);     // Enes Bozkurt
        System.out.println(gizliIsim);              // E*** B******

        /*
        hem isim ve soy isim duruyor
        hem de, art�k kal�c� olarak class'�m�z�n i�inde gizliIsim diye bir variable var, de�eri de E*** B****** oldu.
        hangisini kullanmak istersek ihtiyac�m�za g�re kullanabiliriz.
         */

    }
    public static String isimGizle(String isim, String soyisim){


        isim = isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");

        soyisim = soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim + " "+ soyisim);

        return isim +" "+soyisim;  //return type olarak belirledi�imiz String'i d�nd�rmemiz i�in return yazmal�y�z
    }
}
