//indispensable à java pour créer des listes
import java.util.ArrayList;

public class Mediatheque{
    private ArrayList<Document> documents = new ArrayList<>();

    // Pour ajouter un document dans ma liste documents
    public void ajouterDocument(Document document){
        documents.add(document);
    }
// pour chaque document dans ma liste documents, prendre chaque document et vérifie la compatibilité
    public Document recherche (String titre){
        for(Document document : documents){
            if(document.getTitre().equals(titre)){
                return document;
            }
        }
        return null;
    }

    // ma liste des adherents
    private ArrayList<Adherents> adherents = new ArrayList<>();
    // méthode pour ajouter un adherent dans ma liste adherents
    public void ajouterAdherent(Adherents adherent){
        adherents.add(adherent);
    }
    // pour chaque adherent dans ma liste adherents, prendre chaque adherent et vérifie la compatibilité
    public Adherents rechercheAdherent(String nom, String prenom){
        for(Adherents adherent : adherents){
            if(adherent.getNom().equals(nom) && adherent.getPrenom().equals(prenom)){
                return adherent;
            }
        }
        return null;
    }
    // la liste des emprunts
    private ArrayList<Emprunts> emprunts = new ArrayList<>();
    // méthode pour ajouter un emprunts dans ma liste emprunts
    public void ajouterEmprunt(Emprunts emprunt) {
        Document document = emprunt.getDocument();
        if (!document.getStatut()) {
            emprunts.add(emprunt);
            document.setStatut(true); // Marque le document comme emprunté après l'ajout de l'emprunt
        } else {
            System.out.println("Ce document est déjà emprunté.");
        }
    }
    


    // pour chaque emprunt dans ma liste emprunts, prendre chaque emprunt jusqu'a trouver le même
    public Emprunts rechercheEmprunt(Adherents adherent, Document document){
        for(Emprunts emprunt : emprunts){
            if(emprunt.getAdherent().equals(adherent) && emprunt.getDocument().equals(document)){
                return emprunt;
            }
        }
        return null;
    }
    // méthode pour mettre fin à un emprunt
    public void retourEmprunt(Emprunts emprunt){
        emprunts.remove(emprunt);
    }
}


  