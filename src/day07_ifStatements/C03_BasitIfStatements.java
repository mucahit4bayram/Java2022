package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {

    /*
    Bir if satatement'da { kullanılmazsa, java ilk satırı şart ile bağlar, sonraki satırlar bağımsız olur.

    Eğer birden fazla satır aynı if sartlarına bağlanmış ise mutlaka { kullanmalıyız.
    */
        int sayi = 20;
        if (sayi > 0)
            System.out.println("sayi pozitif");       // if in sonucuna göre yani şarta göre çalışır
            System.out.println("pozitif kalacaktır"); // şart sağlansa da sağlanmasa da her zaman çalışır
                                                      // bağımsız satır.
            System.out.println("ucuncu satir");       // her zaman çalışır

        if (sayi % 2 == 0)
            System.out.println("sayi cift");          // değere bağlı
            System.out.println("cift kalacaktir");    // her zaman çalışır

        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati");  // değere bağlı


    }
}
