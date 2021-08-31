package programmers.secret;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChallengeSolution2 {

	public int[] solution(int[] numbers) {
		int[] answer = {};
		
		Set<Integer> sumSet = new HashSet<Integer>();
		for(int i=0; i<numbers.length; i++) {
			int origin = numbers[i];
			for(int j=i+1; j<numbers.length; j++) {
				sumSet.add(origin+numbers[j]);
			}
		}
		
		answer = new int[sumSet.size()];
		int idx = 0;
		for(int ele : sumSet) {
			//System.out.print(ele+", ");
			answer[idx++] = ele;
		}
		Arrays.sort(answer);
		for(int ele: answer) {
			System.out.print(ele+", ");
		}
		System.out.println();
		
        return answer;
	}

}
