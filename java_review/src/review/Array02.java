package review;

public class Array02 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87}; //배열을 먼저 선언하고 배열에 값을 넣을 땐 값만 쓰지 말고 new와 배열타입[]을 붙인다.
		
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);

	}
	
	//add라는 메소드의 매개변수로 int[] scores라는 배열변수가 선언되어있는 상황.
	//add는 배열객체의 항목들을 전부 다 더해서 
	public static int add(int[] scores) { 
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i]; //배열 안에 들어있는 항목 값의 누적
		}
		
		return sum1;
		
	}

}
