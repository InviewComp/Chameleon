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
        k=k%32;
        //Опять дохера условий
        for (int i=0;i<text.length();i++) {
            if (((int) text.charAt(i)) == (32)) {
                n_text.append(" ");
            } else {


                if (((int) text.charAt(i)) == (1040)) {
                    if (k>(1071-1040)) {
                        loc = 1039+(k-(1071-1040));
                    }else{
                        loc = 1040+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1041))) {
                    if (k>(1071-1041)) {
                        loc = 1039+(k-(1071-1041));
                    }else{
                        loc = 1041+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1042))) {
                    if (k>(1071-1042)) {
                        loc = 1039+(k-(1071-1042));
                    }else{
                        loc = 1042+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1043))) {
                    if (k>(1071-1043)) {
                        loc = 1039+(k-(1071-1043));
                    }else{
                        loc = 1043+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1044))) {
                    if (k>(1071-1044)) {
                        loc = 1039+(k-(1071-1044));
                    }else{
                        loc = 1044+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1045))) {
                    if (k>(1071-1045)) {
                        loc = 1039+(k-(1071-1045));
                    }else{
                        loc = 1045+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1046))) {
                    if (k>(1071-1046)) {
                        loc = 1039+(k-(1071-1046));
                    }else{
                        loc = 1046+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1047))) {
                    if (k>(1071-1047)) {
                        loc = 1039+(k-(1071-1047));
                    }else{
                        loc = 1047+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1048))) {
                    if (k>(1071-1048)) {
                        loc = 1039+(k-(1071-1048));
                    }else{
                        loc = 1048+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1049))) {
                    if (k>(1071-1049)) {
                        loc = 1039+(k-(1071-1049));
                    }else{
                        loc = 1049+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1050))) {
                    if (k>(1071-1050)) {
                        loc = 1039+(k-(1071-1050));
                    }else{
                        loc = 1050+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1051))) {
                    if (k>(1071-1051)) {
                        loc = 1039+(k-(1071-1051));
                    }else{
                        loc = 1051+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1052))) {
                    if (k>(1071-1052)) {
                        loc = 1039+(k-(1071-1052));
                    }else{
                        loc = 1052+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1053))) {
                    if (k>(1071-1053)) {
                        loc = 1039+(k-(1071-1053));
                    }else{
                        loc = 1053+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1054))) {
                    if (k>(1071-1054)) {
                        loc = 1039+(k-(1071-1054));
                    }else{
                        loc = 1054+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1055))) {
                    if (k>(1071-1055)) {
                        loc = 1039+(k-(1071-1055));
                    }else{
                        loc = 1055+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1056))) {
                    if (k>(1071-1056)) {
                        loc = 1039+(k-(1071-1056));
                    }else{
                        loc = 1056+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1057))) {
                    if (k>(1071-1057)) {
                        loc = 1039+(k-(1071-1057));
                    }else{
                        loc = 1057+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1058))) {
                    if (k>(1071-1058)) {
                        loc = 1039+(k-(1071-1058));
                    }else{
                        loc = 1058+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1059))) {
                    if (k>(1071-1059)) {
                        loc = 1039+(k-(1071-1059));
                    }else{
                        loc = 1059+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1060))) {
                    if (k>(1071-1060+1)) {
                        loc = 1039+(k-(1071-1060));
                    }else{
                        loc = 1060+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1061))) {
                    if (k>(1071-1061)) {
                        loc = 1039+(k-(1071-1061));
                    }else{
                        loc = 1061+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1062))) {
                    if (k>(1071-1062)) {
                        loc = 1039+(k-(1071-1062));
                    }else{
                        loc = 1062+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1063))) {
                    if (k>(1071-1063)) {
                        loc = 1039+(k-(1071-1063));
                    }else{
                        loc = 1063+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1064))) {
                    if (k>(1071-1064)) {
                        loc = 1039+(k-(1071-1064));
                    }else{
                        loc = 1064+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1065))) {
                    if (k>(1071-1065)) {
                        loc = 1039+(k-(1071-1065));
                    }else{
                        loc = 1065+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1066))) {
                    if (k>(1071-1066)) {
                        loc = 1039+(k-(1071-1066));
                    }else{
                        loc = 1066+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1067))) {
                    if (k>(1071-1067)) {
                        loc = 1039+(k-(1071-1067));
                    }else{
                        loc = 1067+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1068))) {
                    if (k>(1071-1068)) {
                        loc = 1039+(k-(1071-1068));
                    }else{
                        loc = 1068+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1069))) {
                    if (k>(1071-1069)) {
                        loc = 1039+(k-(1071-1069));
                    }else{
                        loc = 1069+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1070))) {
                    if (k>(1071-1070)) {
                        loc = 1039+(k-(1071-1070));
                    }else{
                        loc = 1070+k;
                    }
                    n_text.append((char)loc);
                }

                if ((((int) text.charAt(i)) == (1071))) {
                    if (k>(1071-1071)) {
                        loc = 1039+(k-(1071-1071));
                    }else{
                        loc = 1071+k;
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
        System.out.println("Шифратор не поддерживает использование символов Ё и ё ");
        System.out.println("Следовательно, алфавит содержит 32 символа.");
        System.out.println("");
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
