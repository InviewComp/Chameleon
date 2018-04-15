import static java.lang.System.out;

public class TranspositionInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    TranspositionInfo(){
        out.println(ANSI_YELLOW+"Шифр перестано́вки — это метод симметричного шифрования, в котором элементы исходного открытого текста меняют местами. \n" +
                "Элементами текста могут быть отдельные символы (самый распространённый случай), пары букв, тройки букв, комбинирование этих случаев и так далее. \n" +
                " Типичными примерами перестановки являются анаграммы.\n"+ANSI_GREEN);
    }
}
