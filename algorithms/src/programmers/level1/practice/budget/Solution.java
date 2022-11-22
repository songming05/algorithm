package programmers.level1.practice.budget;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12982
		
		/*
		입출력 예
		d	budget	result
		[1,3,2,5,4]	9	3
		[2,2,3,3]	10	4
		*/
		
		int d[][] = {{1,3,2,5,4}, {2,2,3,3}};
		int budget[] = {9, 10};
		
		for(int i=0; i<2; i++) {
			System.out.println(solution(d[i], budget[i]));
		}
		

	}

	public static int solution(int[] d, int budget) {
		int answer = 0;
		int current = budget;

		Arrays.sort(d);

		for(int i=0; i<d.length; i++){
			if(current>=d[i]){
				current -= d[i];
				answer++;
			}
			else break;
		}
		return answer;
	}

}
