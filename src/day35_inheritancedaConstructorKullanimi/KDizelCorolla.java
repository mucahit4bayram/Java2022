package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("KDizelCorolla parametresiz cons");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla parametreli cons");
    }
    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla("Hasan");
    }

    /*
    parametresiz constructor ile çalýþtýrdýðýmýzda çýktý;
    GToyota parametresiz cons
    HCorolla parametresiz cons
    KDizelCorolla parametresiz cons

    parametreli constructor ile çalýþtýrdýðýmýzda çýktý;
    GToyota parametreli cons
    HCorolla parametreli cons
    KDizelCorolla parametreli cons



     */
}