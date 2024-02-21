import java.util.Date;

public class Emprunts {
    private Date dateEmprunt;
    private Adherents adherent;
    private Document document;

    public Emprunts(Date dateEmprunt, Adherents adherent, Document document){
        this.dateEmprunt = dateEmprunt;
        this.adherent = adherent;
        this.document = document;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }
    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }
    public Adherents getAdherent() {
        return adherent;
    }
    public void setAdherent(Adherents adherent) {
        this.adherent = adherent;
    }
    public Document getDocument() {
        return document;
    }
    public void setDocument(Document document) {
        this.document = document;
    }
    @Override
    public String toString() {
        return "dateEmprunt: " + dateEmprunt + " adherent: " + adherent + " document: " + document;
    }
    
}
