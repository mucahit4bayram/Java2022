package day09_ternary;

import java.util.Scanner;

public class C08_Homework {
    public static void main(String[] args) {

        /*
        Soru : SDET kisaltmasindaki harflerden birini yazmasýný isteyin.
        Kullanici ;
        S girerse : "Software"
        D girerse : "Developer"
        E girerse : "Engineer"
        T girerse : "In Testing" yazdýrýn
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("SDET kisaltmasindaki harflerden birini giriniz");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("yanlýs karakter girdiniz");
        }
    }
}
