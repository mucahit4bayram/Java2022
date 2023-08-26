package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*                            /-/-/ LOOP (D�ng�) /-/-/

        Belirli bir ko�ul sa�land��� s�rece tekrarlanmas� gereken i�ler i�in kullan�lan kod bloklar�na LOOP (D�ng�)
        denir.

        FOR LOOP :
        ----------
        - ��lemi ka� kere yapaca��n�z belli ise
        - ��lemi ba�latan ve bitiren de�i�ken ayn� ise for loop tercih edilir.

        1- Ba�lang�� de�eri olu�tur (initialization) : E�er loop daha �nceden olu�turdu�umuz bir variable'a
        ba�l� olarak kullan�lacaksa onu yazabilir veya yeni bir variable olu�turup ba�lang�� de�eri atayabiliriz.

        2- Biti� �art� kontrol et : Loop'un her d�ng�s�nde biti� �art� kontrol edilir. True ise loop body'si �al���r,
        false ise loop biter.

        3- Art�� veya azal�� : Loop body'si �al���p ba�a d�nd���nde ilk olarak bu b�l�m �al���r, sonra biti� �art�n�
        kontrole gider. Art�� veya azal�� birer birer olmak zorunda de�ildir.

             (starting value)          (Ending Condition)                 (increasing or decreasing the value)
            ba�lang�� noktas�,        biti� i�in gerekli olan ko�ul,      artarak m�?, azalarak m�? ka�ar ka�ar?
            -----------------         -----------------------------      --------------------------------------
        for (    int i = 0;                   i < ;                                      i++) {

        *** E�er Ending Condition hep true verirse loop sonsuz d�ng�ye girer.

        *** E�er Loop'ta Ending Condition hi� true olmazsa loop body hi� devreye girmez.

        *** Art�� de�eri olmak zorunda de�il, farkl� da olabilir. (i+= vb..)

        }

         */

        // 1'den 5 e kadar(5 dahil) olan tamsayilari toplayalim

        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;                            // her looop'tan ald��� i de�erini toplama ekliyor
        }
        System.out.println("toplam : " + toplam); // 15

        // 10 dahil - 20 dahil aradaki sayilari toplayin

        toplam=0;

        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("10-20 arasi toplam : " + toplam); // 165

        // 30 dagil 50 dahil, aradaki cift sayilari toplayin

        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam); //440

        //2.yontem

        toplam=0;

        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam); // 440

        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin

        toplam=0;

        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500-1600 arasi yedi ile bolunebilen sayilarin toplam : " + toplam);
    }
}

