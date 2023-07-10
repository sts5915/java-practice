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
		//int a = 10;
		//double b = 3.5;
		//double c = a*b;         따로 변수선언 안해도 된다
		//System.out.println(a + " multiplied by " + b + " equals " + c + ".");
		//System.out.println(a + " multiplied by " + b + " equals " + (a*b)+".");
		
		
		// 명시적 형 변환
		//byte a=10;    //정수
		//double b = 40.5;   //실수
		//double c = a+b;    //더하려면 같은 데이터 값으로 만들어야됨
        //         byte  double
		//         double         정수에서 실수로 형 변환가능
		//      = 10 + 40.5
		//      = 50.5
		
		
		//byte a = 10;    //정수
		//double b = 40.5;  //실수
		//int c = a+b;     //더하려면 같은 데이터 값으로 만들어야됨
		//      byte double
		//       int  double   에러 발생
		
		//명시적 형 변환이란 자동 형 변환이 적용되지 않을 경우 수동으로 형 변환을 하는것
		// 명시적 형 변환 형식 - (데이터 타입)할당 값
		// float a = 100.0;
		// float a = 100.0F;
		// float a = (float)100.0;
		// int b = 100.0F;
		// int b = (int)100.0F; 출력하면 100 으로 출력된다
		// 상수 값 앞 괄호에 변환하고 싶은 데이터 타입을 작성 (데이터 타입)할당값
		
		//퀴즈
		// 명시적 형 변환이란
		// float a = 300.0; 을 명시적 형 변환으로
		// float a = (float)300.0;
		// int a=(int)400.7; 의 출력값은 400
		
		// 문제 10
		//int a = 10;
		//long b = 20L;
		//double c = 30.5;
		//int result = (int)(a+b+c);
		//System.out.println(result);
		
		//일부 상황에서 상수 뒤에 L을 사용하지 않아도 long타입으로 인식하는 경우가 있다
		// 자바의 기본 정수 타입은 int타입으로 처리된다 그래서 long 타입 표현하기 위해 상수 값 뒤에 L을 붙인다
		// 하지만 int범위 내에 있을때는 long타입을 사용해도 L을 안붙여도 된다
		// int 범위에 포함되지 않는 값을 long형으로 사용하고 싶다면 상수 값 뒤에 L을 붙여야한다
		// 그러나 코드의 가독성과 명확성을 위해서는 항상 L을 명시하는 것이 좋다
		
		//문제 11
		//int num1 = 10;
		//int num2 = 3;
		//double result = (double)(num1/num2);
		//System.out.println(result);
		
		//문제12
		//int width =10;
		//int height = 5;
		//int area = width*height; //  사각형의 넓이는 정수라고 했으므로 //이 과정을 꼭 거치는것이 좋다
		//double result = (double)(area); //출력값은 실수이므로 변환해줘야 한다
		//System.out.println(result);
		
		// 연산자
		// 문자와 문자는 +연산자를 사용하지 못한다
		// 에러 발생 자바의 문법적인 규칙때문이다
		
		//int i =3; 
		//i++;    ++ 증가 연산자로 항의 값을 1 증가시킨다  --는 감소 연산자로 항의 값을 1 감소 시킨다
		//System.out.println(i);
		//++i;
		//System.out.println(i);
		//System.out.println(++i);
		//System.out.println(i++);
		//System.out.println(i);
		
		//단항 연산자
		// 논리 부정 연산자 !
		// 피연산자가 true 값이면 false값 출력
		// 피연산자가 false 값이면 true 값 출력
		
		//boolean ab = true;
		//System.out.println(ab);
		
		//ab = !ab;
		//System.out.println(ab);
		
		//비트 반전 연산자 ~
		//비트값을 반전시킨다 ( 1 - 0 , 0 - 1)
		
		//퀴즈
		// /나누기 % 나머지
		// 문자열과 문자열
		// 연산자는 형 변환이 가능하다
		// 1
		// 논리 부정
		
		
		
		
	}

}
