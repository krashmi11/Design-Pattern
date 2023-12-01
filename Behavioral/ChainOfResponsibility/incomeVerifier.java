public class incomeVerifier extends Validator {

    @Override
    public void verify(Authentication a) {
        if (a.info.equals("income")) {
            System.out.println("Authenticaton done by Income Verifier...");
        } else {
            if (nexValidator != null) {
                nexValidator.verify(a);
            }
        }
    }

}
