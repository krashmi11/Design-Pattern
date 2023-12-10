public class Borderdecorator extends ShapeDecorator {

    Borderdecorator(Shape decoShape) {
        super(decoShape);
    }

    @Override
    public void getShape() {
        decoShape.getShape();
        setBorder();
    }

    public void setBorder() {
        System.out.println("Border setted properly");
    }

}
