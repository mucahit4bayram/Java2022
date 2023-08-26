package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi �zerinden marka variable'ina ula�abildim, de�i�tirebildim (set)(yazma) ve yazd�rabildim (get) (okuma)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        // access modifier kullanarak marka variable'ina ula��m� tamamen serbest yapabilir veya tamamen engelleyebiliriz.

        // private yapt���m�zda model'e hi� ula�amay�z

        // yani access modifier ya hep ya hi� diyor

        // model'i de�i�tirelim ama g�remeyelim

        // yak�t� da g�relim ama de�i�tiremeyelim

        // set ve get yetkilerini �zel olarak tan�mlamak iserseniz
        // 1. ad�m  : �zel yetki tan�mlayaca��n�z variable'lar� private yap�n
        //            private bir dataya ba�ka class'lardan ula�mak m�mk�n olmad���ndan,'
        // 2. ad�m  : set yetkisi i�in setter, get yetkisi i�in getter methodlar� olu�tural�m.

        arb1.setModel("Corolla");   // model larak Corolla'y� atad�k
        // model'i yazd�rma imkan�m�z yok, ��nk� getter method'u yok

        System.out.println(arb1.getYakit()); // yak�t olarak elektrikli bilgisini yazd�rabildik
        // yak�t� de�i�tiremeyiz ��nk� setter method'u yok


        // set methodu : de�er atanabilsin ama g�r�lemesin (veri giri�i)

        // get methodu : g�r�lebilsin ama yeni de�er atanamas�n isteniyor (yazd�rma)


    }
}
