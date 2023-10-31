package codingtest;

public class RevertString {
	public static void main(String[] args) {
		char[] orgArr = {'a','b','c','d'};
		// char[] revertArr = new char[4];
		
		for(int i=0; i<orgArr.length/2; i++) {
			// revertArr[orgArr.length - 1 - i] = orgArr[i];
			// swap
			char temp = orgArr[i];
			orgArr[i] = orgArr[orgArr.length-1-i];
			orgArr[orgArr.length-1-i] = temp;
		}
		
		System.out.println(orgArr);
		
		
		String orgStr = "abcd";
		String revertStr = null;
		
		for(int i=0; i<orgStr.length(); i++) {
			
		}
		
		System.out.println(orgStr);
		System.out.println(revertStr);
		
	}
}

//=======================================================
//public class RevertString {
//	public static void main(String[] args) {
//		char[] orgArr = {'a','b','c','d'};
//		// char[] revertArr = new char[4];
//		
//		for(int i=0; i<orgArr.length; i++) {
//			// revertArr[orgArr.length - 1 - i] = orgArr[i];
//			// swap
//			char temp = orgArr[i];
//			orgArr[i] = orgArr[orgArr.length-1-i];
//			orgArr[orgArr.length-1-i] = temp;
//		}
//		
//		System.out.println(orgArr);
//		
//		
//		String orgStr = "abcd";
//		String revertStr = null;
//		
//		for(int i=0; i<orgStr.length(); i++) {
//			
//		}
//		
//		System.out.println(orgStr);
//		System.out.println(revertStr);
//		
//	}
//}

//=======================================================
//public class RevertString {
//	public static void main(String[] args) {
//		char[] orgArr = {'a','b','c','d'};
//		char[] revertArr = new char[4];
//		
//		for(int i=0; i<orgArr.length; i++) {
//			revertArr[orgArr.length - 1] = orgArr[i];
//		}
//		
//		System.out.println(orgArr);
//		System.out.println(revertArr);
//		
//		String orgStr = "abcd";
//		String revertStr = null;
//		
//		for(int i=0; i<orgStr.length(); i++) {
//			
//		}
//		
//		System.out.println(orgStr);
//		System.out.println(revertStr);
//		
//	}
//}

//====================================================
//public class RevertString {
//	public static void main(String[] args) {
//		String orgStr = "abcd";
//		String revertStr = null;
//		
//		for(int i=0; i<orgStr.length(); i++) {
//			
//		}
//		
//		System.out.println(orgStr);
//		System.out.println(revertStr);
//		
//		
//	}
//}
