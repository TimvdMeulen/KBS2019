public abstract class Component {
    private String naam;
    private String type;
    private int beschikbaarheid;
    private int kosten;
    public Component(String naam, String type, int beschikbaarheid, int kosten) {
        this.naam = naam;
        this.type = type;
        this.beschikbaarheid = beschikbaarheid;
        this.kosten = kosten;
    }
}
