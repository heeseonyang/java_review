package array;

public class Array04_Length {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		
		//배열의 길이를 직접 주지 않고 배열의 length을 이용하여 계산.
		int sum = 0;
		for(int i=0; i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
		
	}

}
