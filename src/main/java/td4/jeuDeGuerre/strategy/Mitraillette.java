package td4.jeuDeGuerre.strategy;

import td4.jeuDeGuerre.strategy.Attaque;

public class Mitraillette implements Attaque {
    @Override
    public String attaquer() {
        return "au mitraillette. Je Mitraille tout!";
    }
}
