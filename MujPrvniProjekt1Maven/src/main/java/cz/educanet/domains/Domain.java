package cz.educanet.domains;

public class Domain {
    private double averagePrice;
    private double maximalPrice;
    private double minimalPrice;

    public Domain(double averagePrice, double maximalPrice, double minimalPrice) {
        this.averagePrice = averagePrice;
        this.maximalPrice = maximalPrice;
        this.minimalPrice = minimalPrice;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public double getMaximalPrice() {
        return maximalPrice;
    }

    public double getMinimalPrice() {
        return minimalPrice;
    }
}
