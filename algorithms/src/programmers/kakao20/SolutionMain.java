package programmers.kakao20;

import java.text.SimpleDateFormat;
import java.util.*;

public class SolutionMain {

	public static void main(String[] args) {
		
		
		String p = "PM 11:59:59";
		int n = 1;
		
		String[] splt  = p.split(" ");
		String div = splt[0].toUpperCase();
		String[] times = splt[1].split(":");
		int hrs = Integer.parseInt(times[0]);
		int min= Integer.parseInt(times[1]);
		int sec = Integer.parseInt(times[2]);
		int hourOfDay = 0;			
		
		if("AM".equals(div)) {
			hourOfDay = hrs;
		}else if("PM".equals(div)) {
			hourOfDay = 12+hrs;
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 10, 10, hourOfDay, min, sec);
		calendar.add(Calendar.SECOND, n);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		
		
		System.exit(0);
		
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
//			String p = strInputArray[i];
//			String result = solutionRightParenthesis.solution(p);
//			System.out.println("========== 정답: "+answerArray[i]+", 나의 답: "+result+" ==========");
			
		}
		//==================================================================
		

	}

}
