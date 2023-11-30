public class Checker extends AirCond {

    Checker(double temp, String humidity) {
        super(temp, humidity);
    }

    State check() {
        if (this.temp >= 35 && this.humidity.equals("high")) {
            return new Cool();
        } else if ((this.temp < 35 && this.temp >= 25) && this.humidity.equals("medium")) {
            return new Warm();
        }
        return new High();
    }

}
