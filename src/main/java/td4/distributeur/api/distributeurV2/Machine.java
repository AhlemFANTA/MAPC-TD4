package td4.distributeur.api.distributeurV2;

public class Machine {
    private int fund;
    private MachineState state;


    public Machine() {
        this.fund = 0;
        this.state = AskState.getInstance();
    }

    void setState(MachineState etat) {
        this.state = etat;
    }

    int fund() {
        return fund;
    }

    void increaseFund(int n) {
        fund += n;
    }

    void decreaseFund() {
        fund -= 10;
    }

    public void give(int n) {
        state.give(this, n);
    }

    public void askCoffee() {
        state.askCoffee(this);
    }

    public void askTee() {
        state.askTee(this);
    }

    void resetFund() {
        fund = 0;
    }

    public void getRefund() {
        state.getRefund(this);
    }


}
