class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("Setting state to " + state);
        this.state = state;
    }

    public Memento save() {
        System.out.println("Saving to Memento.");
        return new Memento(state);
    }

    public void restore(Memento m) {
        state = m.getState();
        System.out.println("State after restoring from Memento: " + state);
    }
}