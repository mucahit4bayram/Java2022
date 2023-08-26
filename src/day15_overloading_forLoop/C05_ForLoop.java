package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*                            /-/-/ LOOP (Döngü) /-/-/

        Belirli bir koþul saðlandýðý sürece tekrarlanmasý gereken iþler için kullanýlan kod bloklarýna LOOP (Döngü)
        denir.

        FOR LOOP :
        ----------
        - Ýþlemi kaç kere yapacaðýnýz belli ise
        - Ýþlemi baþlatan ve bitiren deðiþken ayný ise for loop tercih edilir.

        1- Baþlangýç deðeri oluþtur (initialization) : Eðer loop daha önceden oluþturduðumuz bir variable'a
        baðlý olarak kullanýlacaksa onu yazabilir veya yeni bir variable oluþturup baþlangýç deðeri atayabiliriz.

        2- Bitiþ þartý kontrol et : Loop'un her döngüsünde bitiþ þartý kontrol edilir. True ise loop body'si çalýþýr,
        false ise loop biter.

        3- Artýþ veya azalýþ : Loop body'si çalýþýp baþa döndüðünde ilk olarak bu bölüm çalýþýr, sonra bitiþ þartýný
        kontrole gider. Artýþ veya azalýþ birer birer olmak zorunda deðildir.

             (starting value)          (Ending Condition)                 (increasing or decreasing the value)
            baþlangýç noktasý,        bitiþ için gerekli olan koþul,      artarak mý?, azalarak mý? kaçar kaçar?
            -----------------         -----------------------------      --------------------------------------
        for (    int i = 0;                   i < ;                                      i++) {

        *** Eðer Ending Condition hep true verirse loop sonsuz döngüye girer.

        *** Eðer Loop'ta Ending Condition hiç true olmazsa loop body hiç devreye girmez.

        *** Artýþ deðeri olmak zorunda deðil, farklý da olabilir. (i+= vb..)

        }

         */

        // 1'den 5 e kadar(5 dahil) olan tamsayilari toplayalim

        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;                            // her looop'tan aldýðý i deðerini toplama ekliyor
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

