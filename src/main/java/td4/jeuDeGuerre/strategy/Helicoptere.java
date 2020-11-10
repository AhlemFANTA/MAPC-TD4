package td4.jeuDeGuerre.strategy;

public class Helicoptere implements Unite {
    private Attaque attaque;
    private Deplacement deplacement;
    private String identifiant;

    public Helicoptere(String identifiant, Attaque attaque, Deplacement deplacement) {
        this.identifiant = identifiant;
        this.attaque = attaque;
        this.deplacement = deplacement;
    }

    @Override
    public String seDeplacer() {
        return "Helico " + identifiant + "::: " + deplacement.deplacer();
    }

    @Override
    public String combattre() {
        return "J'attaque " + attaque.attaquer();
    }
}
