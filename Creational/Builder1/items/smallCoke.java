package items;

public class smallCoke extends Coke {

    @Override
    public String getName() {
        return "Small Coke";
    }

    @Override
    public String getSize() {
        return "small";
    }

    @Override
    public double getPrice() {
        return 10;
    }

}
