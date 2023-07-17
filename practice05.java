package practice01;
		// 4일차
import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건문
		// if (조건문의 핵심)
		// 조건문은 if로 시작한다. 즉, if가 있으면 조건문의 시작라는걸 알면된다.
		
		// if(){ 
		// if뒤의 괄호를 if절이라고 부르고, 괄호에는 true 값 또는 false 값 두가지 값 중 하나만이 들어올 수 있다.
		// 중괄호와 중괄호가 감싸고 있는 구간을 then절이라고 부른다.
		// if뒤의 괄호()에 true 값이 들어온다면 중괄호{}안의 코드가 한줄씩 실행된다.
		// if뒤의 괄호()에 false 값이 들어온다면 중괄호{}안의 코드는 실행되지 않는다.
		
		//if(true){
			
		//System.out.println("result : true");
		//}
		//if(false) {
		//System.out.println("result : true");
		//}
		//if(true) {
		//System.out.println(1);
		//}
		//System.out.println(5);
		//if(false) {
		//System.out.println(1);
		//}
		//System.out.println(5);
		
		// 퀴즈
		// 시작
		// true 값 false 값
		// Java if가 true값이라서
		// 아무것도 출력되지 않는다 if가 false값이라서
		
		// else
		// if가 이끄는 코드를 한덩어리로 가지고 있게 하기 위해서는 다른 문법적인 요소가 피요하게 되는데 그것을 else라고 한다
		// if(){  (A) } else{(B)} if(true)면 (A)영역의 코드가 실행
		//                        if(false)면 (B)영역의 코드가 실행
		
		//if(true) {
		//	System.out.println(1);
		//} else {
		//	System.out.println(2);
		//}
		//if(false) {
		//	System.out.println(1);
		//} else {
		//	System.out.println(2);
		//}
		
		// else if
		//if(){(A)} else if(){(B)} else {(C)} if(true값) > (A)
		//									  if(false값)> else if(true값) > (B)
		//									  if(false값)> else if(false값)> (C)
		//if(false) {
		//	System.out.println(1);
		//} else if(false) {
		//	System.out.println(2);     // 조건문에서는 true가 한번이라도 발견되면 true가 처음으로 등장한 구간이 실행되고 if문은 종료가 된다.
		//} else if(true) {
		//	System.out.println(3);
		//} else {
		//	System.out.println(4);
		//}
		
		// 퀴즈
		// 90
		// 자두 
		
		// 문제 1
		//int a=6;
		//if(a%2==0) {
		//	System.out.println("6은 2의 배수");
		//} 
		//if(a%3==0) {
		//	System.out.println("6은 3의 배수");
		//}
		//if(a%4==0){
		//	System.out.println("6은 4의 배수");
		//}
		
		// 문제2
		//int num = 5;
		//if(num%2==0) {
		//	System.out.println("5는 짝수입니다.");
		//} else if(num%2!=0) {
		//	System.out.println("5는 홀수입니다.");
		//}
		//int num = 5;
		//if(num%2!=0) {
		//	System.out.println("5는 홀수입니다.");
		//} else {
		//	System.out.println("5는 짝수입니다.");
		//}
		
		// 문제 3
		//int age = 25;
		//if(age>=20) {
		//	System.out.println("20대");
		//} else if(age<20) {
		//	System.out.println("10대 이하");
		//} else {
		//	System.out.println("30대");
		//}
		
		// 문제 4
		//Scanner sc = new Scanner(System.in);
		//System.out.println("점수를 입력해 주세요.");
		//System.out.println("시험 점수는?");
		//int score = sc.nextInt();
		//if(score>=60) {
		//	System.out.println("합격");
		//} else {
		//	System.out.println("불합격");
		//}
		
		// 문제5
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(); 
		int	b=sc.nextInt();
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {							// 한줄일때는 {}를 안써도 되지만 가독성과 편의를 위해선 가급적 쓰는것이 좋다
			System.out.println("==");
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
