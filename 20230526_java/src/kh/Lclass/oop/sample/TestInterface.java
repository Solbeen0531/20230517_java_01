package kh.Lclass.oop.sample;

import java.awt.im.spi.InputMethod;
import java.io.Serializable;
import java.util.List;

//public abstract class TestInterface{
//	public abstract void method1(); // 능력단위별 평가보기
//	public abstract String method2(); // 평가 전 안내
//	public abstract int method3(int a,int b); // 평가 리뷰
//}
public interface TestInterface extends InputMethod, Serializable{
	public final int MAXCNT = 10;
	int MAXCNT2 = 10;
	public void method1(); // 능력단위별 평가보기
	public String method2(); // 평가 전 안내
	public int method3(int a, int b); // 평가 리뷰
	
	int insertBoard(Car vo);
	int deleteBoard(Car vo);
	int updateBoard(Car vo);
	Car selectOne(int boardNo);
	Car[] selectList();
	Car[] selectList(String searchWord);
	List<Car> selectListList(String searchWord);
	Car[] searchSelectBoard(String word);
}

