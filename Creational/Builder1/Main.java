public class Main {
    public static void main(String[] args) {
        computer cb = new ComputerBuilder(8, "iOS", 15).setBluetooth(true).setIsgraphics(true).Build();
        System.out.println(cb);
    }
}
