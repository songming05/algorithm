package programmers.level2.practice.conquerTerritory;

/**
 * https://programmers.co.kr/learn/courses/18/lessons/846
 *
 * 동적프로그래밍 할때는 0부터 생각하지 말자,
 * 중간의 i 번째 부터 고민해도 좋을 것 같다.
 *
 * i 번째 행의 각 컬럼에는 최댓값이 고정적이다, 0인덱스에는 1,2,3 만 갈 수 있기 때문
 * 그렇다면 최대의 경로를 따를 때, 마지막에서부터 체크하면 된다.
 *
 */
public class ConquerTerritorySolution {
    public static ConquerTerritorySolution newInstance() {
        return new ConquerTerritorySolution();
    }

    public int solution(int[][] land) {
        int answer = 0;

        int row = land.length;
        int col = land[0].length; //4

        int[][] calcArr = new int[row+1][4];

        for (int i = 0; i < 4; i++) {
            calcArr[0][i] = land[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    if(j != k){
                        calcArr[i][j] = Math.max(calcArr[i][j], land[i][j] + calcArr[i-1][k]);
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, calcArr[row-1][i]);
        }

//        int[][] maxArray = land.clone();
//        System.out.println(maxArray);
//        System.out.println(land);

//        for (int i = 0; i < row; i++) {
//            //같은 줄에 중복 값이 없나..?
//            int maxIdx = 0;
//            for (int j = 1; j < col; j++) {
//                if(land[i][maxIdx] < land[i][j]){
//                    maxIdx = j;
//                }
//            }
//            maxArray[i] = new int[] {0,0,0,0};
//            maxArray[i][maxIdx] = land[i][maxIdx];
//        }
//
//        for (int i = 0; i < maxArray.length; i++) {
//            for (int j = 0; j < maxArray[i].length; j++) {
//                if(maxArray[i][i] != 0 ){
//                   if(i == maxArray.length-1) {
//                       answer += maxArray[i][j];
//                       break;
//                   }
//
//                   if(maxArray[i][j] > maxArray[i+1][j]){
//
//                   }
//                }
//            }
//        }

//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("{");
//        for (int i = 0; i < row; i++) {
//            stringBuffer.append("{ ");
//            for (int j = 0; j < col; j++) {
//                stringBuffer.append(maxArray[i][j]);
//                if(j != col-1) stringBuffer.append(", ");
//            }
//            stringBuffer.append(" }, ");
//        }
//        stringBuffer.append("}");
//
//        System.out.println(stringBuffer.toString());
        return answer;
    }
}
