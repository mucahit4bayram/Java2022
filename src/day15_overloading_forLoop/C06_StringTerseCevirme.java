package day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input="ey edip adanada pide ye";

        terstenYazdir(input);
    }
    public static void terstenYazdir(String input) {

        String tersInput=input.substring(input.length()-1); // son harfi tersInput'a ekledik

        /*
        String tersInput="";                          // tersInput'a "" ekleyip
        for (int i = input.length()-1; i >= 0; i--) { // lenght-1 den çalıştırınca sorun olmadı.
         */

        for (int i = input.length()-2; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }
}
