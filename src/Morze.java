import java.util.Scanner;

import static java.lang.System.out;

public class Morze {

    //Метод шифрования азбукой морзе русского текста
    static String MorzeRUS(StringBuilder text){

        //Создаём StringBuilder - это своего рода конструктор стринга, где можно редачить строчки по индексам и творить лютую магию кр4
        StringBuilder n_text = new StringBuilder();

        //Проверяем каждый символ кроме пробела и заменяем
        //БОЛЬШЕ УСЛОВИЙ КРРРРЧЧЧ
        for (int i=0;i<text.length();i++) {
            if (((int) text.charAt(i)) == (32)) {
                n_text.append(" ");
            } else {


                if ((((int) text.charAt(i)) == (1040)) || (((int) text.charAt(i)) == (1072))) {
                    n_text.append(".-");
                }

                if ((((int) text.charAt(i)) == (1041)) || (((int) text.charAt(i)) == (1073))) {
                    n_text.append("-...");
                }

                if ((((int) text.charAt(i)) == (1042)) || (((int) text.charAt(i)) == (1074))) {
                    n_text.append(".--");
                }

                if ((((int) text.charAt(i)) == (1043)) || (((int) text.charAt(i)) == (1075))) {
                    n_text.append("--.");
                }

                if ((((int) text.charAt(i)) == (1044)) || (((int) text.charAt(i)) == (1076))) {
                    n_text.append("-..");
                }

                //Пусть это Ёё идёт нахер
                if ((((int) text.charAt(i)) == (1045)) || (((int) text.charAt(i)) == (1077))||(((int) text.charAt(i)) == (1025))||(((int) text.charAt(i)) == (1105))) {
                    n_text.append(".");
                }


                if ((((int) text.charAt(i)) == (1046)) || (((int) text.charAt(i)) == (1078))) {
                    n_text.append("...-");
                }

                if ((((int) text.charAt(i)) == (1047)) || (((int) text.charAt(i)) == (1079))) {
                    n_text.append("--..");
                }

                if ((((int) text.charAt(i)) == (1048)) || (((int) text.charAt(i)) == (1080))) {
                    n_text.append("..");
                }

                if ((((int) text.charAt(i)) == (1049)) || (((int) text.charAt(i)) == (1081))) {
                    n_text.append(".---");
                }

                if ((((int) text.charAt(i)) == (1050)) || (((int) text.charAt(i)) == (1082))) {
                    n_text.append("-.-");
                }

                if ((((int) text.charAt(i)) == (1051)) || (((int) text.charAt(i)) == (1083))) {
                    n_text.append(".-..");
                }

                if ((((int) text.charAt(i)) == (1052)) || (((int) text.charAt(i)) == (1084))) {
                    n_text.append("--");
                }

                if ((((int) text.charAt(i)) == (1053)) || (((int) text.charAt(i)) == (1085))) {
                    n_text.append("-.");
                }

                if ((((int) text.charAt(i)) == (1054)) || (((int) text.charAt(i)) == (1086))) {
                    n_text.append("---");
                }

                if ((((int) text.charAt(i)) == (1055)) || (((int) text.charAt(i)) == (1087))) {
                    n_text.append(".--.");
                }

                if ((((int) text.charAt(i)) == (1056)) || (((int) text.charAt(i)) == (1088))) {
                    n_text.append(".-.");
                }

                if ((((int) text.charAt(i)) == (1057)) || (((int) text.charAt(i)) == (1089))) {
                    n_text.append("...");
                }

                if ((((int) text.charAt(i)) == (1058)) || (((int) text.charAt(i)) == (1090))) {
                    n_text.append("-");
                }

                if ((((int) text.charAt(i)) == (1059)) || (((int) text.charAt(i)) == (1091))) {
                    n_text.append("..-");
                }

                if ((((int) text.charAt(i)) == (1060)) || (((int) text.charAt(i)) == (1092))) {
                    n_text.append("..-.");
                }

                if ((((int) text.charAt(i)) == (1061)) || (((int) text.charAt(i)) == (1093))) {
                    n_text.append("....");
                }

                if ((((int) text.charAt(i)) == (1062)) || (((int) text.charAt(i)) == (1094))) {
                    n_text.append("-.-.");
                }

                if ((((int) text.charAt(i)) == (1063)) || (((int) text.charAt(i)) == (1095))) {
                    n_text.append("---.");
                }

                if ((((int) text.charAt(i)) == (1064)) || (((int) text.charAt(i)) == (1096))) {
                    n_text.append("----");
                }

                if ((((int) text.charAt(i)) == (1065)) || (((int) text.charAt(i)) == (1097))) {
                    n_text.append("--.-");
                }

                if ((((int) text.charAt(i)) == (1066)) || (((int) text.charAt(i)) == (1098))) {
                    n_text.append(".--.-.");
                }

                if ((((int) text.charAt(i)) == (1067)) || (((int) text.charAt(i)) == (1099))) {
                    n_text.append("-.--");
                }

                if ((((int) text.charAt(i)) == (1068)) || (((int) text.charAt(i)) == (1100))) {
                    n_text.append("-..-");
                }

                if ((((int) text.charAt(i)) == (1069)) || (((int) text.charAt(i)) == (1101))) {
                    n_text.append("...-...");
                }

                if ((((int) text.charAt(i)) == (1070)) || (((int) text.charAt(i)) == (1102))) {
                    n_text.append("..--");
                }

                if ((((int) text.charAt(i)) == (1071)) || (((int) text.charAt(i)) == (1103))) {
                    n_text.append(".-.-");
                }


            }
        }
        //Вывод текста. Да, я тоже в шоке.
        System.out.println(n_text.toString());
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
