package programmers.level1.practice.soobaksoobak;

public class Solution {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
		
		/*
		example
		n	return
		3	���ڼ�
		4	���ڼ���
		*/
		int input[] = {3,4};
		
		for(int idx : input) System.out.println(solution(idx));
		

	}

	public static String solution(int n){
		StringBuffer answer = new StringBuffer();
		String[] sb = new String[n];
		for(int i=0; i<sb.length; i++){
			if(i%2==0) sb[i] = "��";
			else sb[i]= "��";
		}//for
		for(String data : sb){
			answer.append(data);
		}//for extended
		return answer.toString();
	}

}
