package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {


        // Soru2: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
        //  virgul olarak ayni satira yaziniz

        int bas=20;
        int son=35;

        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i + ", ");  // e�er i<son ise virg�l(,) de koysun
            }else{
                System.out.print(i);         // de�ilse sadece i yi yazd�rs�n. bu �ekilde son say�dan sonra (,) koymaz
            }
        }
    }
}
