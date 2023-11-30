public class IteratorMain {
    public static void main(String[] args) {
        Container c = new ChannelRepo();
        Iterator c1 = c.getIterator();
        while (c1.hasNext()) {
            System.out.println(c1.next().toString());
        }
    }
}
