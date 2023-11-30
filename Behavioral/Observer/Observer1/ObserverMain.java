public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject s1 = new ConcreteSubject();
        Observor ob1 = new ob1();
        Observor ob2 = new ob2();
        s1.addObservor(ob1);
        s1.addObservor(ob2);
        s1.payAmount(500);
    }
}
