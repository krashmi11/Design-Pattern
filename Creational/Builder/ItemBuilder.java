public class ItemBuilder {
    Itemlist itembuid() {
        Itemlist orderItemlist = new Itemlist();
        orderItemlist.addItems(new LargeCheeze());
        orderItemlist.addItems(new SmallChiken());
        orderItemlist.addItems(new smallCoke());

        return orderItemlist;
    }
}
