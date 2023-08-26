package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /*
        kullanıcıdan gün ismini alın
        hafta içi veya hafta sonu olduğunu yazdırın.
         */

        String input = "pazartesi";
        input = input.toLowerCase();

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "salı":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

                switch (input){
                    case "pazartesi":

                    case "salı":

                    case "carsamba":

                    case "persembe":

                    case "cuma":
                        System.out.println("Hafta ici");
                        break;
                    case "cumartesi":

                    case "pazar":
                        System.out.println("Hafta sonu");
                        break;
                    default:
                        System.out.println("Lutfen gecerli bir gun giriniz");

        }

    }
}
