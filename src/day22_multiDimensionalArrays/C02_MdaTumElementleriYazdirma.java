package day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        // verilen bir multi-dimensional array'in t�m elementlerini yazd�ran bir method olu�tural�m

        int [][]sayilar = {{1,5,6,9,},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);  // elementleriYazdir methoduna argument olrak "sayilar" � verdik
                                     // ki gitsin onlar� yazd�rs�n

        /*
        elementleriYazdir(sayilar) ===> methodumuz; integer 2 katl� array'imiz i�in
                                        "Arrays.deepToString" imiz olacak, (sadece 2 katl�, 3 katl� olmaz)
         */



    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {        // i= 0,1,2 de�erlerini alacak
            for (int j = 0; j < sayilar[i].length; j++) { // inner arraylerin uzunlu�una ba�lad�k
                System.out.print(sayilar[i][j] + " ");    // 1 5 6 9 2 5 3 1 6
            }

        }
    }
}
        /*
        1 for loopla tek katl� arrayleri yazd�rabiliyorduk.

        burada outer array'in i�erisinde 3 tane element (3 adet inner array) var. elementlerde birer array.
        dolay�s�yla 1., 2., yada 3. elementi YAZDIR diyemeyiz.Ama 1., 2., 3., inner array'lere G�T diyebiliriz.
        (indexi ===> 0, 1, 2 )

        bunu 1. for loopta yapabiliriz  ;

        for (int i = 0; i < sayilar.length; i++) {    // dinamik olmas� i�in "sayilar.length" e g�re yapt�k
                                                      // outer array'in lenght'ine kadar gitmeli. (i < sayilar.length)

            sayilar[i] ===> bize 1. arrayi {1,5,6,9,},
                                 2. arrayi {2,5}
                              ve 3. arrayi{3,1,6} getirir.
                            bize array de�il, element laz�m.
                            bize 2. bir de�i�ken laz�m. bunun i�in 2. bir for loop olu�turmal�y�z.

        for (int j = 0; j < sayilar[i].length; j++) { // inner array'in lenght'ine kadar gitmeli. (j < sayilar[i].length)

            System.out.print(sayilar[i][j] + " ");    // 1 5 6 9 2 5 3 1 6 (t�m elementlere ula�m�� olduk)

         */
