package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        /*
        // Scanner ile kullanicidan bilgi alabiliriz
		// 3 adimla scanner islemini gerceklestiriyoruz

		// 1. adim Scanner objesi olusturacagiz

		Scanner scan = new Scanner(System.in);

		// new : Java da ne zaman new kelimesini gorseniz yeni bir object olusturuluyor demektir
		// parantezin icine yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerekir
		// Bir kod yazdigimizda kodun altinda kirmizi cizgi olusuyorsa veya satir numarasi
		// olan kisimda kirmizi X olusuyorsa bir seyler yanlis demektir
		// java.util java'nin bizim icin hazirladigi bir kutuphanedir, ihtiyacimiz oldugunda ihtiyacimiz olan kodlari
		// class'a import etmemiz yeterlidir
		// scan olusturdugumuz Scanner objesine verdigimiz isimdir. farkli isimler de verebiliriz
		// ancak scan ismi tum programcilar tarafindan kullanilan bir isimdir
		// kodumuzun anlasilabilir ve rahat okunabiilir olmasi icin scan ismini kullanmamiz tavsiye edilir


		// 2. adim kullaniciya bir mesaj yazin
		System.out.println("Karenin bir kenar uzunlugunu girin");

		// 3.adim kullanicinin konsola girdigi degeri programimiza alacagiz
		//  ve bir variable olusturup bu degeri atayacagiz
		// kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayi da girebilir,
		// buyuk bir sayi da yazabilir, tam sayi da yazabilir, virgullu sayi da yazabilir
         */
        //-------------------------------//

        // kullanıcıdan ismini isteyin
        // girilen ismi
        // isminiz : Idris şeklinde yazdırın

        // insanların dünyasından kodlarımızın bulunduğu class'a değer almak için
        // Scanner class'ını kullanırız

        // 1- Scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);

        // 2- Kullanıcıya ne istediğimizi söyleyelim
        System.out.println("Lurfen isminizi giriniz");

        // 3- Oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        // oluşturacağımız uygun bir variable'a atayalım

        String kullaniciIsmi = scan.next();


        System.out.println("Isminiz:" + kullaniciIsmi);
    }
}
