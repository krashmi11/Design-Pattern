public class Main {
    public static void main(String[] args) {
        
        Log l1 = Log.getInstance();
        l1.getLogRecord("Application Started");
        l1.getLogRecord("Log record added");
        l1.getLogRecord("Error occured");

        Log l2 = Log.getInstance();
        l2.getLogRecord("Restarted again");
        l2.getLogRecord("Added successfully");

        System.out.println(l1.hashCode() + " " + l2.hashCode());
    }
}
