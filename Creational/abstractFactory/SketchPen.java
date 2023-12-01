public class SketchPen implements Pen {
    Tube t;
    Refill r;

    @Override
    public Refill getRefill() {
        Refill r = new Sponge();
        r.refillType();
        return r;

    }

    @Override
    public Tube getTube() {
        Tube t = new Fibre();
        t.tubeType();
        return t;
    }

    @Override
    public Pen createPen() {
        this.r = getRefill();
        this.t = getTube();
        System.out.println("Sketch Pen creted");
        return this;
    }
}
