package bitarray;

public class MultiArray01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][2]; //값 하나하나 넣기
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[2][0] = 50;
		ar[2][1] = 60;
		
		int[][] ar2 = {{10,20},{30,40},{50,60}}; //값 한 번에 넣기
		
		System.out.println("배열명 ar = " + ar);
		System.out.println();
		
		System.out.println("ar[0] = " + ar[0]);
		System.out.println("ar[1] = " + ar[1]);
		System.out.println("ar[2] = " + ar[2]);
		System.out.println();
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.println("ar["+i+"]["+j+"]=" + ar[i][j]);
			}
		}
		

	}

}
