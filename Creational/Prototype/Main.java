public class Main {
    public static void main(String[] args) {
        Prototype p1;
        p1 = new Student("Rashmi", 11, 9.83, "6883784");
        p1.showRecord();
        Prototype s = p1.getclone();
        s.showRecord();

    }
}