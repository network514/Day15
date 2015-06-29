package m;

import java.util.*;

import data.*;

public class J01_Collection {
	
//	컬렉션
//	- 많은 양의 데이터를 관리할 때 사용되는
//		특별한 구조
//	- 많은 양의 데이터를 관리하는 종류 중 하나인
//		배열 구조의 경우, 프로그램 작성 시
//		데이터의 갯수를 알아야만 사용 가능하다는
//		단점이 있고, 사용 도중 갯수가 변경되는 
//		경우, 추가적인 작업들이 필요하다는
//		번거로움이 있다.
//	- 위와 같은 배열의 단점들을 해결한 것이
//		컬렉션이다.
//	- java.util 패키지에 위치
//	- 컬렉션은 기본적으로 객체 고유번호를
//		관리하는 구조이다.
//	=> 컬렉션의 종류 3가지
//		1. List 인터페이스 계열
//			: ArraysList, Vector, ...
//		2. Set 인터페이스 계열
//			: HashSet, TreeSet, ...
//		3. Map 인터페이스 계열
//			: HashMap, TreeMap, ...
//	=> 저장될 데이터의 형태를 모르는 상태에서
//		모든 데이터의 저장-이용이 가능하도록
//		Object 타입으로 모든 데이터를
//		처리-관리한다.
//	=> 따라서, 컬렉션 객체에 원하는 데이터를
//		집어 넣으면, 무조건 모두 Object 타입으로
//		자동 형변환되어 저장되고,
//		이 때문에 저장된 데이터를 추출해서
//		이용할 때에는 본래의 형태로 변환하는
//		작업이 필요하다.
	
	public static void main(String[] args) {
		
		List list = null;
		list = new ArrayList();
		list = new LinkedList();
		list = new Vector();
//		=> List 인터페이스를 구현하는 
//			구현 클래스 객체들을 통해서
//			다형성 이용이 가능하다.
		ArrayList lists2 = new ArrayList();
		LinkedList lists3 = new LinkedList();
		Vector vects = new Vector();
//		=> 구현 클래스로 직접 객체를 만들어서
//			사용하기도 한다.
		
		
		
		list.add(10);
		list.add(12.34);
		list.add('j');
		list.add("가나다");
		
		J01_Cla c = new J01_Cla();
		list.add(c);
		list.add(new J01_Cla());
		
		System.out.println(
				"list : " + list);
//		=> 컬렉션은 기본적으로 객체의
//			고유번호만을 저장한다.
		
		
		Set sets = null;
		sets = new HashSet();
		sets.add(10);
		sets.add(12.34);
		sets.add('p');
		sets.add("하나둘셋");
		sets.add(new J01_Cla());
		System.out.println("sets : " + sets);
		
		
		Map maps = null;
		maps = new HashMap();
		maps = new TreeMap();
		
		maps.put(1, "하나");
		maps.put(2, "둘");
		maps.put(3, "셋");
		maps.put(4, "넷");
		maps.put(5, 10);
		maps.put(6, 12.34);
		maps.put(7, 'p');
		maps.put(8, new J01_Cla());
		System.out.println("maps : " + maps);
		
		
	}
}





















