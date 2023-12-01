package items;

import java.util.ArrayList;

public class Itemlist {
    ArrayList<Items> itemlist = new ArrayList<Items>();

    void addItems(Items item) {
        itemlist.add(item);
    }

    void showList() {
        for (Items a : itemlist) {
            System.out.println(a.getName());
            System.out.println(a.getSize());
            System.out.println(a.getPrice());
        }
    }

    double TotalCost() {
        double total = 0;
        for (Items a : itemlist) {
            total += a.getPrice();
        }
        return total;
    }
}
