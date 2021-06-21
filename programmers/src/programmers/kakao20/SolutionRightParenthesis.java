package programmers.kakao20;

public class SolutionRightParenthesis {
	/*
	 * '(' 와 ')' 로만 이루어진 문자열이 있을 경우, '(' 의 개수와 ')' 의 개수가 같다면 이를 균형잡힌 괄호 문자열이라고 부릅니다.
	 * 그리고 여기에 '('와 ')'의 괄호의 짝도 모두 맞을 경우에는 이를 올바른 괄호 문자열이라고 부릅니다.
	 * 예를 들어, "(()))("와 같은 문자열은 균형잡힌 괄호 문자열 이지만 올바른 괄호 문자열은 아닙니다.
	 * 반면에 "(())()"와 같은 문자열은 균형잡힌 괄호 문자열 이면서 동시에 올바른 괄호 문자열 입니다.
	 * '(' 와 ')' 로만 이루어진 문자열 w가 균형잡힌 괄호 문자열 이라면 다음과 같은 과정을 통해 올바른 괄호 문자열로 변환할 수 있습니다.
	 */
	
	/*
	 * 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
	 * 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
	 * 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
	 * 	3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
	 * 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
	 * 	4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
	 * 	4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
	 * 	4-3. ')'를 다시 붙입니다.
	 * 	4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
	 * 	4-5. 생성된 문자열을 반환합니다.
	 */
	public String solution(String p) {
        String answer = "";
        if("".equals(p)) return "";
        
        int left = 0;
        int right = 0;
        String u = "";
        String v = "";
        
        for(int i=0; i<p.length(); i++) {
        	String temp = "";
        	temp = p.substring(i,i+1);
        	if("(".equals(temp)) {
        		left++;
        	}else if(")".equals(temp)) {
        		right++;
        	}
        	if(left == right && left != 0) {//균형잡힌 
        		u = p.substring(0, i+1);
        		v = p.substring(i+1);
        		break;
        	}
        }
        System.out.println("u: "+u+", v: "+v);
        
        String[] splitedU = u.split("\\(\\)", -1);
        String parsedU = "";
        for(int i=0; i<splitedU.length; i++) {
        	System.out.print(splitedU[i]+", ");
        	parsedU += splitedU[i];
        }
        System.out.println();

        
        
        
        
        
        recursive(p, "");
        return answer;
    }

	private String recursive(String u, String v) {
		if("".equals(u)) return "";
		
		
		return "";
	}
}
