package cz.educanet.games;

public class Games {
    private String dev;
    private int metaScore;
    private double price;
    private String pub;
    private String releaseDate;
    private String title;

    public Games(String dev, int metaScore, double price, String pub, String releaseDate, String title) {
        this.dev = dev;
        this.metaScore = metaScore;
        this.price = price;
        this.pub = pub;
        this.releaseDate = releaseDate;
        this.title = title;
    }

    public String getDev() {
        return dev;
    }

    public int getMetaScore() {
        return metaScore;
    }

    public double getPrice() {
        return price;
    }

    public String getPub() {
        return pub;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }
}
