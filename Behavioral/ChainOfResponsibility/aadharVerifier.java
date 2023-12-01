public class aadharVerifier extends Validator {

    @Override
    public void verify(Authentication auth) {
        if (auth.info.equals("aadhar")) {
            System.out.println("Authenticated by Aadhar verifier...");
        } else {
            if (nexValidator != null) {
                nexValidator.verify(auth);
            }
        }
    }

}
