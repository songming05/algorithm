package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

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
        //problem2675();

        //단어공부
        //https://www.acmicpc.net/problem/1157
        //problem1157();

        //단어의 개수
        //https://www.acmicpc.net/problem/1152
        //problem1152();

        //상수
        //https://www.acmicpc.net/problem/2908
        problem2908();

    }

    private static void problem2908() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String data = bufferedReader.readLine();
        String[] datas = data.split(" ");
        String originA = datas[0];
        String originB = datas[1];
        int length = 3;
        String reversA = "" + originA.charAt(length-1) + originA.charAt(length-2) + originA.charAt(length-3);
        String reversB = "" + originB.charAt(length-1) + originB.charAt(length-2) + originB.charAt(length-3);

        int a = Integer.parseInt(reversA);
        int b = Integer.parseInt(reversB);
        int max = 0;

        max = Math.max(a, b);
        System.out.println(max);
    }

    private static void problem1152() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String data = bufferedReader.readLine();
        String[] splitedDatas = data.split(" ");
        if(splitedDatas.length == 0) {
            System.out.println(0);
            return;
        }
        int count = splitedDatas.length;
        if ("".equals(splitedDatas[0])) {
            count--;
        }
        if ("".equals(splitedDatas[splitedDatas.length-1])) {
            count--;
        }
        System.out.println(count);
    }

    private static void problem1157() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String data = bufferedReader.readLine();
        data = data.toLowerCase();
        char[] dataArray = data.toCharArray();
        String spells = "";
        int[] sumCount = new int[dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            char c = dataArray[i];
            if(spells.contains(String.valueOf(c))){
                int index = spells.indexOf(c);
                sumCount[index]++;
            } else {
                spells += String.valueOf(c);
                sumCount[spells.length()-1]++;
            }
        }

        int max = 0;
        int maxValueIndex = -1;
        boolean hasSameValue = false;
        for (int i = 0; i < sumCount.length; i++) {
            int num = sumCount[i];
            if(max <= num){
                if(max == num) hasSameValue = true;
                else hasSameValue = false;
                max = num;
                maxValueIndex = i;
            }
        }

        if(hasSameValue) System.out.println("?");
        else System.out.println(spells.toUpperCase().charAt(maxValueIndex));
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
