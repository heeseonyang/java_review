package array;

public class Array03_new {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		System.out.println();
		
		//각 배열에 새로운 값 저장
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		System.out.println();
		
		//실수타입 배열 만들기
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println();
		
		//각 배열에 새로운 값 저장
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		System.out.println();
		
		arr3[0] = "이호석";
		arr3[1] = "김선호";
		arr3[2] = "최우식";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		
	}
	

}
