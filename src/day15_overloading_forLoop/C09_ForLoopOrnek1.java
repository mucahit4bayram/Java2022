package day15_overloading_forLoop;

public class C09_ForLoopOrnek1 {
    public static void main(String[] args) {

        // 1'den 100'e kadar (100 dahil) olan tamsayilar� toplay�n

        int toplam = 0;
        for (int i = 1; i <=100 ; i++) {
            toplam +=i;
            System.out.print(i + " ");

        }
        System.out.println("toplam :" +toplam);

        // verilen iki say�n�n ilkinden ba�lay�p ikinciye kadar
        // 3'er 3'er yazd�r�n. (ikinci say� �artlar� sa�lam�yorsa yazd�r�lmayabilir.)

        int bas = 20;
        int bit = 61;
        int toplam2 =0;

        for (int i = bas; i <=bit; i+=3) {
            toplam2 += i;
            System.out.print(i +" ");

        }
        System.out.print("toplam2 : "+ toplam2);

        System.out.println();

        // verilen say�dan ba�layarak geriye 1'e do�ru
        // 3 ile b�l�nebilen say�lar� yazd�r�n.

        int sayi = 100;

        for (int i = sayi; i >=1 ; i--) {
            if (i%3==0) {
                System.out.print(i + " ");

            }
        }






    }
}
