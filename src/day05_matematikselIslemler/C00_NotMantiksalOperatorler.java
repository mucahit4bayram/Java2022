package day05_matematikselIslemler;

public class C00_NotMantiksalOperatorler {
    public static void main(String[] args) {

         /*              //-/-/ MANTIKSAL OPERATORLER /-/-//
        int a = 5;
        a++;
        a++;
        a++;
        System.out.println("a: " + a); // a: 8

        a+= 5;  // a = 13
        a-= 3;  // a = 10
        a*= 4;  // a = 40
        a/= 10; // a = 4

        int b = 12;
        b%= 5;  // b = 2  // b nin 5'e göre modu alınıp kalanı b'ye atama işlemi.

        */
        /*
        int sayi1 = 5;
        int sayi2 = 4;

        boolean sonuc = sayi1==sayi2;  // true       /-/-/  " == " Eşittir operatörü
        boolean sonuc = sayi1!=sayi2;  // false      /-/-/  " != " Eşit değildir operatörü
        boolean sonuc = sayi1>sayi2;   // true       /-/-/   " > " Büyüktür operatörü
        boolean sonuc = sayi1<sayi2;   // false      /-/-/   " < " Küçüktür operatörü
        boolean sonuc = sayi1>=sayi2;  // true       /-/-/  " >= " Büyük Eşit operatörü
        boolean sonuc = sayi1<=sayi2;  // false      /-/-/  " <= " Küçük Eşit operatörü

         */
        /*

        &&  ve operatörü
        ||  veya operatörü
        !   değil operatörü     // sonucun zıttını almak için kullanılan operatördür.
        ?:  üçlü operatör

        boolean a = true ;
        System.out.println(a); // true
        boolean a = !true ;
        System.out.println(a); // false



         */

        int x = 5;
        int y =3;

        boolean sonucxy = x>y;
        System.out.println(sonucxy);  // true
        boolean sonucxy1 = !(x>y);
        System.out.println(sonucxy1); // false

        boolean sonucxy2 = x>2 && y<7; // x>2 --> true, y<7 --> true  /-/-/ true ve true ---> true
        System.out.println(sonucxy2);  // true

        boolean sonucxy3 = x>2 && y<1; // x>2 --> true, y<1 --> false /-/-/ true ve fasle ---> false
        System.out.println(sonucxy3);  // false

        /*
        true && true   ---> true      /-/-/ && (VE) operatöründe bütün koşullar sağlanırsa sonuç true olur.
                                            bir tane koşul bile sağlanmazsa sonuç false dır.
        true && false  ---> false
        false && false ---> false

                                       /-/-/ || (VEYA) operatöründe bir koşul true olursa sonuç true olur.
                                             bütün koşullar false olursa sonuç false olur.

         */
        //-------------------------------------------//
        /*
           int number=10;

		// bir variable'in degerini toplayarak artirmak icin 3 yontem kullanabilirim

		// 1.yontem (acemi yontemi )

		number = number + 5;

		// 2.yontem (usta isi)

		number += 8;

		// 3.yontem sadece 1 (bir) artirmak icin

		number++;

		// bu yontemler sadece toplama islemine has degildir tum operatorler icin kullanilabilir
		// 3.yontem sadece toplama ve cikarma icin gecerlidir

		// number'i 6 eksiltin
		   number -= 6;

		// number'i ikiye bolun
		   number /= 2 ;

		// number'i 3'le carpin
		   number *= 3;

		// number'i 1 eksiltin
		   number--;
         */





    }
}
