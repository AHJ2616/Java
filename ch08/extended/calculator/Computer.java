package ch08.extended.calculator;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		double result=Math.PI*r*r;
		return super.areaCircle(r);
	}

	

	
	

}//class end
