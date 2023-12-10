public class Main {
    public static void main(String[] args) {
        Observor binary = new Binary();
        Observor Hexa = new Hexa();
        Observor octal = new Octal();
        Subject s = new Subject();
        s.add(binary);
        s.add(Hexa);
        s.add(octal);
        s.seti(3);
        s.seti(4);
    }
}
