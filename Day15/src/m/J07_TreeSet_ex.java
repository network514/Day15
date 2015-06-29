package m;

import java.util.*;

public class J07_TreeSet_ex {
	public static void main(String[] args) {
		
		TreeSet<Integer> lotto
						= new TreeSet();
		
		while(true) {
			int n 
				= (int)(Math.random()*45 + 1);
			lotto.add(n);
			
			if(lotto.size()==6) {
				break;
			}
		}
		
		System.out.println("추천 번호 : "
						+ lotto.toString());
		
	}
}









