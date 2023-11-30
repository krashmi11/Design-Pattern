public class Main {
    public static void main(String[] args) {
        Collegues c1 = new col1();
        Collegues c2 = new col2();
        Mediator med = new med1();
        med.Notify();
        med.add(c1);
        med.add(c2);
        c1.send("hello", med);
    }
}
