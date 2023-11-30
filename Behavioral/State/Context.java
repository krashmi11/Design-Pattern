public class Context {
    State s;

    void setState(State s) {
        this.s = s;
    }

    void work() {
        System.out.println("Starts setting....");
        s.checkState();
    }
}
