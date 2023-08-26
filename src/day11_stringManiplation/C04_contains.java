package day11_stringManiplation;

public class C04_contains {
    public static void main(String[] args) {

     /*
     Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
             “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa
             “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
      */

        String cumle = "Java buyuk, dunya kucuk";
        cumle = cumle.toLowerCase();

        // requiremets'de  büyük harf / küçük harf hassasiyeti hakkında bilgi verilmemiş.
        // ikinci olarak da her iki kelimeyi de içerme durumu açıklanamamış.
        // bu durumda görevi bize kim verdiyse ona sormak lazım

        // ek requiremets : ikisini de içeriyorsa "Karar ver büyük mü yazdırayım küçük mü?"
        // case sensetive olmasın (harfe duyarlı)

        if(cumle.contains("kucuk")&&cumle.contains("buyuk")) {
            System.out.println("Karar ver buyuk mu yazdirayim buyuk mu?");
        }else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kucuk yada buyuk kelime icermiyor");

        }
    }
}
