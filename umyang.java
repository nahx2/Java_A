package java;
import java.util.Arrays;
// 
// -10에서 10사이의 정수 10개를 랜덤하게 채번하여  음수와 양수의 합계를 구하시오.
// [요구사항 : 채번한 숫자는 1차 배열에 담아서 처리해 주세요]
// 출력)
// 배열 : 9 -2 -3 8 0 -3 -8 -6 -2 0
// 음수합 : -24
// 양수합 : 17
//  

public class umyang {
	int i = 0;
	int yhap = 0;
	int uhap = 0;
	int arr[] = new int[10];
	int nansu;
	public void ran() {
		for (; i < 10; i++) {
			nansu = (int) (Math.random() * 21) - 10;
			arr[i] = nansu; // 이부분 애먹음 그냥 난수를 배열에 넣는 것 뿐인데... 아직 익숙하지 않은가봄 배열복습 열심히
		}
		System.out.println("배열 : " + Arrays.toString(arr));
	}// end of ran
	public void pul() {
// 넘어왔는지 확인용		System.out.println(arr[1]); 
		int i = 0; // 앞선 for문 진행중에서 커졌으니...?
		for (; i < arr.length; i++) {
			if ((int) arr[i] > 0) {
				yhap = yhap + arr[i];
			} else if ((int) arr[i] < 0) {
				uhap = uhap + arr[i];
			} 
			else {
				// 0일경우 아무것도 실행 안 할 것... 그냥 아무 것도 안 써도 되는 것일까
			}
		}
		System.out.println("양수의 합 : " + yhap);
		System.out.println("음수의 합 : " + uhap);
	}// end of pul
	public static void main(String[] args) {
		umyang a2 = new umyang();
		a2.ran();
		a2.pul();
	}
}
