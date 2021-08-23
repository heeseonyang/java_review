package bitarray;

//�迭 ũ�� �Է� : 7
//
//ar[0] : 25
//ar[1] : 36
//ar[2] : -12
//ar[3] : 100
//ar[4] : 72
//ar[5] : 55
//ar[6] : 23
//
//25 36 -12 100 72 55 23

//�� = xxx
//�ִ밪 = 
//�ּҰ�=

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01_Array05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�迭 ũ�� �Է� : ");
		int size = Integer.parseInt(br.readLine());
		int sum=0;

		
		int[] ar = new int[size];
	
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar[" + i + "] : ");
			ar[i] = Integer.parseInt(br.readLine());
			
			sum += ar[i];
		}
		
		//�ִ밪,�ּҰ� : �ʱⰪ�� ������ �� �ϳ��� ���´�. (�迭 �� 1��° �����͸� ���ϴ� ���� ������)
		
		int max= ar[0]; //�ִ밪
		int min= ar[0]; //�ּҰ�
		
		for(int i=0; i<size; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		
		
		//���
		for(int data : ar) {
			System.out.print(data + " ");
		
		}
		System.out.println();
		
		System.out.println("�� = " + sum);
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
		
		
		
	}

}
