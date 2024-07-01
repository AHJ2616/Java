package ch07.mbcCar;

import ch07.hankook.*;//클래스명이 같은것 끼리는 패키지가 달라도 import가 불가능하다.
import ch07.hyundai.Engine;
import ch07.kumho.EcoTire;
import ch07.nexen.*;

public class Car {
	//필드
	Tire hTire = new Tire(); // 한국타이어패키지에서 가져옴
	ch07.kumho.Tire kTire = new ch07.kumho.Tire();//import 없이도 불러올 수 있다.
	SnowTire sTire = new SnowTire();
	EcoTire eTire = new EcoTire();
	BigWidthTire bTire= new BigWidthTire();
	SportTire spTire = new SportTire();
	
	Engine hEngine = new Engine();
	
	
	
	
	//생성자
	
	
	//메서드
	

}//class end
