package td4.jeuDeGuerre.client;

import td4.jeuDeGuerre.strategy.*;

import java.util.List;

public class Jeu {
    public static void main(String[] args) {
        List<Unite> unites = List.of(
                new Soldat("Brian", new LanceFlamme(), new Courir()),
                new Soldat("Toby", new Mitraillette(), new Courir()),
                new Helicoptere("H120 ", new Missile(), new Voler()),
                new Char("Vickers Mark E", new Canon(), new Rouler())
        );

        for (Unite u : unites ) {
            System.out.println(u.seDeplacer() + " "+ u.combattre());
        }

    }
}
