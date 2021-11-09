package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMain {

    public static void main(String[] args) throws Exception{
        //아스키코드
        //https://www.acmicpc.net/problem/11654
        //problem11654();

        //숫자의 합
        //https://www.acmicpc.net/problem/11720
        problem11720();


    }

    private static void problem11720() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        String[] datas = bufferedReader.readLine().split("");
        int sum = 0;
        for (int i = 0; i < datas.length; i++) {
            sum += Integer.parseInt(datas[i]);
        }
        System.out.println(sum);
    }

    private static void problem11654() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        char[] asciis = input.toCharArray();
        System.out.println((int) asciis[0]);
    }
}
