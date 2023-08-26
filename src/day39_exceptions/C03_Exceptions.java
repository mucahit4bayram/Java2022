package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdi�iniz deger sadece rakamlardan olusmalidir.");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");

        }


        System.out.println("Sayinin karesi : " + sayi*sayi);

        /*
        Kullan�c�dan String olarak bir de�er al�yor ve bunu integer'a �eviriyorsak NumberFormatException ile
        kar��la�abilece�imizi �ng�r�yoruz.
        NFE ald���m�zda kodun durmamas�n� istiyorsak try catch ile �evreleyebiliriz.

        E�er bilmedi�im bir exception daha olu�ursa kodum durmas�n istiyorsak
        bir kere daha catch c�mlesi ekleyip ona en geni� Exception'i yazd�rabiliriz.

         */


    }
}
