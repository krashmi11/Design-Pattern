public abstract class Template {
    // Hook method
    void initialize() {
        System.out.println("Game is defined");
        System.out.println("Company name");
    }

    // primitive method
    abstract void startPlay();

    abstract void endPlay();

    // Template method
    void play() {
        initialize();
        startPlay();
        endPlay();
    }
}