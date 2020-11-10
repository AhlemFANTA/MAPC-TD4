package td4.jeuDeGuerre.strategy;

import td4.jeuDeGuerre.strategy.Deplacement;

public class Rouler implements Deplacement {
    @Override
    public String deplacer() {
        return "Je roule...";
    }
}
