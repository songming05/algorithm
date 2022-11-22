package programmers.level1.practice.soobaksoobak;

public class Solution {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
		
		/*
		example
		n	return
		3	수박수
		4	수박수박
		*/
		int input[] = {3,4};
		
		for(int idx : input) System.out.println(solution(idx));
		

	}

	public static String solution(int n){
		StringBuffer answer = new StringBuffer();
		String[] sb = new String[n];
		for(int i=0; i<sb.length; i++){
			if(i%2==0) sb[i] = "수";
			else sb[i]= "박";
		}//for
		for(String data : sb){
			answer.append(data);
		}//for extended
		return answer.toString();
	}

}
