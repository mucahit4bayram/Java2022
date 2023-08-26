package day33_encapsulation;

public class Araba {

    String marka = "Marka belirtilmedi";  // marka'nýn access modifier'i default olduðundan
                                          // package içerisinde kullanýlabilir.
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli";  // tüm arabalar elektrikli ise bu variable'in deðiþtirilememesi lazým.
    // private yaptýðýmýz model ve yakýt variable'larýna eriþimi yetkilendirelim.
    // model'e deðer atanabilsin ama görülemesin  (setter)
    // yakýt ise görülebilsin ama yeni deðer atanamasýn isteniyor  (getter)
    // bunun için

    public void setModel(String model) { // deðer atamaya izin veriyordu
        this.model = model;
    }

    public String getYakit() {  // ulaþýma izin veriyor
        return yakit;
    }
}
