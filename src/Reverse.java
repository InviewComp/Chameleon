import java.util.Scanner;

import static java.lang.System.out;

public class Reverse{
    public static final String ANSI_GREEN = "\u001B[32m";
    private void print_dot(int n) throws InterruptedException {

        //процедура красивого вывода точкек

        for (int i=0;i<n;i++){
            Thread.sleep(500);
            out.print('.');
        }
        System.out.println();
    }
    Reverse() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Введите текст для шифрования:");
        String q = in.nextLine();
        out.print("Обработка текста");
        print_dot(3);
        out.println("Шифрование завершено: ");
        for (int i = q.length() - 1; i >= 0; i--) {
            System.out.print(q.charAt(i));
        }
        System.out.println();
    }

}
