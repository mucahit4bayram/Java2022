package day19_scope;

    public class C01_InstanceVariables {

        /*

         class icerisinde heryerden kullanmak istediginiz variable'lari
         class level'da (Class'in icinde ama method'larin disinda)
         genellikle class level variable'lar class'in basinda olusturulur(sart degil)
         class level'daki variable'lar icin 2 scope vardir
         1- static variables (Class variable'lari da denir)
         2- instance (static olmayan) variables (obje variable'i da denir)
         */
        int instSayi=20; // static olmayip class level'da oldugu icin instance variable'dir
        public static void main(String[] args) {

            int sayi=10;

        /* System.out.println(instSayi);
           instance variables static olmadigi icin static klup'e uye main method'dan direk kullanamayiz
           instance variable'larin diger adi object variable'dir
           dolayisiyla obje olusturursaniz instance variable'lari heryerden kullanabilirsiniz
         */

            C01_InstanceVariables obje1 = new C01_InstanceVariables();
            System.out.println("obje1 degismeden once : "+obje1.instSayi); // 20

            obje1.instSayi=30;
            System.out.println("obje1 degistikten sonra : "+obje1.instSayi);  // 30

            C01_InstanceVariables obje2 = new C01_InstanceVariables();
            System.out.println("obje2 degismeden once : "+obje2.instSayi); // 20

            obje2.instSayi=25;
            System.out.println("obje2 degistikten sonra : "+obje2.instSayi); // 25

            C01_InstanceVariables obje3 = new C01_InstanceVariables();
            System.out.println("obje3 degismeden once : "+obje3.instSayi); // 20
        /*
         Her obje olustugunda instance (obje) variable'inin ilk atanan degerini alir
         */
        }
        public static void staticMethod(){
            // System.out.println(sayi);
        /*
         bir method'un icerisinde olusturulan variable, sadece o method'un icinden kullanilabilir. (Local variables)
         */
        /*
            instSayi=30;

            instance variable'lara main method disindaki static method'lardan da direk ulasamayiz.
            obje olusturursak ulasabiliriz
         */
            C01_InstanceVariables obje4 = new C01_InstanceVariables();

            System.out.println("objet4 : " + obje4.instSayi);

        }
        public void staticOlmayanMethod(){

            System.out.println(instSayi);
        /*
         instance variable'lar class icerisindeki
         static olmayan method'lardan direk kullanilabilir
         */
        }
    }
    /*

    * INSTANCE VARIABLES'LAR, CLASS LEVEL ÝÇÝNDE ANCAK MAÝN METHOD'UN DIÞINDA OLUÞTURULMALIDIR.
    * INSTANCE VARIABLES'LAR, STATIC DEÐÝLDÝRLER, NON STATIC DÝRLER.
    * INSTANCE VARIABLES'LAR CLASS ÝÇERÝSÝNDE VEYA BAÞKA CLASS'LARDA DÝREK KULLANILAMAZ. KULLANMAK ÝSTEDÝÐÝMÝZDE;
      STATIC METHOD'LARIN ÝÇERÝSÝNDEN OBJE OLUÞTURULMALI VE OBJE YARDIMIYLA,
      STATIC OLMAYAN'LARIN ÝÇERÝSÝNDEN DÝREKT ULAÞILABÝLÝR.

     */

