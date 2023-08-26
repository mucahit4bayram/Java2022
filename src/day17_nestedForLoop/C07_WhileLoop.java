package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

                         //-/-/   While Loop  (iken, oldugu surece)  /-/-/-/
        /*
        *** D�ng�n�n ba�lang�c�nda ko�ulu kontrol eder ve ko�ul sa�lan�rsa body i�indeki kodlar� �al��t�r�r.

        *** While loop'daki ko�ul yanl��sa, loop hi� �al��maz.

        *** Ba�lang�� de�eri, biti� �art�, art��/azal�� mutlaka olmal�.

        Ba�lang�� de�eri ve art�� miktar�n� mutlaka eklemeliyiz. Art�� yada azal�� miktar�n� eklemezsek
        sonsuz d�ng�ye girer.

        condition (ko�ul) true olduk�a kod �al���yor ve ba�a d�n�yor durumu tekrar kontro ediyor.
        condition (ko�ul) fals oldu�unda d�ng�y� k�r�p alt sat�ra ge�iyor.
         */

        // 20'den 50'ye kadar (s�n�rlar dahil) �ift say�lar� yazd�ral�m.

        // for loop ile yapal�m

        int bas = 20;
        int bitis = 50;

        for (int i = bas; i <=bitis ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");

        // while loop ile yapal�m

        int temp = bas;
        while (temp<=bitis){

            if (temp%2==0){
                System.out.print(temp + " ");
            }
            temp ++;    //-/-/ !!! ARTI� M�KTARINI EKLEMEM�Z �NEML� !!! /-/-/

        }
    }
}
