package td4.distributeur.api.distributeurV2;

public class AskState implements MachineState {
    private static AskState instance;

    private AskState() {
    }

    public static AskState getInstance() {
        if (instance == null) {
            instance = new AskState();
        }
        return instance;
    }

    @Override
    public void give(Machine m, int n) {
        m.increaseFund(n);
        if (m.fund() >= 10) {
            m.setState(GiveState.getInstance());
        }
        System.out.printf("fund = %d%n", m.fund());
    }

    @Override
    public void askCoffee(Machine m) {
        System.out.println("pas possible");
    }

    @Override
    public void askTee(Machine m) {
        System.out.println("pas possible");
    }

    @Override
    public void getRefund(Machine m) {
        m.resetFund();
    }
}

