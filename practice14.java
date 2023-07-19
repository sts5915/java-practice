package practice01;
		//8일차(for-each)
import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		배열의 내용을 탐색할때 for문을 좀 더 간편하게 사용할 수 있는 방법
//		each라는 단어를 사용하는 것이 아니라 "각각"이라는 의미를 가지는 표현이다
//		for(각 요소의 값: 배열값) {
//			반복수행할 작업
//		}
//		for(데이터 타입 변수 이름 : 배열 변수 이름) {
//			반복 수행할 코드
//		}
//		String[] members = {"김철수", "박철수", "이철수"};
//		for(String e : members) {
//			System.out.println(e + "가 상담을 받았습니다.");
//		}
//		문법적으로 간결해졌다.
//		위 구문은 배열 members의 값을 변수e에 담아 중괄호 구간 안으로 전달해 준다
//		반복문의 종료 조건이나 종료조건을 위해 기준값을 증가시키는 등의 반복적인 작업을 내부적으로 감춘것이라고 할 수 있다.
//		이 기능이 안되고 오류가 생긴다면 자바 버전 업그레이드 하자
		
		// 퀴즈
//		String[] classGroup = {"민지", "하니", "겨울"};
//		System.out.println(classGroup[]);
//		System.out.println(classGroup[]);
//		System.out.println(classGroup[]);
//		출력값
//		민지
//		하니
//		겨울
//		// 0 1 2
//		// 원소이다
//		// 인덱스이다
		
		// 문제 1
		// 배열 arr에 담긴 모든 값을 더하는 프로그램을 작성하세요.
//		int[] arr = {10,20,30,40,50};
//		int sum = 0;
//		for(int i = 0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("sum=" + sum);
		
		// 문제2 ( 복습 꾸준히 해보기)
		// 정수 5개를 입력받아 배열을 초기화 하고 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 출력한다
		// 배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다" 메시지를 출력한다
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("입력"+i+" : ");
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("검색할 값 : ");
//		int search = sc.nextInt();
//		
//		boolean flag = true;                  // 검색 결과를 나타내기 위한 변수 flag를 선언하고 true로 초기화 합니다. flag가 true인 경우 일치하는 값이 없다는 것을 의미합니다
//		
//		for(int i=0; i<arr.length; i++) {
//			if(search == arr[i]) {
//				System.out.println("인덱스 : "+i);
//				flag = false;
//				break;
//			}
//		}
//		if(flag)
//			System.out.println("일치하는 값이 존재하지 않습니다.");
		
		// 문제 3
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열 선언 및 하랑하고 배열의 크기만큼 사용자가 직접값을 입력하여 각각의 인덱스에 값을 초기화하세요
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 구하세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 : ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("배열"+i+"번 째 인덱스에 넣을 값 : ");
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("총합: "+sum);
		
		 
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
