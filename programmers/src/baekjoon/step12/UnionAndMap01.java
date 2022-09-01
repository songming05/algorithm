package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class UnionAndMap01 {

    public static void main(String[] args) throws Exception {
        // 숫자 카드
        // https://www.acmicpc.net/problem/10815
        // problem10815();

        // 문자열 집합
        // https://www.acmicpc.net/problem/14425
        //problem14425();

        // 나는야 포켓몬 마스터 이다솜
        //https://www.acmicpc.net/problem/1620
        //problem1620();

        //숫자 카드 2
        //https://www.acmicpc.net/problem/10816
        problem10816();

    }

    private static void problem10816() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] datas = bufferedReader.readLine().split(" ");
        int m = Integer.parseInt(bufferedReader.readLine());
        String[] checkers = bufferedReader.readLine().split(" ");
        HashMap<String, Integer> cardMap = new HashMap<>();
        for(String s : datas) {
            int currentCount = Optional.ofNullable(cardMap.get(s))
                    .orElse(0);
            cardMap.put(s, currentCount+1);
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(String s: checkers) {
            int maybeValueOrDefault = Optional.ofNullable(cardMap.get(s))
                    .orElse(0);
            stringBuffer.append(maybeValueOrDefault+ " ");
        }

        System.out.println(stringBuffer);
    }

    private static void problem1620() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] datas = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(datas[0]);
        int m = Integer.parseInt(datas[1]);
        HashMap<String, Integer> poketmonMap = new HashMap<>();
        ArrayList<String> poketmonList = new ArrayList<>();
        ArrayList<String> findList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = bufferedReader.readLine();
            poketmonMap.put(name, i);
            poketmonList.add(name);
        }
        for (int i = 0; i < m; i++) {
            findList.add(bufferedReader.readLine());
        }


        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < findList.size(); i++) {
            String target = findList.get(i);
            if (target.matches("^[0-9]*$")) {
                stringBuffer.append(poketmonList.get(Integer.parseInt(target) - 1));
            } else {
                int idx = -1;
//                for (int j = 0; j < poketmonList.size(); j++) {
//                    if(target.equals(poketmonList.get(j))) {
//                        idx = j;
//                        break;
//                    }
//                }

                stringBuffer.append(poketmonMap.get(target)+1);
                //stringBuffer.append(idx+1);
                //stringBuffer.append(poketmonList.lastIndexOf(target) + 1);
            }
            stringBuffer.append(System.lineSeparator());
        }
        System.out.println(stringBuffer);
    }


    private static void problem14425() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] datas = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(datas[0]);
        int m = Integer.parseInt(datas[1]);
        ArrayList<String> unionSList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            unionSList.add(bufferedReader.readLine());
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if(unionSList.contains(bufferedReader.readLine())) {
                count++;
            }
        }
        System.out.println(count);

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
            boolean isExists = myCardMap.containsKey(checkers[i]);

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
