package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        /// Pre_Post_Increment (önce-sonra artırmak) //

        int numA = 2;
        numA = numA + 3;    // ----> numA + = 3
        System.out.println("numA :" + numA);     // 5

        int sayi1 = 10;

        int sayi2 = sayi1 + 1;  // sayi2---> 11

        sayi2 += 5;             // sayi2---> 16
        System.out.println("sayi1 : " + sayi1); // 10
        System.out.println("sayi2 : " + sayi2); // 16

        /*
        pre veya post incremet/decrement
        sadece ++ ve -- işlemi için geçerlidir
        bu iki işlem için sayidan sonra veya önce yazilmasina göre farklı iki işleyiş olur

         */
        // sayi2 = 16

        int sayi3 = sayi2++;  // 1- sayi2 değeri, sayi3'e atanacak  ----> sayi3 = 16
                              // 2- sayi2 bir artirilacak           ----> sayi2 = 17
        /*
        ++ veya -- variable'dan sonra olursa buna post .... denir.
        bu durumda o satirda yapılan iki işlemden
        artirma veya azaltma işlemi sonuncudur.

        ** önce sayi2'yi sayı3' atayacak sayi3= 16 olur,
        ** sonra sayi2 bir artırılacak   sayi2= 17 olur.

         */


        System.out.println("sayi3 : " + sayi3); // 16
        System.out.println("sayi2 : " + sayi2); // 17

        // sayi1 = 10

        int sayi4 = ++sayi1;  // 1- sayi1 değeri artirilacak         ----> sayi1 = 11
                              // 2- sayi 1 değeri, sayi4'e atanacak  ----> sayi4 = 11

        /*
        Eğer ++ veya -- variable'dan önce ise buna pre... denir
        bu durumda o satirda yapılan iki islemden öncelikli olan
        artirma veya azaltmadır.
         */
        System.out.println("sayi4 : " + sayi4); // 11
        System.out.println("sayi1 : " + sayi1); // 11


    }
}
