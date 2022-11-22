package programmers.secret;

public class ChallengeSolution1 {

	public int[] solution(int n) {
		int[] answer = {};
		
		int total = 0;
		int[][] shape = null;
		shape = new int[n][];
		for(int i=0; i<n; i++) {
			shape[i] = new int[i+1];
			total += i+1;
		}
//		shape[0][0] = 1;
//		shape[1][0] = 2;
//		shape[2][0] = 3;
//		shape[3][0] = 4;
//		shape[3][1] = 5;
//		shape[3][2] = 6;
//		shape[3][3] = 7;
//		shape[2][2] = 8;
//		shape[1][1] = 9;
//		//============
//		shape[2][1] = 10;
		
		//System.out.println("ss");
		int a0 = 0; 
		int an = n;
		int b0 = 0;
		int bn = n;		
		int ele = 1;
		
		for(int i=0; i<n/2; i++) {
			ele = oneCycle(shape, a0, an, b0, bn, ele, total);
			if(ele <= total) {
				a0 += 2;
				an -= 1;
				b0++;
				bn -= 2;
			}
			//System.out.println(ele);
		}
		
		for(int i=0; i<n; i++) {
			for(int e : shape[i]) {
				System.out.print(e+", ");
			}
			System.out.println();
		}
		
		
		
		
		
//		
//		int n1 = 0;
//		int n2 = 1;
//		for(int col1 = 0; col1<n; col1++) {
//			shape[col1][0] = ele++;
//		}
//		for(int col2 = 1; col2<n; col2++) {
//			shape[n-1][col2] = ele++; 
//		}
//		for(int col3 = n-2; col3 >= 1; col3--) {
//			shape[col3][col3] = ele++;
//		}
//		//=======
//		n1++;
//		n2++;
//		for(int c = n1+1; c<n-2*(n1); c++) {
//			shape[c][n1] = ele++;
//		}
//		for(int d = n2+1; d<n2+1; d++) {
//			//shape[]
//		}
		
		
		answer = new int[total];
        int index = 0;
        for(int i=0; i< n; i++){
            for(int j=0; j<i; j++){
                answer[index++] = shape[i][j];
            }
        }
		
        return answer;
	}

	private int oneCycle(int[][] shape, int a0, int an, int b0, int bn, int ele, int total) {
		for(int col1 = a0; col1<an; col1++) {
			shape[col1][b0] = ele++;
			if(ele > total) return ele;
		}
		
		for(int col2 = a0+1; col2<bn; col2++) {
			shape[an-1][col2] = ele++;
			if(ele > total) return ele;
		}
		
		for(int col3 = bn-2; col3 >= a0+1; col3--) {
			shape[col3][col3] = ele++;
			if(ele > total) return ele;
		}
		return ele;
	}

	private void oneCycle(int a0, int an, int b0, int bn, int ele) {
		// TODO Auto-generated method stub
		
	}

}
