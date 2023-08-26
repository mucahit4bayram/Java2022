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
        eðer ismi ve soyismi E*** B****** þeklinde saklamak istiyorsak;
        Stringe atayalým.
        Kabul etmez çünkü bizim methodumuz void.

        String gizliIsim = ismiGizle(isim,soyisim);

        Void olmayan bir method bulmalýyýz, o bize istediðimiz ismi istediðimiz hale döndürmeli.
        bizde onu yeniIsim yada gizliIsim de bir variable a atamalýyýz ve bundan sonra hep öyle kullanmalýyýz.

        C04 class da bu iþlemi yapýyoruz !!!!
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
