package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi üzerinden marka variable'ina ulaþabildim, deðiþtirebildim (set)(yazma) ve yazdýrabildim (get) (okuma)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        // access modifier kullanarak marka variable'ina ulaþýmý tamamen serbest yapabilir veya tamamen engelleyebiliriz.

        // private yaptýðýmýzda model'e hiç ulaþamayýz

        // yani access modifier ya hep ya hiç diyor

        // model'i deðiþtirelim ama göremeyelim

        // yakýtý da görelim ama deðiþtiremeyelim

        // set ve get yetkilerini özel olarak tanýmlamak iserseniz
        // 1. adým  : özel yetki tanýmlayacaðýnýz variable'larý private yapýn
        //            private bir dataya baþka class'lardan ulaþmak mümkün olmadýðýndan,'
        // 2. adým  : set yetkisi için setter, get yetkisi için getter methodlarý oluþturalým.

        arb1.setModel("Corolla");   // model larak Corolla'yý atadýk
        // model'i yazdýrma imkanýmýz yok, çünkü getter method'u yok

        System.out.println(arb1.getYakit()); // yakýt olarak elektrikli bilgisini yazdýrabildik
        // yakýtý deðiþtiremeyiz çünkü setter method'u yok


        // set methodu : deðer atanabilsin ama görülemesin (veri giriþi)

        // get methodu : görülebilsin ama yeni deðer atanamasýn isteniyor (yazdýrma)


    }
}
