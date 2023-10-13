public class Employe {
    protected int identifiant, nbr_heures;
    protected String nomemp, adresse;

    public Employe() {
    }

    public Employe(int identifiant, int nbr_heures, String nomemp, String adresse) {
        this.identifiant = identifiant;
        this.nbr_heures = nbr_heures;
        this.nomemp = nomemp;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nbr_heures=" + nbr_heures +
                ", nomemp='" + nomemp + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
