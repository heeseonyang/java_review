package bitarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz02_MultiArray01_Baseball {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int yn;
		int ball;
		int strike;
		

		do {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = br.read();
			br.read();br.read(); // flush = ���ۺ��� (���Ͱ�����)

			if (yn == 'Y' || yn == 'y' || yn == 'n' || yn == 'N') break;

		} while (true);
		
		if(yn == 'y' || yn == 'Y') { //yes������
			
		System.out.println("������ �����մϴ�.");
		
		//�����߻�
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			System.out.print(com[i] + " ");
			
			//�ߺ����š�?
			for(int j=0; j<i; j++) {//?
				if(com[i] == com[j]) {//������
					i--;//i���� -1
					break;
				}//if
			}//for j
		}//for i (����)
		

		while(true) {//���� ������ �𸣴ϱ� while�� ����
			//�����Է�
			System.out.print("���� �Է�: ");
			for(int i =0; i<user.length; i++) {
				user[i] = br.read()-48; //���� �Է��� ���ڸ� ���ڷ� ��� �׷��� �ٸ� ���ڳ���. �׷��� ���ڿ� ���� ���� �� ����
			}//for i
			br.read();br.read(); //flush
			
			//�� Ʋ Ȯ��
			strike=ball=0;//���⼭ �ʱ�ȭ�� ����� �� ���Ӹ��� ��Ʈ����ũ,�� ���ŵ�
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i] == user[i]) {
						if(i==j) strike++;
						else ball++;
					}//if
				}//for j
			}//for i
			System.out.println(strike + "��Ʈ����ũ" + ball + "��");
			if(strike == 3) break;
		}//while
		
		}//if(yes)
		System.out.println("���α׷��� �����մϴ�.");
		
		
			
			
	}//main
}//class

/*
 * �߱����� ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ� �ߺ��� �����Ѵ�
 * 
 * [������] ������ �����Ͻðڽ��ϱ�?(Y/N) : w ������ �����Ͻðڽ��ϱ�?(Y/N) : u ������ �����Ͻðڽ��ϱ�?(Y/N) : n
 * while if n break; ���α׷��� �����մϴ�.
 * 
 * ������ �����Ͻðڽ��ϱ�?(Y/N) : w
 * 
 * ������ �����մϴ�.
 * 
 * �����Է� : 123 user 0��Ʈ����ũ 2�� (��ġ �Ȱ��� ����� 0������ ���� 2�� ����)
 * 
 * �����Է� : 123 0��Ʈ����ũ 1��
 * 
 * �����Է� : 472 2��Ʈ����ũ 0�� ..
 * 
 * �����Է� : 372 3��Ʈ����ũ 0��
 * 
 */