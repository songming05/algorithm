package study.baekjoon.problem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicNote2920 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String solveProblem(int[] p) {
        logger.info("int[] p : {}", p);
        boolean isAsc = true;
        boolean isDesc = true;
        final int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        final int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < p.length; i++) {
            if(p[i] != asc[i]){
                isAsc = false;
            }
            if(p[i] != desc[i]){
                isDesc = false;
            }
        }
        String result = "";
        result = isAsc ? "ascending" : isDesc ? "descending" : "mixed";
        return result;
    }

    public String solveProblem(String[] p) {
        logger.warn("String[] p : {}", p);
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

    public void solveMusicNote2920(Scanner scanner, MusicNote2920 musicNote2920) {
        List<int[]> paramList = new ArrayList<int[]>();
        int[] case01 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] case02 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] case03 = {8, 1, 7, 2, 6, 3, 5, 4};
        paramList.add(case01);
        paramList.add(case02);
        paramList.add(case03);

        paramList.forEach(p -> {
            String result = musicNote2920.solveProblem(p);
            System.out.println("result :: "+result);
        });

        List<String[]> inputList = new ArrayList<String[]>();
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String[] input3 = scanner.nextLine().split(" ");
        inputList.add(input1);
        inputList.add(input2);
        inputList.add(input3);

        inputList.forEach(s -> {
            String result = musicNote2920.solveProblem(s);
            System.out.println("result :: "+result);
        });
    }
}
