package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralMath01 {
    public static void main(String[] args) throws Exception {
        //손익분기점
        //https://www.acmicpc.net/problem/1712
        //problem1712();

        //벌집
        //https://www.acmicpc.net/problem/2292
        //problem2292();

        //분수찾기
        //https://www.acmicpc.net/problem/1193
        problem1193();
    }

    private static void problem1193() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        final int X_MAX = 10000000;

        long sum = 0;
        int step = 0;

        //몇 번 째 단계인지 찾기 (현재 방향 홀수: 우상향, 짝수: 좌하향)
        for(int i = 1; i <= X_MAX; i++ ) {
            if(x <= sum + i) {
              step = i;
              break;
            }
            sum += i;
        }

        long remainingNumber = x - sum;
        String result = "";

        if(step % 2 == 1) {
            //분자 = step + 1 - 남은 개수
            //분모 = 남은개수
            result = (step + 1 - remainingNumber) + "/" + remainingNumber;
        } else {
            //분자 = 남은개수
            //분모 = step + 1 - 남은 개수
            result = remainingNumber + "/" + (step + 1 - remainingNumber);
        }

        System.out.println(result);
    }

    private static void problem2292() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        //1 6 12 18 24
        int result = 0;
        int current = 0;
        for (int i = 0; current < 1000000000; i++) {
            if(i == 0) {
                current = 1;
            } else {
                current += 6 * i;
            }

            if(n <= current) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);
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
