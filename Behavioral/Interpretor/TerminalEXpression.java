public class TerminalEXpression implements Expression {

    String data;

    TerminalEXpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (data.contains(context))
            return true;
        else
            return false;
    }

}
