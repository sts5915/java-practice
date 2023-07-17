package practice01;
		// 4일차
		// System.in.read   buffer    Scanner 사용법
import java.io.IOException; // System.in.read(); 를 사용하는 방법
							//  System.in.read();는 콘솔창에서 사용자로부터 값을 입력받는 함수 기본 입력값은 ascii값 형태이다
							// 아스키코드값 대문자A 65 소문자a 97  
							// 같은 의미의 문자와 숫자는 48차이가 난다 '1'은 49 1은 1 '0'은 48 0은 0
import java.io.BufferedReader; //버퍼 사용하기
import java.util.Scanner;		// Scanner 사용하기

public class practice04 {

	public static void main(String[] args) throws IOException { // System.in.read(); 를 사용하는 방법 
		// TODO Auto-generated method stub
		 
		// 버퍼를 사용하여 읽기를 하는 함수 버퍼를 사용하기 때문에 효율이 좋다
		// 버퍼는 우리가 키보드에 입력할때마다 값을 전달하는 것이 아니라 버퍼에 정해진 용량만큼 모았다가 전달해준다
		// 출력도 마찬가지로 전달되기 때문에 시스템의 데이터 처리 효율성을 높여준다
		
		// scanner sc = new Scanner(System.in);
		// scanner 은 자바에서 사용자로부터 입력을 받기 위한 클래스
		// 'Sysem.in'은 키보드 입력을 나타내며, 'Scanner'클래스의 생성자에 'System.in'을 전달하여 입력을 처리한다
		// 'Scanner'클래스를 사용하면 사용자로부터 다양한 데이터 유형을 입력받을 수 있다.
		// import java.util.Scanner; 과 함께 사용한다.
		// int number=a.nextint(); 'Scanner'클래스의 메소드 중 하나로 사용자로부터 정수값을 입력받을 때 사용된다
		
		// import java.util.Scanner;
		// Scanner 변수명 = new Scanner(System.in);
		// int 변수명 = Scanner변수명.nextint(); > 세트라고 생각하면 편함.
		
		// 'Scanner'을 이용해서 문자열 입력받기
		// String 변수이름 = Scanner변수이름.next();
		// 'Scanner'을 이용해서 실수 입력받기
		// float 변수이름 = Scanner변수이름.nextFloat(); 더블을 사용하면 float자리에 double을 쓰면 된다
		
		// 문제1
		//Scanner sc = new Scanner(System.in);
		//System.out.println("점수를 입력하세요.");
		//System.out.println("시험 점수는?");
		//int number = sc.nextInt();
		//System.out.println("수고하셨습니다!");
		
		// 문제2
		//Scanner sc = new Scanner(System.in);
		//System.out.println("당신의 이름은 무엇입니까?");
		//String name = sc.next();
		//System.out.println("감사합니다.");
		
		
		
		
		
	}

}
