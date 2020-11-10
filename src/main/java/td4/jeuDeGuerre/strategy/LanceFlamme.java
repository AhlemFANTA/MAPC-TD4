package td4.jeuDeGuerre.strategy;

import td4.jeuDeGuerre.strategy.Attaque;

public class LanceFlamme implements Attaque {
    @Override
    public String attaquer() {
        return "au lance-flamme. BRULER TOUT!!!";
    }
}
