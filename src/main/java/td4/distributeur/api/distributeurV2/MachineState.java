package td4.distributeur.api.distributeurV2;

public interface MachineState {
    void give(Machine m, int n);

    void askCoffee(Machine m);

    void askTee(Machine m);

    void getRefund(Machine m);
}