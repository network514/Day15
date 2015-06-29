package data;

import javax.swing.JOptionPane;

public class J03_Nation {

	String name;	// 국가 이름
	String cap;		// 수도 이름
	
	public J03_Nation() {
		name = 
		JOptionPane.showInputDialog(
						"국가 이름 입력");
		cap =
		JOptionPane.showInputDialog(
						"수도 이름 입력");
	}
	
	public String getData() {
		return "국가 이름 : " + name 
				+ ", 수도이름 : " + cap;
	}
	
	public String getName() {
		return name;
	}
	
}



