package td4.distributeur.api.distributeurV2;

public class Refund implements MachineState {
    private static Refund instance;

    private Refund() {
    }

    public static Refund getInstance() {
        if (instance == null) {
            instance = new Refund();
        }
        return instance;
    }

    @Override
    public void give(Machine m, int n) {
    }

    @Override
    public void askCoffee(Machine m) {
    }

    @Override
    public void askTee(Machine m) {
    }

    @Override
    public void getRefund(Machine m) {
        m.resetFund();
        System.out.printf("fund = %d%n", m.fund());
        m.setState(AskState.getInstance());
    }
}
