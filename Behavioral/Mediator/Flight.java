public abstract class Flight {
    Mediator m;

    Flight(Mediator m) {
        this.m = m;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
