package td4.distributeur.client;

import td4.distributeur.api.distributeurV2.Machine;

public class Distributeur {
    public static void main(String[] args) {
        Machine m = new Machine(); // on est initialement en AmpouleEteinte
        m.askCoffee(); // pas possible
        m.give(5); // c = 5
        m.askCoffee();// pas possible
        m.give(10); // c = 15
        m.askCoffee(); // ok
        m.getRefund(); // 5
        m.getRefund(); // 0
    }

}
