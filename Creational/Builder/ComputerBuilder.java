public class ComputerBuilder {
    public int RAM;
    public String OS;
    public double size;

    // optional parameters
    public boolean isgraphics;
    public boolean isBluetooth;

    public ComputerBuilder(int rAM, String oS, double size) {
        RAM = rAM;
        OS = oS;
        this.size = size;
    }

    public ComputerBuilder setIsgraphics(boolean isgraphics) {
        this.isgraphics = isgraphics;
        return this;
    }

    public ComputerBuilder setBluetooth(boolean isBluetooth) {
        this.isBluetooth = isBluetooth;
        return this;
    }

    public computer Build() {
        return new computer(this);
    }

}
