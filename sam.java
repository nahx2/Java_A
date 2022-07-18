package java;

import java.util.Scanner;

////혹시 여유가 된다면 1부터 100까지에서 100을 Scanner로 입력받아서 처리해 보는 것도
//좋을 거 같습니다.
//whlie & Scanner 버전 가보자고
public class sam {
	int i;

	int hap;

	public void sam2() {
		System.out.println("입력한 숫자까지의 3의 배수의 합을 구할 예정입니다.");
		System.out.println("숫자를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		while (i < j ) {
			i++;
			if (i % 3 == 0) {
				hap = hap + i;
//확인용				
				System.out.println(i); 
				
			}

		}
		System.out.println(hap);
	}

	public static void main(String[] args) {
	sam a = new sam();
		a.sam2();

	}
}
