package day33_encapsulation;

public class Araba {

    String marka = "Marka belirtilmedi";  // marka'n�n access modifier'i default oldu�undan
                                          // package i�erisinde kullan�labilir.
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli";  // t�m arabalar elektrikli ise bu variable'in de�i�tirilememesi laz�m.
    // private yapt���m�z model ve yak�t variable'lar�na eri�imi yetkilendirelim.
    // model'e de�er atanabilsin ama g�r�lemesin  (setter)
    // yak�t ise g�r�lebilsin ama yeni de�er atanamas�n isteniyor  (getter)
    // bunun i�in

    public void setModel(String model) { // de�er atamaya izin veriyordu
        this.model = model;
    }

    public String getYakit() {  // ula��ma izin veriyor
        return yakit;
    }
}
