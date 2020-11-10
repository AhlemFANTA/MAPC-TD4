package td4.distributeur.api.distributeurV1;

public class GiveState implements MachineEtat{
    private static GiveState instance;

    private GiveState() {}

    public static GiveState getInstance() {
        if(instance == null) {
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
        m.resetFund();
        m.setState(AskState.getInstance());
    }

    @Override
    public void askTea(Machine m) {
        System.out.println("ok => Tea");
        m.resetFund();
        m.setState(AskState.getInstance());
    }
}