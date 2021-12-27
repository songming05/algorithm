package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralMath01 {
    public static void main(String[] args) throws Exception {
        //손익분기점
        //https://www.acmicpc.net/problem/1712
        problem1712();
    }

    private static void problem1712() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] datas = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(datas[0]);
        int b = Integer.parseInt(datas[1]);
        int c = Integer.parseInt(datas[2]);

        if(b >= c) {
            System.out.println(-1);
            return;
        }
        int profit = c - b;
        int count = 0;
        while(true){
            count++;
            long sumProfit = profit * count;
            if(a < sumProfit) {
                System.out.println(count);
                return;
            }
        }
    }
}
