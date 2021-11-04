package programmers.level2.practice;

public class Level2Main {

    public static void main(String[] args) throws Exception {
        System.out.println("START");
        //124 나라의 숫자
        //https://programmers.co.kr/learn/courses/30/lessons/12899
        countryOf124();
    }

    private static void countryOf124() {
        System.out.println(countryOf124Solution(1));//1
        System.out.println(countryOf124Solution(2));//2
        System.out.println(countryOf124Solution(3));//4
        System.out.println(countryOf124Solution(4));//11
        System.out.println(countryOf124Solution(40));
    }

    private static String countryOf124Solution(int n) {
        String answer = "";
        StringBuffer stringBuffer = new StringBuffer();
        countryRule(n, stringBuffer);
        answer = stringBuffer.toString();

        return answer;
    }

    private static void countryRule(int n, StringBuffer stringBuffer) {
        int q = n / 3;
        int r = n % 3;
        if(r == 0) q--;

        if(q > 3) countryRule(q, stringBuffer);
        if(q == 1) {
            stringBuffer.append("1");
        }else if(q == 2) {
            stringBuffer.append("2");
        }else if(q == 3) {
            stringBuffer.append("4");
        }

        if(r == 1) {
            stringBuffer.append("1");
        }else if(r == 2) {
            stringBuffer.append("2");
        }else if(r == 0) {
            stringBuffer.append("4");
        }
    }
}
