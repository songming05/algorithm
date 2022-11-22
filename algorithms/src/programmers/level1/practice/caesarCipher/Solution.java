package programmers.level1.practice.caesarCipher;

public class Solution {

	public static void main(String[] args) {
		//시저 암호 https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
		
		String[] s = {"AB", "z", "a B z", };
		int[] n = {1, 1, 4, };
		String[] answer = {"BC", "a", "e F d", };
		
		for(int i=0; i < answer.length; i++) {
			String result = solution(s[i], n[i]);
			System.out.println("answer : "+answer[i]+",\tresult : "+result);
		}
	}

	private static String solution(String s, int n) {
		String answer = "";
		
		char upperA = 'A';
		char upperZ = 'Z';
		char lowerA = 'a';
		char lowerZ = 'z';
		char[] upperCase = new char[26];
		char[] lowerCase = new char[26];
		
		for(int i = 0; i < 26; i++) {
			upperCase[i] = (char) (i+ upperA);
		}
		for(int i = 0; i < 26; i++) {
			lowerCase[i] = (char) (i + lowerA);
		}
		
		//n은 1~25		
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(upperA <= ch && ch <= upperZ) {
				int idx = (ch+n-upperA) % 26;
				answer += upperCase[idx];
			}else if(lowerA <= ch && ch <= lowerZ) {
				int idx = (ch+n-lowerA) % 26;
				answer += lowerCase[idx];
			}else {
				answer += ch;
			}
		}
		
		
		
		
        return answer;
	}

}
