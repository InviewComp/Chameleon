import static java.lang.System.out;

public class CaesarInfo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    CaesarInfo(){
        out.println(ANSI_YELLOW+"Шифр Цезаря — это вид шифра подстановки, в котором каждый символ в открытом тексте заменяется символом, находящимся на некотором постоянном числе позиций левее или правее него в алфавите. \n" +
                "Например, в шифре со сдвигом вправо на 3, А была бы заменена на Г, Б станет Д, и так далее. \n"+ANSI_GREEN);
    }
}
