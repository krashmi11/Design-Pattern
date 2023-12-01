public class PenFactory {
    Pen getPen(String p) {
        if (p.equals("GelPen")) {
            return new GelPen();
        } else if (p.equals("SketchPen")) {
            return new SketchPen();
        }
        return null;
    }
}
