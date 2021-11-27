package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMain {

    public static void main(String[] args) throws Exception{
        //아스키코드
        //https://www.acmicpc.net/problem/11654
        //problem11654();

        //숫자의 합
        //https://www.acmicpc.net/problem/11720
        //problem11720();

        //알파벳 찾기
        //https://www.acmicpc.net/problem/10809
        //problem10809();

        //문자열 반복
        //https://www.acmicpc.net/problem/2675
        problem2675();


    }

    private static void problem2675() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < caseCount; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            String input = bufferedReader.readLine();
            String[] splitedData = input.split(" ");
            int loopCount = Integer.parseInt(splitedData[0]);
            String strData = splitedData[1];

            for(String s : strData.split("")){
                for (int j = 0; j < loopCount; j++) {
                    stringBuffer.append(s);
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }

    private static void problem10809() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char smallA = 'a';
        char[] alphabets = new char[26];
        int[] results = new int[26];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = smallA++;
        }

        String s = bufferedReader.readLine();
        for (int i = 0; i < results.length; i++) {
            results[i] = s.indexOf(alphabets[i]);
            System.out.print(results[i]+" ");
        }
    }

    private static void problem11720() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        String[] datas = bufferedReader.readLine().split("");
        int sum = 0;
        for (int i = 0; i < datas.length; i++) {
            sum += Integer.parseInt(datas[i]);
        }
        System.out.println(sum);
    }

    private static void problem11654() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        char[] asciis = input.toCharArray();
        System.out.println((int) asciis[0]);
    }
}