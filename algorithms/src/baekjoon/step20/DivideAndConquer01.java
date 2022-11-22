package baekjoon.step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DivideAndConquer01 {
    public static void main(String[] args) throws Exception {

        //색종이 만들기
        //https://www.acmicpc.net/problem/2630
        problem2630();
    }

    private static void problem2630() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[][] input = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] row = bufferedReader.readLine().split(" ");
            input[i] = row;
        }

        int[] countZeroWhite = new int[1];
        int[] countOneBlue = new int[1];
        scanThisSquare(input, n, countZeroWhite, countOneBlue);

//        System.out.println("countZeroWhite = " + countZeroWhite[0]);
//        System.out.println("countOneBlue = " + countOneBlue[0]);
        System.out.println(countZeroWhite[0]);
        System.out.println(countOneBlue[0]);
    }

    private static void scanThisSquare(String[][] square, int n, int[] countZeroWhite, int[] countOneBlue) {
        String color = validateWholeColor(square, n);
        if (color == null) {
            countWhiteOrBlueSquare(countZeroWhite, countOneBlue, n, square);
        } else if (color.equals("0")) {
            countZeroWhite[0] = countZeroWhite[0] + 1;
        } else if (color.equals("1")) {
            countOneBlue[0] = countOneBlue[0] + 1;
        }
    }

    private static void countWhiteOrBlueSquare(int[] countZeroWhite, int[] countOneBlue, int n, String[][] input) {
        int half = n / 2;
        String[][] firstSquare = new String[half][half];
        String[][] secondSquare = new String[half][half];
        String[][] thirdSquare = new String[half][half];
        String[][] fourthSquare = new String[half][half];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                firstSquare[i][j] = input[i][j];
            }
            for (int j = half; j < n; j++) {
                secondSquare[i][j - half] = input[i][j];
            }
        }

        for (int i = half; i < n; i++) {
            for (int j = 0; j < half; j++) {
                thirdSquare[i - half][j] = input[i][j];
            }
            for (int j = half; j < n; j++) {
                fourthSquare[i - half][j - half] = input[i][j];
            }
        }

        scanThisSquare(firstSquare, half, countZeroWhite, countOneBlue);

        scanThisSquare(secondSquare, half, countZeroWhite, countOneBlue);

        scanThisSquare(thirdSquare, half, countZeroWhite, countOneBlue);

        scanThisSquare(fourthSquare, half, countZeroWhite, countOneBlue);
    }

    private static String validateWholeColor(String[][] square, int size) {
        Set<String> dataSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            Set<String> collect = Arrays.stream(square[i]).collect(Collectors.toSet());
            if (collect.size() != 1) return null;
            else {
                dataSet.add(square[i][0]);
            }
        }
        if (dataSet.size() != 1) return null;
        return square[0][0];
    }
}
