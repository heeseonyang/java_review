package bitarray;
/* Q. ���ڿ� �Է� : ���ξ���(str)
1��° ���� : ��
2��° ���� : ��
3��° ���� : ��
4��° ���� : ��

1��° ���� : ��
2��° ���� : ��
3��° ���� : �� */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01_Array02 {
	
public static void main(String[] args) throws IOException{//����
		
	System.out.println("Ȯ�� for��");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("���ڿ� �Է� : ");
	String data = br.readLine();

	for(int i=0; i<data.length(); i++) {	
		System.out.println((i+1) + "��° ���� : " + data.charAt(i));
	}

	}
}

