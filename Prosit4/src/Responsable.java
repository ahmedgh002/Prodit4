public class Responsable extends Employe {
    protected int prime;

    public Responsable() {
    }

    public Responsable(int identifiant, int nbr_heures, String nomemp, String adresse, int prime) {
        super(identifiant, nbr_heures, nomemp, adresse);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "prime=" + prime +
                ", identifiant=" + identifiant +
                ", nbr_heures=" + nbr_heures +
                ", nomemp='" + nomemp + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
