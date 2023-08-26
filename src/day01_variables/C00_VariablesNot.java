package day01_variables;

public class C00_VariablesNot {
    public static void main(String[] args) {
        /*
	  \n (or \r): starts from a new line : metni bir alt satýrdan itibaren yazdýrýr.
	          \t:  horizontal tab : metni yatayda 1 tab miktarý kaydýrýr.
	          \\: prints a back slash :\ (ters slash) yazdýrýr
	          \': prints single quote :' tek týrnak yazdýrýr.
	          \": prints double quote :"" Çift týrnak yazdýrýr.
	 */
        // verilen 12345 sayýsýnýn rakamlarýný yukarýdan aþaðýya doðru yazdýrýnýz
        // ex: input:
        //    output: 1
        //		      2
        //		      3
        //		      4
        //		      5

        int sayi=12345;
        int birler= sayi%10; //birler basamagi sayinin 10 a bolumunden kalanýdýr.-->5
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onBinler=(sayi/10000);

		/*
	    System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		 */

        // consolda alt satira yazdýrmak için "\n"  komutu kullanýlýr.

        System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);

        //-----------------------------------------------------------------------------------------------------------//
        System.out.println("-------------------Arttýrma");
        int a = 1;
        System.out.println("a : "+(++a)); //2
        System.out.println("a : "+(a++)); //2
        System.out.println("a : "+a);  //3

        a=5;
        System.out.println("son hali :"+(a++ + ++a)) ;
        // 5 + 7 = 12


        System.out.println("-------------------Azaltma");
        int b = 5;
        System.out.println(--b);  //4
        System.out.println(b--);  //4
        System.out.println(b);  //3


        System.out.println("-------------SORU1-----------------");
        int x = 20;
        int y = 15;

        System.out.println(++x + --y);  //21 + 14 =35  x= 21   y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");
        System.out.println(++x + y--);  // 21 + 15=36  x=21 y=14
        System.out.println(x);
        System.out.println(y);


        System.out.println("-------------SORU2-----------------");

        x = 20;
        y = 15;

        System.out.println(x++ + y--);  // 20+15=35   x=21 y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");

        System.out.println(x++ + --y);  // 20+14 =34  x=21 y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");



        int k=5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        //  6  + 6 +  7   + 7 + 7 + 6 = 39   k=6

        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);

        //------------------------------------------------------------------------------------------------------------//
        String bx = "Java 1235 ?!@$_";

        // \\d ifadesi tum rakamlari(digit) temsil eder.
        System.out.println(bx.replaceAll("\\d","*"));
        System.out.println(bx);
        // ===>  \\D rakamlardisindaki hersey
        System.out.println(bx.replaceAll("\\D","*"));

        //==> \\S space disindaki hersey
        System.out.println(bx.replaceAll("\\S","*"));

        //==> \\s space ifadesidir.
        System.out.println(bx.replaceAll("\\s","*"));
        // replace ile yapma
        System.out.println(bx.replace(" ","*"));

        //==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
        System.out.println(bx.replaceAll("\\w","*"));

        //==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar

        System.out.println(bx.replaceAll("\\W","*"));

    }
}
