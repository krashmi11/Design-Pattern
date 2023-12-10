public class Flight1 extends Flight {

    Flight1(Mediator m) {
        super(m);

    }

    @Override
    public void send(String msg) {
        m.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Flight1:" + msg);
    }

}
