public class Singleton {
    protected int roll;
    protected String name;

    private static Singleton singleton;

    protected Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null)
            return (singleton = new Singleton());
        else
            return singleton;
    }

    final public void setInstance(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    final public String toString() {
        return "Singleton [roll=" + roll + ", name=" + name + "]";
    }

}