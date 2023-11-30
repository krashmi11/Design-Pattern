public class med1 implements Mediator {

    @Override
    public void Notify() {
        System.out.println("Notified");
    }

    @Override
    public void add(Collegues c) {
        col.add(c);
    }

}
