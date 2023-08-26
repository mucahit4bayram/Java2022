package day12_stringManiplation;

public class C01_replace {
    public static void main(String[] args) {

        /*    /-/-/ Değiştirmek - yerine koymak /-/-/

        14 ) replace() : Verilen String'deki istenen karakter(ler)i istenen yeni karakter(ler) ile değiştirir.

                        * replece() methodu char için de kullanılabilir.
         */

        String str = " Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ","")); // Bugunhavacokguzel (Boşluklarının tamamını yok ettik)

        // hava kelimesini java yapalım

        System.out.println(str.replace("h", "J"));//  Bu gun Ja va cok guz el
        System.out.println(str.replace("h", "J").replace(" ","")); //BugunJavacokguzel
                                                             // arka arkaya replace ekleyebiliriz.

        // guz el yerine harika yapalım

        System.out.println(str.replace("guz el","harika")); //  Bu gun ha va cok harika

        // cümleyi replace kullanarak Bugun Java cok guzel yapalım

        str = str.replace("Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");

        // atama yaptığımız için yaptığımız işlem kalıcı oldu.

        System.out.println(str);   //  Bugun Java cok guzel





    }
}
