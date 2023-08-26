package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*   /-/-/  Multi Dimensional Arrays (Çok Boyutlu Arra'ler) /-/-/

        tek katlý array'lerde array'i direk yazdýramýyoruz. çünkü array non-primitive data türüdür ve
        her non-primitive data direk yazdýrýlamayabilir.

        ancak array'in içerisindeki elementleri direk yazdýrabiliyorduk.
        çünkü genelde primitive data türü veya String elementler kullanýlýyor

        Multi-dimensional array'lerde en dikkat edeceðimiz konu ulaþmak istediðimiz elementin bir array mi
        yoksa primitive data mý olduðudur.
         */

        int [][] sayilar = {{1,2,4,5},{3,4}};


        // {1,2,4,5}  ===> sayilar outer array'in 0. indexindeki  ==> inner array
        // {3,4}      ===> sayilar outer array'in 1. indexindeki  ==> inner array

        /*
        burada sayýlar arrayini düþünürsek içinde 2 tane inner array var
        sayilar[0] ===> [1,2,4,5]
        sayilar[1] ===> [3,4]

        ancak en içerdeki elementlere ulaþabilirsek direkt  yazdýrabiliriz

         */

        System.out.println(sayilar[0]);                  // [I@57829d67 Referance verdi yazdýrmadý.
        // Çünkü, sayilar [0] --> sayilar outer array'inin 0. elementi ==> bu bir array olduðu için direkt yazdýramayýz.

        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]
        // Arrays.toString(sayilar[0]) deyip yazdýrýnca sonucu verdi.

        System.out.println(sayilar[0][1]);               // 2  En içerdeki elemente ulaþýrsak yazdýrabiliriz.
        // sayilar outer array'in , 0. indexindeki inner array'in, 1. indexindeki elementi

        System.out.println(sayilar[1][0]);               // 3
        // outer array'in (sayýlar) , 1. indexsindeki inner arrayin , 0. indexindeki elementi

        System.out.println(Arrays.toString(sayilar));    // [[I@57829d67, [I@19dfb72a]
        // array in içinde arraylar olduðu için yazdýrmadý. iki tane referans verdi.

        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 4, 5], [3, 4]]
        // multi-dimensional array'i direkt yazdýrmak istersek "Arrays.deepToString()" yöntemini kullanmalýyýz

        /*
        array'i iki þekilde declare edebiliyorduk

        1- elemanlarý direkt yazabiliriz.

        int [][] sayilar = {{1,2,4,5},{3,4}};

        2- outer ve inner array'lerin uzunluklarýný belirterek oluþturabiliriz.

        int [][] sayilar = new int[3][4];

        ancak 2. yöntemle yaptýðýmýzda inner array'lerin farklý uzunlukta olma ihtimali kalmaz
        bu örnek için outer array'in 3 tane inner array'i vardýr.
        her bir inner array'in ise 4 er elemaný vardýr.

        eðer inner arrayleri farklý uzunluklarda oluþturmak istiyorsaniz mecburen 1. yöntemi kullanmalisiniz.
         */
    }
}
