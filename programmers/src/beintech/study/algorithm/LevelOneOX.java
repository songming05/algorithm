package beintech.study.algorithm;

public class LevelOneOX {
	

	public int answer(int questionArrSize, String[][] questionArr) {
		int answer=0;
        
		
		String beforeChar = "";
		String afterChar = "";
		String changedChar = "";

		int changeCnt = 0;
		
		for(int i=0; i<questionArrSize; i++) {
			for(int j=0; j<questionArr[i].length-1; j++) {
				beforeChar = questionArr[i][j];
				afterChar = questionArr[i][j+1];
				System.out.println("beforeChar: "+beforeChar+", afterChar: "+afterChar);
				
				if(beforeChar.equals(afterChar)) {
					if("O".equals(beforeChar.toUpperCase())) changedChar = "X";
					else changedChar = "O";
					changeCnt++;
				}
				questionArr[i][j+1] = changedChar;
			}
		}
	    
		answer = changeCnt;
        return answer;
	}


}
