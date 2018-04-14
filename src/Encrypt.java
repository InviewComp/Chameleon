

import java.util.Scanner;

import static java.lang.System.out;

public class Encrypt {
    Encrypt(String user) throws InterruptedException {
        Scanner scn=new Scanner(System.in);
        boolean isStart=true;
        while(isStart) {
            out.println("Encrypt/"+user+">");
            String commandDec=scn.next();

            switch (commandDec){
                case "/csr":
                    boolean inCSR=true;
                    while (inCSR) {
                        out.println("Encrypt/Csr/" + user + ">");
                        String commandST = scn.next();
                        switch (commandST) {
                            case "-s":
                                new Morze();
                                break;
                            case "-h":
                                new MorzeInfo();
                                break;
                            case "-e":
                                inCSR = false;
                        }
                    }
                    break;
                //Морзе
                case "/mrz":
                    boolean inMRZ=true;
                    while (inMRZ) {
                        out.println("Encrypt/Mrz/" + user + ">");
                        String commandST = scn.next();
                        switch (commandST) {
                            case "-s":
                                new Morze();
                                break;
                            case "-h":
                                new MorzeInfo();
                                break;
                            case "-e":
                                inMRZ = false;
                        }
                    }
                    break;
                //Бинарщина
                case "/bnr":
                    boolean inBNR=true;
                    while (inBNR){
                        out.println("Encrypt/Bnr/"+user+">");
                    String commandST=scn.next();
                        switch (commandST) {
                        case "-s":
                            new Binary();
                            break;
                        case "-h":
                            new BinaryInfo();
                            break;
                        case "-e":
                            inBNR=false;
                    }
                    }
                    break;
                    //Транспозиция
                case "/trp":
                    boolean inTRP=true;
                    while (inTRP){
                        out.println("Encrypt/Trp/"+user+">");
                        String commandST=scn.next();
                        switch (commandST) {
                            case "-s":
                                new Transposition();
                                break;
                            case "-h":
                                new TranspositionInfo();
                                break;
                            case "-e":
                                inTRP=false;
                        }
                    }
                    break;
                case "/rev":
                    boolean inREV=true;
                    while (inREV){
                        out.println("Encrypt/Rev/"+user+">");
                        String commandST=scn.next();
                        switch (commandST) {
                            case "-s":
                                new Reverse();
                                break;
                            case "-h":
                                new ReverseInfo();
                                break;
                            case "-e":
                                inREV=false;
                        }
                    }
                    break;
                case "/exit":
                    new Exit();
                    break;

                case "/stop":
                    out.println("Конец работы шифровальщика");
                    isStart=false;
                    break;

                case "/help":
                new Helpshifr();
                    break;



                default:
                    new Error(commandDec);
            }
        }
    }
}
