import java.util.Scanner;
import java.util.StringJoiner;

import static java.lang.System.out;
import static java.lang.System.setOut;
public class Transposition {

    final static int w = 4;
    private static void print_matrix(String s){

        //Функция для отладки

        int len = s.length()/w;
        if (s.length()%4!=0) len+=1;
        char [][]chars = new char[w][len];
        int u = 0;
        for (int i=0;i<w;i++){
            for (int j=0;j<len;j++){
                chars[i][j]=s.toCharArray()[u];
                u++;
                if (u>=s.length()) break;
            }
            if (u>=s.length()) break;
        }
        for (int i=0;i<w;i++){
            for (int j=0;j<len;j++){
                out.print(chars[i][j]);
            }
            out.println();
        }
    }
    public static String shifr(String s){
        int len = s.length()/w;

        //Вычисляем размер сетки

        if (s.length()%4!=0) len+=1;
        char [][]chars = new char[w][len];
        int u = 0;

        //Заносим данные в массив

        for (int i=0;i<w;i++){
            for (int j=0;j<len;j++){
                chars[i][j]=s.toCharArray()[u];
                u++;
                if (u>=s.length()) break;
            }
            if (u>=s.length()) break;
        }

        //Формируем ответ

        String result="";
        for (int i=0;i<len;i++){
            for (int j=0;j<w;j++){
                result+=chars[j][i];
            }
        }
        return result;
    }
    private void print_dot(int n) throws InterruptedException {

        //процедура красивого вывода точкек

        for (int i=0;i<n;i++){
            Thread.sleep(500);
            out.print('.');
        }
        System.out.println();
    }

    Transposition() throws InterruptedException {

        //Клиент для работы с пользователем

        Scanner scn=new Scanner(System.in);

                    System.out.println("Введите текст для шифрования:");
                    String text = scn.nextLine();
                    out.print("Обработка текста");
                    print_dot(3);
                    out.println("Шифрование завершено: ");
                    out.println(shifr(text));

    }

}
