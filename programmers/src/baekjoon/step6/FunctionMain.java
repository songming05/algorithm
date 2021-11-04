package baekjoon.step6;

import java.io.*;

public class FunctionMain {

    public static void main(String[] args) throws Exception {

        System.out.println("START");
        //정수 N개의 합 #basic
        //https://www.acmicpc.net/problem/15596
        //problem15596();

        //셀프 넘버 #재귀 #구현
        //https://www.acmicpc.net/problem/4673
        //problem4673();

        //한수 #brute_force
        //https://www.acmicpc.net/problem/1065
        problem1065();
    }

    private static void problem1065() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //N <= 1000
        final int N = Integer.parseInt(bufferedReader.readLine());

        int result = 0;
        for (int i = 1; i <= N; i++) {
            boolean isHanSu = checkHanSu(i);
            if(isHanSu) result++;
        }

        System.out.println(result);
    }

    private static boolean checkHanSu(int n) {
        boolean isHanSu = false;
        int d = 0; //공차
        int hundreadValue = 0;
        int tenValue = 0;
        int oneValue = 0;

        if(n == 1000) return isHanSu;
        else if(n >= 100) {
            hundreadValue = n / 100;
            tenValue = n % 100 / 10;
            oneValue = n % 10;
            d = hundreadValue - tenValue;
            isHanSu = d == tenValue - oneValue;
        }else if(n >= 10) {
            isHanSu = true;
            tenValue = n / 10;
            oneValue = n % 10;
        }else if(n >= 1) {
            isHanSu = true;
            oneValue = n;
        }
        return  isHanSu;
    }

    private static void problem4673() {
        //에라토스테네스의 체 처럼.. 생성된 것들을 1로만들자
        byte[] cheker = new byte[10001];

        for(int i=1; i < cheker.length; i++) {
            if(cheker[i] > 0) continue;
            kaprekar(i, cheker);
        }

        for(int i=1; i < cheker.length; i++) {
            if(cheker[i] == 0) System.out.println(i);
        }
    }

    private static int kaprekar(int n, byte[] cheker) {
        int result = -1;
        if (n > 10000) return result;

        if(n >= 1000) {
            result = n + (n / 1000) + (n % 1000 / 100) + (n % 100 / 10) + (n % 10);

        }else if (n >= 100){
            result = n + (n / 100) + (n % 100 / 10) + (n % 10);

        }else if (n >= 10) {
            result = n + (n / 10) + ( n % 10);

        }else if (n > 0) {
            result = n + n;
        }
        if(result <= 10000 && result > 0) {
            cheker[result] = 1;
            kaprekar(result, cheker);
        }
        return  result;
    }

    private static void problem15596() {
        int[] a = new int[3000000];//3,000,000
        long result = sum(a);
    }

    private static long sum(int[] a) {
        long sum = 0;
        for(int ele : a) {
            sum += ele;
        }
        return  sum;
    }
}
