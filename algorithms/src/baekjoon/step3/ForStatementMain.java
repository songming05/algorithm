package baekjoon.step3;

import java.io.*;
import java.util.Scanner;

public class ForStatementMain {

    public static void main(String[] args) throws IOException {

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
        //problem2741();

        //기찍 N
        //problem2742();

        //A+B - 7
        //problem11021();

        //A+B - 8
        //problem11022();
        
        //별 찍기 - 1
        //problem2438();

        //별 찍기 - 2
        //problem2439();

        //X보다 작은 수
        problem10871();


    }

    private static void problem10871() throws IOException {
        //https://www.acmicpc.net/problem/10871
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        String[] splitedInputs = input.split(" ");
        int n = Integer.parseInt(splitedInputs[0]);
        int x = Integer.parseInt(splitedInputs[1]);

        String[] splitedInputNums = bufferedReader.readLine().split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int targetNum = Integer.parseInt(splitedInputNums[i]);
            if(targetNum < x){
                stringBuffer.append(targetNum);
                stringBuffer.append(" ");
            }
        }
        System.out.println(stringBuffer.toString());
    }

    private static void problem2439() throws IOException {
        //https://www.acmicpc.net/problem/2439
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bufferedReader.readLine();
        int n = Integer.parseInt(input);

        for (int i = 1; i <= n; i++) {
            int blank = n - i;
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < i; j++) {
                stringBuffer.append("*");
                blank++;
            }
            String format = blank == 0 ? "%s" : "%"+blank+"s%n";
            System.out.printf(format, stringBuffer.toString());
        }
    }

    private static void problem2438() {
        //https://www.acmicpc.net/problem/2438
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                stringBuffer.append("*");
            }
            if(i != n) stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());
    }

    private static void problem11022() {
        //https://www.acmicpc.net/problem/11022
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(input);

        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i < count; i++){
            String nums = scanner.nextLine();
            String[] splitedNums = nums.split(" ");
            int a = Integer.parseInt(splitedNums[0]);
            int b = Integer.parseInt(splitedNums[1]);
            stringBuffer.append("Case #");
            stringBuffer.append(i+1);
            stringBuffer.append(": ");
            stringBuffer.append(a);
            stringBuffer.append(" + ");
            stringBuffer.append(b);
            stringBuffer.append(" = ");
            stringBuffer.append(a+b);
            stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());
    }

    private static void problem11021() {
        //https://www.acmicpc.net/problem/11021
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(input);

        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i < count; i++){
            String nums = scanner.nextLine();
            String[] splitedNums = nums.split(" ");
            int a = Integer.parseInt(splitedNums[0]);
            int b = Integer.parseInt(splitedNums[1]);
            stringBuffer.append("Case #");
            stringBuffer.append(i+1);
            stringBuffer.append(": ");
            stringBuffer.append(a+b);
            stringBuffer.append("\n");
        }
        System.out.println(stringBuffer.toString());
    }

    private static void problem2742() {
        //https://www.acmicpc.net/problem/2742
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

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
