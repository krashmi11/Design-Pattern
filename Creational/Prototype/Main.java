public class Main {
    public static void main(String[] args) {
        Prototype e1, e2, s1, s2;
        e1 = new Enemy(5.0);
        e2 = new Enemy(3.0);
        s1 = new Soldier("Heavy Weapon Speacialist", "Heavy Machine Gun");
        s2 = new Soldier("Sniper", "Sniper rifle");
        e1.getclone();
        e1.getclone();
        e1.getclone();

        e2.getclone();
        e2.getclone();

        s1.getclone();
        s1.getclone();
        s1.getclone();

        s2.getclone();
        s2.getclone();
        s2.getclone();

    }
}
