import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Test film 1
        Film film1 = new Film(1, "Asterix & Obelix", 2020,false, "Guillaume Canet", 1,"Comedy");
        System.out.println(film1.getTitre());
        System.out.println(film1.getRéalisateur());
        System.out.println(film1.getDuree());
        System.out.println(film1.getGenre());
        //Test film 2
        Film film2 = new Film(2, "300", 2006,false, "Zack Snyder", 1, "Action");
        System.out.println(film2.getTitre());
        System.out.println(film2.getRéalisateur());
        System.out.println(film2.getDuree());
        System.out.println(film2.getGenre());
        //Test livre
        Livre livre1 = new Livre(2,"Harry Potter and the philosopher's Stone", 2004, false, "J.K. Rowling", 1000, "Aventure");
        System.out.println(livre1.getTitre());
        System.out.println(livre1.getAuteur());
        System.out.println(livre1.getNombreDePages());
        System.out.println(livre1.getGenre());
        //Test bandeDessinee
        BandeDessinee bandeDessinee1 = new BandeDessinee(1, "Jojo's Bizarre adventure", 2005, false, "Hirohiko Araki", 100);
        System.out.println(bandeDessinee1.getTitre());
        System.out.println(bandeDessinee1.getDateSortie());
        System.out.println(bandeDessinee1.getdessinateur());
        System.out.println(bandeDessinee1.getNombreDePages());
        
        //Test adherents
        Adherents adherents1 = new Adherents(1, "Jean-Christophe", "Dominguez", "20 rue du Java");
        System.out.println(adherents1.getNom());
        System.out.println(adherents1.getPrenom());
        System.out.println(adherents1.getAdresse());

        Mediatheque mediatheque1 = new Mediatheque();
        mediatheque1.ajouterDocument(film1);
        mediatheque1.ajouterDocument(film2);
        mediatheque1.ajouterDocument(livre1);
        mediatheque1.ajouterDocument(bandeDessinee1);
        mediatheque1.ajouterAdherent(adherents1);
        //test recherche adherent
        System.out.println(mediatheque1.rechercheAdherent("Jean-Christophe", "Dominguez")); ;
        //test recherche film
        System.out.println(mediatheque1.recherche("300"));

        // Je teste les emprunts
        Emprunts emprunts1 = new Emprunts(new Date(), adherents1, film1); ;
        System.out.println(emprunts1.getDateEmprunt());
        mediatheque1.ajouterEmprunt(emprunts1);
        System.out.println(mediatheque1.rechercheEmprunt(adherents1, film1));

    }
}
