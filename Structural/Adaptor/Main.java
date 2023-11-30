public class Main {
    public static void main(String[] args) {
        String ext = "VLC";
        String song = "ss";
        Adapter adapter = new Adapter(ext, song);
        adapter.play(ext, song);
    }
}
