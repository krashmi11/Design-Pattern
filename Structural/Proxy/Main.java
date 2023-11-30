public class Main {
    public static void main(String[] args) {
        Internet proxy = new InternetProxy();
        proxy.connect("www.gfg.in");
        proxy.connect("abc.co.in");
    }
}
