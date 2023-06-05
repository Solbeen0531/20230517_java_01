package kh.Lclass.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kh.Lclass.exception.UserException;
import kh.Lclass.oop.sample.Person;

public class TestFileIO {
	public void testFileOutputStreamObject() {
		// 파일에 사람들 자료를 저장함
		Person p1 = new Person("홍길동", 23, '남');
		Person p2 = new Person("영희", 27, 'F');

		String filePath = "D:/data2/test/aaa.txt";

		FileOutputStream fos = null; // 기반 스트림
		ObjectOutputStream oos = null; // 보조 스트림

		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void testFileInputStreamObject() {
		String filePath = "D:/data2/test/aaa.txt";

		FileInputStream fis = null; // 기반 스트림
		ObjectInputStream ois = null; // 보조 스트림

		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			
			Object a = null;
			
			if ((a = ois.readObject()) instanceof Person) {
			Person p = (Person)a;
			System.out.println(p);
			}
			if ((a = ois.readObject()) instanceof Person) {
				Person p = (Person)a;
				System.out.println(p);
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) ois.close();
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void testRamda() throws UserException {
		int[] arr = { 2, 3, 4 };
		int[] arr2 = new int[] { 2, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		if (arr.length > 2) {

			throw new UserException("배열의 크기는 2보다 크면 안됨. 줄여주세요");
		}

	}

	public void testFileReadDate() {
		String filePath = "D:/data2/test/aaa.txt";
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath));) {
			// [F2] - quick fix 사용 1. try catch 신중하게 잘 써야 함 2. unimplement method add

			long temp = 0L;
			while ((temp = dis.readLong()) != 0) {
				System.out.println(String.valueOf(temp)); // temp를 String형으로 바꿔줘
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void testFileRead3() {
		String filePath = "D:/data2/test/aaa.txt";
//		BufferedReader br = null;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//			br = new BufferedReader(new FileReader(filePath));

//		try(	FileInputStream fis = new FileInputStream(filePath);
//				InputStreamReader isr = new InputStreamReader(fis); 
//				BufferedReader br = new BufferedReader(isr);	)
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null) br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}

	public void testFileRead2() {
		// 보조스트림
		String filePath = "D:/data2/test/aaa.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try { // 생성 순서 : 기반 스트림 --> 보조스트림

			fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis); // 줄여서 나타내기a
			br = new BufferedReader(isr);

//				isr = new InputStreamReader(new FileInputStream(filePath)); // 줄여서 나타내기a
//			  br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 해제 순서(생성 반대 순서) : 보조스트림 --> 기반스트림 ***XXX
				if (br != null)
					br.close();
				if (fis != null)
					fis.close();
				if (isr != null)
					isr.close();

			} catch (IOException e2) {
				e2.printStackTrace();
			}

		}
	}

	public void testFileRead() {
		String filePath = "D:/data2/test/aaa.txt"; // 실존하지 않는 파일 이름인 경우 FileNotFound 에러 발생
		FileReader fr = null;

//			new FileReader(filePath); // (file과 java 프로그램의 resource 통로)
		try {
			fr = new FileReader(filePath);
			// Unhandled exception type IOException
			// for문 사용불가 (int i=0;i<fr.)
			// 방법 1
//				int a = -1;
//
//				while ((a = fr.read()) > -1) {
//					System.out.println((char) a);
//				}
//				int readCnt = fr.read(readCharArr,1,3); 

			// 글자의 1번째 위치부터 3번째까지 출력 = abc 띄어쓰기는 초기 null 값
			// 글자의 0번째 위치부터 4번째까지 출력 = abcd
//				System.out.println(readCnt); // 문자 스페이스 바를 포함해서 10개 읽음
//				System.out.println(readCharArr); // 

			// 방법 2 - 3
			int cntPerRead = 30;
			char[] readCharArr = new char[1000];
			for (int i = 0; i < readCharArr.length / cntPerRead; i++) {

				int readCnt = fr.read(readCharArr, i * cntPerRead, cntPerRead);
				System.out.println(readCnt); // 문자 스페이스 바를 포함해서 10개 읽음
				if (readCnt < cntPerRead) {
					break;
				}
			}
			System.out.println(readCharArr); //

			//

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cannot File. Check path.");
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			// 변수가 없으면 종료할 수 없다.
//			Unhandled exception type IOException

			try {
				if (fr != null) { // ' null 이 아니면 ' 항목을 미작성하면 NullPointer에러 발생
					fr.close();
				} // 통로를 닫기 _순서 숙지
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("== testFileRead 끝 ==");
	}

	public void testFile() /* throws Exception */ {
//		File f1 = new File("D:/data/aaa.txt"); 

//		File f1 = new File("D:/data1/aaa.txt");
//		f1.mkdirs(); // 디렉토리 생성

		String path = "D:/data2/test";
		String filename = "aaa.txt";

		new File(path).mkdirs(); // 디렉토리 생성
		File f2 = new File(path, filename);

//		Unhandled exception type IOException

		FileWriter fw = null;

		try {
			f2.createNewFile(); // 파일 생성

			fw = new FileWriter(f2); // 문자 형태 전송이 가능한 OutputStream (File 과 java 프로그램의 통로)
			fw.write("abcdef 한글"); // 전송하고자 하는 문자
			fw.flush(); // 전송한 문자가 담긴 버퍼(통로)를 깨끗하게 밀어내기
			return;

		} catch (IOException e) {
			System.out.println("cannot create file");
			e.printStackTrace();

		} finally { // return 전에 반드시 실행하고 넘어가는 문구

			try {
				if (fw != null) {
					fw.close();
				} // 통로를 닫기 _순서 숙지
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
