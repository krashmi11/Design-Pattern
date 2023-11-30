abstract class Vehicle {// abstraction
    Manufacturer man;

    Vehicle(Manufacturer man) {
        this.man = man;
    }

    abstract void type();
}