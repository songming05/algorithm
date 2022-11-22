package programmers.level1.skillcheck;

import java.util.*;

public class Prime {

	public static void main(String[] args) {

		int n = 10;		
		System.out.println(solution(n));
		n=5;
		System.out.println(solution(n));
	}


	public static int solution(int n) {
		int answer = 0;
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int i=3; i<= 1000; i += 2) {
			int sw = 0; 
			for(int ele : prime) {
				if(i % ele == 0) {
					//i 는 합성수
					sw = 1;
					break;
				}
			}

			if(sw == 0) {
				//i는 소수
				prime.add(i);
			}
		}
		
		if(n <= 1000) {
			for(int i=0; i<prime.size(); i++) {
				if(n < prime.get(i)) {
					answer = i;
					break;
				}
			}
		}else {
			for(int i=0; i<prime.size(); i++) {
				if(n < Math.pow(prime.get(i), 2)) {
					answer = i;
					break;
				}
			}
		}
		

		//answer = prime.size();
		return answer;}
}
