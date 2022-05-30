package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion01 {
    public static void main(String[] args) throws Exception {

        //팩토리얼
        //https://www.acmicpc.net/problem/10872
        //problem10872();

        //피보나치 수 5
        //https://www.acmicpc.net/problem/10870
        //problem10870();
        
        //재귀함수가 뭔가요?
        //https://www.acmicpc.net/problem/17478
        problem17478();
    }

    private static void problem17478() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int currnent = 0;
        professorQnA(currnent, n);
    }

    private static void professorQnA(int currnent, int n) {
        String intro = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
        String question = "\"재귀함수가 뭔가요?\"";
        String answer01 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String answer02 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String answer03 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        String lastAnswer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
        String outtro = "라고 답변하였지.";

        if(currnent > n) return;
        if (currnent == 0) {
            System.out.println(intro);
        }

        String prefix = callPrefix(currnent);
        System.out.println(prefix + question);
        if(currnent != n) {
            System.out.println(prefix + answer01);
            System.out.println(prefix + answer02);
            System.out.println(prefix + answer03);
        }else {
            System.out.println(prefix + lastAnswer);
        }
        professorQnA(currnent+1, n);
        System.out.println(prefix + outtro);

    }

    private static String callPrefix(int currnent) {
        StringBuffer stringBuffer = new StringBuffer();
        String prefix = "____";
        for (int i = 0; i < currnent; i++) {
            stringBuffer.append(prefix);
        }
        return stringBuffer.toString();
    }

    private static void problem10870() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = pibonacheFive(n);
        System.out.println(result);
    }

    private static int pibonacheFive(int n) {
        if (n == 0 || n == 1) return n;
        else return pibonacheFive(n-1) + pibonacheFive(n-2);
    }

    private static void problem10872() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int result = factorial(n);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if(n > 0) return n * factorial(n-1);
        else if (n == 0) return 1;
        return 0;
    }
}
