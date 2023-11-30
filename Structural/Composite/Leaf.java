public class Leaf implements employee {
    String name;
    int emp_id;
    String desig;

    Leaf(String name, int emp_id, String desig) {
        this.name = name;
        this.emp_id = emp_id;
        this.desig = desig;
    }

    @Override
    public void showemployee() {
        System.out.println(name + " " + emp_id + " " + desig);
    }

    @Override
    public void addEmployee(employee cEO) {

    }

}
