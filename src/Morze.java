import java.util.Scanner;

import static java.lang.System.out;

public class Morze {

    static String Upper(StringBuilder text){

        StringBuilder n_text = new StringBuilder();

        for (int i=0;i<text.length();i++) {
            n_text.append(text.substring(i,i+1).toUpperCase());
        }

        return n_text.toString();
    }


    //Метод шифрования азбукой морзе русского текста
    static String MorzeRUS(StringBuilder otext){

        //Создаём StringBuilder - это своего рода конструктор стринга, где можно редачить строчки по индексам и творить лютую магию кр4
        StringBuilder n_text = new StringBuilder();

        String text = Upper(otext);

        //Проверяем каждый символ кроме пробела и заменяем
        //БОЛЬШЕ УСЛОВИЙ КРРРРЧЧЧ
        for (int i=0;i<text.length();i++) {
n_text.append(' ');

            if ((((int) text.charAt(i)) == (65))) {
                n_text.append(".-");
            }

            if ((((int) text.charAt(i)) == (66))) {
                n_text.append("-...");
            }

            if ((((int) text.charAt(i)) == (67))) {
                n_text.append("-.-.");
            }

            if ((((int) text.charAt(i)) == (68))) {
                n_text.append("-..");
            }

            if ((((int) text.charAt(i)) == (69))) {
                n_text.append(".");
            }

            //Пусть это Ёё идёт нахер
            if ((((int) text.charAt(i)) == (70))) {
                n_text.append("..-.");
            }


            if ((((int) text.charAt(i)) == (71))) {
                n_text.append("--.");
            }

            if ((((int) text.charAt(i)) == (72))) {
                n_text.append("....");
            }

            if ((((int) text.charAt(i)) == (73))) {
                n_text.append("..");
            }

            if ((((int) text.charAt(i)) == (74))) {
                n_text.append(".---");
            }

            if ((((int) text.charAt(i)) == (75))) {
                n_text.append("-.-");
            }

            if ((((int) text.charAt(i)) == (76))) {
                n_text.append(".-..");
            }

            if ((((int) text.charAt(i)) == (77))) {
                n_text.append("--");
            }

            if ((((int) text.charAt(i)) == (78))) {
                n_text.append("-.");
            }

            if ((((int) text.charAt(i)) == (79))) {
                n_text.append("---");
            }

            if ((((int) text.charAt(i)) == (80))) {
                n_text.append(".--.");
            }

            if ((((int) text.charAt(i)) == (81))) {
                n_text.append("--.-");
            }

            if ((((int) text.charAt(i)) == (82))) {
                n_text.append(".-.");
            }

            if ((((int) text.charAt(i)) == (83))) {
                n_text.append("...");
            }

            if ((((int) text.charAt(i)) == (84))) {
                n_text.append("-");
            }

            if ((((int) text.charAt(i)) == (85))) {
                n_text.append("..-");
            }

            if ((((int) text.charAt(i)) == (86))) {
                n_text.append("...-");
            }

            if ((((int) text.charAt(i)) == (87))) {
                n_text.append(".--");
            }

            if ((((int) text.charAt(i)) == (88))) {
                n_text.append("-..-");
            }

            if ((((int) text.charAt(i)) == (89))) {
                n_text.append("-.--");
            }

            if ((((int) text.charAt(i)) == (90))) {
                n_text.append("--..");
            }


            if ((((int) text.charAt(i)) == (33))) {
                n_text.append("--..--");
            }
            if ((((int) text.charAt(i)) == (34))) {
                n_text.append(".-..-.");
            }
            if ((((int) text.charAt(i)) == (39))) {
                n_text.append(".----.");
            }
            if ((((int) text.charAt(i)) == (47))) {
                n_text.append("-..-.");
            }
            if ((((int) text.charAt(i)) == (40))) {
                n_text.append("-.--.-");
            }
            if ((((int) text.charAt(i)) == (41))) {
                n_text.append("-.--.-");
            }
            if ((((int) text.charAt(i)) == (43))) {
                n_text.append(".-.-.");
            }
            if ((((int) text.charAt(i)) == (44))) {
                n_text.append(".-.-.-");
            }
            if ((((int) text.charAt(i)) == (45))) {
                n_text.append("-....-");
            }
            if ((((int) text.charAt(i)) == (46))) {
                n_text.append("......");
            }
            if ((((int) text.charAt(i)) == (58))) {
                n_text.append("---...");
            }
            if ((((int) text.charAt(i)) == (63))) {
                n_text.append("..--..");
            }
            if ((((int) text.charAt(i)) == (32))) {
                n_text.append("-...-");
            }


            if ((((int) text.charAt(i)) == (48))) {
                n_text.append("-----");
            }
            if ((((int) text.charAt(i)) == (49))) {
                n_text.append(".----");
            }
            if ((((int) text.charAt(i)) == (50))) {
                n_text.append("..---");
            }
            if ((((int) text.charAt(i)) == (51))) {
                n_text.append("...--");
            }
            if ((((int) text.charAt(i)) == (52))) {
                n_text.append("....-");
            }
            if ((((int) text.charAt(i)) == (53))) {
                n_text.append(".....");
            }
            if ((((int) text.charAt(i)) == (54))) {
                n_text.append("-....");
            }
            if ((((int) text.charAt(i)) == (55))) {
                n_text.append("--...");
            }
            if ((((int) text.charAt(i)) == (56))) {
                n_text.append("---..");
            }
            if ((((int) text.charAt(i)) == (57))) {
                n_text.append("----.");
            }



        }
        //Вывод текста. Да, я тоже в шоке.
        System.out.println(n_text.toString());
        return n_text.toString();
    }

    private void print_dot(int n) throws InterruptedException {

        //процедура красивого вывода точкек

        for (int i=0;i<n;i++){
            Thread.sleep(500);
            out.print('.');
        }
        System.out.println();
    }

Morze() throws InterruptedException {
//Создаём сканнер
    Scanner scn = new Scanner(System.in);

    System.out.println("Введите текст для шифрования:");

    //Вводим текст в одну строку
    String text = scn.nextLine();

    out.print("Обработка текста");
    print_dot(3);
    out.println("Шифрование завершено: ");
    //Создаём билдер, чтобы его передать как параметр в метод MorzeRUS
    StringBuilder StrBld = new StringBuilder();

    //Добавляем волшебным методом билдера текст из нашей переменной типа String
    StrBld.append(text);

    //Обращаемся к волшебству этого мира
    MorzeRUS(StrBld);
}

}
