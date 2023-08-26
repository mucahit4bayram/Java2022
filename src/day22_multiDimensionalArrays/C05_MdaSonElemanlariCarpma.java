package day22_multiDimensionalArrays;

public class C05_MdaSonElemanlariCarpma {
    public static void main(String[] args) {
      /*
        Soru 2) Asagidaki multi dimensional array’in
        ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

        int[][] arr={ {1,2,3}, {4,5,2}, {6,3} };

        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (j==arr[i].length-1){  // son elemaný length-1 le buluruz
                    carpim*=arr[i][j];    // inner array'in son elemanýný çarpýma ekledik.
                }
            }
        }
        System.out.println("Son elemanlarin carpimi = " + carpim);
        /*
        { {1,2,3}, {4,5,2}, {6,3} };
               3        2      3

         Son elemanlarin carpimi = 18
         */
        /*
        ARRAY 'DA "i" ve "j" INDEX'TIR. SADECE ELEMANLAR ÜZERÝNDE GEZÝNMEMÝZÝ SAÐLAYAN YARDIMCILARDIR.
         */
    }
}