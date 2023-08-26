package day34_inherritance;

public class Personel {
    /*
    Eðer parent class olacak þekilde tasarladýðýnýz veya ileride bu class'i parent yapmak
    isteyenle variable ve method'larýn accec modifier'ini PROTECTED seçmelisiniz.
    tam olarak inheritance için seçilmiþ.
    Böylece, child class'lar sizin variable ve method'larýnýzdan istifade ederken
    diðer classlar sizin variable ve method'larýnýza baþka package'lerden ulaþamazlar.
     */

    protected int persNo;
    protected String isim = "Isim belirtilmedi";
    protected String departman ="Departman belirtilmedi";


    protected void maas(){
        System.out.println("Tum personelin maasi vardir.");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar.");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretini statusune gore alir.");
    }
}
