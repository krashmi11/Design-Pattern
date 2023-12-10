public class ComputerBuilder {
    public int RAM;
    public String OS;
    public double size;

    public ComputerBuilder setRam(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setOs(String OS) {
        this.OS = OS;
        return this;
    }

    public ComputerBuilder setSIze(double size) {
        this.size = size;
        return this;
    }

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
