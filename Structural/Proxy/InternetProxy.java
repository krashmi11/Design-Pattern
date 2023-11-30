import java.util.ArrayList;

public class InternetProxy implements Internet {

    private static ArrayList<String> al = new ArrayList<String>();
    Internet rl = new RealInternet();
    static {
        al.add("abc.co.in");
        al.add("xyx.co.in");
    }

    @Override
    public void connect(String site) {
        if (al.contains(site)) {
            System.out.println("Access denied");
        } else {
            rl.connect(site);
        }
    }

}
