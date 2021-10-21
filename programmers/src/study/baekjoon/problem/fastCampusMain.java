package study.baekjoon.problem;

import java.io.*;
import java.util.*;

public class fastCampusMain {

    public static void main(String[] args) throws Exception {

        System.out.println("START");

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

        //프린터 큐
        //https://www.acmicpc.net/problem/1966
    	//1
    	//100 32
    	//2 9 2 4 1 8 8 5 4 6 3 4 6 2 8 2 3 6 6 2 2 8 2 5 8 9 6 2 6 1 2 8 1 4 9 8 2 5 3 3 1 3 4 6 5 1 7 5 6 1 4 6 6 5 1 5 3 6 4 8 7 6 4 5 7 3 1 6 8 2 7 6 4 8 3 8 8 7 1 5 6 5 8 2 9 8 4 2 3 8 8 7 4 2 9 8 5 9 2 1
        //problem1966();
        //problem1966_answer();


        //키로거
        //https://www.acmicpc.net/problem/5397
        //3
        //---<<BP<A>>Cd-
        //ThIsIs--<<S3Cr->>3t>>--
        //ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--ThIsIs--<<S3Cr->>3t>>--
        problem5397();

    }

    private static void problem5397() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        final String LEFT = "<";
        final String RIGHT = ">";
        final String BACK_SPACE = "-";
//        final char CLEFT = '<';
//        final char CRIGHT = '>';
//        final char CBACK_SPACE = '-';

        for(int i=0; i < n; i++) {
            String input = bufferedReader.readLine();
            String[] splitedInput = input.split("");

            StringBuffer stringBuffer = new StringBuffer();
            List<String> keyList = new ArrayList<>();
            int cursor = 0;
            for (int j = 0; j < splitedInput.length; j++) {
                String data = splitedInput[j];
                //System.out.println(data+",\t"+cursor);
//                char cdata = data.charAt(0);
//                switch (cdata) {
//                    case CLEFT:
//                        if(cursor > 0) cursor--;
//                        break;
//                    case CRIGHT:
//                        //if(cursor < stringBuffer.length()) cursor++;
//                        if(cursor < keyList.size()) cursor++;
//                        break;
//                    case CBACK_SPACE:
//                        //if(cursor > 0 ) stringBuffer.deleteCharAt(--cursor);
//                        if(cursor > 0) keyList.remove(--cursor);
//                        break;
//                    default:
//                        //stringBuffer = stringBuffer.length() == cursor ? stringBuffer.append(data) : stringBuffer.insert(cursor, data);
//                        if (keyList.size() == cursor) {
//                            keyList.add(String.valueOf(data));
//                        } else {
//                            keyList.add(cursor, String.valueOf(data));
//                        }
//                        cursor++;
//                        break;
//                }


                switch (data) {
                    case LEFT:
                        if(cursor > 0) cursor--;
                        break;
                    case RIGHT:
                        //if(cursor < stringBuffer.length()) cursor++;
                        if(cursor < keyList.size()) cursor++;
                        break;
                    case BACK_SPACE:
                        //if(cursor > 0 ) stringBuffer.deleteCharAt(--cursor);
                        if(cursor > 0) keyList.remove(--cursor);
                        break;
                    default:
                        //stringBuffer = stringBuffer.length() == cursor ? stringBuffer.append(data) : stringBuffer.insert(cursor, data);
                        if (keyList.size() == cursor) {
                            keyList.add(data);
                        } else {
                            keyList.add(cursor, data);
                        }
                        cursor++;
                        break;
                }
                //System.out.println(cursor);
            }
            for (int j = 0; j < keyList.size(); j++) {
                stringBuffer.append(keyList.get(j));
            }
            System.out.println(stringBuffer.toString());
        }

    }

    private static void problem1966_answer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int dataCount = Integer.parseInt(bufferedReader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i < dataCount; i++) {
            String input = bufferedReader.readLine();
            String[] splitedInput = input.split(" ");
            int n = Integer.parseInt(splitedInput[0]);
            int m = Integer.parseInt(splitedInput[1]);

            String[] priorInput = bufferedReader.readLine().split(" ");
            int[] priorityArray = new int[priorInput.length];
            int order = 0; //Result

            //Queue&Array Init.
            for(int j=0; j < priorInput.length; j++) {
                int p = Integer.parseInt(priorInput[j]);
                priorityArray[j] = p;
                queue.add(p);
            }

            int targetPr = priorityArray[m];

            for(int pr = 9; pr >= targetPr; pr--) {
                if(!queue.contains(pr)) continue;
                //Full Scan
                for(int k=0; k < queue.size(); k++ ) {
                    if(!queue.contains(pr)) break;

                    int pop = queue.poll();//빼서 확인
                    //맞으면 증가
                    if(pop == pr) {
                        order++;
                        if(m > 0 ) m--;
                        else if(targetPr == pr) break;
                    }
                    //아니면 맨뒤
                    else {
                        queue.offer(pop);
                        if(m > 0) m--;
                        else m = queue.size() -1;
                    }
                }
            }
            bufferedWriter.append(String.valueOf(order));
            if(i < dataCount -1) bufferedWriter.newLine();
        }

        bufferedWriter.flush();
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
        			int pop = queue.poll();//빼서 확인
        			//맞으면 증가
        			if(pop == pr) {
        				order++;
        				if(targetIndex > 0 ) targetIndex--;
        				else if(targetPr == pr) break;
        			}
        			//아니면 맨뒤
        			else {
        				queue.offer(pop);
        				if(targetIndex > 0) targetIndex--;
        				else targetIndex = queue.size() -1;
        			}
        		}
        	}
        	//System.out.println(order+",\t"+targetIndex);
        	bufferedWriter.append(String.valueOf(order));
        	if(i < count -1) bufferedWriter.newLine();
        }
		
        bufferedWriter.flush();
	}

	private static void problem1874_answer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Buffer가 가득차면 write 해버린다...
        //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //n 입력, push는 1부터 오름차순 대로
        String input = bufferedReader.readLine();
        int n = Integer.parseInt(input);
        Stack<Integer> stackN = new Stack<>();

        StringBuffer stringBuffer = new StringBuffer();

        int cursor = 1;
        for(int i=0; i < n; i++) {
            int data = Integer.parseInt(bufferedReader.readLine());

            //해당 숫자까지는 무조건 증가
            for(; cursor <= data; ){
                stackN.add(cursor);
                stringBuffer.append("+");
                stringBuffer.append("\n");
                cursor++;
            }

            if(stackN.peek() == data) {
                stackN.pop();
                stringBuffer.append("-");
                if(i != n-1) stringBuffer.append("\n");
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(stringBuffer.toString());
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
