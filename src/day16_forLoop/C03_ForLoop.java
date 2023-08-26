package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {


        // Soru2: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
        //  virgul olarak ayni satira yaziniz

        int bas=20;
        int son=35;

        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i + ", ");  // eðer i<son ise virgül(,) de koysun
            }else{
                System.out.print(i);         // deðilse sadece i yi yazdýrsýn. bu þekilde son sayýdan sonra (,) koymaz
            }
        }
    }
}
