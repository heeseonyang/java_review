package bitarray;
//A(65)부터 Z(90)까지의 알파벳을 랜덤으로 100번 출력해서
//10줄씩 출력해라
//출력한 알파벳의 숫자의 합을 구해라
//각 알파벳의 개수를 구해라

public class Quiz01_Array04 {

	public static void main(String[] args) {

		int[] ar = new int[100]; //랜덤으로 100개 출력 
		int count = 0; //10개씩 세어야함
		int sum = 0; //합 구해야함
		int[] cnt = new int[26];

		//ar.length(100)만큼 난수발생
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 26) + 65;
		}

		//발생한 난수 char로 변환해서 출력
		for (int i = 0; i < ar.length; i++) {
			System.out.print((char) ar[i] + " ");
			count++;

			if (count % 10 == 0) { //난수 갯수를 세어서 10으로 나누었을 때 나머지가 0이면
				System.out.println(); //개행해라
			}

			sum += ar[i]; // 합

			for (int j =0; j < cnt.length; j++) {
				if (ar[i] == j + 65) // j의 현재값이 0이니까 A값인 65를 더함
					cnt[j]++; //수를 누적해서 A의 개수를 구함

			} // for j
		}

		System.out.println();
		System.out.println("합  = " + sum);

		for (int i = 0; i < cnt.length; i++) {//cnt의 크기만큼 돌리는 이유? 알파벳 A~Z까지니까
			System.out.println((char)(i + 65) + "의 개수 = " + cnt[i]);
		}

	}

}
