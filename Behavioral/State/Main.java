public class Main {
    public static void main(String[] args) {
        Context c = new Context();
        Checker check = new Checker(45.7, "high");
        c.setState(check.check());
        c.work();
    }
}
