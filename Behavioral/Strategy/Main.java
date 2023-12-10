public class Main {
    public static void main(String[] args) {
        Context c = new Context(new Bus());
        c.start();
        c = new Context(new Bike());
        c.start();
    }
}
