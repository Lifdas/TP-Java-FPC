// ma sous class CD audio qui hérite de la classe document
public class CDAudio extends Document {
    private String interprete;
    private String compositeur;
    private int duree;

    public CDAudio(int numéroUnique, String titre, int dateSortie, Boolean statut, String interprete, String compositeur, int duree) {
        // j'appelle les attributs dont il hérite du document
        super(numéroUnique, titre, dateSortie);
        this.interprete = interprete;
        this.compositeur = compositeur;
        this.duree = duree;
    }

    // Getters et Setters pour CDAudio
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public void setCompositeur(String compositeur) {
        this.compositeur = compositeur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return " interprete: " + interprete
                + " compositeur: " + compositeur
                + " duree: " + duree
                + super.toString();
    }
}
