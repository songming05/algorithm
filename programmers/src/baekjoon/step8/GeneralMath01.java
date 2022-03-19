package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

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
        //problem1193();

        //달팽이는 올라가고 싶다
        //https://www.acmicpc.net/problem/2869
        //problem2869();

        //ACM호텔
        //https://www.acmicpc.net/problem/10250
        //problem10250();

        //부녀회장이 될테야
        //https://www.acmicpc.net/problem/2775
        problem2775();
    }

    private static void problem2775() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tCase; i++) {
            int k = Integer.parseInt(bufferedReader.readLine()); //floor
            int n = Integer.parseInt(bufferedReader.readLine()); //room
            int[][] apt = new int[15][15]; //0~14(층), 1~14(호)
            initApartmentConstant(apt);
            dynamicApartment(apt, k, n);
            System.out.println(apt[k][n]);
        }
    }

    private static int dynamicApartment(int[][] apt, int k, int n) {
//        a_i_j = i층 / j 호 (j >=1)
//                = a_i_(j-1) + a_(i-1)_j
//        when i = 0
//          then a_i_j = j명 거주
//        when j = 1
//          then 1 명
        int value = 0;
        if(n < 1) return value;

        if (apt[k][n] != 0) {
//            System.out.print("#k:"+k+", n:"+n+"\t");
//            System.out.println("apt[k][n] != 0, val:" + apt[k][n]);
            return apt[k][n];
        }
        if(k > 0) {
//            System.out.print("##k:"+k+", n:"+n+"\t");
            value = dynamicApartment(apt, k, n-1) + dynamicApartment(apt, k-1, n);
            apt[k][n] = value;
//            System.out.println("k > 0, val:" + apt[k][n]);
        } else {
//            System.out.print("###k:"+k+", n:"+n+"\t");
//            System.out.println("else, val:" + apt[k][n]);
            return apt[k][n];
        }
        return value;
    }

    private static void initApartmentConstant(int[][] apt) {
        for (int i = 0; i < apt[0].length; i++) {
            apt[0][i] = i;
            apt[i][1] = 1;
        }
    }

    private static void problem10250() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int t = Integer.parseInt(input);

        for (int i = 0; i < t; i++) {
            String data = bufferedReader.readLine();
            int height = Integer.parseInt(data.split(" ")[0]);
            int width = Integer.parseInt(data.split(" ")[1]);
            int number = Integer.parseInt(data.split(" ")[2]);

            int floor = number % height;
            if(floor == 0) floor = height;
            int room = (int) Math.ceil( (float) number / height);

            System.out.println(String.format("%d%02d", floor, room));
        }
    }

    private static void problem2869() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        int v = Integer.parseInt(input.split(" ")[2]);

        double h = v - a;
        double diff = a - b;
        int result = (int) (Math.ceil(h / diff) + 1);
        System.out.println(result);

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
