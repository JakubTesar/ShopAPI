package cz.educanet;

import java.util.List;

public class Shop {
    public List<Product> featured;
    public List<Product> other;

    public Shop(List<Product> featured, List<Product> other) {
        this.featured = featured;
        this.other = other;
    }

    public List<Product> getFeatured() {
        return featured;
    }

    public List<Product> getOther() {
        return other;
    }
}
