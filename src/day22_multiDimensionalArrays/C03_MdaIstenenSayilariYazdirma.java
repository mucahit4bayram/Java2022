package day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {

        /*
        verilen 2 katlý bir multi-dimensional array'de outer index'i ve inner index'i
        ayný olan sayýlarýn toplamýný bulunuz.

        int [][]sayilar = {{1,5,6,9,},{2,5},{3,1,6},{1,1,1,3};
        [0][0] + [1][1] + [2][2] + [3][3] + ....

         */

        int [][]sayilar = {{1,5,6,9,},{2,5},{3,1,6},{1,1,1,3}};

        int istenenToplam = 0;                            // toplamýný koyacaðýmýz variable oluþturduk
                                                          // iki katlý array olduðu için 2 for loop oluþturacaðýz

        for (int i = 0; i <sayilar.length ; i++) {        // 0'dan baþlayýp outer arrayin length ine kadar gidecek
            for (int j = 0; j <sayilar[i].length ; j++) { // 0'dan baþlayýp inner arrayin length ine kadar gidecek

                if (i==j){                                // þart ; inner array == outer array ise al diyor
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
