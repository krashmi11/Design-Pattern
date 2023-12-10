public class Log {
    private static Log log;

    private Log() {
    }

    public static Log getInstance() {
        if (log == null) {
            log = new Log();
        }
        return log;
    }

    public void getLogRecord(String msg) {
        System.out.println(msg);
    }
}
