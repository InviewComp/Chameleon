import static java.lang.System.out;

public class ReverseInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    ReverseInfo(){
        out.println(ANSI_YELLOW+"hello with reverse"+ANSI_GREEN);
    }
}
