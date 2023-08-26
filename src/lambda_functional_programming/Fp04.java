package lambda_functional_programming;
import java.util.stream.IntStream;

public class Fp04 {

    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println("get7den100eToplam02: "+get7den100eToplam02());
        System.out.println("get2den11eCarpim: "+get2den11eCarpim());
        System.out.println(faktoriyelHesapla(4));
        System.out.println(verilenIkiSayiArasindakiCiftSayilarinToplamini(11,5));
        System.out.println(ikiSayiArasindakiTumSayilarinRakamlariToplami(13,11));

    }

    // 1) 7'den 100'e kadar integer de�erlerinin toplam�n� bulan bir method olu�turun.
    // 1. Yol
    public static int get7den100eToplam(){

        return  IntStream.range(7,101).reduce(Math::addExact).getAsInt();
        // IntStream ==> integer bir stream olusturur ve method'larini kullaniriz. interface dir.(integer lar�n ak��� diyebiliriz)
        // .range(7,101) ==> 101 dahil degil[7+8+9...+100]

    }
    // 2. Yol
    public static int get7den100eToplam02(){

        return  IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
                      // .rangeClosed(7,100) ==> 100 dahil [7+8+9...+100]
    }

    // 2) 2'den 11'e kadar integer de�erlerinin �arp�m�n� bulan bir method olu�turun.
    public static int get2den11eCarpim(){

        return  IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }

    // 3) Verilen bir say�n�n faktoriyelini hesaplayan bir method olu�turun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelHesapla(int x){

        if(x>=0){
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan buyuk deger giriniz");

        return 0;
    }

    // 4) Verilen iki say� aras�ndaki �ift say�lar�n toplam�n� bulan bir method olu�turun.
    public static int verilenIkiSayiArasindakiCiftSayilarinToplamini(int x, int y){
        int z = 0;
        if(x>y){
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemaniSec).sum();
    }
    // 5) Verilen iki say� aras�ndaki t�m say�lar�n rakamlar�n�n toplam�n� hesaplayan bir method olu�turun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x, int y){
        int z = 0;
        if(x>y){
            z = x;
            x = y;
            y = z;
        }

        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).sum();
    }
}