import java.util.ArrayList;
import java.util.List;

public interface Mediator {
    void Notify();

    List<Collegues> col = new ArrayList<>();

    void add(Collegues c);
}