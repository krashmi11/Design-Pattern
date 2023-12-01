public class Factorymain {
    public static void main(String Args[]) {
        ShapeFactory sf = new ShapeFactory();
        Shape s = sf.getshape("Square");
        s.draw();
    }
}
