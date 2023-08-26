package day34_inherritance;

public class Personel {
    /*
    E�er parent class olacak �ekilde tasarlad���n�z veya ileride bu class'i parent yapmak
    isteyenle variable ve method'lar�n accec modifier'ini PROTECTED se�melisiniz.
    tam olarak inheritance i�in se�ilmi�.
    B�ylece, child class'lar sizin variable ve method'lar�n�zdan istifade ederken
    di�er classlar sizin variable ve method'lar�n�za ba�ka package'lerden ula�amazlar.
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
