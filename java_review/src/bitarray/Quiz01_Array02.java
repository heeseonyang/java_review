package bitarray;
/* Q. 문자열 입력 : 파인애플(str)
1번째 문자 : 파
2번째 문자 : 인
3번째 문자 : 애
4번째 문자 : 플

1번째 문자 : 도
2번째 문자 : 마
3번째 문자 : 뱀 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01_Array02 {
	
public static void main(String[] args) throws IOException{//구현
		
	System.out.println("확장 for문");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("문자열 입력 : ");
	String data = br.readLine();

	for(int i=0; i<data.length(); i++) {	
		System.out.println((i+1) + "번째 문자 : " + data.charAt(i));
	}

	}
}

