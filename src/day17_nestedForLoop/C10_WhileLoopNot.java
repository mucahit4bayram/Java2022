package day17_nestedForLoop;

public class C10_WhileLoopNot {
    public static void main(String[] args) {

        boolean dogruMu = false;
        int sayi = 15;

        while (!dogruMu){ // buras� false olunca while loop �al��maz.
                          // �art sa�land���nda dogruMu= true olur. !true olunca da while d�ng� k�r�l�r.

            if (sayi>20){  // �art sa�land���nda while loop'un condition'i false olmali
                System.out.println("Bu islem tamam");
                dogruMu = true;

            }else {        // �art sa�lanmad��� m�ddet�e while loop'un kontrol etti�i de�i�ken de�i�meli
                System.out.println("istenen sart saglanamadi" + sayi);
                sayi++;
            }
        }
    }
}
