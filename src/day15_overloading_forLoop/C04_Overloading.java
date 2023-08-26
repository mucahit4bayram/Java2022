package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

    topla(5,7);     // 12
    topla(5.2, 3);  // 8.2
    topla(3.4,6.1); // 9.5
    topla(5,6.2);   // 11.2

    }
    /*
    Java hangi method'un �al��aca��na karar verirken optimizasyon yapar.
    - e�er hi� kest yapmadan kullanabilece�i bir method varsa onu kullan�r
    - e�er cast yapmadan kullanabilece�i bir method yoksa, en az cast yaparak kullanabilece�i methodu tercih eder.
     */
    /*
    Overloading de;
    ayn� isimde ama farkl� imzalara sahip methodlar olu�turuyoruz
    yani; isim + method say�s� + methodlar�n data t�rleri
    bunlar� de�i�tirisek imza de�i�mi� olur,
    imza de�i�mi�se java ayni isimde birden fazla method olu�turmam�za izin verir.
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