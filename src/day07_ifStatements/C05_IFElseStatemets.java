package day07_ifStatements;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C05_IFElseStatemets {
    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        String kelime = scan.nextLine();
        char harf = kelime.charAt(0);

        if (kelime.length()>1) {
            System.out.println("Birden fazla karakter girdiniz.");

        } else if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harf");

        } else System.out.println("Girilen karakter bir harf değil");


    }
}
