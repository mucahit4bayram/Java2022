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


        /*  /-/-/ !!! Ö N E M L Ý !!! /-/-/

        Çalýþtýrdýðýmýz method'un sonucunu String olarak gizliIsim'e atadýktan sonra, yani yukarýdaki iþlemi
        yaptýktan sonra method oluþturunca
        return type void yerine String oldu.
         */
        /*
        bu method'un amacý yazdýrmak deðil. bir deðiþiklik yapýp , deðiþtirilmiþ hali geri döndürmek.
         */


        System.out.println(isim+ " "+ soyisim);     // Enes Bozkurt
        System.out.println(gizliIsim);              // E*** B******

        /*
        hem isim ve soy isim duruyor
        hem de, artýk kalýcý olarak class'ýmýzýn içinde gizliIsim diye bir variable var, deðeri de E*** B****** oldu.
        hangisini kullanmak istersek ihtiyacýmýza göre kullanabiliriz.
         */

    }
    public static String isimGizle(String isim, String soyisim){


        isim = isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");

        soyisim = soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim + " "+ soyisim);

        return isim +" "+soyisim;  //return type olarak belirlediðimiz String'i döndürmemiz için return yazmalýyýz
    }
}
