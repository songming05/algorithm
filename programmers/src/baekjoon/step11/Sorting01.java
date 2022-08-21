package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sorting01 {

    public static void main(String[] args) throws Exception {
        // 수 정렬하기
        // https://www.acmicpc.net/problem/2750
        problem2750();
    }

    private static void problem2750() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> datas = new ArrayList<>();
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            datas.add(Integer.parseInt(bufferedReader.readLine()));
        }
        datas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
