package bitarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz02_MultiArray01_Baseball {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int yn;
		int ball;
		int strike;
		

		do {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			yn = br.read();
			br.read();br.read(); // flush = 버퍼비우기 (엔터값삭제)

			if (yn == 'Y' || yn == 'y' || yn == 'n' || yn == 'N') break;

		} while (true);
		
		if(yn == 'y' || yn == 'Y') { //yes누르면
			
		System.out.println("게임을 시작합니다.");
		
		//난수발생
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			System.out.print(com[i] + " ");
			
			//중복제거★?
			for(int j=0; j<i; j++) {//?
				if(com[i] == com[j]) {//같으면
					i--;//i에서 -1
					break;
				}//if
			}//for j
		}//for i (난수)
		

		while(true) {//언제 맞출지 모르니까 while문 돌려
			//숫자입력
			System.out.print("숫자 입력: ");
			for(int i =0; i<user.length; i++) {
				user[i] = br.read()-48; //내가 입력한 숫자를 문자로 출력 그래서 다른 숫자나옴. 그래서 문자와 숫자 사이 값 빼줌
			}//for i
			br.read();br.read(); //flush
			
			//맞 틀 확인
			strike=ball=0;//여기서 초기화를 해줘야 매 게임마다 스트라이크,볼 갱신됨
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i] == user[i]) {
						if(i==j) strike++;
						else ball++;
					}//if
				}//for j
			}//for i
			System.out.println(strike + "스트라이크" + ball + "볼");
			if(strike == 3) break;
		}//while
		
		}//if(yes)
		System.out.println("프로그램을 종료합니다.");
		
		
			
			
	}//main
}//class

/*
 * 야구게임 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다 중복은 제거한다
 * 
 * [실행결과] 게임을 실행하시겠습니까?(Y/N) : w 게임을 실행하시겠습니까?(Y/N) : u 게임을 실행하시겠습니까?(Y/N) : n
 * while if n break; 프로그램을 종료합니다.
 * 
 * 게임을 실행하시겠습니까?(Y/N) : w
 * 
 * 게임을 시작합니다.
 * 
 * 숫자입력 : 123 user 0스트라이크 2볼 (위치 똑같이 맞춘건 0개지만 숫자 2개 맞춤)
 * 
 * 숫자입력 : 123 0스트라이크 1볼
 * 
 * 숫자입력 : 472 2스트라이크 0볼 ..
 * 
 * 숫자입력 : 372 3스트라이크 0볼
 * 
 */