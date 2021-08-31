package programmers.secret;

public class SecretMain {

	public static void main(String[] args) {
		//n은 1 이상 1,000 이하입니다.
		int[] n = {4, 5, 6};
		int[][] answer1 = {{1,2,9,3,10,8,4,5,6,7}, {1,2,12,3,13,11,4,14,15,10,5,6,7,8,9}, {1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11}};
		
		ChallengeSolution1 challengeSolution1 = new ChallengeSolution1();
		for(int i=0; i<n.length; i++) {
			int[] myAnswer = challengeSolution1.solution(n[i]);
		}
		
		
		int[] numbers = null;	
		int[] answer2 = null;
		int[] myAnswer2 = null;
		
		ChallengeSolution2 challengeSolution2 = new ChallengeSolution2();
		numbers = new int[] {2,1,3,4,1};
		answer2 = new int[] {2,3,4,5,6,7};
		myAnswer2 = challengeSolution2.solution(numbers);
		numbers = new int[] {5,0,2,7};
		answer2 = new int[] {2,5,7,9,12};
		myAnswer2 = challengeSolution2.solution(numbers);
		
	}

}
