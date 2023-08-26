package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        // bir tamsayı, bir de char değişken oluşturun ve bunların toplamını yazın.

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf);   //10a değil --> 10+97=107 (cahar'ın işleme girdiği variable
                                                                 // sayı olduğu için--->char sayı gibi davrandı)
        System.out.println("sayi+harf"); //10a değil --> sayi+harf yazar.
        System.out.println(str+harf);    // banana
        System.out.println(harf+2);      // 99       --> 97+2
        System.out.println(str+sayi);   // banan10
        System.out.println(str+sayi+harf); //banan10a

       // char yeniHarf = harf+2; !!!hata verir!!!

        /* char data türü işleme girdiği değişkenin türüne göre farkli davranabilir.
           eğer toplandığı variable sayısal bir değerse sayı gibi davranır.
           sayı+harf sayı variable'i int olduğundan harf variable'i asci tablosundan 97 değerini kullanır

           1- char yeniHarf =harf+2; java önce sağdaki işlemi yapar, sağda int+char görünce asccii değerini
                                  aldıktan sonra işleme girer (97+2=99), atama işlemini yapmaya çalışır.
                                  sol taraf char, sağ taraf int olduğu için bu atama kabul edilebilir değildir.

                                  char yeniHarf=99;
                                  bu atama java açısından kabul edilebilir değildir.

           2- str+harf); // banana
                            String variable çok güçlüdür, hangi data türü ile işleme girerse girsin
                            diğer data türünü kendine benzetir.

         */
                        //-/-/ !!! Ö N E M L İ !!! /-/-//
        // peki... konsolda; verilen variable'ları kullanarak 10a görmek istersek nasıl yazdırmalıyız?

        System.out.println(sayi+harf);    //107
        System.out.println(""+sayi+harf); //10a   // başa hiçlik koyarsak string olur, "" (hiçliğin) yanında 10 var
                                                  // string10'un yanına a eklenince 10a olur'

        char deger='1';
        System.out.println(deger+harf); //'1' + 'a' ---> 49+97=146

        char deg=1;                     //  int bir değer, aski tablosunda 1'in değeri start of header (SOH)
        System.out.println(deg);
    }
}
