package day14StaticKeywordEncapsulation;

public class HastaKayit {


    public String hastaIsim = "Ali Mert";
    private final String yatisBolum = "Kalp";
    private int odaNo = 15;
    private boolean gunlukOlcum = false;

    public String getYatisBolum() {
        return yatisBolum;
    }

    public int getOdaNo() {
        return odaNo;
    }

    public boolean isGunlukOlcum() {
        return gunlukOlcum;
    }

 

    public void setGunlukOlcum(boolean gunlukOlcum) {
        this.gunlukOlcum = gunlukOlcum;
    }

    public void setOdaNo(int odaNo) {
        this.odaNo = odaNo;
    }



}
