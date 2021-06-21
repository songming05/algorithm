package study.baekjoon.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusicNote2920Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String result = solveProblem(input);
        System.out.println(result);
    }

    private static String solveProblem(String[] p) {
        boolean isAsc = true;
        boolean isDesc = true;
        final String[] asc = {"1", "2", "3", "4", "5", "6", "7", "8"};
        final String[] desc = {"8", "7", "6", "5", "4", "3", "2", "1"};
        for (int i = 0; i < p.length; i++) {
            if(!p[i].equals(asc[i])){
                isAsc = false;
            }
            if(!p[i].equals(desc[i])){
                isDesc = false;
            }
        }
        String result = "";
        result = isAsc ? "ascending" : isDesc ? "descending" : "mixed";
        return result;
    }
}
