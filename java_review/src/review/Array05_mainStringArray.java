package review;

public class Array05_mainStringArray {
	
	//�ΰ��� ���� �Է¹޾� ���� ���α׷�
	public static void main(String[] args) {
		if(args.length != 2 ) {
			System.out.println("���α׷� ����");
			System.out.println("java review.Array04_mainStringArray num1 num2");
			//java ��Ű����.Ŭ������ num1 num2 -> �ΰ��� ���� �Է��ؾ��Ѵ�. ��Ű������ ���� ����
			
			System.exit(0); //���α׷� ����
		}
		
		String strNum1 = args[0]; //�츮�� ���ڸ� �־ ���ڿ��� ��޵�.
		String strNum2 = args[1];
		
		//���ڷ� �ٲ���
		int num1 = Integer.parseInt(strNum1); //strNum1�� ����� ���ڿ��� ���ڷ� ��ȯ!! ���ڸ� �����ϴ� "3"�̷���..
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	
	}
	

}
