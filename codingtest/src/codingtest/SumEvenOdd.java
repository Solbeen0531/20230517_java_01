package codingtest;

public class SumEvenOdd {
	public static void main(String[] args) {
		int nSum = 0, nEvenSum = 0, nOddSum = 0;;
		
		for(int i=1; i<101; i=i++) {
			nEvenSum = nEvenSum + i;
		}
		
		for(int i=2; i<101; i=i+2) {
			nOddSum = nOddSum + i;
		}
		
		nSum = nEvenSum + nOddSum;
		
		System.out.printf("1부터 100까지 홀수합: %d, 짝수합: %d, 총합: %d\n", nOddSum, nEvenSum, nSum);

	}
}

//===========================================================
//public class SumEvenOdd {
//	public static void main(String[] args) {
//		int nSum = 0, nEvenSum = 0, nOddSum = 0;;
//		
//		for(int i=1; i<101; i=i+2) {
//			nEvenSum = nEvenSum + i;
//		}
//		
//		for(int i=2; i<101; i=i+2) {
//			nOddSum = nOddSum + i;
//		}
//		
//		nSum = nEvenSum + nOddSum;
//		
//		System.out.printf("1부터 100까지 홀수합: %d, 짝수합: %d, 총합 : %d\n", nOddSum, nEvenSum, nSum);
//		// 결과
//		// 1부터 100까지 홀수합: 2550, 짝수합: 2500, 총합 : 5050
//	}
//}

//=====================================================
//public class SumEvenOdd {
//	public static void main(String[] args) {
//		int nSum = 0, nEvenSum = 0, nOddSum = 0;;
//		
//		System.out.printf("1부터 100까지 홀수합: %d, 짝수합: %d, 총합 : %d\n", nOddSum, nEvenSum, nSum);
//		
//	}
//}
