package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[] = {1,2,3,4,5,6,7};

        // array'in tamam�n� yazd�ral�m

        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7] virg�l ve bo�lu�u array otomatik yaz�yor

        // array'in t�m elementlerini yazd�ral�m

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+ " ");     // 1 2 3 4 5 6 7

        }

    }
}
