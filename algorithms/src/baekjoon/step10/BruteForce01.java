package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.DoubleFunction;

public class BruteForce01 {
    public static void main(String[] args) throws Exception {
        //분해합
        //https://www.acmicpc.net/problem/2231
        //problem2231();

        //덩치
        //https://www.acmicpc.net/problem/7568
        problem7568();

    }

    private static void problem7568() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] weights = new int[n];
        int[] heights = new int[n];
        int[] counts = new int[n];
        int[] ranks = new int[n];
        int[] result = new int[n];

        //data
        for (int i = 0; i < n; i++) {
            String[] inputs = bufferedReader.readLine().split(" ");
            int kg = Integer.parseInt(inputs[0]);
            int cm = Integer.parseInt(inputs[1]);
            weights[i] = kg;
            heights[i] = cm;
        }

        //덩치
        for (int i = 0; i < n; i++) {
            int x = weights[i];
            int y = heights[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                if(x > weights[j] && y > heights[j]) count++;
            }
            counts[i] = count;
        }
//
//        //등수
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            result[i] = counts[i] - (ranks[counts[i]] - 1);
//            System.out.println(counts[i]+" - ("+ranks[counts[i]] + " - 1)");
////            result[i] = n - counts[i] - (ranks[counts[i]] - 1);
////            System.out.println(n + " - "+counts[i]+" - ("+ranks[counts[i]] + " - 1)");
//
//            sb.append(result[i]);
//            if(i != n-1) sb.append(" ");
//        }

//        System.out.println(sb.toString());

        Arrays.stream(counts).forEach(System.out::print);
        System.out.println();
        Arrays.stream(ranks).forEach(System.out::print);
        System.out.println();
        Arrays.stream(result).forEach(System.out::print);
    }

    public double integrate(DoubleFunction<Double> df, double a, double b) {
        return (df.apply(a) + df.apply(b)) * Math.abs(b-a) / 2.0;
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
