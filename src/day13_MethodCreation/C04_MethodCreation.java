package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        /*                //-/-/ METHOD CREATION (Method Oluþturma) /-/-//

        Method : Java'da method'lar istediðimiz iþlemleri bizim adýmýza yapan kod bloklarýdýr.
        (Belirli bir iþi yapmak için tasarlanmýþ robotlar gibidir.)

         */

        // input olarak verilen 2 integer'i toplayýp sonucu yazdýran bir method oluþturun.

        int input1 = 30;
        int input2 = 20;
        
        /*
        *** method ---> Method Class body'si içinde Main method dýþýnda oluþturulmalýdýr.
        *
        method 4 adýmda oluþturulur;
        - 1. adým method call,
        - 2. adým argument eklenmesi gerekiyorsa ekleyelim,
        -    eðer method'un return type void'den farklý olacaksa bir variable oluþturup, method call'u assign edelim
        
         */
        topla (input1,input2);

        //-/!!!/ Toplama Methodunu input1 ve input2 için çalýþtýr demek.
        //-/!!!/ Method çaðýrýrken parantez içine yazýlan deðerlere Arguments denir.(input1, input2)
        //-/!!!/ Method call parantez içi ARGUMENT, Methoddaki parantez içi PARAMETRE...
        //-/!!!/ Method çaðýrýrken kullandýðýmýz argumanlar ile method parametrelerinin uyumlu olmasý gereklir.
        //-/!!!/ Sayý parametreleri için char deðerler de arguman olrak kullanýlabilir.

    }

    public static void topla (int input1, int input2) {
        /*
        - 3. adým method deklerasyonunda deðiþtirilmesi gereken bölümleri deðiþtir (acces modifier, return type vb...)

        /-/-/ !!! hazýrladýðýmýz method'a her yerden ulaþabilmemiz için acces modifier'ý public yapmalýyýz !!! /-/-/
                  private ---> sadece içinde bulunduðumuz classta kullanýlabilir.

        - 4. adým eðer return type void dýþýnda bir þeyse return keyword'u ve dönecek deðeri hesaplamalýyýz
             * method birþeyi return etmesi bekleniyorsa return keyword'u kullanýlmalý,
             * return type'i void olanlar bize bir sonuç döndürmez, sonucu yazdýrmak veya bir yere kaydetmek gibi
               iþlevler yapabilirler.(fatura yatýran çocuk)
             * return type void olmayanlar bize bir sonuç döndürürler. (ekmek almaya gönderdiðimiz kapýcý gibi)
               sadece method'un çalýþmasý yetmez, dönen sonucu kaydetmeniz gerekir.

         */
        System.out.println("Girilen iki sayýnýn toplami : " + (input1+input2));
    }
}
