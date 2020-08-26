package programmers.level1.kakao;

public class CranePickerMain {

	public static void main(String[] args) {
		//크레인인형뽑기 2019 카카오 개발자 겨울 인턴십
		//https://programmers.co.kr/learn/courses/30/lessons/64061	
		Solution solution = new Solution();
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}
		, {3,5,1,3,1}};		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int result = solution.solution(board, moves);		
		System.out.println("정답: 4 결과: "+result);
		
	}

}
