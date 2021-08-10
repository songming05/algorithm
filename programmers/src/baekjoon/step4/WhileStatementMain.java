package baekjoon.step4;

import java.io.*;

public class WhileStatementMain {

    public static void main(String[] args) throws IOException {
        //A+B - 5
        problem10952();

    }

    private static void problem10952() throws IOException {
        //https://www.acmicpc.net/problem/10952
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bufferedReader.readLine();

        while (input != null){
            String[] splitedInputs = input.split(" ");
            int a = Integer.parseInt(splitedInputs[0]);
            int b = Integer.parseInt(splitedInputs[1]);

            bufferedWriter.write(String.valueOf(a+b));
            input = bufferedReader.readLine();
            if("0 0".equals(input)) break;
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
