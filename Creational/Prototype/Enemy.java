public class Enemy implements Prototype {

    double level;

    public Enemy(double level) {
        this.level = level;
    }

    @Override
    public Prototype getclone() {
        Enemy e = new Enemy(level);
        showInfo();
        return e;
    }

    @Override
    public void showInfo() {
        System.out.println("Enemy created..");
        System.out.println("Enemy with threat level:" + level);
        System.out.println("\n");

    }

}
