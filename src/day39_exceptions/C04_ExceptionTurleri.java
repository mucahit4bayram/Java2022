package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {
        String str;
        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Compile Time'da bunu farkeder ve size izin vermez
         */
        str=null;

        // System.out.println(str.length());
        // NullPointerException // RTE

        Object obj= "Java Java Java";  // obje her�eyin atas�
        Integer sayi= (Integer)obj; // ClassCastException

        /*
        String str2="Hava Civa";
        Integer sayi2=str2;          // burada String'in integer'a atanamayaca�� bariz belli

        Java bazi casting islemlerine compile time'da izin vermez
        Ancak bazen syntax uygun olabilir bu durumda java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000); // kod sat�r� aras� bekleme yapt�r�yor (5sn.)


    }
}
