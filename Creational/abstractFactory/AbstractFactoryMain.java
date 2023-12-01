public class AbstractFactoryMain {
    public static void main(String[] args) {
        PenFactory p = new PenFactory();
        Pen pr = p.getPen("SketchPen");
        pr.createPen();
    }
}
