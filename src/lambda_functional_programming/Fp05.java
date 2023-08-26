package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    /*
    POJO yani �Plain Old Java Object� Class :
    Olu�turmu� oldu�umuz bu java s�n�f� framework�lerden ba��ms�z istenildi�i gibi kullan�labilir.
    Ba�ka herhangi bir nesne ile ba�lant�s� olmayan, b�nyesinde instance variable, constructor, getter, setter ve
    toString gibi metodlar� bar�nd�rabilen en temel objeye POJO ismi verilir. �ok basit tan�mlarsak e�er en temel
    Java nesnelerine verilen isim olarak belirtebiliriz.

        * Courses classta; Season, courseName, averageScore, numberOfStudents variable lar�n� olu�turan bir pojo class
          olu�turduk.

        * Fp05 classta; Pojo classta bulunan parametreli constructor vas�tas�y�la olu�turdu�umuz Courses ismindeki objeleri,
          coursesList ad�nda bir listin i�ine att�k.

     */

    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println("ortalamaPuanlarVerilenSayidanBuyukMu: "+ ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,10));
        System.out.println("kelimeKursAdlariIcindeVarMi: "+kelimeKursAdlariIcindeVarMi(coursesList,"X"));
        ortalamasiEnYuksekKursunAdiniYazdir(coursesList);
        System.out.println(ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList,3));


    }

    // 1) T�m ortalama puanlar�n verilen say�dan b�y�k olup olmad���n� kontrol etmek i�in bir method olu�turun.
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses> list, double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);
        // t�m ald�p�m�z puanlar, verilen say�dan (x) b�y�kse true d�nd�r�r.

    }

    // 2) Kurs adlar�ndan en az birinin verilen kelimeyi i�erip i�ermedi�ini kontrol etmek i�in bir method olu�turun
    public static boolean kelimeKursAdlariIcindeVarMi(List<Courses> list, String kelime){

        return list.stream().anyMatch(t->t.getCourseName().contains(kelime));

    }

    // 3) Ortalama puan� en y�ksek olan kursu yazd�rmak i�in bir y�ntem olu�turun
    public static void ortalamasiEnYuksekKursunAdiniYazdir(List<Courses> list){

        String sonuc = list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
                                                                           // findFirst (TN)nin objeysini verecek.
                                                                           // getCouseName bize String verecek.Kursun ad�n� verecek
        System.out.println(sonuc);
    }

    // 4) List ��elerini artan d�zende (k���kten b�y��e) ortalama puana g�re s�ralay�n ve ilk verilenleri atlay�n
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list, int x){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());

    }
}
