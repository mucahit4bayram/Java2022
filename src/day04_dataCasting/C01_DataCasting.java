package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf = 'a';

        // char yeniHarf = harf +1; // kod bu durumda önce sağdaki işlemi yapar
        // char yeniHarf = 97+1     --->98
        // char bir variable 98 olmayacağı için Java hata verir. Çünkü sonuç int.

        char yeniHarf = (char) (harf + 1); // 98 i char olarak düşün dedik. Java kabul etti. ---> sonuç b
                                           // Data Casting (Data Çevirme)

        System.out.println("yeniHarf : " +yeniHarf); // yeniHarf : b

        /*   /-/-/ !!! Her data türü birbirine casting edilmez.!!! /-/-/

        Bazen bir variable'a oluşturduğumuz data türü dışında değer atanabilir.
        Bunlardan bazısını java otomatik olarak kabul eder.

        java eğer bu değer atamasında sorun oluşturacağını
        (data kayıplarının olabileceği veya datanın başkalaşabileceği) görürse bu durumda otomatik olarak
        bu atamayı kabul etmez.
        eğer bu atamayı istiyorsanız, sizden sorumluluğu almanızı bekler.

         */
        /// int sayi1=7.3;

        int sayi1 = (int) 7.3;

        System.out.println("sayi1 : " + sayi1); //7  küsüratı attı

        double sayi2 = 10;
        System.out.println("sayi2 : " + sayi2); //10.0

        int sayi3 = 'c';
        System.out.println("sayi3 : " + sayi3); //99

        char harf2 = 98;
        System.out.println("harf2 : " + harf2);  //b


        // -------------------

        double sayia = 123456789123456789.01;

        float sayib = (float) sayia;
        System.out.println("sayib : " + sayib); // 1.23456791E17

        long sayic = (long) sayia;
        System.out.println("sayic : " + sayic); // 123456789123456784

        int sayid = (int) sayia;
        System.out.println("sayid : " + sayic); // 123456789123456784

        short sayie = (short) sayia;
        System.out.println("sayie : " + sayic); // 123456789123456784

        byte sayif = (byte) sayia;
        System.out.println("sayif : " + sayic); // 123456789123456784


        //---------------------------------------------//



        // byte veri turunde bir degisken olusturup deger atayin
		// olusturulan variable'i adim adim AUTO WIDENING ile genisletip yazdirin

		byte numByte= 45;

		System.out.println("byte degisken degeri : " + numByte); // 45

		// short yapalim

		short numShort = numByte; // short byte'dan buyuk oldugu icin Java sikayet etmiyor
									// Auto Widening ile degeri short variable'a atiyor

		System.out.println("short degisken degeri : " + numShort); // 45

		int numInt = numShort;

		System.out.println("Integer degisken degeri : " + numInt); // 45

		float numFloat= numInt;
		System.out.println("float degisken degeri : " + numFloat); // 45.0

		double numDouble = numFloat;

		System.out.println("double degisken degeri : " + numDouble); // 45.0


        //----------------------------------------//


        // double bir degisken olusturalim ve bunu int ve sonra da byte'a cevirin

		double numDouble1=129.56;

		int numInt1 = (int) numDouble1;
		// double'dan integer'a gecerken eger sayida ondalikli bolum varsa
		// Java ondalikli bolumu siler (yok sayar)

		System.out.println("integer degisken degeri : " + numInt1); // 129

		byte numByte1= (byte) numInt1;
		// daha dar (narrow) bir data tipine cevirirken eger data tipinin sinirindan buyukse saymaya
		// negatif en kucuk sayidan devam eder, istenen sayiya gelinceye kadar
		// tekrar tekrar en kucuk negatif sayiya gider

		System.out.println("byte degisken degeri : " + numByte1);  // -127








    }
}
