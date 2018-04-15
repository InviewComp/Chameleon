import static java.lang.System.out;

public class MorzeInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    MorzeInfo(){
        out.println(ANSI_YELLOW+" Код Мо́рзе — способ знакового кодирования, представление букв алфавита, цифр, знаков препинания и других символов последовательностью сигналов: длинных («тире») и коротких («точек»)."+ANSI_GREEN);
    }
}
