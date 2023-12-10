public class Flight2 extends Flight {
    Flight2(Mediator m) {
        super(m);

    }

    @Override
    public void send(String msg) {
        m.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Flight2:" + msg);
    }
}
