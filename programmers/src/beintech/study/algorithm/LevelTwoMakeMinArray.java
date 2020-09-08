package beintech.study.algorithm;

public class LevelTwoMakeMinArray {

	public int answer(int questionArrSize, String[] questionArr, int groupSize){
        int answer=0;
        
        int oneIndex = -1; //1의 index
        int divider = groupSize -1; //그룹단위 하나 포함할 것이므로 -1
        final int lastIdx = questionArr.length - 1;
        int quotient = 0; //몫
        int remainder = 0; //나머지
        
        for(int i=0; i<questionArrSize; i++	) {
        	if("1".equals(questionArr[i])) {
        		oneIndex = i;
        		quotient = i / divider;
        		remainder = i % divider;
        	}
        }
        
        if(quotient == 0 ) {//한그룹 || 나머지그룹
        	answer++;//처음그룹
        	int rests = (lastIdx - groupSize +1);
        	if(rests != 0) {
        		rests = rests / divider;
        		answer = answer + rests + 1;//마지막그룹
        	}
        }else if(quotient > 0) {//그룹단위 묷음 수 || 1들어있는 한그룹 || 나머지그룹
        	answer = quotient; //처음그룹
        	int midGr = oneIndex - remainder + (groupSize - 1);//중간그룹의 마지막 
        	if(remainder != 0) answer++;//중간그룹
        	if(midGr + 1 < lastIdx ) {
        		int rests = lastIdx - midGr;
        		if(rests != 0) {
            		rests = rests / divider;
            		answer = answer + rests + 1;//마지막그룹
            	}
        	}
        }
        return answer;
    }
}
