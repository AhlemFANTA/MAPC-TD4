package td4.jeuDeGuerre.strategy;

import td4.jeuDeGuerre.strategy.Deplacement;

public class Voler implements Deplacement {
    @Override
    public String deplacer() {
        return "Je vole!...";
    }
}
