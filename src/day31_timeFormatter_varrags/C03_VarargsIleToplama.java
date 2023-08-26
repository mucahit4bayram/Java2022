package day31_timeFormatter_varrags;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {

        // verilen kac int olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public static void toplaYazdir(int... sayi){
        /*
        int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir
         */
        int toplam=0;
        int sayiAdedi= sayi.length;
        for (int each: sayi
        ) {
            toplam+=each;
        }
        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami : " + toplam);
    }
}
        /*
                Varargs (Deðiþken sayýdaki argument

        Varargs tek method a istediðimiz kadar parametre yollayarak sonuç almamizi saðlar.
        Yani parametre sayýmiz deðiþken ancak methodun yapacaðý iþ sabitse Varargs kullanarak tek
        method’la kodumuzu yazabiliriz

        Varargs ozellik olarak list gibi calisir (uzunlugu esnektir) fakat varargs’in arka planinda Java Array
        ile calisir.

        Varargs’i declare etmek icin data type’dan sonra kullaniriz. (int… sayi vb..)

        Bir method’da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir.
        (aksi durumda varargs nerede duracagini bilemez)

        Bir method’da sadece 1 varargs kullanilabilir
         */