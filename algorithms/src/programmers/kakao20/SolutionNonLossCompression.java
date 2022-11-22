package programmers.kakao20;

import java.util.*;

public class SolutionNonLossCompression {

	public int solution(String s) {
        int answer = 0;
        
        int half = s.length() / 2; //이상 진행하는 것은 압축불가
        
        List<String> strArray = new ArrayList<String>();
        for(int i=0; i<s.length()-1; i++) {
        	String str = s.substring(i, i+1);
        	strArray.add(str);
        }
        
        
        List<Integer> lengthList = new ArrayList<Integer>();
        
        for(int group = 1; group <= half; group++) {
        	StringBuffer compressStr = new StringBuffer();
            int loopCnt = 0;
            int cnt = 0;
            for(int i=0; i<s.length(); i = i+group) {
            	if(s.length() < i+group ) {
            		compressStr.append(s.substring(i));
            		break;
            	}
            	
            	String before = "";
            	String next = "";
            	before = s.substring(i, i+group);
            	if(i+group+group >= s.length()) next = s.substring(i+group);
        		else next = s.substring(i+group, i+group+group);
            	
//            	try {
//            		
//            	}catch (StringIndexOutOfBoundsException e) {
//					next = s.substring(i+group);
//					System.out.println("EX :: before: "+before+", next: "+next);
//				}
            	
                if(before.equals(next)) {
                	cnt++;
                	continue;
                }else {
                	loopCnt = cnt;
                	cnt = 0;
                }
                if(cnt == 0) {
                	if(loopCnt > 0) compressStr.append((loopCnt+1)+before);
                	else compressStr.append(before);
                	loopCnt = 0;
                }
            }
            
            //System.out.println(compressStr.toString());
            lengthList.add(compressStr.length());
        }
        
        Iterator<Integer> iter = lengthList.iterator();
        int min = s.length();
        while (iter.hasNext()) {
			int value = iter.next();
			if(min > value) min = value;
		}
        answer = min;
        
        return answer;
    }
}
