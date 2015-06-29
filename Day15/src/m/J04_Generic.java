package m;

import java.util.*;

public class J04_Generic {
	
//	제네릭
//	- 컬렉션을 이용할 때
//		컬렉션은 Object 형태로 데이터를 받으므로
//		모든 형태의 고유번호를 받을 수 있지만,
//		일반적인 상황에서는 목적에 맞는
//		공통된 형태의 데이터를 받게 된다.
//	- 프로그램의 안정성을 높이는 효과로
//		컬렉션에 저장될 데이터의 형태를
//		일정한 규칙으로 정하고 사용하는 기능이
//		제네릭이다.
//	- 제네릭을 설정하면, 
//		설정한 형태의 고유번호(데이터)만
//		저장 가능한 컬렉션이 되며,
//		저장된 데이터를 사용할 때에는
//		형변환을 하지 않아도 자동으로 형변환되어
//		값이 제공된다.
	
	public static void main(String[] args) {
		
		ArrayList lists1 = new ArrayList();
		lists1.add(10);
		lists1.add(1.2);
		lists1.add('k');
//		=> Object 형태의 고유번호를 관리하므로
//			모든 형태의 데이터 처리 가능
		
		
		ArrayList<String> lists2 
						= new ArrayList();
//		=> lists2 컬렉션은 String 클래스의
//			고유번호만 저장하겠다는 의미.
		lists2.add("가나다");
		lists2.add(new String("abcde"));
		lists2.add("1234");
//		에러 : lists2.add(1234);
//		=> 제네릭을 String으로 설정했으므로
//			정수 이용 불가능
		
//		에러 : 
//		ArrayList<int> lists3
//					= new ArrayList();
//		=> 제네릭은 클래스 형태의 설정만
//			가능하다.
//		=> 기본 자료형에 대한 클래스 형태인
//			Wrapper클래스를 이용해야 한다.
//		=> Wrapper클래스 종료
//			: Integer(int), Double(double)
//				Float(float), Boolean(boolean)
//				Character(char)...
		
		ArrayList<Integer> lists3
							= new ArrayList();
		lists3.add(12);
		lists3.add(951);
//		에러 : lists3.add('r');
//		=> 제네릭 설정에 따라 정수만 가능
		
		System.out.println("lists3 : " 
									+ lists3);
		System.out.println("lists3.get(0) : "
									+ lists3.get(0));
		
		Object obj = lists3.get(0);
		int temp = (int)obj;
		
		int data = lists3.get(0);
//		=> 제네릭 설정에 따라 형변환을 하지 않아도
//			자동으로 형변환된다.
		
		
		
		
		
	}
}





