package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    /*
    POJO yani “Plain Old Java Object” Class :
    Oluþturmuþ olduðumuz bu java sýnýfý framework’lerden baðýmsýz istenildiði gibi kullanýlabilir.
    Baþka herhangi bir nesne ile baðlantýsý olmayan, bünyesinde instance variable, constructor, getter, setter ve
    toString gibi metodlarý barýndýrabilen en temel objeye POJO ismi verilir. Çok basit tanýmlarsak eðer en temel
    Java nesnelerine verilen isim olarak belirtebiliriz.

        * Courses classta; Season, courseName, averageScore, numberOfStudents variable larýný oluþturan bir pojo class
          oluþturduk.

        * Fp05 classta; Pojo classta bulunan parametreli constructor vasýtasýyýla oluþturduðumuz Courses ismindeki objeleri,
          coursesList adýnda bir listin içine attýk.

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

    // 1) Tüm ortalama puanlarýn verilen sayýdan büyük olup olmadýðýný kontrol etmek için bir method oluþturun.
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses> list, double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);
        // tüm aldýpýmýz puanlar, verilen sayýdan (x) büyükse true döndürür.

    }

    // 2) Kurs adlarýndan en az birinin verilen kelimeyi içerip içermediðini kontrol etmek için bir method oluþturun
    public static boolean kelimeKursAdlariIcindeVarMi(List<Courses> list, String kelime){

        return list.stream().anyMatch(t->t.getCourseName().contains(kelime));

    }

    // 3) Ortalama puaný en yüksek olan kursu yazdýrmak için bir yöntem oluþturun
    public static void ortalamasiEnYuksekKursunAdiniYazdir(List<Courses> list){

        String sonuc = list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
                                                                           // findFirst (TN)nin objeysini verecek.
                                                                           // getCouseName bize String verecek.Kursun adýný verecek
        System.out.println(sonuc);
    }

    // 4) List öðelerini artan düzende (küçükten büyüðe) ortalama puana göre sýralayýn ve ilk verilenleri atlayýn
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list, int x){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());

    }
}
