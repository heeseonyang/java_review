package bitarray;

//배열 크기 입력 : 7
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

//합 = xxx
//최대값 = 
//최소값=

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01_Array05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열 크기 입력 : ");
		int size = Integer.parseInt(br.readLine());
		int sum=0;

		
		int[] ar = new int[size];
	
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar[" + i + "] : ");
			ar[i] = Integer.parseInt(br.readLine());
			
			sum += ar[i];
		}
		
		//최대값,최소값 : 초기값은 데이터 중 하나를 갖는다. (배열 속 1번째 데이터를 비교하는 것이 보편적)
		
		int max= ar[0]; //최대값
		int min= ar[0]; //최소값
		
		for(int i=0; i<size; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		
		
		//출력
		for(int data : ar) {
			System.out.print(data + " ");
		
		}
		System.out.println();
		
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
		
		
	}

}
