package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Optional;

public class UnionMap01 {

    public static void main(String[] args) throws Exception {
        // 숫자 카드
        // https://www.acmicpc.net/problem/10815
        problem10815();
    }

    private static void problem10815() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] datas = bufferedReader.readLine().split(" ");
        int m = Integer.parseInt(bufferedReader.readLine());
        String[] checkers = bufferedReader.readLine().split(" ");

        HashMap<String, Boolean> myCardMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            myCardMap.put(datas[i], true);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            //keyset (138068KB	944ms)
            boolean isExists = myCardMap.keySet().contains(checkers[i]);

            //hashmap (141744KB	924ms)
//            boolean isExists = Optional.ofNullable(myCardMap.get(checkers[i]))
//                    .orElseGet(() -> false);
            //System.out.println(isExists);
            if(isExists) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
            if(i != m-1) stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
