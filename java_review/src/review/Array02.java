package review;

public class Array02 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87}; //�迭�� ���� �����ϰ� �迭�� ���� ���� �� ���� ���� ���� new�� �迭Ÿ��[]�� ���δ�.
		
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("���� : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("���� : " + sum2);

	}
	
	//add��� �޼ҵ��� �Ű������� int[] scores��� �迭������ ����Ǿ��ִ� ��Ȳ.
	//add�� �迭��ü�� �׸���� ���� �� ���ؼ� 
	public static int add(int[] scores) { 
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i]; //�迭 �ȿ� ����ִ� �׸� ���� ����
		}
		
		return sum1;
		
	}

}
