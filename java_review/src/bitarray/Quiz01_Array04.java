package bitarray;
//A(65)���� Z(90)������ ���ĺ��� �������� 100�� ����ؼ�
//10�پ� ����ض�
//����� ���ĺ��� ������ ���� ���ض�
//�� ���ĺ��� ������ ���ض�

public class Quiz01_Array04 {

	public static void main(String[] args) {

		int[] ar = new int[100]; //�������� 100�� ��� 
		int count = 0; //10���� �������
		int sum = 0; //�� ���ؾ���
		int[] cnt = new int[26];

		//ar.length(100)��ŭ �����߻�
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 26) + 65;
		}

		//�߻��� ���� char�� ��ȯ�ؼ� ���
		for (int i = 0; i < ar.length; i++) {
			System.out.print((char) ar[i] + " ");
			count++;

			if (count % 10 == 0) { //���� ������ ��� 10���� �������� �� �������� 0�̸�
				System.out.println(); //�����ض�
			}

			sum += ar[i]; // ��

			for (int j =0; j < cnt.length; j++) {
				if (ar[i] == j + 65) // j�� ���簪�� 0�̴ϱ� A���� 65�� ����
					cnt[j]++; //���� �����ؼ� A�� ������ ����

			} // for j
		}

		System.out.println();
		System.out.println("��  = " + sum);

		for (int i = 0; i < cnt.length; i++) {//cnt�� ũ�⸸ŭ ������ ����? ���ĺ� A~Z�����ϱ�
			System.out.println((char)(i + 65) + "�� ���� = " + cnt[i]);
		}

	}

}
