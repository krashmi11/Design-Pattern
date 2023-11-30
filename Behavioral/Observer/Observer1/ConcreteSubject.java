import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements subject {

    List<Observor> observors = new ArrayList<>();
    Payment p = new Payment();
    boolean status = false;

    @Override
    public void addObservor(Observor obs) {
        observors.add(obs);
    }

    void payAmount(int amount) {
        if (p.pay(amount)) {
            this.status = true;
        }
        if (status == true)
            Notify();
    }

    void Notify() {
        for (Observor o : observors) {
            boolean s = o.Display();
            if (s == true) {
                System.out.println("CAFE is notified to start working " + o.hashCode());
            }
        }
    }

}
