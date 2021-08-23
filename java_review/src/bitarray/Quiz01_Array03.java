package bitarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
Q. �迭�� ũ�⸦ �Է¹޾Ƽ� ������ �迭�� �����ϰ� ������ �Է� �� ����Ͻÿ�

[������]
�迭 ũ�� �Է� : 3

ar[0]�� �Է� : 87
ar[1]�� �Է� : -15
ar[2]�� �Է� : 20

87  -15  20
*/

public class Quiz01_Array03 {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�迭 ũ�� �Է� : ");
		int size = Integer.parseInt(br.readLine());
		
		int[] ar = new int[size];
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar[" + i + "]�� �Է� : ");
			ar[i] = Integer.parseInt(br.readLine());
		}

		for(int data : ar) {
			System.out.print(data + "\t");
		}
		
	}

}
