package org.howard.edu.lsp.exam.question40;

public class Test {

	public static void main(String[] args) {
		String Flying;
		Goose objGoose = new Goose();
		Tiger objTiger = new Tiger();
		Airplane objAirplane = new Airplane();
		
		
		objGoose.speak();
		objTiger.speak();
		objGoose.move();
		objTiger.move();
		
		Flying = objGoose.fly();
		System.out.println(Flying);
		objAirplane.fly();
	
	}

}
