package array;

public class Array04_Length {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		
		//�迭�� ���̸� ���� ���� �ʰ� �迭�� length�� �̿��Ͽ� ���.
		int sum = 0;
		for(int i=0; i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("��� : " + avg);
		
	}

}
