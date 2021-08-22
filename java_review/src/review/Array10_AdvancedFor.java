package review;

public class Array10_AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};//이 배열의 전체항목을 순차적으로 이용한다.
		
		int sum=0;
		for(int score : scores) { //scores의 개수만큼 반복된다.
			sum += score;
			
		}
		System.out.println("점수 총합= " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균= " + avg);
		
	}

}
