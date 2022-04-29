package cz.educanet;

public class Product {
    private String SKU;
    private int ID;
    private String name;
    private String shortDescription;
    private String type;
    private boolean IsFeatured;

    public Product(String SKU, int ID, String name, String shortDescription, String type, boolean isFeatured) {
        this.SKU = SKU;
        this.ID = ID;
        this.name = name;
        this.shortDescription = shortDescription;
        this.type = type;
        IsFeatured = isFeatured;
    }

    public String getSKU() {
        return SKU;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public String getType() {
        return type;
    }
    public boolean isFeatured() {
        return IsFeatured;
    }
}
