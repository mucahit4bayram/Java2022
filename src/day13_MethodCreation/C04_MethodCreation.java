package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        /*                //-/-/ METHOD CREATION (Method Olu�turma) /-/-//

        Method : Java'da method'lar istedi�imiz i�lemleri bizim ad�m�za yapan kod bloklar�d�r.
        (Belirli bir i�i yapmak i�in tasarlanm�� robotlar gibidir.)

         */

        // input olarak verilen 2 integer'i toplay�p sonucu yazd�ran bir method olu�turun.

        int input1 = 30;
        int input2 = 20;
        
        /*
        *** method ---> Method Class body'si i�inde Main method d���nda olu�turulmal�d�r.
        *
        method 4 ad�mda olu�turulur;
        - 1. ad�m method call,
        - 2. ad�m argument eklenmesi gerekiyorsa ekleyelim,
        -    e�er method'un return type void'den farkl� olacaksa bir variable olu�turup, method call'u assign edelim
        
         */
        topla (input1,input2);

        //-/!!!/ Toplama Methodunu input1 ve input2 i�in �al��t�r demek.
        //-/!!!/ Method �a��r�rken parantez i�ine yaz�lan de�erlere Arguments denir.(input1, input2)
        //-/!!!/ Method call parantez i�i ARGUMENT, Methoddaki parantez i�i PARAMETRE...
        //-/!!!/ Method �a��r�rken kulland���m�z argumanlar ile method parametrelerinin uyumlu olmas� gereklir.
        //-/!!!/ Say� parametreleri i�in char de�erler de arguman olrak kullan�labilir.

    }

    public static void topla (int input1, int input2) {
        /*
        - 3. ad�m method deklerasyonunda de�i�tirilmesi gereken b�l�mleri de�i�tir (acces modifier, return type vb...)

        /-/-/ !!! haz�rlad���m�z method'a her yerden ula�abilmemiz i�in acces modifier'� public yapmal�y�z !!! /-/-/
                  private ---> sadece i�inde bulundu�umuz classta kullan�labilir.

        - 4. ad�m e�er return type void d���nda bir �eyse return keyword'u ve d�necek de�eri hesaplamal�y�z
             * method bir�eyi return etmesi bekleniyorsa return keyword'u kullan�lmal�,
             * return type'i void olanlar bize bir sonu� d�nd�rmez, sonucu yazd�rmak veya bir yere kaydetmek gibi
               i�levler yapabilirler.(fatura yat�ran �ocuk)
             * return type void olmayanlar bize bir sonu� d�nd�r�rler. (ekmek almaya g�nderdi�imiz kap�c� gibi)
               sadece method'un �al��mas� yetmez, d�nen sonucu kaydetmeniz gerekir.

         */
        System.out.println("Girilen iki say�n�n toplami : " + (input1+input2));
    }
}
