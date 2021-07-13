package baekjoon.step1;

import java.util.Scanner;

public class IOAndOperatorMain {

    public static void main(String[] args){

        //problem10171();
        problem10869();


    }

    private static void problem10869() {
        //https://www.acmicpc.net/problem/10869
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInput = input.split(" ");
        int a = Integer.parseInt(splitedInput[0]);
        int b = Integer.parseInt(splitedInput[1]);

        int add = a+b;
        int minus = a-b;
        int multi = a*b;
        int quot = a/b;
        int remain = a%b;
        System.out.println(""+add+"\n"+minus+"\n"+multi+"\n"+quot+"\n"+remain);
    }

    private static void problem10171() {
        //https://www.acmicpc.net/problem/10171
        StringBuffer outputSB = new StringBuffer();
        outputSB.append("\\    /\\\n" +
                " )  ( ')\n" +
                "(  /  )\n" +
                " \\(__)|");
        System.out.println(outputSB.toString());
    }
}
