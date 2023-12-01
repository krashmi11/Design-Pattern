public class ShapeFactory extends Factory {
    Shape getshape(String s) {
        if (s.equals("Square")) {
            return new square();
        } else if (s.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

}
