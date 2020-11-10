package td4.distributeur.api.distributeurV2;

public class GiveState implements MachineState {
    private static GiveState instance;

    private GiveState() {
    }

    public static GiveState getInstance() {
        if (instance == null) {
            instance = new GiveState();
        }
        return instance;
    }

    @Override
    public void give(Machine m, int n) {
        System.out.printf("fund = %d%n", m.fund());
    }

    @Override
    public void askCoffee(Machine m) {
        System.out.println("ok => coffee");
        m.decreaseFund();
        m.setState(Refund.getInstance());
    }

    @Override
    public void askTee(Machine m) {
        System.out.println("ok => Tea");
        m.decreaseFund();
        m.setState(Refund.getInstance());
    }

    @Override
    public void getRefund(Machine m) {
        m.resetFund();
        m.setState(AskState.getInstance());
    }
}