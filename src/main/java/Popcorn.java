public class Popcorn implements ISell{
    private double sellPrice;

    private String type;

    public Popcorn(String type) {
        this.sellPrice = 5;
        this.type = type;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
