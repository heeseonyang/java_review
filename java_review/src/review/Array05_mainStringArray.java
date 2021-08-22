package review;

public class Array05_mainStringArray {
	
	//두개의 수를 입력받아 쓰는 프로그램
	public static void main(String[] args) {
		if(args.length != 2 ) {
			System.out.println("프로그램 사용법");
			System.out.println("java review.Array04_mainStringArray num1 num2");
			//java 패키지명.클래스명 num1 num2 -> 두개의 수를 입력해야한다. 패키지명은 생략 가능
			
			System.exit(0); //프로그램 종료
		}
		
		String strNum1 = args[0]; //우리가 숫자를 넣어도 문자열로 취급됨.
		String strNum2 = args[1];
		
		//숫자로 바꾸자
		int num1 = Integer.parseInt(strNum1); //strNum1에 저장된 문자열을 숫자로 변환!! 숫자만 가능하다 "3"이런거..
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	
	}
	

}
