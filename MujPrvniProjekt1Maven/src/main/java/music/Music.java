package music;
//"\"\";\"year\";\"position\";\"artist\";\"song\";\"indicativerevenue\";\"us\";\"uk\";\"de\";\"fr\";\"ca\";\"au\"\n" +
public class Music {
    private int year;
    private String position;
    private String artist;
    private String song;
    private Double indicativerevenue;

    public Music(int year, String position, String artist, String song, Double indicativerevenue) {
        this.year = year;
        this.position = position;
        this.artist = artist;
        this.song = song;
        this.indicativerevenue = indicativerevenue;
    }

    public int getYear() {
        return year;
    }

    public String getPosition() {
        return position;
    }

    public String getArtist() {
        return artist;
    }

    public String getSong() {
        return song;
    }

    public Double getIndicativerevenue() {
        return indicativerevenue;
    }
}
