// Sous class BandeDessinee qui hérite de la classe document

public class BandeDessinee extends Document {
    private String dessinateur;
    private int nombreDePages;

    public BandeDessinee(int numéroUnique, String titre, int dateSortie, Boolean statut, String dessinateur, int nombreDePages) {
        super(numéroUnique, titre, dateSortie);
        this.dessinateur = dessinateur;
        this.nombreDePages = nombreDePages;
    }

    // Getters et Setters pour BandeDessinee
    public String getdessinateur() {
        return dessinateur;
    }

    public void setdessinateur(String dessinateur) {
        this.dessinateur = dessinateur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }
}
