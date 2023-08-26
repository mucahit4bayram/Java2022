package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 5;

        System.out.println(sayi1 / sayi2); // 4.6 yerine 4 yazdırdı
        // ikisi de int olduğundan sonucu int olarak kabul edip yazdırır

        System.out.println(25 * 7 / 3); // 58,3 yerine 58 yazdırdı

        double sayi3 = 5;

        System.out.println(sayi1 / sayi3); // 4,6 yazdırdı.
        // iki veriable'ın data türü değişik olduğunda (int, double)
        // daha kapsamlı olanı data türü olarak kabul eder


    }
}
