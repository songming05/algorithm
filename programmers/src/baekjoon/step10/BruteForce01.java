package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce01 {
    public static void main(String[] args) throws Exception {
        //분해합
        //https://www.acmicpc.net/problem/2231
        problem2231();
    }

    private static void problem2231() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int n = Integer.parseInt(input);
        int startPoint = (int) Math.pow(10, input.length()-2);
        int endPoint = (int) Math.pow(10, input.length());
//        System.out.println(startPoint);
//        System.out.println(endPoint);

        boolean isExists = false;
        for (int i = startPoint; i < endPoint; i++) {
            if(i >= n) break;
            int result = 0;
            result += i;
            String[] splited = String.valueOf(i).split("");
            for (int j = 0; j < splited.length; j++) {
                result += Integer.parseInt(splited[j]);
            }
            if(result == n) {
                isExists = true;
                System.out.println(i);
                break;
            }
        }
        if(!isExists) {
            System.out.println(0);
        }
    }
}
