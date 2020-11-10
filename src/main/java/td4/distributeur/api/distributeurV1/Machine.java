package td4.distributeur.api.distributeurV1;

public class Machine {
    private int fund;
    private MachineEtat state;


    public Machine() {
        this.fund = 0;
        this.state = AskState.getInstance();
    }

    void setState(MachineEtat state) {
        this.state = state;
    }

    int fund() {
        return fund;
    }

    void addFund(int n) {
        fund += n;
    }

    public void give(int n) {
        state.give(this, n);
    }

    public void askCoffee() {
        state.askCoffee(this);
    }

    public void askTee() {
        state.askTea(this);
    }

    void resetFund() {
        fund = 0;
    }
}