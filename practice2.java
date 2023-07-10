package practice01;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 1
		//float a=3.5F;
		//double a=3.5;
		
		//문제 3
		//float a=4.05F;
		//byte b=100;
		//System.out.println(a);
		//System.out.println(b);
		
		//문제 4
		//int a=200, b=300;  내가 한 풀이
		//int a, b;          정답풀이
		//a = 200;
		//b = 300;
		//long c=2147483648L;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		//문제5
		//int num=100;
		//int result = num*num;
		//System.out.println(result);
		
		//문제 6 복습하자
		//int x = 5;
		//int y = 10;
		
		//int temp = x; //임시변수를 사용하는 이유는 값이 바뀌는 동안에 변수의 값이 손실되지 않도록 하기 위해서이다
		//x=y;          // 변수 값 교환 단계 1. 임시변수에 변수 x값을 저장한뒤 변수 x에 변수 y의 값을 저장한다 2.변수y에 임시 변수의 값을 저장한다
		//y=temp;
		//System.out.println("x: " + x + " y: "+ y);
		// 변수의 값을 교환하기 위해서는 두 변수의 값을 동시에 변겨안다.
		// 그러나 변수값을 직접 교환하면 값이 덮어씌워지고 손실될 수 있다.
		// 이를 방지하기 위해 임시변수를 사용한다.
		
		//문제 7
		//double radius = 5.5;
		//double area = 3.14*radius*radius;
		//System.out.println("원의 넓이: "+ area);
		
		//형변환 - 자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용
		// byte -short,char - int - long - float - double
		//double a=3.0F;     에러가 발생하지 않는다
		//System.out.println(a);
		
		// 정밀도 - 수치 데이터의 세부적인 정확도를 나타내는 개념이다. 소수점 이하의 자릿수를 포함하여 데이터가 얼마나 세밀하게 표현될 수 있는지 나타낸다.
		// 3.14 2자리의 정밀도  9876.4321 4자리의 정밀도
		
		// char이 숫자 데이터 타입으로 자동 형 변환되는 이유는 char의 내부적인 특성 때문이다
		
		//문제 8
		//int a =5;
		//double b = 2.0;
		//double result = a/b;
		//System.out.println(result);
		
		//문제 9
		int a = 10;
		double b = 3.5;
		double c = a*b;
		System.out.println(a + " multiplied by " + b + " equals " + c);
		System.out.println(a + " multiplied by " + b + " equals " + (a*b)+".");
		
		
		
	}

}
