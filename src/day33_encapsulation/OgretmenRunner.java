package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1 = new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        Bu y�ntemde data hiding de�il, daha anla��l�r bir kod ama�lanm�� olur
         */

    }
}
