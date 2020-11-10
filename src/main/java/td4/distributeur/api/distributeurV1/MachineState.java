package td4.distributeur.api.distributeurV1;

public interface MachineState {
    void give(Machine m, int n);
    void askCoffee(Machine m);
    void askTea(Machine m);
}
