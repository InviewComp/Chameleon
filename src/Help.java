import static java.lang.System.out;

public class Help {

    Help(){
        out.println("HELP");
      out.println("/help-вывод списка команд");
        out.println("/enc-запуск машины");
        out.println("В командах шифра:\n" +
                "-e:выход из этого шифра \n" +
                "-s:запуск шифрования \n" +
                "-h:обьяснение шифра \n");
      out.println("/exit - выход из консоли");
    }
}
