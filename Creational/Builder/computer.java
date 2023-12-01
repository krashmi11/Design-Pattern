public class computer {
    private int RAM = 8;
    private String OS = "Windows";
    private double size = 15.7;

    // optional parameters
    private boolean isgraphics;
    private boolean isBluetooth;

    public computer(ComputerBuilder cb) {
        this.RAM = cb.RAM;
        this.OS = cb.OS;
        this.size = cb.size;
        this.isgraphics = cb.isgraphics;
        this.isBluetooth = cb.isBluetooth;
    }

    public int getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public double getSize() {
        return size;
    }

    public boolean isIsgraphics() {
        return isgraphics;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    @Override
    public String toString() {
        return "computer [RAM=" + RAM + ", OS=" + OS + ", size=" + size + ", isgraphics=" + isgraphics
                + ", isBluetooth=" + isBluetooth + "]";
    }

}