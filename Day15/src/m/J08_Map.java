package m;

import java.util.*;

public class J08_Map {
	public static void main(String[] args) {
		
//		Map
//		- 키(key)와 값(value)로 이루어져 있다.
//		- 서로 관계성을 가진 두 개의 데이터에 
//			대하여 키-값의 형태를 설정하는 구조이다.
//		- 키는 중복을 허용하지 않는다.
//		- 만약, 키가 중복되는 경우
//			가장 마지막에 저장한 값으로
//			덮어쓰기가 된다.
//		- 값은 중복을 허용한다.
//			키가 다르다면, 값을 중복되어도 상관없다.
		
		HashMap<Integer, String> maps
							= new HashMap();
		
//		1. put(키, 값);	: 키와 값으로 저장
		maps.put(1, "가");
		maps.put(2, "나");
		maps.put(3, "다");
		maps.put(4, "다");
		maps.put(4, "라");
		System.out.println("1. maps : " + maps);
		
//		2. get(key) : get에 키를 넣으면 
//						값이 제공됨
		String values = maps.get(2);
//		=> get(키)를 명령하면 해당 값이 Object로
//			제공되기 때문에 형변환해야 하지만,
//			제네릭을 걸면 형변환없이 값을 받을 수
//			있다.
		System.out.println("2. values : "
								+ values);
		
//		3. containsKey(key) : 
//			해당 키가 존재하는지 여부 확인
		boolean b = maps.containsKey(3);
		System.out.println("3. b : " + b);
		b = maps.containsKey(9);
		System.out.println("3. b : " + b);
				
		
//		4. keySet() : Map이 가지고 있는
//						키들만 묶어서
//						Set 컬렉션 형태로
//						제공하는 메소드
		Set<Integer> sets = maps.keySet();
		System.out.println("4. sets : "
								+ sets);

//		확장 for-each문의 이용
//		for( 오른쪽 여러개의 데이터 중 한개 
//					: 여러개의 데이터) {
//			
//		}
		
		for(int key : sets) {
			String value = maps.get(key);
			System.out.println(
				"키 : " + key 
					+ ", 값 : " + value);
		}
		
	}
}











