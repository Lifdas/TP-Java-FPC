public abstract class Document {
    private int numéroUnique;
    private String titre;
    private int dateSortie;
    private Boolean statut;

    public Document(int numéroUnique, String titre, int dateSortie) {
        this.numéroUnique = numéroUnique;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.statut = false;
    }
    
    // Getters et Setters
    // Pour le numéro unique
    public int getNuméroUnique() {
        return numéroUnique;
    }

    public void setNuméroUnique(int numéroUnique) {
        this.numéroUnique = numéroUnique;
    }

    // pour mon titre
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(int dateSortie) {
        this.dateSortie = dateSortie;
    }
    
    public Boolean getStatut() {
        return statut;
    }
    
    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "titre: " + titre + " numéroUnique: " + numéroUnique + " dateSortie: " + dateSortie;
    }
}

