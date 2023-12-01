public class Main {
    public static void main(String[] args) {
        ItemBuilder m = new ItemBuilder();
        Itemlist il = m.itembuid();
        il.showList();
        System.out.println("Total cost:" + il.TotalCost());
    }
}
