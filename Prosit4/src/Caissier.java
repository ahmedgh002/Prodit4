public class Caissier extends Employe {
    protected int numeroDeCaisse;

    public Caissier() {
    }

    public Caissier(int identifiant, int nbr_heures, String nomemp, String adresse, int numeroDeCaisse) {
        super(identifiant, nbr_heures, nomemp, adresse);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                ", identifiant=" + identifiant +
                ", nbr_heures=" + nbr_heures +
                ", nomemp='" + nomemp + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
