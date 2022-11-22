package baekjoon.step5;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;

public class FirstDimensionArrayMain {

	public static void main(String[] args) throws Exception {

		//최소, 최대
		//problem10818();

		//최댓값
		//https://www.acmicpc.net/problem/2562
		//problem2562();

		//숫자의 개수
		//https://www.acmicpc.net/problem/2577
		//problem2577();
		
		//나머지
		//https://www.acmicpc.net/problem/3052
		//problem3052();
		
		//평균
		//https://www.acmicpc.net/problem/1546
		//problem1546();
		
		//OX퀴즈
		//https://www.acmicpc.net/problem/8958
		//problem8958();
		
		//평균은 넘겠지
		//https://www.acmicpc.net/problem/4344
		problem4344();
	}

	private static void problem4344() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(bufferedReader.readLine());
		
		for(int i=0; i < count; i++) {
			String[] splitedInput = bufferedReader.readLine().split(" ");
			float n = Float.parseFloat(splitedInput[0]);
			int sum = 0;
			for(int j=1; j < splitedInput.length; j++) {
				sum += Integer.parseInt(splitedInput[j]);
			}
			float avg = sum / n;
			int overCount = 0;
			float percent = 0f;
			for(int j=1; j < splitedInput.length; j++) {
				overCount = Integer.parseInt(splitedInput[j]) > avg ? overCount+1: overCount;
			}
			percent = overCount / n  * 100;
			bufferedWriter.append(String.format("%.3f", percent));
			bufferedWriter.append("%");
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
	}

	private static void problem8958() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bufferedReader.readLine());
		final String O_MARK = "O";
		final String X_MARK = "X";
		for(int i=0; i < n; i++) {
			int valueWeight = 1; //점수가중치
			int score = 0; //최종점수
			String[] splitedInput = bufferedReader.readLine().split("");
			
			for(int j=0; j < splitedInput.length; j++) {
				String data = splitedInput[j];
				switch (data) {
				case O_MARK:
					score += valueWeight;
					valueWeight++;
					break;
					
				case X_MARK:
					valueWeight = 1;
					break;

				default:
					break;
				}
				
			}
			bufferedWriter.append(String.valueOf(score));
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
		
	}

	private static void problem1546() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bufferedReader.readLine());
		String input = bufferedReader.readLine();
		String[] splitedInput = input.split(" ");
		int[] scoreArray = new int[n];
		int max = 0;
		
		for(int i=0; i < splitedInput.length; i++) {
			int score = Integer.parseInt(splitedInput[i]);
			scoreArray[i] = score; 
			if(max < score) max = score;
		}
		
		float sum = 0;
		for(int data : scoreArray) {
			sum +=  (data / (float) max) * 100;
			//System.out.println(data+",\t"+sum);
		}
		System.out.println(String.valueOf(sum / n));	
	}

	private static void problem3052() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int divisor = 42; //제수
		int count = 10; //입력 row
		
		int[] modArray = new int[divisor];
		
		
		for(int i=0; i < count; i++) {
			int n = Integer.parseInt(bufferedReader.readLine());
			
			int mod = n % divisor;
			modArray[mod] = modArray[mod] + 1;
		}
		
		int result = 0;
		for(int n : modArray) {
			if(n != 0) result++;
		}
		System.out.println(String.valueOf(result));
		
	}

	private static void problem2577() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		//MAX 1,000,000,000
		int a = Integer.parseInt(bufferedReader.readLine());
		int b = Integer.parseInt(bufferedReader.readLine());
		int c = Integer.parseInt(bufferedReader.readLine());

		int result = a * b * c;

		String data = String.valueOf(result);
		int[] numArray = new int[10];
		for(int i=0; i<data.length(); i++) {
			int number = Integer.parseInt(data.substring(i, i+1));
			numArray[number] = numArray[number]+1;
		}

		for(int i=0; i < numArray.length; i++) {
			bufferedWriter.append(String.valueOf(numArray[i]));
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
	}

	private static void problem2562() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int place = 0;
		int max = 0;
		int count = 1;
		String input = bufferedReader.readLine();
		while(input != null ) {
			if("".equals(input)) break;
			int data = Integer.parseInt(input);
			if(max < data) {
				max = data;
				place = count;
			}

			count++;
			input = bufferedReader.readLine();
		}

		System.out.println(max+"\n"+place);

	}

	private static void problem10818() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = bufferedReader.readLine();
		String input = bufferedReader.readLine();
		int length = Integer.parseInt(n);
		int[] array = new int[length];
		String[] splitedInputs = input.split(" ");
		for (int i = 0; i < splitedInputs.length; i++) {
			array[i] = Integer.parseInt(splitedInputs[i]);
		}
		Arrays.sort(array);
		int min = array[0];
		int max = array[length-1];

		System.out.println(min+" "+max);
	}
}
