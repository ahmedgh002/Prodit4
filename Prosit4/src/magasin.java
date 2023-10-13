import java.util.Date;

public class magasin {
    int identifiant;
    String adresse;
    String nom_magasin;
    final int capacite = 50;
    final int capacite2 = 20;
    Produit[] tabproduit = new Produit[capacite];
    Employe[] tabemp = new Employe[capacite2];
    int numprod = 0;
    int numemp = 0;

    public magasin() {
    }

    public magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }

    public magasin(int identifiant, String nom_magasin, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.nom_magasin = nom_magasin;
    }

    public void ajouter(Produit produit) {
        if (numprod < capacite) {
            tabproduit[numprod] = produit;
            numprod++;
            System.out.println("Produit ajouté");
        } else {
            System.out.println("Capacité maximale de produits atteinte.");
        }
    }

    public void ajoutcaissier(Caissier caissier) {
        if (numemp < capacite2) {
            tabemp[numemp] = caissier;
            numemp++;
            System.out.println("Caissier ajouté");
        } else {
            System.out.println("Capacité maximale d'employés atteinte.");
        }
    }

    public void ajoutvendeur(Vendeur vendeur) {
        if (numemp < capacite2) {
            tabemp[numemp] = vendeur;
            numemp++;
            System.out.println("Vendeur ajouté");
        } else {
            System.out.println("Capacité maximale d'employés atteinte.");
        }
    }

    public void ajoutresponsable(Responsable responsable) {
        if (numemp < capacite2) {
            tabemp[numemp] = responsable;
            numemp++;
            System.out.println("Responsable ajouté");
        } else {
            System.out.println("Capacité maximale d'employés atteinte.");
        }
    }

    public boolean chercher(Produit P) {
        for (int i = 0; i < numprod; i++) {
            if (tabproduit[i].comparerprod(P))
                return true;
        }
        return false;
    }

    public void supprimer(Produit produit) {
        for (int i = 0; i < numprod; i++) {
            if (chercher(produit)) {
                tabproduit[i] = tabproduit[numprod - 1];
                tabproduit[numprod - 1] = null;
                numprod--;
                System.out.println("Produit supprimé");
                break;
            }
        }
    }

    public String comparermagsin(magasin M1, magasin M2) {
        if (M1.numprod > M2.numprod)
            return (M1.toString());
        else {
            return (M2.toString());
        }
    }

    @Override
    public String toString() {
        return "magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + numprod +
                '}';
    }

    public void afficher() {
        System.out.println("Les Produits du magasin :");
        for (int i = 0; i < numprod; i++) {
            tabproduit[i].afficher();
        }
    }
}
