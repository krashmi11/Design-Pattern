public class Main {
    public static void main(String[] args) {
        employee CEO = new Leaf("John", 101, "CEO");
        employee Manager = new Leaf("Rohan", 102, "Manager");
        employee eng1 = new Leaf("Rakul", 103, "Engineer");
        employee clerk1 = new Leaf("Clerk1", 104, "Clerk1");
        employee clerk2 = new Leaf("Clerk2", 105, "Clerk2");

        employee ceoteam = new Composite();
        ceoteam.addEmployee(CEO);
        ceoteam.addEmployee(Manager);
        ceoteam.addEmployee(eng1);

        employee managerteam = new Composite();
        managerteam.addEmployee(Manager);
        managerteam.addEmployee(clerk1);
        managerteam.addEmployee(clerk2);

        System.out.println("Engineer Details:");
        eng1.showemployee();

        ceoteam.showemployee();
        managerteam.showemployee();
    }
}
