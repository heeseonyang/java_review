package bitarray;
/*
Q.
�迭 ũ�� = 5
ar[0] = 27
ar[1] = 36
ar[2] = 25
ar[3] = 34
ar[4] = 12

�Ųٷ� ���
ar[4] = 12
ar[3] = 34
ar[2] = 25
ar[1] = 36
ar[0] = 27

¦�� �����͸� ���
ar[1] = 36
ar[3] = 34
ar[4] = 12

Ȯ����for
27
36
25
34
12
 */
public class Quiz01_Array01 {

	public static void main(String[] args) {
		
		int[] ar = new int[5];
		
		ar[0] = 27;
		ar[1] = 36;
		ar[2] = 25;
		ar[3] = 34;
		ar[4] = 12;
		
		//�迭���
		System.out.println("�迭 ũ�� = " + ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		//�Ųٷ� ���
		System.out.println("�迭 ũ�� = " + ar.length);
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		//¦���� ���
		System.out.println("�迭 ũ�� = " + ar.length);
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.println("ar[" + i + "] = " + ar[i]);
			}
		}
		System.out.println();
		
		//Ȯ���� for��
		for(int data: ar) { //ar�迭 �ӿ� �ִ� �����͸� �ϳ��� ������ �޶�
			System.out.println(data);
			
		}

	}

}
