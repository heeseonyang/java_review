package bitarray;

public class Array01_BubbleSort {

	public static void main(String[] args) {
		int[]ar = {8,4,1,7,3};
		
		//���� ��
		System.out.print("���� �� : ");
		for(int x : ar) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//����
		int temp;
		for(int i=0; i<ar.length-1; i++) { //ȸ�� , ��Ʈ�� �ΰ��� ¦��� ���ϴϱ� �� �ڱ��� �� �ʿ� ����.
			for(int j=0; j<ar.length-i-1; j++) { //������ ���� ��. �ڿ� -i-1�� �ϴ� ������ ùȸ���� ������ �� ���ڸ��� sort�� �Ϸ�Ǳ� ������ ���� �ʿ� ���
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}//if
			}//for j
		}//for i
		
		//���� ��
		System.out.print("���� �� : ");
		for(int x : ar) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
