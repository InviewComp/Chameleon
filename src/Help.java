import static java.lang.System.out;

public class Help {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    Help(){
        out.println(ANSI_YELLOW+"HELP");
      out.println("/help-вывод списка команд");
      out.println("/exit - выход из консоли"+ANSI_GREEN);
    }
}
