package programmers.level2.practice.findTheLargestSquare;

/**
 * https://programmers.co.kr/learn/courses/18/lessons/1879
 * 가장 큰 정사각형 찾기
 * 주어진 2차원 배열 내에서 1로 이루어진 가장 큰 정사각형 찾기
 * 오른쪽 아래를 기준으로, 그 전좌표들의 정사각형 최대 크기를 안다고 가정할 때, 가장 짧은(작은) 정사각형까지의 거리 + 1
 *
 */
public class FindTheLargestSquare {


    public static void main(String[] args) {

        FindTheLargestSquareSolution findTheLargestSquareSolution = FindTheLargestSquareSolution.newInstance();

        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        //answer 9
        int result = findTheLargestSquareSolution.solution(board);
        System.out.println("#Case1 \nresult :: " + result);

        board = new int[][]{{0,0,1,1},{1,1,1,1}};
        //answer 4
        result = findTheLargestSquareSolution.solution(board);
        System.out.println("\n#Case2 \nresult :: " + result);
    }
}
