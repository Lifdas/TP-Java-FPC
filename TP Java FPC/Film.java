// Sous class Film qui hérite de la classe document
public class Film extends Document {
    private String réalisateur;
    private int duree;
    private String genre;

    public Film(int numéroUnique, String titre, int dateSortie, Boolean statut, String réalisateur, int duree, String genre) {
        super(numéroUnique, titre, dateSortie);
        this.réalisateur = réalisateur;
        this.duree = duree;
        this.genre = genre;
    }

    // Getters et Setters pour Film
    public String getRéalisateur() {
        return réalisateur;
    }

    public void setRéalisateur(String réalisateur) {
        this.réalisateur = réalisateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return " réalisateur: " + réalisateur
                + " duree: " + duree
                + " genre: " + genre
                + super.toString();
    }
}
