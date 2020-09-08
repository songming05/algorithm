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
				if(i>0 && j==0) {
					String aboveChar = questionArr[i-1][j];
					if(aboveChar.equals(questionArr[i][j])) {
						if("O".equals(aboveChar.toUpperCase())) changedChar = "X";
						else changedChar = "O";
						//System.out.println("aboveChar: "+aboveChar+", nowChar: "+questionArr[i][j]+", changedChar: "+changedChar);
						questionArr[i][j] = changedChar;
						changeCnt++;
					}
				}
				beforeChar = questionArr[i][j];
				afterChar = questionArr[i][j+1];
				//System.out.println("beforeChar: "+beforeChar+", afterChar: "+afterChar);
				
				if(beforeChar.equals(afterChar)) {
					if("O".equals(beforeChar.toUpperCase())) changedChar = "X";
					else changedChar = "O";
					changeCnt++;
					questionArr[i][j+1] = changedChar;
				}
			}
		}
	    
		answer = changeCnt;
        return answer;
	}


}
