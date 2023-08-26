package day02_variables;

public class C06_Homework4 {
    public static void main(String[] args) {

        // Bir tamsayı ve bir ondalikli variable oluşturun ve bunların toplamını yazdırın.//

        int sayi1 = 61;
        double sayi2 = 10.5;
        float sayi3=20.3f;

        System.out.println(sayi1+sayi2);        // 71.5
        System.out.println(sayi1+sayi2+sayi3);  // 91.79999923706055
        System.out.println(sayi2+sayi3);        // 30.799999237060547

        double sayi4 = sayi1+sayi2;
        // int sayi4 = sayi1+sayi2;  // sayi2 double olduğu için, int atamayı java kabul etmedi

        System.out.println("sayi4 : " + sayi4); // sayi4 : 71.5



    }
}
