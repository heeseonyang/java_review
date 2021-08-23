package bitarray;
/*
Q.
배열 크기 = 5
ar[0] = 27
ar[1] = 36
ar[2] = 25
ar[3] = 34
ar[4] = 12

거꾸로 출력
ar[4] = 12
ar[3] = 34
ar[2] = 25
ar[1] = 36
ar[0] = 27

짝수 데이터만 출력
ar[1] = 36
ar[3] = 34
ar[4] = 12

확장형for
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
		
		//배열출력
		System.out.println("배열 크기 = " + ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		//거꾸로 출력
		System.out.println("배열 크기 = " + ar.length);
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		//짝수만 출력
		System.out.println("배열 크기 = " + ar.length);
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.println("ar[" + i + "] = " + ar[i]);
			}
		}
		System.out.println();
		
		//확장형 for문
		for(int data: ar) { //ar배열 속에 있는 데이터를 하나씩 꺼내서 달라
			System.out.println(data);
			
		}

	}

}
