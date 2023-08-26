package day03_scanner;

public class C02_Swap1 {
    public static void main(String[] args) {

        /*  // Üçüncü Bir Değişken Olmadan Yer Değiştirmek (Swap) //

        1- verilen sayi1 ve sayi2 variable'larinin değerlerini değiştiren (SWAP) bir program yazınız

        örn : sayi1=10 ve
              sayi2=20;

        kod çalıştıktan sonra
             sayi1=20 ve
             sayi2=10
         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        // sayi3 geçici kovamız
        // adım 1- sayi2'yi boş kovaya koyalım

        sayi3 = sayi2;    // 10  20  20

        // adım 2- sayi1'i, sayi2'ye atayacağız

        sayi2 = sayi1;    // 10  10  20

        // adım 3- boş kovadaki sayıyı sayi1'e atayalım

        sayi1 = sayi3;    // 20  10  20

        System.out.println(sayi1);  // 20
        System.out.println(sayi2);  // 10


        System.out.println("swap'dan sonra sayi1 : " + sayi1);  //20
        System.out.println("swap'dan sonra sayi2 : " + sayi2);  //10

    }
}
