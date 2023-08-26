package day33_encapsulation;

public class Ogretmen {


   private String isim;
   private String soyisim;
   private String brans;

       /*
    Bazen de yetkileri s�n�rlamak de�il de yap�lan i�i daha iyi tan�mlamak i�in encapsulation kullan�l�r.

    Bu yakla��m� kullanan class'larda t�m variable'lar private yap�l�p hemsi i�in getter ve setter olu�turulur.
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
