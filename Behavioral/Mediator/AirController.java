import java.util.ArrayList;

public class AirController implements Mediator {
    ArrayList<Flight> al = new ArrayList<>();

    public AirController() {
        al = new ArrayList<>();
    }

    public void addFlight(Flight f) {
        al.add(f);
    }

    @Override
    public void send(String msg, Flight f) {
        for (Flight fl : al) {
            if (fl != f) {
                fl.receive(msg);
            }
        }
    }

}
