package review;

public class Array10_AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};//�� �迭�� ��ü�׸��� ���������� �̿��Ѵ�.
		
		int sum=0;
		for(int score : scores) { //scores�� ������ŭ �ݺ��ȴ�.
			sum += score;
			
		}
		System.out.println("���� ����= " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ���= " + avg);
		
	}

}
