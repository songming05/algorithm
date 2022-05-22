package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion01 {
    public static void main(String[] args) throws Exception {

        //팩토리얼
        //https://www.acmicpc.net/problem/10872
        //problem10872();

        //피보나치 수 5
        //https://www.acmicpc.net/problem/10870
        problem10870();
    }

    private static void problem10870() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = pibonacheFive(n);
        System.out.println(result);
    }

    private static int pibonacheFive(int n) {
        if (n == 0 || n == 1) return n;
        else return pibonacheFive(n-1) + pibonacheFive(n-2);
    }

    private static void problem10872() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = factorial(n);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if(n > 0) return n * factorial(n-1);
        else if (n == 0) return 1;
        return 0;
    }
}
