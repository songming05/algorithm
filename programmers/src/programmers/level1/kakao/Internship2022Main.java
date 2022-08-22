package programmers.level1.kakao;

import java.util.HashMap;

public class Internship2022Main {

    public static void main(String[] args) {
        Internship2022Main internship2022Main = new Internship2022Main();
        internship2022Main.testYourPersonality();
    }

    private void testYourPersonality() {
        String[] survey = null;
        int[] choices = null;
        String result = null;
        survey = new String[] {"AN", "CF", "MJ", "RT", "NA"};
        choices = new int[] {5, 3, 2, 7, 5};
        System.out.println("ex1)");
        result = solution(survey, choices); //"TCMA";
        System.out.println(result);
        survey = new String[] {"TR", "RT", "TR"};
        choices = new int[] {7, 1, 3};
        System.out.println("ex2)");
        result = solution(survey, choices); //"RCJA"
        System.out.println(result);
    }

    private String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> accumulateChoice = new HashMap<>();
        String[] lefts = {"R", "C", "J", "A"};
        String[] rights = {"T", "F", "M", "N"};
        for (int i = 0; i < lefts.length; i++) {
            accumulateChoice.put(lefts[i], 0);
            accumulateChoice.put(rights[i], 0);
        }
        final int NON_COUNT = 4;
        for (int i = 0; i < survey.length; i++) {
            String[] diff = survey[i].split("");
            String typeA = diff[0];
            String typeB = diff[1];
            int choice = choices[i];
            int score = choice - NON_COUNT;
            if(score == 0) {
                continue;
            } else if(score > 0) {
                accumulateChoice.put(typeB, accumulateChoice.get(typeB) + Math.abs(score));
            } else if(score < 0) {
                accumulateChoice.put(typeA, accumulateChoice.get(typeA) + Math.abs(score));
            }
        }


        for (int i = 0; i < lefts.length; i++) {
            String typeX = lefts[i];
            String typeY = rights[i];
            int x = accumulateChoice.get(typeX);
            int y = accumulateChoice.get(typeY);
            if (x == y) {
                if (typeX.toCharArray()[0] < typeY.toCharArray()[0]) {
                    answer += typeX;
                } else {
                    answer += typeY;
                }
            } else if (x > y) {
                answer += typeX;
            } else {
                answer += typeY;
            }
        }



        return answer;
    }
}
