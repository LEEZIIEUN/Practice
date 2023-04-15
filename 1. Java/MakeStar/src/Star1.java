
public class Star1 {
	public static void main(String[] args) {
		Star1 Star = new Star1();
		Star.star5(10);
	}

	public void star1(int line) {

		// 별 만들 줄의 개수(line)

		// STEP 1. 각 줄마다 별 한개씩만 찍기!!
		for (int i = 0; i < line; i++) {
			System.out.println("*");
		}

		// STEP 2. 행과 열 개수 같게 별 찍기!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star2(int line) {

		// STEP 3. 직각삼각형 모양으로 별 찍기!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// STEP 4. 3번과 상하반전되게 별 찍기!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star3(int line) {

		// STEP 5. 3번과 좌우반전되게 별 찍기!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// STEP 6. 5번과 상하반전되게 별 찍기
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void star4(int line) {

		// STEP 7. 이등변삼각형 별 찍기!!
		for (int i = 0; i < line; i++) {
			for (int j = 1; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// STEP 8. 상하반전 이등변삼각형 별 찍기!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (line * 2) - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star5(int line) {

		// STEP 9. 예쁜 별 찍기!! (8번과 차이 : 중간에 겹치는 줄 없게!!)
		for (int i = 0; i < line; i++) {
			for (int j = 1; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (line * 2 - 2) - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
