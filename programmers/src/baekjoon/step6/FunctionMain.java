package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FunctionMain {

    public static void main(String[] args) throws Exception {

        //정수 N개의 합
        //https://www.acmicpc.net/problem/15596
        //problem15596();

        //셀프 넘버
        //https://www.acmicpc.net/problem/4673
        problem4673();
    }

    private static void problem4673() {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //에라토스테네스의 체 처럼.. 생성된 것들을 1로만들자
        byte[] cheker = new byte[10000];

        for(int i=0; i < cheker.length; i++) {
            
        }

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
