package array;

public class Array03_new {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		System.out.println();
		
		//�� �迭�� ���ο� �� ����
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		System.out.println();
		
		//�Ǽ�Ÿ�� �迭 �����
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println();
		
		//�� �迭�� ���ο� �� ����
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		System.out.println();
		
		arr3[0] = "��ȣ��";
		arr3[1] = "�輱ȣ";
		arr3[2] = "�ֿ��";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		
	}
	

}
