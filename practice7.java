package practice01;
		// 5일차 (조건문 문제)

import java.util.Scanner;
public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1
		Scanner num = new Scanner(System.in);
		System.out.println("입력");
		int a = num.nextInt();
		int b = num.nextInt();
		if(a>=-10000&&b<=10000) {                   // 문제에 조건을 넣으라 했으므로 입력해줘야한다.
			if(a>b) {
				System.out.println(">");
			} else if(a<b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
		// 문제 2
		Scanner score= new Scanner(System.in);
		System.out.println("시험점수를 입력하세요.");
		int point = score.nextInt();
		if(point>=0&&point<=100) { 						//기본 조건을 먼저 쓰고 하위에 다시 조건문을 붙이면 된다.
			if (point>=90) {
				System.out.println("A");
			} else if(point>=80) {
				System.out.println("B");
			} else if(point>=70) {
				System.out.println("C");
			} else if(point>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
		// 문제 3
		Scanner years=new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = years.nextInt();
		if(year>=1&&year<=4000) {
			if (year%4==0&&year%100!=0||year%400==0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}	
		num.close();					// 스캐너를 닫아준다 라는 뜻
		score.close();					// 누수를 방지하기 위해서인데 프로그래밍에서 누수는 사용한 자원을 정리하지 않고 그대로 두는 것을 의미한다
		years.close();					// 이는 프로그램의 성능을 저하시키고 오류를 발생시킬 수 있으므로 누수를 방지하기 위해 닫아준다는 의미의 close();를 호출해야 한다.
	}
}
