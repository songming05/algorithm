package programmers.kakao20;

public class SolutionMain {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/60057
		//2020kakao 문자열 압축
		String[] strInputArray = { "aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede",
				"xababcdcdababcdcd" };
		int[] numAnswerArray = { 7, 9, 8, 14, 17 };
		
		SolutionNonLossCompression solutionNonLossCompression = new SolutionNonLossCompression();
		for(int i=0; i<strInputArray.length; i++) {
			String s = strInputArray[i];
			int result = solutionNonLossCompression.solution(s);
			
			System.out.println("========== 정답: "+numAnswerArray[i]+", 나의 답: "+result+" ==========");
		}
		//==================================================================
		
		
		System.out.println("$$$$ 다음 문제 $$$$");
		//https://programmers.co.kr/learn/courses/30/lessons/60058
		//2020kakao 괄호변환
		strInputArray = new String[]{"(()())()", ")(", "()))((()"};
		String[] answerArray = {"(()())()", "()", "()(())()" };
		
		SolutionRightParenthesis solutionRightParenthesis = new SolutionRightParenthesis();
		for(int i=0; i<strInputArray.length; i++) {
			String p = strInputArray[i];
			String result = solutionRightParenthesis.solution(p);
			System.out.println("========== 정답: "+answerArray[i]+", 나의 답: "+result+" ==========");
			
		}
		//==================================================================
		

	}

}
