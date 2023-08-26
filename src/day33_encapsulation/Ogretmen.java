package day33_encapsulation;

public class Ogretmen {


   private String isim;
   private String soyisim;
   private String brans;

       /*
    Bazen de yetkileri sýnýrlamak deðil de yapýlan iþi daha iyi tanýmlamak için encapsulation kullanýlýr.

    Bu yaklaþýmý kullanan class'larda tüm variable'lar private yapýlýp hemsi için getter ve setter oluþturulur.
     */


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }







}
