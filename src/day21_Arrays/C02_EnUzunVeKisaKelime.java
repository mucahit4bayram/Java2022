package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen String bir array�de en uzun ve en kisa String�leri yazdiran bir method olusturun
         */

            String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah  ", "Mihrican"};

            enUzunVeKisayiYazdir(isimler);


    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 1; i < isimler.length; i++) { // enUzunKelime ve enKisaKelime i�in ayr� ayr� ba��ms�z 2 if olu�turmal�y�z.
            if (isimler[i].length()> enUzunKelime.length()){ // isimlerin i. elementinin lenghti, enUzunKelimenin lenghtinden b�y�kse
                enUzunKelime = isimler[i];                   // yeni en uzun kelimemiz isimler[i] olur
            }
            if (isimler[i].length()< enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime : " + enUzunKelime); // Hayrullah
        System.out.println("Arraydeki en kisa kelime : " + enKisaKelime); // Onur
    }
}
