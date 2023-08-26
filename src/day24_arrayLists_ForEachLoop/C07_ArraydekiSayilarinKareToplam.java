package day24_arrayLists_ForEachLoop;

public class C07_ArraydekiSayilarinKareToplam {
    public static void main(String[] args) {

        int[] sayilar= {2,3,4,1,};

        int toplam=0;

        for (int each: sayilar
            ) {
            toplam+=each*each;
        }
        System.out.println("kareler toplami : " + toplam); // kareler toplami : 30


        //-----------------------------------------
//        for (int i = 0; i < sayilar.length; i++) {
//            toplam+=sayilar[i]*sayilar[i];
//
//        }
//        System.out.println("toplam = " + toplam); // 30

    }
}

