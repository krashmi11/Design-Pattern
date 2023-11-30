import java.util.ArrayList;

public class Composite implements employee {
    ArrayList<employee> al = new ArrayList<employee>();

    public void addEmployee(employee e) {
        al.add(e);
    }

    @Override
    public void showemployee() {
        for (employee e : al) {
            e.showemployee();
        }
    }

}