package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi, \nsoyisminizi ve \nyasinizi giriniz \naralarda Enter tusuna basiniz");


        // !!! cümleli bölmek için \n yazmalıyız !!!

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas=scan.nextInt();

        // girilen bilgiler = Seyfi Çapar 34 şeklinde yazdırın

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);

    }
}
