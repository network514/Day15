package m;

import java.util.*;

import org.omg.CORBA._PolicyStub;

import data.*;

public class J02_ArrayList {
	public static void main(String[] args) {
		
//		List 계열 컬렉션
//		- 저장 순서를 기억한다.
//		- 중복을 허용한다.
		
		ArrayList lists = new ArrayList();
		
		
//		1. add() : 기본적으로 객체의 고유번호를
//					저장하는 기능
		lists.add(10);
		lists.add(12.34);
		lists.add('p');
		lists.add("가나다");
		
		J02_People pp 
				= new J02_People("둘리", 12);
		lists.add(pp);
		lists.add(
				new J02_People("도우너", 23));
		
		
//		2. size() : 저장된 객체의 고유번호 
//					갯수를 제공
		int n = lists.size();
		System.out.println("n = " + n);
		
//		3. isEmpty() : 저장된 고유번호가
//					없으면 true / 있으면 false
//					를 제공
		boolean b = lists.isEmpty();
		System.out.println("b : " + b);
		
		
//		4. get(인덱스번호) : 
//				지정된 인덱스에 대한 객체의
//				고유번호를 제공
//			- Object 타입으로 제공
//				(목적에 따라 형변환 필요)
//			- 인덱스 번호는 0부터 시작함
		
		Object rcvObj = lists.get(1);
		System.out.println("rcvObj : " 
							+ rcvObj);
//		에러 : double res = rcvObj + 10;
//		=> Object 타입이므로, 
//			수치데이터로 인식하지 않기 때문에
//			계산 불가능
		
		double rr = (double)rcvObj;
		double res = rr + 10;
		System.out.println("res : " + res);
		
		
//		5. remove(인덱스번호) : 
//				지정된 인덱스의 고유번호를 삭제.
//			- 삭제된 이후에는 고유번호가
//				자동으로 정렬됨
		System.out.println("lists : " + lists);
		System.out.println(lists.get(1));
		lists.remove(12.34);
		System.out.println("lists : " + lists);
		System.out.println(lists.get(1));
		
//		6. clear() : 모든 고유번호를 삭제
		System.out.println(lists.size());
		lists.clear();
		System.out.println(lists.size());
		
		
	}
}











