package array;

public class Array01 {
	
	public static void main(String[]args) {
		int[] score = {83, 90, 87};
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += score[i];
		
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum /3; //소수점 아래까지 정확히 출력하기 위해 실수/정수를 해준다.
		System.out.println("평균 : " + avg);
	}
	


}
