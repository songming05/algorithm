package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

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
        //problem2908();

        //다이얼
        //https://www.acmicpc.net/problem/5622
        //problem5622();
        //problem5622_01();
        //problem5622_02();

        //크로아티아 알파벳
        //https://www.acmicpc.net/problem/2941
        problem2941();

    }

    private static void problem2941() throws IOException {
        //String[] checker = {"c", "d", "l", "n", "s", "z"};

        //vars
        String[] croatia2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String croatia3 = "dz=";
        String checker = "cdlnsz";

        //input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String data = bufferedReader.readLine();
        String[] datas = data.split("");

        //result
        int result = data.length();

        //logic
        for (int i = 0; i < datas.length; i++) {
            String firstStr = datas[i];
            if(checker.indexOf(firstStr) > -1 && i + 1 < datas.length) {//OutOfIndex
                String str = firstStr + datas[i+1];
                for(String two : croatia2) {
                    if(two.equals(str)){
                        i++;
                        result--;
                        break;
                    }
                }

                //2글자 크로아티아 없으면
                if(!"d".equals(firstStr)) continue;
                if(i + 2 < datas.length) {//OutOfIndex
                    str += datas[i+2];
                    if(croatia3.equals(str)) {
                        i = i+2;
                        result = result-2;
                    }
                }
            }
        }//END for


        System.out.println(result);

    }

    private static void problem5622_02() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] str = reader.readLine().toUpperCase().toCharArray();
        int sum = 0;

        for (char c : str) {
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    sum += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sum += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sum += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sum += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sum += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sum += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 10;
                    break;
            }
        }

        System.out.println(sum);
    }

    private static void problem5622_01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int count = 0;

        for(int i=0; i<input.length; i++) {
            if('A' <= input[i] && input[i] < 'D')
                count += 3;
            else if('D' <= input[i] && input[i] < 'G')
                count += 4;
            else if('G' <= input[i] && input[i] < 'J')
                count += 5;
            else if('J' <= input[i] && input[i] < 'M')
                count += 6;
            else if('M' <= input[i] && input[i] < 'P')
                count += 7;
            else if('P' <= input[i] && input[i] < 'T')
                count += 8;
            else if('T' <= input[i] && input[i] < 'W')
                count += 9;
            else
                count += 10;
        }
        System.out.println(count);
    }

    private static void problem5622() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String data = bufferedReader.readLine();
        String[] splitedDatas = data.split("");

        int[] seconds = new int[11];
        String[] dials = new String[26];
        for (int i = 1; i < seconds.length; i++) {
            seconds[i] = i+1;
        }
        char alphabet = 'A';
        for(int i=0; i < dials.length; i++){
            dials[i] = String.valueOf(alphabet++);
        }

        Map<String, Integer> dialMap = new HashMap<>();
        int idx = 0;
        for (int i = 3; i < seconds.length; i++) {
            dialMap.put(dials[idx], i);
            dialMap.put(dials[idx + 1], i);
            dialMap.put(dials[idx + 2], i);
            if(i == 8) {
                dialMap.put(dials[idx + 3], i);
                idx = idx + 4;
            }
            else if (i == 10) {
                dialMap.put(dials[idx + 3], i);
            }
            else
                idx = idx + 3;
        }

        int result = 0;
        for (int i = 0; i < splitedDatas.length; i++) {
            result += dialMap.get(splitedDatas[i]);
        }

        System.out.println(result);
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
