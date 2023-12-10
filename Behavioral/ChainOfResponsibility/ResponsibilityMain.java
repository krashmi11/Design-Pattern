public class ResponsibilityMain {
    public static void main(String[] args) {
        Authentication auth = new Authentication("Criminal record");
        Validator av = new aadharVerifier();
        av.verify(auth);

    }

}
