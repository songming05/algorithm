package baekjoon.step3;

import java.util.Scanner;

public class ForStatementMain {

    public static void main(String[] args){

        //구구단
        //problem2739();
        
        //A+B-3
        //problem10950();

        //합
        //problem8393();

        //fast A+B
        //problem15552();

        //I/O 에 관한 Tip
        //https://www.acmicpc.net/board/view/22716
        //BOJ 채점에 대하여
        //https://www.acmicpc.net/blog/view/55
        
        //N 찍기
        problem2741();
        
    }

    private static void problem2741() {
        //https://www.acmicpc.net/problem/2741
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
        }//32920KB	960ms
//        for (int i = 0; i < n;) {
//            System.out.println(++i);
//        }//33736KB	1092ms
    }

    private static void problem15552() {
        //https://www.acmicpc.net/problem/15552
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int caseCount = Integer.parseInt(input);

        StringBuffer stringBuffer = new StringBuffer(); // 동기화 지원(thread-safe)
        //319696KB	2088ms
        //320996KB	1944ms (+ --> append)
        //StringBuilder stringBuilder = new StringBuilder(); // 단일 쓰레드 우수
        //320628KB	2252ms
        //321036KB	1992ms (+ --> append)

        //slow_n_easy --> 시간초과
        for (int i = 0; i < caseCount; i++) {
            input = scanner.nextLine();
            String[] splitedInputs = input.split(" ");
            int a = Integer.parseInt(splitedInputs[0]);
            int b = Integer.parseInt(splitedInputs[1]);
            //System.out.println(a+b);
            //stringBuffer.append(a+b+"\n");
            stringBuffer.append(a+b);
            if(i != caseCount-1) stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());
    }

    private static void problem8393() {
        //https://www.acmicpc.net/problem/8393
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
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
