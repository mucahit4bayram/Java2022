package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

    topla(5,7);     // 12
    topla(5.2, 3);  // 8.2
    topla(3.4,6.1); // 9.5
    topla(5,6.2);   // 11.2

    }
    /*
    Java hangi method'un çalýþacaðýna karar verirken optimizasyon yapar.
    - eðer hiç kest yapmadan kullanabileceði bir method varsa onu kullanýr
    - eðer cast yapmadan kullanabileceði bir method yoksa, en az cast yaparak kullanabileceði methodu tercih eder.
     */
    /*
    Overloading de;
    ayný isimde ama farklý imzalara sahip methodlar oluþturuyoruz
    yani; isim + method sayýsý + methodlarýn data türleri
    bunlarý deðiþtirisek imza deðiþmiþ olur,
    imza deðiþmiþse java ayni isimde birden fazla method oluþturmamýza izin verir.
     */
    public static void topla(int sayi1, int sayi2){

        System.out.println("Iki integer'in toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki double'in toplami : " + (sayi1+sayi2));
    }
}