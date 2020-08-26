package programmers.level1.kakao;

import java.util.*;

public class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		//System.out.println(board.length);
		List<Stack<Integer>> stackList = new ArrayList<Stack<Integer>>();
		for(int i=0; i<board.length; i++) {
			stackList.add(new Stack<Integer>());
		}
		
		for(int i=board.length-1; i>=0; i--) {
			for(int j=0; j<board[i].length; j++) {
				int numDoll = board[i][j];
				Stack<Integer> boardStack = stackList.get(j);
				if(numDoll != 0) {
					boardStack.push(numDoll);
				}
			}
		}
		
		Stack<Integer> craneStack = new Stack<Integer>();
		for(int i=0; i<moves.length; i++) {
			int numCrane = moves[i]-1;
			Stack<Integer> targetStack = stackList.get(numCrane);
			if(targetStack.isEmpty()) continue;
			int numDoll = targetStack.pop();
			//System.out.println("numCrane :: "+numCrane+",  numDoll :: "+numDoll);			
			if(!craneStack.isEmpty()) {
				//System.out.println("stackPeek :: "+craneStack.peek());
				if(craneStack.peek() == numDoll) {
					craneStack.pop();
					answer = answer + 2;
					continue;
				}
			}
			craneStack.push(numDoll);
		}
		
		
		return answer;
	}
}
