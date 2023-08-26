package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen String'i a�a��daki gibi yazd�ran bir program yazd�ral�m

        input = Deniz

        D
        De
        Den
        Deni
        Deniz
         */

        String input = "Deniz";

        for (int i = 1; i <=input.length(); i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j)); // ilk harf i�in substring (0,1) olmal�
            }
            System.out.println("");
        }

    }
}
