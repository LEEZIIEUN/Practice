
public class Star1 {
	public static void main(String[] args) {
		Star1 Star = new Star1();
		Star.star5(10);
	}

	public void star1(int line) {

		// �� ���� ���� ����(line)

		// STEP 1. �� �ٸ��� �� �Ѱ����� ���!!
		for (int i = 0; i < line; i++) {
			System.out.println("*");
		}

		// STEP 2. ��� �� ���� ���� �� ���!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star2(int line) {

		// STEP 3. �����ﰢ�� ������� �� ���!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// STEP 4. 3���� ���Ϲ����ǰ� �� ���!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star3(int line) {

		// STEP 5. 3���� �¿�����ǰ� �� ���!!
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// STEP 6. 5���� ���Ϲ����ǰ� �� ���
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

		// STEP 7. �̵�ﰢ�� �� ���!!
		for (int i = 0; i < line; i++) {
			for (int j = 1; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// STEP 8. ���Ϲ��� �̵�ﰢ�� �� ���!!
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

		// STEP 9. ���� �� ���!! (8���� ���� : �߰��� ��ġ�� �� ����!!)
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
