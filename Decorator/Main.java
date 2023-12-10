public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.getShape();

        Shape redrect = new Colordecorator(rect);
        redrect.getShape();

        Shape borderShape = new Borderdecorator(rect);
        borderShape.getShape();
    }
}
