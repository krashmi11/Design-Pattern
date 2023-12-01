public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setInstance(11, "Rashmi");

        System.out.println(singleton);
        subclass sc = subclass.getInstance();
        sc.setInstance(60, "Saurabh");

        subclass sc1 = subclass.getInstance();
        sc1.setInstance(69, "Preet");

        subclass2 sub2 = subclass2.getInstance();
        sub2.setInstance(12, "Nishi");

        System.out.println(sc.hashCode() + " " + sc1.hashCode()); // to check whether both objects are same
        System.out.println(sc1);
        System.out.println(sc);
        System.out.println(sub2);
    }
}
