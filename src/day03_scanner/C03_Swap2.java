package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {

        // bir önceki swap sorusunu boş kova kullanmadan yapın.

                /*
        1- verilen sayi1 ve sayi2 variable'larinin değerlerini değiştiren (SWAP) bir program yazınız

        örn : sayi1=10 ve
              sayi2=20;

        kod çalıştıktan sonra
             sayi1=20 ve
             sayi2=10
         */
        int sayi1 = 10;
        int sayi2 = 20;

        sayi1 = sayi1 + sayi2; //---> sayi1=10+20=30

        sayi2 = sayi1 - sayi2; //---> sayi2=30-20=10

        sayi1 = sayi1 - sayi2; //---> sayi1=30-10=10


        System.out.println("swap'dan sonra sayi1 : " + sayi1); //20
        System.out.println("swap'dan sonra sayi2 : " + sayi2); //10


        // System.out.println("sayi1= " + ((sayi1 + sayi2) - sayi1) + " " + "sayi2= " + ((sayi1 + sayi2) - sayi2));


    }
}
