import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	/* inputDC text 파일 불러와 중복 제거하고 오름차순 정렬하기
	 * 텍스트 파일 첫번째 줄의 숫자는 array의 개수!
	 * 이후 각 줄의 첫번째 숫자는 배열의 길이!
	 */
	
	// STEP1. inputDC.txt 파일 불러오기
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner scanner = new Scanner(System.in);
		
		// STEP2. 파일 첫번째 숫자 담기!! (총 array의 개수!!)
		int countArr = scanner.nextInt();		
		for (int i = 0; i < countArr; i++) {
			// 각 줄의 첫번째 숫자는 array 길이!!
			int arrLength = scanner.nextInt();
			// STEP3. arrLength만큼 빈 배열 생성 후 숫자 담아주기!!
			int[] numArr = new int[arrLength];
			for (int j = 0; j < arrLength; j++) {
				numArr[j] = scanner.nextInt();				
			}
			// STEP4. 정렬하기! 
			// Arrays.sort(numArr); 
			
			// Arrays.sort로 바로 해결할수도 있지만, 내림차순으로 정렬하려면?! (Selection sort 사용)
			int temp;
			for (int j = 0; j < numArr.length; j++) {
				for (int k = 0; k < j; k++) {
					if (numArr[j] > numArr[k]) { // Selection에서 오름차순은 여기 부등호 반대로!!
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
