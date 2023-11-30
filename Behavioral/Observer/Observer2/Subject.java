import java.util.ArrayList;

public class Subject {
    int i;
    ArrayList<Observor> al = new ArrayList<Observor>();

    void add(Observor o) {
        al.add(o);
    }

    void seti(int i) {
        this.i = i;
        this.Notify();
    }

    void Notify() {
        for (Observor o : al) {
            o.convert(i);
        }
    }
}
