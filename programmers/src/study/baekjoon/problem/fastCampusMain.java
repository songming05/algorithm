package study.baekjoon.problem;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class fastCampusMain {

    public static void main(String[] args) throws Exception {

        //기본자료구조 - 01.기초문제풀이
        //음계
        //https://www.acmicpc.net/problem/2920



        //블랙잭
        //https://www.acmicpc.net/problem/2798
        System.out.println(problem2798());
    }

    private static int problem2798() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bufferedReader.readLine();
        String[] splitedInput = input.split(" ");
        //N(3 ≤ N ≤ 100)
        //M(10 ≤ M ≤ 300,000)
        int n = Integer.parseInt(splitedInput[0]);
        int m = Integer.parseInt(splitedInput[1]);

        String inputCards = bufferedReader.readLine();
        int[] cards = new int[n];
        String[] splitedInputCards = inputCards.split(" ");
        for (int i = 0; i < splitedInputCards.length; i++) {
            cards[i] = Integer.parseInt(splitedInputCards[i]);
        }

        Arrays.sort(cards);
        int minusResult = 0;

//        ArrayList<Integer> resultsArray = new ArrayList<>();
//
//        minusResult = m - cards[cards.length-1];
//        if(minusResult == 0 ) return m;
//        if(minusResult < cards[0]) {
//            resultsArray.add(minusResult);
//            minusResult = 0;
//        }
//
//        for (int i = n-1; i >= 0; i--) {
//            minusResult = m - cards[i];
//        }

        int idx = cards.length-1;
        minusResult = m;
        minusResult = recursiveMinus(cards, idx, minusResult);

        if(minusResult == 0 ) return m;

        //GIVE_UP!
        return -1;
    }

    private static int recursiveMinus(int[] cards, int idx, int minusResult) {
        minusResult -= cards[idx];
        if(minusResult == 0 || minusResult < cards[0])  return minusResult;
        if(idx == 0) return minusResult;
        recursiveMinus(cards, --idx, minusResult);
        return -1;
    }
}
