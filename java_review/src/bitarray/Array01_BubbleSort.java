package bitarray;

public class Array01_BubbleSort {

	public static void main(String[] args) {
		int[]ar = {8,4,1,7,3};
		
		//정렬 전
		System.out.print("정렬 전 : ");
		for(int x : ar) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//정렬
		int temp;
		for(int i=0; i<ar.length-1; i++) { //회차 , 소트는 두개씩 짝지어서 비교하니까 맨 뒤까지 갈 필요 없다.
			for(int j=0; j<ar.length-i-1; j++) { //인접한 숫자 비교. 뒤에 -i-1을 하는 이유는 첫회차가 끝나면 맨 뒷자리는 sort가 완료되기 때문에 비교할 필요 없어서
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}//if
			}//for j
		}//for i
		
		//정렬 후
		System.out.print("정렬 후 : ");
		for(int x : ar) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
