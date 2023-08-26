package day23_arrayLists.day16_forLoop;

public class C01_FoorLoop {
    public static void main(String[] args) {

        // verilen bir pozitif tam saynýn pozitif tam bölenlerini yazdýralým.

        int input=120;

        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.print(i + " ");
            }
        }
    }
}