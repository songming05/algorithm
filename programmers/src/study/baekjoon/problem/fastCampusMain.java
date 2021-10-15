package study.baekjoon.problem;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class fastCampusMain {

    public static void main(String[] args) throws Exception {

        //기본자료구조 - 01.기초문제풀이
        //음계
        //https://www.acmicpc.net/problem/2920

        //블랙잭
        //https://www.acmicpc.net/problem/2798
        //System.out.println(problem2798());
        //System.out.println(problem2798_answer());


        //기본자료구조 - 02.핵심유형 문제풀이
        //스택수열
        //https://www.acmicpc.net/problem/1874
        //problem1874();
        //problem1874_answer();
        
        
    	System.out.println("START");
        problem1966();
    }

    private static void problem1966() throws IOException {
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i < count; i++) {
        	String input = bufferedReader.readLine();
        	String[] splitedInput = input.split(" ");
        	int total = Integer.parseInt(splitedInput[0]);
        	int targetIndex = Integer.parseInt(splitedInput[1]);
        	
        	String[] priorInput = bufferedReader.readLine().split(" ");
        	int[] priorityArray = new int[priorInput.length];
        	int order = 0; //Result
        	
        	//Queue&Array Init.
        	for(int j=0; j < priorInput.length; j++) {
        		int p = Integer.parseInt(priorInput[j]);
        		priorityArray[j] = p;
        		queue.add(p);
        	}
        	
        	int targetPr = priorityArray[targetIndex];
        	
        	for(int pr = 9; pr >= targetPr; pr--) {
        		if(!queue.contains(pr)) continue;
        		//Full Scan
        		for(int k=0; k < queue.size(); k++ ) {
        			int pop = queue.poll();
        			if(pop == pr) {
        				order++;
        				if(targetIndex > 0 ) targetIndex--;
        				else if(targetPr == pr) break;
        			}
        			else {
        				queue.add(pop);
        				if(targetIndex > 0) targetIndex--;
        				else targetIndex = queue.size() -1;
        			}
        		}
        	}
        	bufferedWriter.append(String.valueOf(order));
        	if(i < count -1) bufferedWriter.newLine();
        }
		
        bufferedWriter.flush();
	}

	private static void problem1874_answer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //n 입력, push는 1부터 오름차순 대로
        String input = bufferedReader.readLine();
        int n = Integer.parseInt(input);
        Stack<Integer> stackN = new Stack<>();

        int cursor = 1;
        for(int i=1; i <= n; i++) {
            int data = Integer.parseInt(bufferedReader.readLine());

            for(; cursor <= data; ){
                stackN.add(cursor);
                bufferedWriter.append("+");
                bufferedWriter.newLine();
                cursor++;
            }
            if(stackN.peek() == data) {
                stackN.pop();
                bufferedWriter.append("-");
                if(data != 1) bufferedWriter.newLine();
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        bufferedWriter.flush();
    }

    private static void problem1874() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //n 입력, push는 1부터 오름차순 대로
        String input = bufferedReader.readLine();
        int n = Integer.parseInt(input);

        Stack<Integer> stackN = new Stack<>();

        int cursor = 1;
        for(String next = bufferedReader.readLine(); next != null; next = bufferedReader.readLine()) {
            if("".equals(next)) break;

            int netxNumber = Integer.parseInt(next);
            for(; cursor <= netxNumber; cursor++){
                stackN.add(cursor);
                bufferedWriter.append("+");
                bufferedWriter.newLine();
                if(cursor == netxNumber ) {
                    try {
                        stackN.pop();
                    }catch (EmptyStackException ese){
                        System.out.println("NO");
                        return;
                    }
                    bufferedWriter.append("-");
                    bufferedWriter.newLine();
                }
            }

            try {
                int peekNumber = stackN.peek();
                if(netxNumber == peekNumber){
                    stackN.pop();
                    bufferedWriter.append("-");
                    bufferedWriter.newLine();
                }
            }catch (EmptyStackException ese){
                System.out.println("NO");
                return;
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static int problem2798_answer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bufferedReader.readLine();
        String[] splitedInput = input.split(" ");

        int n = Integer.parseInt(splitedInput[0]);
        int m = Integer.parseInt(splitedInput[1]);

        String inputCards = bufferedReader.readLine();
        int[] cards = new int[n];
        String[] splitedInputCards = inputCards.split(" ");
        for (int i = 0; i < splitedInputCards.length; i++) {
            cards[i] = Integer.parseInt(splitedInputCards[i]);
        }

        int maxResult = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i+1; j < cards.length; j++) {
                for (int k = j+1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= m) maxResult = Math.max(maxResult, sum);
                }
            }
        }

        return maxResult;
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
