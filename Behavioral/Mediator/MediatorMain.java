public class MediatorMain {
    public static void main(String[] args) {
        AirController m = new AirController();
        Flight f1 = new Flight1(m);
        Flight f2 = new Flight2(m);

        m.addFlight(f1);
        m.addFlight(f2);

        f1.send("Hello");
        f2.send("How are u?");
    }
}
