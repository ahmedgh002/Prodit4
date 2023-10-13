public class Vendeur extends Employe {
    protected int tauxDeVente;

    public Vendeur() {
    }

    public Vendeur(int identifiant, int nbr_heures, String nomemp, String adresse, int tauxDeVente) {
        super(identifiant, nbr_heures, nomemp, adresse);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                ", identifiant=" + identifiant +
                ", nbr_heures=" + nbr_heures +
                ", nomemp='" + nomemp + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
