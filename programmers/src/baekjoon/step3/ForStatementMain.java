package baekjoon.step3;

import java.util.Scanner;

public class ForStatementMain {

    public static void main(String[] args){

        //구구단
        //problem2739();
        
        //A+B-3
        problem10950();
    }

    private static void problem10950() {
        //https://www.acmicpc.net/problem/10950
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInputs = input.split(" ");

        int caseCount = Integer.parseInt(input);

        for (int i = 0; i < caseCount; i++) {
            input = scanner.nextLine();
            splitedInputs = input.split(" ");
            int a = Integer.parseInt(splitedInputs[0]);
            int b = Integer.parseInt(splitedInputs[1]);
            System.out.println(a+b);
        }
    }

    private static void problem2739() {
        //https://www.acmicpc.net/problem/2739
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);

        for (int i = 1; i < 10; i++) {
            System.out.println(number + " * " + i +" = " + (number * i));
        }
    }
}
