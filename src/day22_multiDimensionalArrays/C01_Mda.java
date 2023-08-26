package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*   /-/-/  Multi Dimensional Arrays (�ok Boyutlu Arra'ler) /-/-/

        tek katl� array'lerde array'i direk yazd�ram�yoruz. ��nk� array non-primitive data t�r�d�r ve
        her non-primitive data direk yazd�r�lamayabilir.

        ancak array'in i�erisindeki elementleri direk yazd�rabiliyorduk.
        ��nk� genelde primitive data t�r� veya String elementler kullan�l�yor

        Multi-dimensional array'lerde en dikkat edece�imiz konu ula�mak istedi�imiz elementin bir array mi
        yoksa primitive data m� oldu�udur.
         */

        int [][] sayilar = {{1,2,4,5},{3,4}};


        // {1,2,4,5}  ===> sayilar outer array'in 0. indexindeki  ==> inner array
        // {3,4}      ===> sayilar outer array'in 1. indexindeki  ==> inner array

        /*
        burada say�lar arrayini d���n�rsek i�inde 2 tane inner array var
        sayilar[0] ===> [1,2,4,5]
        sayilar[1] ===> [3,4]

        ancak en i�erdeki elementlere ula�abilirsek direkt  yazd�rabiliriz

         */

        System.out.println(sayilar[0]);                  // [I@57829d67 Referance verdi yazd�rmad�.
        // ��nk�, sayilar [0] --> sayilar outer array'inin 0. elementi ==> bu bir array oldu�u i�in direkt yazd�ramay�z.

        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]
        // Arrays.toString(sayilar[0]) deyip yazd�r�nca sonucu verdi.

        System.out.println(sayilar[0][1]);               // 2  En i�erdeki elemente ula��rsak yazd�rabiliriz.
        // sayilar outer array'in , 0. indexindeki inner array'in, 1. indexindeki elementi

        System.out.println(sayilar[1][0]);               // 3
        // outer array'in (say�lar) , 1. indexsindeki inner arrayin , 0. indexindeki elementi

        System.out.println(Arrays.toString(sayilar));    // [[I@57829d67, [I@19dfb72a]
        // array in i�inde arraylar oldu�u i�in yazd�rmad�. iki tane referans verdi.

        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 4, 5], [3, 4]]
        // multi-dimensional array'i direkt yazd�rmak istersek "Arrays.deepToString()" y�ntemini kullanmal�y�z

        /*
        array'i iki �ekilde declare edebiliyorduk

        1- elemanlar� direkt yazabiliriz.

        int [][] sayilar = {{1,2,4,5},{3,4}};

        2- outer ve inner array'lerin uzunluklar�n� belirterek olu�turabiliriz.

        int [][] sayilar = new int[3][4];

        ancak 2. y�ntemle yapt���m�zda inner array'lerin farkl� uzunlukta olma ihtimali kalmaz
        bu �rnek i�in outer array'in 3 tane inner array'i vard�r.
        her bir inner array'in ise 4 er eleman� vard�r.

        e�er inner arrayleri farkl� uzunluklarda olu�turmak istiyorsaniz mecburen 1. y�ntemi kullanmalisiniz.
         */
    }
}
