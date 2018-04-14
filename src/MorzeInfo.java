import static java.lang.System.out;

public class MorzeInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    MorzeInfo(){
        out.println(ANSI_YELLOW+"hello with morze crypt"+ANSI_GREEN);
    }
}
