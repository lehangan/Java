package store;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    DigitalVideoDisc(String title) {
        this.title = title;
    }

    DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, cost);
        this.category = director;
    }

    DigitalVideoDisc(String title, String category, String diretor, int length, float cost) {
        this(diretor, category, title, cost);
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public float getCost() {
        return this.cost;
    }

    public String getCategory() {
        return this.category;
    }

    public int getLength() {
        return this.length;
    }

    public String getDirector() {
        return this.director;
    }


}
