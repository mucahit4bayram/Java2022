package lambda_functional_programming;

public class Utils {

    public static void ayniSatirdaBosluklaYazdir(Object obj){ // obje yaparsak her türlü data türünde çalýþýr

        System.out.print(obj+" ");

    }

    public static boolean ciftElemaniSec(int x){

        return x%2==0;

    }

    public static boolean tekElemaniSec(int x){

        return x%2!=0;

    }

    public static int karesinAl(int x){

        return x*x;
    }

    public static int kupunuAl(int x){

        return x*x*x;
    }
    public static double yarisiniAl(int x){

        return x/2.0;

    }

    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1);
    }

    public static char ilkKarakteriAl(String str){

        return str.charAt(0);
    }

    public static int rakamlarToplaminiAl(int x){

        int toplam = 0;

        while(x>0){             // x>0 olduðu sürece
            toplam += x%10;     // son rakamý al, toplama ekle
            x /= 10;            // son basamaktan kurtul

        }
        return toplam;
    }
}