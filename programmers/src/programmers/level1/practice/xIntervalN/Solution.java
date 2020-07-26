package programmers.level1.practice.xIntervalN;

public class Solution {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12954
		/*
		 * 
		 * input_example 
		 * x	n	answer
		 * 2	5	[2,4,6,8,10]
		 * 4	3	[4,8,12]
		 * -4	2	[-4, -8]
		 */
		int x[] = {2, 4, -4};
		int n[] = {5, 3, 2};
		
		
		for(int i=0; i<x.length; i++) {
			long result[] = solution(x[i], n[i]);
			for(long ele : result) System.out.print("  "+ele);
			System.out.println();
		}
		

	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i=0; i<n; i++){
			answer[i]=Long.valueOf(x)*(i+1);
		} 

		return answer;
	}

}
