package td4.jeuDeGuerre.strategy;

import td4.jeuDeGuerre.strategy.Attaque;

public class Missile implements Attaque {
    @Override
    public String attaquer() {
        return "avec un missile. LARGUER BOMBE!!!";
    }
}
