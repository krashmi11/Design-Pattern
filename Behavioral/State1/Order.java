public class Order {
    State s;

    Order() {
        this.s = new NewState();
    }

    public void setState(State s) {
        this.s = s;
    }

    public void process() {
        s.change_state(this);
    }

}
