import static java.lang.System.out;

public class Helpshifr {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    Helpshifr(){
        out.println(ANSI_YELLOW+"HELP");
        out.println("/csr-Шифр Цезаря");
        out.println("/mrz-Морзе");
        out.println("/bnr-Шифр перевод в бинарный вид");
        out.println("/trp-Шифр Перестановки");
        out.println("/rev-Реверс"+ANSI_GREEN);
    }
}
