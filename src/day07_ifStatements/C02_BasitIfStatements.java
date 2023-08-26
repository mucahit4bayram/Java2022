package day07_ifStatements;

public class C02_BasitIfStatements {
    public static void main(String[] args) {

        int sayi = -20;
        if (sayi > 0) {
            System.out.println("sayi pozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        }
        if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in tam kati");
        }
        /*
        basit if cümleleri kodun diğer parçalarından bağımsızdır. sadece bir şart kontrol eder, şart sağlanıyorsa,
        if body çalışır, yoksa çalışmaz
        birden fazla basit if cümlesi varsa girilen şarta bağlı olarak, tümünde if body'si çalışabilir,
        kısmen if body'leri çalışabilir veya hicbir if body'si çalışmayabilir.
         */
    }
}
