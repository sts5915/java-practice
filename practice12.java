package practice01;
		// 7일차(중간 테스트)

import java.util.Scanner;
public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 1
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(0<=num1&&num1<=10000) {
//			if(0<=num2&&num2<=10000) {
//				if(num1==num2) {
//					System.out.println("1");
//				}else {
//					System.out.println("-1");
//				}
//			}
//		}
//		// class Solution{
//			public int solution(int num1, int num2) {
//				int answer = 0;
//				
//				if(num1 == num2) {
//					return 1;
//				} else {
//					return -1;
//				}
		
		// 문제 2
//		Scanner time = new Scanner(System.in);
//		System.out.println("시각을 입력하세요: ");
//		int a = time.nextInt();
//		int b = time.nextInt();
//		System.out.println("필요한 시간을 입력하세요: ");
//		int c = time.nextInt();
//		if(b+c<60) {
//			System.out.println(a+" "+(b+c));
//		}else if((b+c)%60==0) {
//			int n=(b+c)/60;
//			if(a+n>=24) {
//				System.out.println((a+n-24)+" "+"0");
//			}else {
//			System.out.println((a+n)+" "+"0");
//			}
//		}else if(b+c>60) {
//			System.out.println((a+1)+" "+(b+c-60));
//		}
		
		// 풀이
//		Scanner sc = new Scanner(System.in);
//		int h=sc.nextInt();
//		int m=sc.nextInt();
//		int c = sc.nextInt();
//		
//		h+=c/60;
//		m+=c%60;
//		if(m>=60) {
//			h++;
//			m%=60;
//		}
//		if(h>=24) {
//			h%=24;
//		}
//		System.out.println(h+" "+m);
		
		// 문제 3
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		if(a==b) {
//			if(a==c) {
//				System.out.println(10000+(a*1000));
//			} else {
//				System.out.println(1000+(a*100));
//			}
//		} else {
//			if(b==c) {
//				System.out.println(1000+(b*100));
//			} else if(b!=c) {
//				if(a==c) {
//					System.out.println(1000+(a*100));
//				} else {
//					if(a>b&&a>c) {
//						System.out.println(a*100);
//					}else if(b>c&&b>a) {
//						System.out.println(b*100);
//					}else if(c>a&&c>b) {
//						System.out.println(c*100);
//					}
//				}
//			}
//				
//		}
		
		// 풀이
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int result;
//		if(a ==b && b==c && a==c) {
//			result = 10000 +a*1000;
//		}
//		else if(a == b||a==c) {
//			result = 1000 +a*100;
//		}
//		else if(b==c) {
//			result = 1000 + b*100;
//		}
//		else {
//			result=Math.max(a, Math.max(b, c)) * 100;		// Math.max(x,y) x와 y중 더 크값을 반환하는 메소드
//		}
//		System.out.println(result);
		
		// 문제 4
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			sum+=i;
//		}System.out.println(sum);
		
		// 문제 5(다시 풀어보기)
		
		// T = (n%10)*10 // T의 십의 자릿수
		// T = {(n/10)+(n%10)}%10 // T의 일의 자릿수
		// T = {(n%10)*10}+ {{(n/10)+(n%10)}%10}
		// 그리고 이것을 반복하기 위해 while문을 작성하여 내부에 위의 코드를 넣어주자
		// 단 주의할 점은 위에서 T를 새로운 수로 가정했는데 실제로는 반복문에서 n값을 계속 새로운 값으로 대체해주어야 하는 것이니 T를 n으로 고친다
		// 마지막으로 코드를 보기 전에 변수를 정리하자
		// 1. 처음 입력값을 복사한 변수 copy
		// 변수를 복사하는 이유는 원본 변수의 값을 유지하면서 새로운 변수에 변경된 값을 저장하기 위해서이다.
		// 변수 copy를 사용하는 이유는 while 루프에서 원본 값n을 변경하면서도 사이클의 길이를 세야하기 때문이다
		// 즉 원본값을 변화하지 않고 copy를 사용하여 사이클을 계산하는 것으로 원본 값을 보존하면서 정상적으로 사이클의 길이를 구할 수 있다.
		// 2. 반복문이 몇번 반복되었는지 세어주는 변수 count
		// 3. 처음 입력값과 새로운 변수가 같은 경우 반복문을 종료하기 위한 조건문
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int copy = n;
//		int count = 0;
//		do {
//			n=((n%10)*10)+ (((n/10)+(n%10))%10);
//			count++;
//		}while(copy!=n);
//		System.out.println(count);
		
		// 문제 6
//		Scanner sc = new Scanner(System.in);
//		int total = sc.nextInt();
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			int price = sc.nextInt();
//			int num = sc.nextInt();
//			sum += price*num;
//		}
//		if(total==sum) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
