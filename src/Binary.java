import java.util.Scanner;

import static java.lang.System.out;

public class Binary {
    public static String dv(int s){
//перевод и 10-й с.с. в 2-ую с.с.
        int t = s;
        String d = "";
        while(t>0){
    if(t%2 == 0){d="0"+d;}
    if(t%2 == 1){d="1"+d;}
    t/=2;
        }
return d;
    }

    private void print_dot(int n) throws InterruptedException {

        //процедура красивого вывода точкек

        for (int i=0;i<n;i++){
            Thread.sleep(500);
            out.print('.');
        }
        System.out.println();
    }

    Binary() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String q = in.nextLine();
        out.print("Обработка текста");
        print_dot(3);
        out.println("Шифрование завершено: ");
        for(int i = 0; i < q.length(); i++){
            char w = q.charAt(i);
            System.out.print(dv((int) w) + " ");
            //берет ascii код символа и переводит его в двоичную с.с. Всё.
    }
    System.out.println();
    }
}
