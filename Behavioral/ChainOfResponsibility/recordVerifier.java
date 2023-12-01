public class recordVerifier extends Validator {

    @Override
    public void verify(Authentication a) {
        if (a.info.contains("record")) {
            System.out.println("Authenticated by Record Verifier");
        } else {
            System.out.println("Not a valid document forAuthentication");
        }
    }

}
