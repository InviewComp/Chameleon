import java.util.Scanner;

import static java.lang.System.out;

public class Caesar{

    static String Upper(StringBuilder text){

        StringBuilder n_text = new StringBuilder();

        for (int i=0;i<text.length();i++) {
            n_text.append(text.substring(i,i+1).toUpperCase());
        }

        return n_text.toString();
    }

    static String CesarRUS(StringBuilder otext, int k){

        Scanner scn = new Scanner(System.in);

        //Создаём StringBuilder - это своего рода конструктор стринга, где можно редачить строчки по индексам и творить лютую магию кр4
        StringBuilder n_text = new StringBuilder();

        //Переводим весь текст в UpperCase волшебным методом
        String text = Upper(otext);

        //Локальная переменная, которая просто нужна в условиях
        int loc=0;

        //Чтобы если юзер тупой и вводил сдвиг больше чем алфавит - то всё было норм..
        k=k%26;
        //Опять дохера условий
        for (int i=0;i<text.length();i++) {
            if (((int) text.charAt(i)) == (32)) {
                n_text.append(" ");
            } else {


                if (((int) text.charAt(i)) == (65)) {
                    if (k>(90-65)) {
                        loc = 64+(k-(90-65));
                    }else{
                        loc = 65+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (66))) {
                    if (k>(90-66)) {
                        loc = 64+(k-(90-1066));
                    }else{
                        loc = 66+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (67))) {
                    if (k>(90-67)) {
                        loc = 64+(k-(90-67));
                    }else{
                        loc = 67+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (68))) {
                    if (k>(90-68)) {
                        loc = 64+(k-(90-68));
                    }else{
                        loc = 68+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (69))) {
                    if (k>(90-69)) {
                        loc = 64+(k-(90-69));
                    }else{
                        loc = 69+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (70))) {
                    if (k>(90-70)) {
                        loc = 64+(k-(90-70));
                    }else{
                        loc = 70+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (71))) {
                    if (k>(90-71)) {
                        loc = 64+(k-(90-71));
                    }else{
                        loc = 71+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (72))) {
                    if (k>(90-72)) {
                        loc = 64+(k-(90-72));
                    }else{
                        loc = 72+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (73))) {
                    if (k>(90-73)) {
                        loc = 64+(k-(90-73));
                    }else{
                        loc = 73+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (74))) {
                    if (k>(90-74)) {
                        loc = 64+(k-(90-74));
                    }else{
                        loc = 74+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (75))) {
                    if (k>(90-75)) {
                        loc = 64+(k-(90-75));
                    }else{
                        loc = 75+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (76))) {
                    if (k>(90-76)) {
                        loc = 64+(k-(90-76));
                    }else{
                        loc = 76+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (77))) {
                    if (k>(90-77)) {
                        loc = 64+(k-(90-77));
                    }else{
                        loc = 77+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (78))) {
                    if (k>(90-78)) {
                        loc = 64+(k-(90-78));
                    }else{
                        loc = 78+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (79))) {
                    if (k>(90-79)) {
                        loc = 64+(k-(90-79));
                    }else{
                        loc = 79+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (80))) {
                    if (k>(90-80)) {
                        loc = 64+(k-(90-80));
                    }else{
                        loc = 80+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (81))) {
                    if (k>(90-81)) {
                        loc = 64+(k-(90-81));
                    }else{
                        loc = 81+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (82))) {
                    if (k>(90-82)) {
                        loc = 64+(k-(90-82));
                    }else{
                        loc = 82+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (83))) {
                    if (k>(90-83)) {
                        loc = 64+(k-(90-83));
                    }else{
                        loc = 83+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (84))) {
                    if (k>(90-84)) {
                        loc = 64+(k-(90-84));
                    }else{
                        loc = 84+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (85))) {
                    if (k>(90-85)) {
                        loc = 64+(k-(90-85));
                    }else{
                        loc = 85+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (86))) {
                    if (k>(90-86)) {
                        loc = 64+(k-(90-86));
                    }else{
                        loc = 86+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (87))) {
                    if (k>(90-87)) {
                        loc = 64+(k-(90-87));
                    }else{
                        loc = 87+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (88))) {
                    if (k>(90-88)) {
                        loc = 64+(k-(90-88));
                    }else{
                        loc = 88+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (89))) {
                    if (k>(90-89)) {
                        loc = 64+(k-(90-89));
                    }else{
                        loc = 89+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (90))) {
                    if (k>(90-90)) {
                        loc = 64+(k-(90-90));
                    }else{
                        loc = 90+k;
                    }
                    n_text.append((char)loc);
                }



            }

        }


        System.out.println("Ваш зашифрованный текст: "+n_text);


        return null;
    }

    private void print_dot(int n) throws InterruptedException {

        //процедура красивого вывода точкек

        for (int i=0;i<n;i++){
            Thread.sleep(500);
            out.print('.');
        }
        System.out.println();
    }

    Caesar() throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Активирован шифр Цезаря.");
        System.out.println("Введите текст: ");

        String text = scn.nextLine();

        //Вводим сдвиг
        System.out.print("Введите сдвиг: ");
        int k = scn.nextInt();
        out.print("Обработка текста");
        print_dot(3);
        out.println("Шифрование завершено: ");
        //Создаём билдер, чтобы его передать как параметр в метод MorzeRUS
        StringBuilder StrBld = new StringBuilder();

        //Добавляем волшебным методом билдера текст из нашей переменной типа String
        StrBld.append(text);

        //Обращаемся к волшебству этого мира
        CesarRUS(StrBld,k);

    }
}
