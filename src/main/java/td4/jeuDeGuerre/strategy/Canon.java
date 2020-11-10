package td4.jeuDeGuerre.strategy;

import td4.jeuDeGuerre.strategy.Attaque;

public class Canon implements Attaque {
    @Override
    public String attaquer() {
        return "au canon! BOOM!";
    }
}
