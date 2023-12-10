public class NewState implements State {

    @Override
    public void change_state(Order ord) {
        System.out.println("New order is there....");
        ord.setState(new Shipped());

    }

}
