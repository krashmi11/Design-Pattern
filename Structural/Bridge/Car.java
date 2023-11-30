public class Car extends Vehicle {

    Car(Manufacturer man) {
        super(man);
    }

    @Override
    void type() {
        System.out.println("Vehicle is Car");
        man.manufacture();
    }

}
