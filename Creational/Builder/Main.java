public class Main {
    public static void main(String[] args) {
        computer cb = new ComputerBuilder(24, "Linux", 13).setBluetooth(true).setIsgraphics(true).setOs("Windows")
                .Build();
        System.out.println(cb);
    }
}
