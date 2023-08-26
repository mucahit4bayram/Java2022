package day11_stringManiplation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*
        10 ) contains() : Verilen String'in istenen karakter(leri) içerip içermediğini kontrol eder.
                          İçeriyorsa TRUE, içermiyorsa FALSE döndürür.

                          * Parametere String olmalıdır.

                          * char içim kullanılmaz

                          * Aradığımız String'in adedi il ilgili bilgi döndürmez.
         */

        /*
        Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa
        “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , @gmail.com ile
        bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {           // ( -10 @gmail.com un uzunluğu)
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("Lutfen yazimi kontrol edin");


        }
    }

    }

