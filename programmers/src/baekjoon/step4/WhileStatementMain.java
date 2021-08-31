package baekjoon.step4;

import java.io.*;

public class WhileStatementMain {

    public static void main(String[] args) throws IOException {
        //A+B - 5
        //problem10952();

        //A+B - 4
        //problem10951();

        //더하기 사이클
        problem1110();

    }

    private static void problem1110() throws IOException {
        //https://www.acmicpc.net/problem/1110
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bufferedReader.readLine();
        int count = 0;
        int firstNum = Integer.parseInt(input);//26, 9
        int preNum = 0;
        int nextNum = 0;
        if(firstNum < 10)  {
            nextNum = (firstNum * 10) + (firstNum % 10);
            count++;
        }

        while (firstNum != nextNum){
            int a = 0;
            int b = 0;
            int sum = 0;


            count++;
        }

    }

    private static void problem10951() throws IOException {
        //https://www.acmicpc.net/problem/10951
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bufferedReader.readLine();

        while (input != null && !input.equals("")){
            String[] splitedInputs = input.split(" ");
            int a = Integer.parseInt(splitedInputs[0]);
            int b = Integer.parseInt(splitedInputs[1]);

            bufferedWriter.write(String.valueOf(a+b));
            input = bufferedReader.readLine();
            if(input != null) bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
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
