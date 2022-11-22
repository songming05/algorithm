package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Temp {

	public static void main(String[] args) throws Exception {
		
		//stackPractice();
		
		stringCheck();
		

	}

	private static void stringCheck() {
		long n = 118372;
		
		long answer = 0;
	      String temp="";
	      String number = String.valueOf(n);//입력된 n을 문자열로 변환
	      
	      int[] arr = new int[number.length()];
	      for(int i=0; i<number.length(); i++){	    	 
	          //arr[i] = number.charAt(i) -'0';
	          arr[i] = Integer.parseInt(number.substring(i, i+1)); 
	          //System.out.println(Integer.parseInt(number.substring(i, i+1)) + " // "+ (number.charAt(i)-'0'));
	      }//for 배열arr에 각 자리 숫자
	      Arrays.sort(arr);
	      for(int i=0; i<arr.length; i++){
	          temp += arr[arr.length-i-1];
	      }//for 내림차순, 문자열 temp
	      answer = Long.parseLong(temp);
	      System.out.println(answer);
		
	}

	private static void stackPractice() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		try {
			input = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		int target = 0;
		try {
			 target = Integer.parseInt(input.trim());
		}catch (NumberFormatException e) {
			System.out.println("입력된 값이 숫자가 아닙니다.");
			return;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(target == 0) {
			System.out.println("자연수가 아닙니다.");
		}else if(target % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		String s = "";
		
		s.toUpperCase();
		for(int i=0; i< s.length(); i++)
		s.charAt(i);
		
		Stack<Integer> stackInt = new Stack<Integer>();
		stackInt.add(1);
		stackInt.size();
		//stackInt.get(index);
	}
	
	
}
