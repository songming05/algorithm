package programmers.level2.practice.conquerTerritory;

/**
 * https://programmers.co.kr/learn/courses/18/lessons/1880
 * 땅따먹기
 */
public class ConquerTerritory {

    public static void main(String[] args){
        ConquerTerritorySolution conquerTerritorySolution = ConquerTerritorySolution.newInstance();

        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        //answer  16
        int result = conquerTerritorySolution.solution(land);
        System.out.println("#Case1 result :: "+result);
    }
}
