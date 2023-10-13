import java.util.Date;

public class Produit {
    private int identifiant;
    private String libellé, marque;
    private float prix;
    private Date dateexpiration;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix > 0)
            this.prix = prix;
        else
            System.out.println("Le prix doit être positif");
    }

    public Date getDateexpiration() {
        return dateexpiration;
    }

    public void setDateexpiration(Date dateexpiration) {
        this.dateexpiration = dateexpiration;
    }

    public Produit() {
    }

    public Produit(int identifiant, String libellé, String marque, float prix, Date dateexpiration) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;
        this.prix = prix;
        this.dateexpiration = dateexpiration;
    }

    public void afficher() {
        System.out.println("Identifiant: " + identifiant + " Libellé: " + libellé + " Marque: " + marque + " Prix: " + prix + " Date d'expiration: " + dateexpiration);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libellé='" + libellé + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateexpiration=" + dateexpiration +
                '}';
    }

    public boolean comparerprod(Produit P) {
        return this.identifiant == P.identifiant && this.libellé.equals(P.libellé) && this.marque.equals(P.marque);
    }
}
