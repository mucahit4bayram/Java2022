package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen String'deki kullan�lan harfleri tekrars�z olarak yazd�r�p
        // kelimede kullan�lan farkl� harf say�s�n� veren b�r method yaz�n�z.

        String input = "Java her zaman guzel";

        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {

        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); // Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0,1)); // J yad�rd�
        benzersizInput+=islenecekKelime.substring(0,1);   // J harfini benzersizInputa ekledi

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
    }
}