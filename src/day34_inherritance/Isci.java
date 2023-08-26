package day34_inherritance;

public class Isci extends Personel {
    /*
    Normal hayatýmýzda parent, çocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar özelliklerini inherit etmek istedikleri class'ý kendilerine
    parent edinirler.

    Mesela iþci class'ini oluþturundas nelere ihtiyacý var diye düþünürsek
    Personel class'ýndaki tüm variable ve method'lara ihtiyacý olduðunu dörebiliriz.
    Bu durumda yeniden o variable ve method'larý oluþturmak yerine Personel class'ini
    kendimize parent ediniriz.

    Bir class'ý parent edinmek için extends keyword kullanmalýyýz.

    Bir class baþka bir class'ý parent edindiðinde;
    1- parent class'daki tüm özelliklere (varible+method) otomatik olarak sahip olur
    2- parent class'daki özelliklerden bazýlarýný kendine uyarlayabilir
    3- parent class'da olmayan bazý yeni özellikler oluþturabilir.

    Not : parent class'daki özelliklerden hiçbirini reddedemez ama deðiþtirebilir.
     */

    int persNo = 1001;

    public static void main(String[] args) {

        Isci isci1 =new Isci();
        System.out.println(isci1.isim);
        // kendi class'ýmýzda isim variable yok, onun için parent'a gideriz.
        isci1.isim ="Selim";
        System.out.println(isci1.persNo); // 1001 kendi class'ýmýzda varsa onu kullanýr

        isci1.maas(); // Isciler minimum 15 euro saat ucreti alýr
    }

    public void maas () {
        System.out.println("Isciler minimum 15 euro saat ucreti alýr");
    }

    public void ozelSigorta () {
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptýrýlýr.");
    }
}
