public class Main {
    public static void main(String[] args) {
        Manufacturer m = new assemble();
        Vehicle bike = new Bike(m);
        bike.type();
        Manufacturer m1 = new deassemble();
        Vehicle car = new Car(m1);
        car.type();
    }
}
