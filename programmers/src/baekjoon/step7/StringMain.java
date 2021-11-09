package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMain {

    public static void main(String[] args) throws Exception{
        //아스키코드
        //https://www.acmicpc.net/problem/11654
        problem11654();


    }

    private static void problem11654() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        char[] asciis = input.toCharArray();
        System.out.println(asciis[0]);
    }
}
