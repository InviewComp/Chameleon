import static java.lang.System.out;

public class TranspositionInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    TranspositionInfo(){
        out.println(ANSI_YELLOW+"hello with transposition"+ANSI_GREEN);
    }
}
