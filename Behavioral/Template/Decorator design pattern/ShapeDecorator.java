public abstract class ShapeDecorator implements Shape {
    Shape decoShape;

    ShapeDecorator(Shape decoShape) {
        this.decoShape = decoShape;
    }

}
