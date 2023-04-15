import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	/* inputDC text ���� �ҷ��� �ߺ� �����ϰ� �������� �����ϱ�
	 * �ؽ�Ʈ ���� ù��° ���� ���ڴ� array�� ����!
	 * ���� �� ���� ù��° ���ڴ� �迭�� ����!
	 */
	
	// STEP1. inputDC.txt ���� �ҷ�����
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner scanner = new Scanner(System.in);
		
		// STEP2. ���� ù��° ���� ���!! (�� array�� ����!!)
		int countArr = scanner.nextInt();		
		for (int i = 0; i < countArr; i++) {
			// �� ���� ù��° ���ڴ� array ����!!
			int arrLength = scanner.nextInt();
			// STEP3. arrLength��ŭ �� �迭 ���� �� ���� ����ֱ�!!
			int[] numArr = new int[arrLength];
			for (int j = 0; j < arrLength; j++) {
				numArr[j] = scanner.nextInt();				
			}
			// STEP4. �����ϱ�! 
			// Arrays.sort(numArr); 
			
			// Arrays.sort�� �ٷ� �ذ��Ҽ��� ������, ������������ �����Ϸ���?! (Selection sort ���)
			int temp;
			for (int j = 0; j < numArr.length; j++) {
				for (int k = 0; k < j; k++) {
					if (numArr[j] > numArr[k]) { // Selection���� ���������� ���� �ε�ȣ �ݴ��!!
						temp = numArr[j];
						numArr[j] = numArr[k];
						numArr[k] = temp;
					}
				}
			}			
			System.out.println(Arrays.toString(numArr));
		}
				
	}

}
