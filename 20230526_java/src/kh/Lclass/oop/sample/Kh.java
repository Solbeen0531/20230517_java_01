package kh.Lclass.oop.sample;

import java.awt.AWTEvent;
import java.awt.Rectangle;
import java.awt.im.spi.InputMethodContext;
import java.io.Serializable;
import java.lang.Character.Subset;
import java.util.List;
import java.util.Locale;

public class Kh implements TestInterface, Serializable {
	// The serializable class Kh does not declare a static final serialVersionUID
	// field of type long
// 		private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 433260745687281223L;

	public void khSpecial() {
		String str = "111111111111112222222222222222222";
//		int c=Integer.parseInt(str);
		Car[] carArr = new Car[3];
		try { // try~catch문 단점 : 에러가 하나라도 있으면 그 이후 에러 확인하지 않음
//			carArr[0] = new Car();
			carArr[4].setPrice(5000); // ArrayIndexOutOfBoundsException
			carArr[0].setPrice(5000); // NullPointerException

			int a = Integer.parseInt(str); // NumberFormatException

			int c = 10 / 0; // 허수이므로 오류 ArithmeticException
			c = 0 / 10;

		} catch (NumberFormatException e) {
			System.out.println(Integer.MAX_VALUE + "까지의 정수만 입력하세요");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눈 수는 나타낼 수 없습니다.");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("예상하지 못한 오류가 발생하였습니다. try again");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 범위를 벗어났습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("최상위 부모 예외처리");
			e.printStackTrace();
		}

		System.out.println("====여기가 마지막=======");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method3(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertBoard(Car vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(Car vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(Car vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Car selectOne(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car[] selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car[] selectList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> selectListList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car[] searchSelectBoard(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInputMethodContext(InputMethodContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean setLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCharacterSubsets(Subset[] subsets) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCompositionEnabled(boolean enable) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCompositionEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reconvert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispatchEvent(AWTEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyClientWindowChange(Rectangle bounds) {
		// TODO Auto-generated method stub

	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deactivate(boolean isTemporary) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hideWindows() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeNotify() {
		// TODO Auto-generated method stub

	}

	@Override
	public void endComposition() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getControlObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
