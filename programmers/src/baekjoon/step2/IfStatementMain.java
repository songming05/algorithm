package baekjoon.step2;

import java.util.Scanner;

public class IfStatementMain {

    public static void main(String[] args){

        //problem1330();

        //problem9498();
        
        //윤년
        //problem2753();

        //사분면 고르기 Quadrant n
        //problem14681();
        
        //알람 시계
        problem2884();
    }

    private static void problem2884() {
        //https://www.acmicpc.net/problem/2884
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInputs = input.split(" ");
        int hour = Integer.parseInt(splitedInputs[0]);
        int minute = Integer.parseInt(splitedInputs[1]);

        if(minute < 45) { //시간 -1
            hour = hour == 0 ? 23 : hour-1;
        }
        minute += 15; //45분 전이라는 것은 항상 분은 +15 분 된 결과이다.
        minute %= 60; //0~59분

        System.out.println(hour + " " + minute);
    }

    private static void problem14681() {
        //https://www.acmicpc.net/problem/14681
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int x = Integer.parseInt(input1);
        int y = Integer.parseInt(input2);

        String quadrant = "";
        if(x > 0){
            quadrant = y > 0 ? "1" : "4";
        }else if (x < 0){
            quadrant = y > 0 ? "2" : "3";
        }else{
            //0인 경우는 잘못된 입력이다.
        }

        System.out.println(quadrant);

    }

    private static void problem2753() {
        //https://www.acmicpc.net/problem/2753
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);

        //chek400multiple
        if(year % 400 == 0){
            System.out.println("1");
            return;
        }else if(year % 100 != 0 && year % 4 == 0){
            System.out.println("1");
            return;
        }

        System.out.println("0");
    }

    private static void problem9498() {
        //https://www.acmicpc.net/problem/9498
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        String result = "";
        switch (score / 10 ){
            case 10 :
            case 9 :
                result = "A";
                break;
            case 8 :
                result = "B";
                break;
            case 7 :
                result = "C";
                break;
            case 6 :
                result = "D";
                break;
            default:
                result = "F";
                break;
        }

        System.out.println(result);

    }

    private static void problem1330() {
        //https://www.acmicpc.net/problem/1330
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInput = input.split(" ");

        int a = Integer.parseInt(splitedInput[0]);
        int b = Integer.parseInt(splitedInput[1]);

        String result = a > b ? ">" : a < b ? "<" : "==";
        System.out.println(result);
    }
}
