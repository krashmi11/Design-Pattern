package items;

public class LargeChicken extends NonVeg {

    @Override
    public String getName() {
        return "LargeChicken";
    }

    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String getSize() {
        return "Large";
    }

}
