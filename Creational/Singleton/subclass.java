public class subclass extends Singleton {
    private static subclass sub;

    public static subclass getInstance() {
        if (sub == null)
            return (sub = new subclass());
        else
            return sub;
    }
}
