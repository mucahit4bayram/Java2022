package day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        // verilen bir multi-dimensional array'in tüm elementlerini yazdýran bir method oluþturalým

        int [][]sayilar = {{1,5,6,9,},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);  // elementleriYazdir methoduna argument olrak "sayilar" ý verdik
                                     // ki gitsin onlarý yazdýrsýn

        /*
        elementleriYazdir(sayilar) ===> methodumuz; integer 2 katlý array'imiz için
                                        "Arrays.deepToString" imiz olacak, (sadece 2 katlý, 3 katlý olmaz)
         */



    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {        // i= 0,1,2 deðerlerini alacak
            for (int j = 0; j < sayilar[i].length; j++) { // inner arraylerin uzunluðuna baðladýk
                System.out.print(sayilar[i][j] + " ");    // 1 5 6 9 2 5 3 1 6
            }

        }
    }
}
        /*
        1 for loopla tek katlý arrayleri yazdýrabiliyorduk.

        burada outer array'in içerisinde 3 tane element (3 adet inner array) var. elementlerde birer array.
        dolayýsýyla 1., 2., yada 3. elementi YAZDIR diyemeyiz.Ama 1., 2., 3., inner array'lere GÝT diyebiliriz.
        (indexi ===> 0, 1, 2 )

        bunu 1. for loopta yapabiliriz  ;

        for (int i = 0; i < sayilar.length; i++) {    // dinamik olmasý için "sayilar.length" e göre yaptýk
                                                      // outer array'in lenght'ine kadar gitmeli. (i < sayilar.length)

            sayilar[i] ===> bize 1. arrayi {1,5,6,9,},
                                 2. arrayi {2,5}
                              ve 3. arrayi{3,1,6} getirir.
                            bize array deðil, element lazým.
                            bize 2. bir deðiþken lazým. bunun için 2. bir for loop oluþturmalýyýz.

        for (int j = 0; j < sayilar[i].length; j++) { // inner array'in lenght'ine kadar gitmeli. (j < sayilar[i].length)

            System.out.print(sayilar[i][j] + " ");    // 1 5 6 9 2 5 3 1 6 (tüm elementlere ulaþmýþ olduk)

         */
