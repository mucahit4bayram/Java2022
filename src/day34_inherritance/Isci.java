package day34_inherritance;

public class Isci extends Personel {
    /*
    Normal hayat�m�zda parent, �ocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar �zelliklerini inherit etmek istedikleri class'� kendilerine
    parent edinirler.

    Mesela i�ci class'ini olu�turundas nelere ihtiyac� var diye d���n�rsek
    Personel class'�ndaki t�m variable ve method'lara ihtiyac� oldu�unu d�rebiliriz.
    Bu durumda yeniden o variable ve method'lar� olu�turmak yerine Personel class'ini
    kendimize parent ediniriz.

    Bir class'� parent edinmek i�in extends keyword kullanmal�y�z.

    Bir class ba�ka bir class'� parent edindi�inde;
    1- parent class'daki t�m �zelliklere (varible+method) otomatik olarak sahip olur
    2- parent class'daki �zelliklerden baz�lar�n� kendine uyarlayabilir
    3- parent class'da olmayan baz� yeni �zellikler olu�turabilir.

    Not : parent class'daki �zelliklerden hi�birini reddedemez ama de�i�tirebilir.
     */

    int persNo = 1001;

    public static void main(String[] args) {

        Isci isci1 =new Isci();
        System.out.println(isci1.isim);
        // kendi class'�m�zda isim variable yok, onun i�in parent'a gideriz.
        isci1.isim ="Selim";
        System.out.println(isci1.persNo); // 1001 kendi class'�m�zda varsa onu kullan�r

        isci1.maas(); // Isciler minimum 15 euro saat ucreti al�r
    }

    public void maas () {
        System.out.println("Isciler minimum 15 euro saat ucreti al�r");
    }

    public void ozelSigorta () {
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yapt�r�l�r.");
    }
}
