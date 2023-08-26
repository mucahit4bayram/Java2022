package day10_stringManiplation;

public class C06_indexOf {
    public static void main(String[] args) {

        /*
        8) indexOf() : Verilen String'de istenen karakterin kullanıldığı ilk index'i döndürür.
                       Eğer iki parametre girersek, aramaya istediğimiz indexten başlatabiliriz.

         */
        String str = "Java ogrenmek çok güzel";

        System.out.println(str.indexOf("o"));  // 5  / istersek string olarak yazarız
        System.out.println(str.indexOf('g'));  // 6  / istersek char olarak yazarız
        System.out.println(str.indexOf("t"));  // -1 / bana integer döndürüyor
                                               // int'de yok diye bir değer bulunmuyor
        System.out.println(str.indexOf("J"));  // 0 dersek J'nin indexidir.
                                               // -1 değer dönerse biz aranan string'in str'da olmadığını anlarız
                                               // Java -1 döndürmeyi tercih etmiştir.

        String str5 = "eeffweweefdlkgrgjldfslkfrfefrffsdfwefol";
        // str5 de p harfi var mıdır?

        if (str5.indexOf("p")==-1) {
            System.out.println("str5 de istenen karakter kullanılmamıştır");

        }else {
            System.out.println("str5 de istenen karakter kullanılmıştır");
        }

    }
}
