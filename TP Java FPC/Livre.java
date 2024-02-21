// sous class livre qui hérite de la classe document
public class Livre extends Document {
    private String auteur;
    private int nombreDePages;
    private String genre;

    public Livre(int numéroUnique, String titre, int dateSortie, Boolean statut, String auteur, int nombreDePages, String genre) {
        super(numéroUnique, titre, dateSortie);
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.genre = genre;
    }

    // Getters et Setters pour Livre
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return " auteur: " + auteur
                + " nombreDePages: " + nombreDePages
                + " genre: " + genre
                + super.toString();
    }
}
