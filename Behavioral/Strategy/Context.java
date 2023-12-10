public class Context {
    private Travel travel;

    public Context(Travel travel) {
        this.travel = travel;
    }

    public void start() {
        this.travel.do_travel();
    }
}
