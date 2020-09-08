package beintech.study.algorithm;

public class AnswerMain {

	public static void main(String[] args) {
		String[][] questionArr;
		int questionArrSize;
		/* 
		 * 1. QUESTIONARRSIZE X QUESTIONARRSIZE 사이즈만큼의 이중 배열이 있다
		 * 2. 이 배열에는 O 또는 X 가 무작위 순서로 입력되어 있다
		 * 3. 배열의 값을 아래와 같이 반복되지만 않도록 변경하려한다.
		 * 4.   ex)QUESTIONARRSIZE = 3
		 *             O X O           X O X
		 *             X O X       OR     O X O
		 *             O X O             X O X
		 * 5. 변경해야 할 O,X의 최소 갯수를 출력하자.        
		 * */

		//예시 1 START*******************************************/
		
		// 변경 위치  (2,1)
		//        {"O","X"}    >    {"O","X"}
		//        {"O","O"}        {"X","O"}
		// 최소 변경 횟수     1회
		//예시 1 END*******************************************/

		//예시 2 START*******************************************/                                        

		// 변경 위치 (2,2) , (3,2)
		//        {"X","O","X"}    >    {"X","O","X"}
		//        {"O","O","O"}        {"O","X","O"}
		//        {"X","X","X"}        {"X","O","X"}
		// 최소 변경 횟수     2회
		//예시 2 END*******************************************/        

		//예시 3 START*******************************************/        

		// 변경 위치 (1,1) , (1,3), (2,3), (2,4), (3,1), (3,2), (4,2), (4,4)
		//        {"X","X","X","X"}    >    {"O","X","O","X"}
		//        {"X","O","O","X"}        {"X","O","X","O"}
		//        {"X","O","O","X"}        {"O","X","O","X"}
		//        {"X","X","X","X"}        {"X","O","X","O"}
		// 최소 변경 횟수     8회
		//예시 3 END*******************************************/
		//X, !O, X, !O
		//!O, !X, O, X
		//X, O, !X, !O
		//!O, X, !O, X

		LevelOneOX levelOneOX =  new LevelOneOX();
		//EXAMPL1
		questionArrSize = 2;    
		questionArr = new String[][]{{"O","X"},{"O","O"}};
		System.out.println("결과 (1) > " + levelOneOX.answer(questionArrSize, questionArr));
		
		//EXAMPL2
		questionArrSize = 3;
		questionArr = new String[][] { { "X", "O", "X" }, { "O", "O", "O" }, { "X", "X", "X" } };
		System.out.println("결과 (2) > " + levelOneOX.answer(questionArrSize, questionArr));
		
		questionArrSize = 4;                    
		questionArr = new String[][] { { "X", "X", "X", "X" }, { "X", "O", "O", "X" }, { "X", "O", "O", "X" },
				{ "X", "X", "X", "X" } };
		System.out.println("결과 (3) > " + levelOneOX.answer(questionArrSize, questionArr));
		
		
		
		System.out.println("\n$$$$ 다음 문제 $$$$\n");
		
		String[] questionArr2;
		int questionArrSize2;
		int groupSize;
		/* 
         * 1. 1부터 QUESTIONARRSIZE 까지 일련된 정수가 입력된 배열이 있다.
         * 2. 배열의 모든 정수를 배열의 숫자중 최소값 으로 변경하려 한다.
         * 3. 한번 변경시 GROUPSIZE 만큼 숫자를 묶어서 최소값으로 변경 할 수 있다.
         * 4. 최소 변경 횟수를 구하자.
         * */
 
        //예시 1 START*******************************************/
        // 최소 변경 흐름    {"2","1","3"} > {"1","1","1"}
        // 최소 변경 횟수    1회
        //예시 1 END*******************************************/
 
        //예시 2 START*******************************************/
        // 최소 변경 흐름     {"2","4","3","1","7","9","10","5","8","6"}
        //                {"1","1","1","1","1","9","10","5","8","6"}
        //                {"1","1","1","1","1","1","1","1","1","6"}
        //                {"1","1","1","1","1","1","1","1","1","1"}
        // 최소 변경 횟수   3회
        //예시 2 END*******************************************/
        
        //예시 3 START*******************************************/
        //  최소 변경 흐름     {"6","7","4","3","5","2","1"}
        //                {"6","7","4","3","5","1","1"}
        //                {"6","7","4","3","1","1","1"}
        //                {"6","7","4","1","1","1","1"}
        //                {"6","7","1","1","1","1","1"}
        //                {"6","1","1","1","1","1","1"}
        //                {"1","1","1","1","1","1","1"}
        // 최소 변경 횟수  6회
        //예시 3 END*******************************************/
		
		// 의심가는 케이스
//		{"6","7","4","3","5","1","2","11","13","10","8","9","12"}
//		{"6","7","4","3","1","1","1","1","1","10","8","9","12"}
//		{"1","1","1","1","1","1","1","1","1","10","8","9","12"}
//		{"1","1","1","1","1","1","1","1","1","1","1","1","1"}
		//13개- 5묶음
		//idx 5 자리에 1
        
		LevelTwoMakeMinArray levelTwoMakeMinArray = new LevelTwoMakeMinArray();
		
        questionArrSize2 = 3;
        questionArr2 = new String[]{"2","1","3"};
        groupSize = 3;
        System.out.println("결과 (1) > " + levelTwoMakeMinArray.answer(questionArrSize2, questionArr2, groupSize));
					
        questionArrSize2 = 10;
        questionArr2 = new String[]{"2","4","3","1","7","9","10","5","8","6"};
        groupSize = 5;
        System.out.println("결과 (2) > " + levelTwoMakeMinArray.answer(questionArrSize2, questionArr2, groupSize));
        
        questionArrSize2 = 7;
        questionArr2 = new String[]{"6","7","4","3","5","2","1"};
        groupSize = 2;
        System.out.println("결과 (3) > " + levelTwoMakeMinArray.answer(questionArrSize2, questionArr2, groupSize));
        
        questionArrSize2 = 13;
        questionArr2 = new String[]{"6","7","4","3","5","1","2","11","13","10","8","9","12"};
        groupSize = 5;
        System.out.println("결과 (4) > " + levelTwoMakeMinArray.answer(questionArrSize2, questionArr2, groupSize));

	}

}
