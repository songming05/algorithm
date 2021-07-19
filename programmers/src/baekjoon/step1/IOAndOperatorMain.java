package baekjoon.step1;

import java.util.Scanner;

public class IOAndOperatorMain {

    public static void main(String[] args){

        //problem10171();
		
        //problem10869();

        //problem10430();

        //problem2588();

    }

    private static void problem2588() {
        //https://www.acmicpc.net/problem/2588
        Scanner scanner = new Scanner(System.in);
        String inputFirst = scanner.nextLine();
        String inputSecond = scanner.nextLine();

        int num1 = Integer.parseInt(inputFirst);
        int num2 = Integer.parseInt(inputSecond);

        //Case1
        int valueOne = num2 % 10;
        int valueTen = num2 % 100 - valueOne;
        valueTen /= 10;
        int valueHundred = num2 % 1000 - valueTen - valueOne;
        valueHundred /= 100;

        //Case2
        valueOne = Integer.parseInt(inputSecond.split("")[2]);
        valueTen = Integer.parseInt(inputSecond.split("")[1]);
        valueHundred = Integer.parseInt(inputSecond.split("")[0]);


        System.out.println(valueOne * num1);
        System.out.println(valueTen * num1);
        System.out.println(valueHundred * num1);
        System.out.println(num2 * num1);

    }

    private static void problem10430() {
        //https://www.acmicpc.net/problem/10430
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInput = input.split(" ");
        int a = Integer.parseInt(splitedInput[0]);
        int b = Integer.parseInt(splitedInput[1]);
        int c = Integer.parseInt(splitedInput[2]);

        System.out.println((a + b) % c + "");
        System.out.println(((a % c) + (b % c)) % c + "");
        System.out.println((a * b) % c + "");
        System.out.println(((a % c) * (b % c)) % c + "");

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
