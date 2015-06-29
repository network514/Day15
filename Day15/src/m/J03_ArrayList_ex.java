package m;

import java.util.*;

import javax.swing.JOptionPane;

import data.*;

public class J03_ArrayList_ex {
	public static void main(String[] args) {
		
//		국가 정보 프로그램 : 국가이름-수도
		
		ArrayList lists = new ArrayList();
		
		String showMenu = "1. 국가정보 입력\n"
					+ "2. 수도명 검색\n"
					+ "3. 프로그램 종료\n\n"
					+ "번호 선택";
		
		area : while(true) {
			String menu = 
			JOptionPane.showInputDialog(showMenu);
			String msg = null;
			switch(menu) {
			case "1" : 
				J03_Nation ref
					= new J03_Nation();
				lists.add(ref);
				msg = "정상적으로 저장되었습니다.";
				break;
				
			case "2" : 
				String rcv =
				JOptionPane.showInputDialog(
						"검색할 국가명 입력");
//				=> 전제 정보가 저장되어 있는
//					lists에서 국가명을 찾아야 한다.
				
				boolean isNoData = true;
				for(int i=0; i<lists.size(); i++) {

//					lists.get(i) => 객체 고유번호
//					=> 실제 클래스로 형변환
					
					J03_Nation info = (J03_Nation)lists.get(i);
					
					if(info.getName().equals(rcv)) {
						msg = info.getData();
						isNoData = false;
						break;
					}
				}
				
				if(isNoData) {
					msg = "저장된 정보가 없습니다.";
				}
				break;
				
			case "3" : 
				break area;
				
			default : 
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(
								null, msg);
		}
		
		
		
	}
}











