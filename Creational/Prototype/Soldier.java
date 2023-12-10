public class Soldier implements Prototype {

    String type;
    String weapon;

    Soldier(String type, String weapon) {
        this.type = type;
        this.weapon = weapon;
    }

    @Override
    public Prototype getclone() {
        Soldier s = new Soldier(type, weapon);
        showInfo();
        return s;
    }

    @Override
    public void showInfo() {
        System.out.println("Soldier Created for fight");
        System.out.println("Soldier of type " + this.type + " with weapon " + this.weapon);
        System.out.println("\n");

    }

}
