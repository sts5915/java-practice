package practice01;
			// 6일차
import java.util.Scanner;
public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문
		// while
		// while 문의 형식
		// while(조건){    주어진 조건이 참이면 반복적으로 코드를 실행한다
		// 반복실행영역		  조건이 참이면 반복이 계속되고, 조건이 거짓이면 반복이 종료된다.
		// }
		
		// while(false){ while문의 조건에 false가 왔으므로 error가 발생한다
		// while문의 조건에 false가 와서 error가 발생하는 것은 문법적으로 문제가 있어서 error가 발생한다고 생각하는 것보다 
		// 자바에서는 반복 실행 영역의 구문이 동작하지 않을 반복 코드라는 것을 알려주기 위해 error가 발생한다고 이해하면 된다
		
//		int i= 0;									// 처음 i라는 값을 0으로 지정했다
//		while(i<10) {								// 그리고 i라는 값은 언제까지 반복할 것인가에 대한 기준점으로 사용될 것이다
//			System.out.println("Java Coding"+i);	// while문의 조건이 true라면 while의 중괄호 안 부분이 실행되고,
//			i++;	// i++은 i=i+1과 같다				// false면 실행되지 않고 while문 밖으로 나갈 것이다
//		}
		// 반복문 이해안되면 손으로 직접 다 적어보자
		
		// do ~ while
		// while 문은 조건이 참일 경우에만 중괄호 안 문장을 실행한다
		// 만약 조건을 만족하지 않는다면 반복문 안 문장을 한번도 실행하지 않을 수도 있다.
		// do while문은 이와 다르게 무조건 한번은 실행하게 하는 구문이다.
		// do while문 형식
		// do{						// do~while 부분을 무조건 한번 수행하고 이후에는 while문의 조건을 만족할때까지 반복을 한다.
		//   반복할 문장들
		// while()
		
//		int value=0;
//		Scanner sc = new Scanner(System.in);
//		
//		do {
//			value = sc.nextInt();
//			System.out.println("입력받은 값:"+value);
//		} while(value !=10);
//		System.out.println("반복문 종료!!");
		
		// for
		// for문의 형식
		// for(초기화; 종료조건; 반복실행){  // for문은 특정한 횟수만큼 반복 실행하는 경우 자주 사용된다.
		// 반복적으로 실행될 구문			 // for문과 while문은 서로 대체 가능하다	
		// }
		
//		for (int i=0; i<10; i++) { 					// 초기화 : 반복문이 실행될때 1회 실행된다
//			System.out.println("Java Coding"+i);	// 종료조건 : 초기화가 실행된 후 종료조건이 실행된다
//		}											// 종료조건의 값이 false일 때까지 반복문의 중괄호 구간의 코드가 반복 실행된다
													// 중괄호 구간의 실행이 끝나면 반복 실행이 실행된다. 일반적으로 i++와 같이 변수를 증가시키는 로직이 위치하고 이것이 실행된 후에 종료조건이 실행된다 
													// 종료조건이 false가 될때까지 이과정이 반복된다.
		
		// for과 while 은 서로 대체 가능한데 서로의 차이점을 잘 확인하고 쓰도록하자
		// 취향과 문제 조건에 따라 판단하에 쓰면 된다
		
		// 반복문이 없다면?
		// java coding을 10번 반복해서 출력하고 싶다면 출력코드를 10번 작성해야한다
		// 그러나 10번이 아니라 100번 1000번 이상이 된다면 힘들어서 반복문을 사용해야 한다
		
//		int i=0;
//		while(i<10) {
//			System.out.println("Java Coding");
//			i++;
//		} 
//		
		
//		int i=0;
//		while(i<10) {
//			System.out.println("Java Coding"+2*(i+1));
//			i++;
//		}
		
		// 반복 작업을 중간에 중단시키고 싶다면 break를 사용하면 된다
		// if문 뒤 괄호에 i==5가 들어왔기 때문에 i가 5가 되는 순간 if문 중괄호의 break문이 실행되러 반복문이 완전히 종료된다.
		
		// continue
		// continue 구문에 해당되는 부분만 실행이 안될뿐이지 반복문 자체를 중단하는 것이 아니기 때문에 5를 제외한 다음 숫자부터는 다시 반복하여 실행된다.
		
		// 반복문의 중첩
//		for (int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.println(i+""+j);
//			}
//		}
		
		// 퀴즈
		// error
		// coding lesson 0~4
		// coding lesson 0~1
		// coding lesson 0 1 3 4 
		
		// 문제 1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("n을 입력하세요: ");
//		int n= sc.nextInt();
//		for(int i=1; i<10; i++) {
//			if(i %3==0) {
//				System.out.println(i);
//			}
//		}
		
		// 문제 2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("n을 입력하세요: ");
//		int n = sc.nextInt();
//		for(int i=n ; i>=1; i--) {
//			System.out.println(i);
//		}
	
		// 문제 3
//		Scanner sc = new Scanner(System.in);   // prinln은 출력 후 줄바꿈을 포함하기 때문에 각각의 별표를 한줄씩 출력하게 된다
//		System.out.println("n을 입력하세요: ");	   // 그러므로 print를 사용해야 한다
//		int num=sc.nextInt();				   // print는 줄바꿈 없이 출력을 수행한다
//		for(int i=1; i<=num; i++) {			   // 마지막 println을 사용하지 않으면 줄바꿈이 안되므로 아래처럼 결과값이 출력된다
//			for(int j=0; j<i; j++) {		   // **********
//				System.out.print("*");		   // num=3
//			}System.out.println();			   // i = 1 - j=0 *
//		}								       // i = 2 - j=0
										       //         j=1 **
											   // i = 3 - j=0
											   //         j=1
											   //         j=2 ***
		
		
			
		
		
		
		
	}

}
