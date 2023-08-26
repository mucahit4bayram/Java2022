package day17_nestedForLoop;

public class C10_WhileLoopNot {
    public static void main(String[] args) {

        boolean dogruMu = false;
        int sayi = 15;

        while (!dogruMu){ // burasý false olunca while loop çalýþmaz.
                          // þart saðlandýðýnda dogruMu= true olur. !true olunca da while döngü kýrýlýr.

            if (sayi>20){  // þart saðlandýðýnda while loop'un condition'i false olmali
                System.out.println("Bu islem tamam");
                dogruMu = true;

            }else {        // þart saðlanmadýðý müddetçe while loop'un kontrol ettiði deðiþken deðiþmeli
                System.out.println("istenen sart saglanamadi" + sayi);
                sayi++;
            }
        }
    }
}
