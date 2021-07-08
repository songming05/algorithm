package study.programmers.kakao.code2017;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/1840
 */
public class SmartProdo {

    public static void main(String[] args){
        //solution(int n, int m, int[] a, int[] b, int k, int m1, int m2, int[] e1, int[] e2)
        int n = 5;
        int m = 6;
        int[] a = {1, 1, 2, 2, 3, 4};
        int[] b = {2, 3, 3, 4, 5, 5};
        int k = 2;
        int m1 = 2;
        int m2 = 2;
        int[] e1 = {3, 6};
        int[] e2 = {2, 4};
        int[][] answer = {{0, 3}, {1, 2}, {0, 6}, {1, 4}};

        SmartProdoSolution smartProdoSolution = SmartProdoSolution.newInstance();

        int[][] myAnswer = smartProdoSolution.solution(n, m, a, b, k, m1, m2, e1, e2);

        StringBuffer sbPrintAnswer = new StringBuffer();
        sbPrintAnswer.append("[");
        for (int i = 0; i < myAnswer.length; i++) {
            sbPrintAnswer.append("[");
            for (int j = 0; j < myAnswer[i].length; j++) {
                sbPrintAnswer.append(myAnswer[i][j]);
                if(j != myAnswer[i].length-1)
                    sbPrintAnswer.append(", ");
            }
            sbPrintAnswer.append("]");
            if(i != myAnswer.length-1)
                sbPrintAnswer.append(", ");
        }
        sbPrintAnswer.append("]");

        System.out.println("myAnswer :: " + sbPrintAnswer.toString());
    }
}
