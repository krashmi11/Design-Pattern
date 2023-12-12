public class subclass2 extends Singleton {
    private static subclass2 sub2;

    public static subclass2 getInstance() {
        if (sub2 == null)
            return (sub2 = new subclass2());
        else
            return sub2;
    }
}
