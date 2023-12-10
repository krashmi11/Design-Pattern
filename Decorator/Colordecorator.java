public class Colordecorator extends ShapeDecorator {

    Colordecorator(Shape decoShape) {
        super(decoShape);
    }

    @Override
    public void getShape() {
        decoShape.getShape();
        setColorDecorator();
    }

    public void setColorDecorator() {
        System.out.println("Red colour setted properly.");
    }

}
