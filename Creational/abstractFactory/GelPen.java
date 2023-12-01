public class GelPen implements Pen {
    Tube t;
    Refill r;

    @Override
    public Refill getRefill() {
        Refill x = new Plastic();
        x.refillType();
        return x;

    }

    @Override
    public Tube getTube() {
        Tube x = new Metal();
        x.tubeType();
        return x;
    }

    @Override
    public Pen createPen() {
        this.t = this.getTube();
        this.r = this.getRefill();
        System.out.println("Gel Pen creted");
        return this;
    }

}
