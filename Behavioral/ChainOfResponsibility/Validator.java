public abstract class Validator {
    Validator nexValidator;

    public void setValidator(Validator nexValidator) {
        this.nexValidator = nexValidator;
    }

    public abstract void verify(Authentication a);
}
