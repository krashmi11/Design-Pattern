public class Bike extends Vehicle {

    Bike(Manufacturer man) {
        super(man);
    }

    @Override
    void type() {
        System.out.println("Vehicle is Bike");
        man.manufacture();
    }

}
