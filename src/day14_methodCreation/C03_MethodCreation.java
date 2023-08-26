package day14_methodCreation;

public class C03_MethodCreation {
    public static <Strtin> void main(String[] args) {

        // Input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun.

        String isim = "Enes";
        String soyisim = "Bozkurt";

        ismiGizle(isim,soyisim);  // E*** B******

        System.out.println(isim+ " " + soyisim); // Enes Bozkurt
        /*
        e�er ismi ve soyismi E*** B****** �eklinde saklamak istiyorsak;
        Stringe atayal�m.
        Kabul etmez ��nk� bizim methodumuz void.

        String gizliIsim = ismiGizle(isim,soyisim);

        Void olmayan bir method bulmal�y�z, o bize istedi�imiz ismi istedi�imiz hale d�nd�rmeli.
        bizde onu yeniIsim yada gizliIsim de bir variable a atamal�y�z ve bundan sonra hep �yle kullanmal�y�z.

        C04 class da bu i�lemi yap�yoruz !!!!
         */



    }

    public static void ismiGizle(String isim, String soyisim){

        isim = isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");

        soyisim = soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim + " "+ soyisim);
    }
}
