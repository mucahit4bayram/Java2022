package day15_overloading_forLoop;

public class  C02_Overloading {
    public static void main(String[] args) {

        /*                /-/-/ OVERLOAD�NG (A�IRI Y�KLEME) /-/-/

        Overloading : E�er bir Class'da ismi ayn� fakat parametreleri farkl� olan methodlar olu�turursak
                      buna Overloading denir.

        Overloading nas�l yap�l�r? : Java ayn� isim ve ayn� parametrelerle birden fazla method olu�turulmas�na
                                     izin vermez. Ayn� isimle birden fazla method olu�turmak isterseniz
                                     method signature (metot imzas�) nin de�i�tirilmesi gerekir.

        method signature nas�l de�i�tirilir? : 3 y�ntem kullan�l�r
                                               - parametrelerin data tipleri de�i�tirilebilir.
                                               - parametrelerin say�s� de�i�tirilebilir.
                                               - parametre say�s� ayn� olmak zorunda ise farkl� data tipindeki
                                                 parametrelerin s�ras� de�i�tirilir.

        *** Method'un return type'ini de�i�tirmek, access modifier'ini de�i�tirmek veya static kelimesi eklemek
            method signature'i de�i�tirmez.

         */
        /*
        Java'da olu�turdu�umuz method'lar�n isminin yapt��� i�lev ile uyumlu olmas�n� isteriz.
        mesela bir String'i bir b�l�m�n� almak i�in Java
        2 adet substring() method'u veya
        Verilen Strign'deki baz� par�alar� yenileriyle de�i�tirmek i�in
        2 adet replaca() method'u var.

        Java ayn� isimde birden fazla method varsa hangisinin kullan�laca��na parametre say�s� ve parametrelerin
        data t�r�ne g�re karar verir.
         */

        String str = "Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c', 'v');
        str.replace("J", "H");
        // str.replace(5,8);


        /*
        // Java da ayni isimle birden fazla method olusturulursa buna overloading denir.
		// Overloading yapabilmek icin Method Signature'larinin farkli olmasi gerekir
		// Method Signature = isim + parametre sayisi + parametre data turu
		// birbirini kapsayan data turleri oldugunda Java en optimum cozumu uretir
		// (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
		// methodu kullanir)
		// Eger kapsayan bir method da bulamazsa Java CTE verir
         */




    }
}
