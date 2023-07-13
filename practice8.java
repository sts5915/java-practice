package practice01;
		// 5일차 조건문 문제

import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 4
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		if((x>=-1000&&x<=1000&&x!=0)&&(y>=-1000&&y<=1000&&y!=0)) {
//			if(x>0&&y>0) {
//				System.out.println("1");
//			} else if(x<0&&y>0) {
//				System.out.println("2");
//			} else if(x<0&&y<0) {
//				System.out.println("3");
//			} else if(x>0&&y<0) {
//				System.out.println("4");
//			}
//			
//		}
		// 문제 5
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if((0<=H&&H<=23)&&(0<=M&&M<=59)) {
			if(M<45) {
				H-=1;
				M+=15;
				if(H<0) {
					H+=24;
				}
				System.out.println(H+" "+M);
				} else if(M>=45) {
					//H=H;
					M-=45;
				System.out.println(H+" "+M);	
				}
		}
	}

}
