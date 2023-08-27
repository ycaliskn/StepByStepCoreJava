package day19Map;

public enum Sehirler {
    Istanbul("Ist", 212, 34),
    Ankara("Ank", 312, 06),
    Izmir("İz", 232, 35),
    Antalya("Ant", 242, 07),
    Van("Vn", 432, 65),

    Kayseri("Ks", 326, 38);


    public final String sehirKisaltma;

    public final int alankodu;

    public final int plaka;

    Sehirler(String sehirKisaltma, int alankodu, int plaka) {
        this.sehirKisaltma = sehirKisaltma;
        this.alankodu = alankodu;
        this.plaka = plaka;
    }

    public String getSehirKisaltma() {
        return sehirKisaltma;
    }

    public int getAlankodu() {
        return alankodu;
    }

    public int getPlaka() {
        return plaka;
    }
}
