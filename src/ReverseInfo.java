import static java.lang.System.out;

public class ReverseInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    ReverseInfo(){
        out.println(ANSI_YELLOW+"Реверс-отображения строки задом наперед"+ANSI_GREEN);
    }
}
