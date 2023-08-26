package day15_overloading_forLoop;

public class  C02_Overloading {
    public static void main(String[] args) {

        /*                /-/-/ OVERLOADÝNG (AÞIRI YÜKLEME) /-/-/

        Overloading : Eðer bir Class'da ismi ayný fakat parametreleri farklý olan methodlar oluþturursak
                      buna Overloading denir.

        Overloading nasýl yapýlýr? : Java ayný isim ve ayný parametrelerle birden fazla method oluþturulmasýna
                                     izin vermez. Ayný isimle birden fazla method oluþturmak isterseniz
                                     method signature (metot imzasý) nin deðiþtirilmesi gerekir.

        method signature nasýl deðiþtirilir? : 3 yöntem kullanýlýr
                                               - parametrelerin data tipleri deðiþtirilebilir.
                                               - parametrelerin sayýsý deðiþtirilebilir.
                                               - parametre sayýsý ayný olmak zorunda ise farklý data tipindeki
                                                 parametrelerin sýrasý deðiþtirilir.

        *** Method'un return type'ini deðiþtirmek, access modifier'ini deðiþtirmek veya static kelimesi eklemek
            method signature'i deðiþtirmez.

         */
        /*
        Java'da oluþturduðumuz method'larýn isminin yaptýðý iþlev ile uyumlu olmasýný isteriz.
        mesela bir String'i bir bölümünü almak için Java
        2 adet substring() method'u veya
        Verilen Strign'deki bazý parçalarý yenileriyle deðiþtirmek için
        2 adet replaca() method'u var.

        Java ayný isimde birden fazla method varsa hangisinin kullanýlacaðýna parametre sayýsý ve parametrelerin
        data türüne göre karar verir.
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
