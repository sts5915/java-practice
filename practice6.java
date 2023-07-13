package practice01;
//4일차 (switch case 구문)

import java.util.Scanner;
public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("switch(1)");   // 코드분석
//		switch(1) {						   // switch(1)이면 case뒤 1이 들어간 println구문이 실행된다. 
//		case 1:							   // 하지만 case(1)만 실행되는 것이 아니라 그뒤 case 구문들도 다 실행된다.
//			System.out.println("one");     // 여기서 각각에 해당되는것만 출력하려면 break 를 사용한다.
//		case 2:							   // case 각 구문 아래에 break를 넣는다
//			System.out.println("two");
//		case 3:
//			System.out.println("three");
//		}	
//		System.out.println("switch(2)");
//		switch(2) {
//		case 1:
//			System.out.println("one");
//		case 2:
//			System.out.println("two");
//		case 3:
//			System.out.println("three");
//		}	
//		System.out.println("switch(3)");
//		switch(3) {
//		case 1:
//			System.out.println("one");
//		case 2:
//			System.out.println("two");
//		case 3:
//			System.out.println("three");
//		}
//		System.out.println("switch(1)");   
//		switch(1) {						   
//		case 1:							   
//			System.out.println("one");
//			break;
//		case 2:							   
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		}	
//		System.out.println("switch(2)");
//		switch(2) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		}	
////		System.out.println("switch(3)");    //switch문과 if문은 서로 대체 가능한 관계이다. 
//		switch(3) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		}
		
		// 퀴즈
		// 여름 가을
		// 여름
		
		// 문제1
		/*
		 * Scanner a = new Scanner(System.in); System.out.println("수를 입력하세요."); int num
		 * = a.nextInt();
		 * 
		 * if(num>0) { System.out.println("양수입니다."); } else if(num<0) {
		 * System.out.println("음수입니다."); } else { System.out.println("0입니다."); }
		 */
		
		// 문제2
//		Scanner a = new Scanner(System.in);
//		System.out.println("입력(1~7)");
//		int num = a.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("일요일");
//			break;
//		case 2:
//			System.out.println("월요일");
//			break;
//		case 3:
//			System.out.println("화요일");
//			break;
//		case 4:
//			System.out.println("수요일");
//			break;
//		case 5:
//			System.out.println("목요일");
//			break;
//		case 6:
//			System.out.println("금요일");
//			break;
//		case 7:
//			System.out.println("토요일");
//			break;
//		default:
//			System.out.println("default");
//			break;
//		}
		
		// 문제 3
//		int x = 50;
//		int y = 60;
//		if(x<y) {
//			System.out.println("x는 y보다 작습니다.");
//		}
		
		// 문제4
//		Scanner num= new Scanner(System.in);
//			System.out.println("입력");
//		int a=num.nextInt();
//		int b=num.nextInt();
//		int c=num.nextInt();
//		if(a>b&&a>c) {
//			System.out.println("가장 큰 수:"+a);
//		} else if(b>a&&b>c) {
//			System.out.println("가장 큰 수:"+b);
//		} else if(c>a&&c>b) {
//			System.out.println("가장 큰 수:"+c);
//		}
		// 조금 더 정확한 풀이
//		Scanner scanner = new Scanner(System.in);  
//		System.out.println("3개의 정수를 입력하세요: ");
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		int num3 = scanner.nextInt();
//		
//		int max = num1;              // 코드를 처음 실행할때 아직 가장 큰 수를 판단하지 않았으므로 초기값으로 num1을 할당한다 그후에 if문을 사용하여
//								     // num2와 num3을 max와 비교하고 만약 더 큰수가 나오면 max에 해당값을 할당한다.
//		if(num2 > max) {			 // 따라서 반복적으로 비교를 진행하면서 현재까지 가장 큰 수를 유지한다.
//			max=num2;				 // 이렇게 초기값을 설정하는 이유
//		}							 // 초기값을 설정하지 않고 처음에 max를 사용하기 전에 if문을 사용하여 비교한다면, max가 아직 초기화되지 않은 상태에서 비교를 진행하므로 정확한 결과를 얻을수 없다
//		if(num3>max) {				 // 초기값을 지정해주면 비교를 시작하기 전에 최소한 하나의 값을 가지고 있게 되므로, 정확한 비교와 결과를 얻을수있다.
//			max = num3;
//		}
//		System.out.println("가장 큰 수: "+max);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
