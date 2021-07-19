package baekjoon.step2;

import java.util.Scanner;

public class IfStatementMain {

    public static void main(String[] args){

        //problem1330();

        //problem9498();
        
        //윤년
        problem2753();

    }

    private static void problem2753() {
        //https://www.acmicpc.net/problem/2753

    }

    private static void problem9498() {
        //https://www.acmicpc.net/problem/9498
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        String result = "";
        switch (score / 10 ){
            case 10 :
            case 9 :
                result = "A";
                break;
            case 8 :
                result = "B";
                break;
            case 7 :
                result = "C";
                break;
            case 6 :
                result = "D";
                break;
            default:
                result = "F";
                break;
        }

        System.out.println(result);

    }

    private static void problem1330() {
        //https://www.acmicpc.net/problem/1330
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInput = input.split(" ");

        int a = Integer.parseInt(splitedInput[0]);
        int b = Integer.parseInt(splitedInput[1]);

        String result = a > b ? ">" : a < b ? "<" : "==";
        System.out.println(result);
    }
}
