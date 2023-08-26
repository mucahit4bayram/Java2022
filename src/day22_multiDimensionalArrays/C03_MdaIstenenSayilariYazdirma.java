package day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {

        /*
        verilen 2 katl� bir multi-dimensional array'de outer index'i ve inner index'i
        ayn� olan say�lar�n toplam�n� bulunuz.

        int [][]sayilar = {{1,5,6,9,},{2,5},{3,1,6},{1,1,1,3};
        [0][0] + [1][1] + [2][2] + [3][3] + ....

         */

        int [][]sayilar = {{1,5,6,9,},{2,5},{3,1,6},{1,1,1,3}};

        int istenenToplam = 0;                            // toplam�n� koyaca��m�z variable olu�turduk
                                                          // iki katl� array oldu�u i�in 2 for loop olu�turaca��z

        for (int i = 0; i <sayilar.length ; i++) {        // 0'dan ba�lay�p outer arrayin length ine kadar gidecek
            for (int j = 0; j <sayilar[i].length ; j++) { // 0'dan ba�lay�p inner arrayin length ine kadar gidecek

                if (i==j){                                // �art ; inner array == outer array ise al diyor
                    istenenToplam+=sayilar[i][j];

                }

            }

        }
        System.out.println("istenenToplam : " + istenenToplam);
        /*
        [0][0] ===> 1
        [1][1] ===> 5       toplam = 15
        [2][2] ===> 6
        [3][3] ===> 3
         */

    }
}
