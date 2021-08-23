package bitarray;
//행의 합과 열의 합을 구하여라
public class MultiArray02 {

	public static void main(String[] args) {
		int sum =0;
		int[][] ar = {{2,3,8},{8,9,1},{7,0,5}};
		
		//행의 합
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				sum += ar[i][j];
			}
			System.out.println(i+1 + "행의 합" + sum + "\t");
			sum=0;
		}
		
		
		//열의 합
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				sum += ar[j][i];
			}
			System.out.println(i+1+"열의 합" + sum + "\t");
			sum=0;
		}
		
		
		//우상향 대각선의 합
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				if(i+j ==2) {
					sum += ar[i][j];
				}//if
			}//for j
		}//for i
		System.out.println("우상향 대각선의 합 : " + sum + "\t");
		sum=0;
		
		
		//우하향 대각선의 합
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				if(i==j) {
					sum += ar[i][j];
				}//if
			}//for j
		}//for i
		System.out.println("우하향 대각선의 합 : " +sum + "\t");
		sum=0;

	}
}
