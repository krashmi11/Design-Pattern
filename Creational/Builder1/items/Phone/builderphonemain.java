public class builderphonemain {

    public static void main(String[] args) {
        Phone p;// =new Phone(/*"Android",1,5*/); Incorrect
        // System.out.println(p);

        System.out.println("Windows");
        PhoneBuilder x = new PhoneBuilder();
        p = x.setOS("Windows").setRAM(6).setOS("iOS").setRAM(8).build();
        System.out.println(p);

        p = x.setOS("Windows").setRAM(8).build();
        System.out.println(p);

    }
}
