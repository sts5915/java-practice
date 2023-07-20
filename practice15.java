package practice01;
		// 9일차

import java.util.Scanner;
public class practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 코딩 테스트 문제 
		// 문제 3
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n을 입력하세요(1<=n<=10000) : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			sum += i;
//		}
//		System.out.println("총합 : " +sum);
		
		//문제 1
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수의 갯수 : ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		int max = -1000000;                      // 문제에서 '모든 정수는 -1000000보다 크거나 같고 1000000보다 작거나 같은 정수'라고 했기 때문에 max,min을 위의값으로 초기화했다
//		int min = 1000000;						 // 초기화 하는 이유는 주어진 범위 내에 최솟값과 최댓값을 찾기 위해서이다
//		for(int i = 0; i <arr.length; i++) {	 // 초기값을 주어진 범위의 최솟값 또는 최댓값으로 설정함으로써 이후 입력된 정수들을 비교하면 최솟값과 최댓값을 갱신할 수 있게 된다.
//			arr[i]=sc.nextInt();				  
//			if(arr[i]>max) {					  
//				max = arr[i];
//			}
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min + " "+max);
		
//		max와 min을 바꿔서 쓴 이유
//		최솟값을 구하기 위해서는 초기값을 주어진 범위의 최대값인 1000000으로 설정해야 한다
//		그래야만 주어진 범위의 어떤 정수라도 최솟값과 비교될 수 있다
//		예를 들어 입력으로 -1000000보다 작은 값이 주어진다면, 초기값이 -1000000으로 설정되어 있으면 이 값이 최솟값으로 갱신될 수 있다
//		최댓값도 마찬가지이다
//		그래야 이후 입력된 정수들을 비교하면서 최댓값과 최솟값을 올바르게 갱신할수 있다
		
		// 문제 2
//		Scanner sc = new Scanner(System.in);
//		int max = 0;
//		int count = 0;
//		int[] arr = new int[9];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i]>max) {
//				max=arr[i];
//				count = i+1;
//			}
//		}
//		System.out.println(max);
//		System.out.println(count);
		
		// 문제 4
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int max = 0;
//		int sum = 0;
//		int[] arr = new int[n];
//		for(int i = 0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		for(int j =0; j<arr.length; j++) {
//			sum=arr[j]/max*100;
//		}
//		System.out.println(sum/n);
		
		// 문제 분석하기
//		최고 점수를 기준으로 전체 점수를 다시 계산해야 하므로 모든 점수를 입력받은 후에 최고점을 별도 저장해야 한다
//		또한 문제에서 제시한 한 과목의 점수를 계산하는 식은 총합과 관련된 식으로 변환할 수 있다. 따라서 일일이 변환 점수를 구할 필요없이 한번에 변환한 점수의 평균 점수를 구할 수 있다
//		
//		변환 점수의 평균을 구하는 식(점수가 a, b, c인 경우)
//		(a/M*100+b/M*100+c/M*100)/3 = (a+b+c)*100/M/3
		
		// 풀이 (다시 보기)
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int A[]=new int[N];
//		for(int i=0; i<N; i++) {
//			A[i]=sc.nextInt();
//		}
//		
//		long sum = 0;
//		long max = 0;
//		for(int i=0; i<N; i++) {
//			if(A[i]>max) {
//				max= A[i];
//				sum=sum+A[i];
//			}
//		}
//		System.out.println(sum*100.0/max/N);
		
		// 시험 성적인 A가 int N처럼 sc.nextInt();안쓰고 for문을 사용하여 입력받고 배열로 저장하는 이유
		// 1. 점수를 개별적으로 관리 : 배열을 사용하여 각 시험 성적을 개별적으로 저장하면 각 성적에 접근하고 조작하는 것이 용이해진다.
		//    배열을 사용하면 성적을 쉽게 조회 수정 삭제할 수 있으면 각 성적에 대한 개별적인 작업을 수행할 수 있다.
		// 2. 계산을 위한 집계 : 배열에 저장된 시험 성적은 평균 최댓값 최솟값 등과 같은 계산을 수행하는데 유용하다.
		//    배열을 사용하면 쉽게 집계를 수행하고 원하는 결과를 도출할 수 있다.
		
		// sum과 max에 int가 아닌 long을 사용하는 이유
		// 이 코드에서는 시험 점수와 합을 저장하는 변수 max과 변수 sum의 값이 매우 커질 수 있으므로 정확한 계산 결과를 보장하기 위해서이다.
		
		// 출력 코드를 좀 더 자세히 보겠다.
//		1. sum*100.0/max/3
//		: 한 과목과 관련된 수식을 종합한 후 관련된 수식으로 변환해 로직을 간단하게 만들었다
//		2. 100이 아니라 100.0을 사용한 이유
//		: 문제를 보면 예시 출력의 값이 모두 정수가 아닌 소수점이 있는 실수이다 
//		그래서 실수를 출력하기 위해 100이 아닌 100.0을 사용했다
//		즉 단순히 100을 사용하면 소수점 이하 부분이 버려져서 문제에서 원하는 계산 결과가 나오지 않을 수 있으므로 
//		소수점 형태인 100.0을 사용하여 나누면 소수점을 포함한 실수 형태의 출력값을 얻을 수 있다.
		
		// 문제 5
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int arr[] = new int[N];
//		for(int i=0; i<N; i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		long sum = 0;
//		for(int i=0; i<N; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
		
		// 문제 분석하기
//		N의 범위가 1부터 100까지이므로 값을 int형, long형과 같은 숫자형으로 담을 수 없다
//		먼저 문자열 형태로 입력값을 받은 후 이를 문자 배열로 변환하고, 문자 배열값을 순서대로 읽으며 숫자형으로 변환하여 더해야 한다. 
//		예를 들어 입력값을 "1234"와 같이 문자열로 입력받은 후 이를 다시'1','2','3','4'와 같이 이 문자 배열로 변환하고 
//		다시 문자 배열을 1,2,3,4로 변환한 다음 더해 10을 구한다
		
//		추가 설명1
//		N의 범위가 1부터 100까지이므로 값을 int형, long형과 같은 숫자형으로 담을 수 없다
//		int long 범위를 초과하는 값이 변수에 저장되면 오버플로우가 발생한다
//		오버플로우 : 변수가 표현할수 있는 최솟값 또는 최댓값 이상이 되는 경우를 말한다
//		주어진 문제에서는 N의 범위가 1부터 100까지이므로 N개의 숫자의 합은 최대 100자리 숫자가 될수있다
//		이렇게 큰 숫자를 int long변수에 저장하려고 하면 범위를 초과하여 값이 정확하게 표현되지 않을 수 있기 때문에 
//		이문제에서는 숫자들을 문자열로 입력받아 문자열 처리를 통해 합을 구하는 것이 적합하다
//		문자열로 처리하면 숫자의 크기에 제한이 없기 때문에 정확한 합을 구할수있다
		
//		추가 설명2
//		문자열을 숫자형으로 변경하려면 아스키코드를 이해하고 있어야 한다
//		아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다 
//		예를 들어 문자'1'은 아스키코드 값이 49이다 그럼 문자'1'을 숫자 1로 변환하려면 '1'-48 또는 '1'-'0'으로 연산하면 된다
//		좀더 구체적으로 이야기 하자면 아스키코드에서 문자는 '0'부터'9'까지의 수자와 관련된 코드갑은 연속적으로 할당되어 있다
//		이렇게 숫자 문자와 관련되 코드값이 연속적으로 할당된 이유는 
//		컴퓨터에서 숫자 연산을 쉽게 처리하기 위해서이다 
//		숫자를 문자형태로 표현하는 경우 해당 문자의 아스키코드 값에서 '0'의 아스키코드 값을 빼면 숫자의 값을 얻을수있다
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		int sum=0;
		
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i]-'0';
		}
		System.out.println(sum);

//		char[] cNum = sNum.tocharArray();
//		입력받은 문자열 sNum을 문자 배열로 변환하여 변수 cNum에 저장한다 문자열의 각 문자가 배열의 원소로 들어간다
//		sNum.tocharArray();은 sNum에 입력받은 문자열 toCharArray를 사용하여 문자 배열로 변환하는 메서드이다
//		
//		문자열을 배열로 변환하는 이유는 개별 문자에 접근하고 조작하기 쉽게 하기 위해서이다
//		문자열은 문자로 구성되어 있다
//		하지만 문자열 자체는 수정할 수 없는 불변한 객체이다 따라서 문자열의 특정한 위치에 있는 문자를 직접 변경하거나 접근하는 것은 불가능하다
//		하지만 배열은 수정 가능한 객체이며 개별 요소에 접근하여 변경할 수 있다 문자 배열을 사용하면 문자열의 각 문자에 직접 접근하여 조작할 수 있다
//		정리해 보자면 입력받은 문자열을 문자 배열로 변환함으로써 프로그램에서 문자열을 더 쉽게 다룰 수있고 문자열의 각 문자를 개별적으로 조작할 수 있는 유연성을 제공한다
		 
		
	}

}
