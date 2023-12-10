public class Shipped implements State {

    @Override
    public void change_state(Order ord) {
        System.out.println("Order is ready to shipped...");
        ord.setState(new Delivered());
    }

}
