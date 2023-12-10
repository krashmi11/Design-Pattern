public class Delivered implements State {

    @Override
    public void change_state(Order ord) {
        System.out.println("Order delivered...");
    }

}
