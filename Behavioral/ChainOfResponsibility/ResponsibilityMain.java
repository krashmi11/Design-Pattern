public class ResponsibilityMain {
    public static void main(String[] args) {
        Authentication auth = new Authentication("Criminal record");
        Validator av = new aadharVerifier();
        Validator ic = new incomeVerifier();
        av.setValidator(ic);
        ic.setValidator(new recordVerifier());
        av.verify(auth);
        auth = new Authentication("pan");
        av.verify(auth);
    }

}
