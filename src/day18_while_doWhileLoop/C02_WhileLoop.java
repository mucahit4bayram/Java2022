package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 7 ) Kullan�c�dan bir say� al�n
        ve bu say�n�n rakamlar� toplam�n� yazd�r�n
         */

        int input = 5432;

        int rakamlarToplami =0;
        int birlerBasamagi=0;
        int temp = input;

        while (temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;

        }
        System.out.println(input + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}
