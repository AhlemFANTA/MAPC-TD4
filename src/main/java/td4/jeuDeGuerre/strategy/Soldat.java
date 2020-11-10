package td4.jeuDeGuerre.strategy;

public class Soldat implements Unite {

    private Attaque attaque;
    private Deplacement deplacement;
    private String nom;

    public Soldat(String nom, Attaque attaque, Deplacement deplacement) {
        this.nom = nom;
        this.attaque = attaque;
        this.deplacement = deplacement;
    }

    @Override
    public String seDeplacer() {
        return "Soldat " + nom + "::: " + deplacement.deplacer();
    }

    @Override
    public String combattre() {
        return "J'attaque " + attaque.attaquer();
    }
}
