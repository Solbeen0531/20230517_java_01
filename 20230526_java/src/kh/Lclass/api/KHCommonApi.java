package kh.Lclass.api;

public class KHCommonApi {
	public static boolean checkMenu(int start, int end, int value) {
		boolean result = false;
		if (value < start || value > end) {
			// 비정상 입력 경우
			System.out.printf("%d-%d 사이 선택해주세요.",start,end);
		} else {
			// 정상 입력
			result = true;
		}

		return result;
	}
}
