public class Main {

    public static Expression getAnswer() {
        Expression exp1 = new TerminalEXpression("Rashmi");
        Expression exp2 = new TerminalEXpression("Rashmi is mine");
        return new AndExpression(exp1, exp2);
    }

    public static void main(String[] args) {
        Expression and = getAnswer();
        boolean ans = and.interpret("Rashmi");
        System.out.println(ans);
    }

}
