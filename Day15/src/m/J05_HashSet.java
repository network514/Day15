package m;

import java.util.*;

public class J05_HashSet {
	public static void main(String[] args) {
		
//		Set
//		- 중복을 허용하지 않는다.
//		- 저장 순서를 기억하지 않는다.
		
		HashSet<String> sets = new HashSet();
		
//		1. add() : 객체의 공유번호 저장
		sets.add("사람1");
		sets.add("사람2");
		sets.add("사람3");
		sets.add("사람3");
		sets.add("사람4");
		sets.add("사람2");
		sets.add("사람5");
		
		System.out.println("1. sets : " + sets);
		
		
//		2. size() : 저장된 고유번호 갯수 제공
		System.out.println("2. sets.size() : "
							+ sets.size());
		
//		3. contains() : 데이터 존재 여부 확인
		boolean b = sets.contains("사람2");
		System.out.println("3. b = " + b);
		
	}
}












