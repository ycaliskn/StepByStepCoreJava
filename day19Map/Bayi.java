package day19Map;

public class Bayi {
    String city;
    String town;
    int currentStock;
    boolean weekend;


    public Bayi(String city, String town, int currentStock, boolean weekend) {
        this.city = city;
        this.town = town;
        this.currentStock = currentStock;
        this.weekend = weekend;
    }

    @Override
    public String toString() {
        return "Bayi[" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", currentStock=" + currentStock +
                ", weekend=" + weekend +
                ']';
    }
}
