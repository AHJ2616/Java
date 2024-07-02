package ch09.interfaceExam.extend;

public class Pterosaur implements Bird {

	@Override
	public void land() {
		System.out.println("익룡이 착륙한다");
		
	}

	@Override
	public void flying() {
		System.out.println("익룡이 난다");
		
	}

	@Override
	public void glide() {
		System.out.println("익룡이 이륙한다");
		
	}

	@Override
	public void eat() {
		System.out.println("익룡이 먹는다");
		
	}

	@Override
	public void breath() {
		System.out.println("익룡이 숨쉰다");
		
	}

	@Override
	public void feces() {
		System.out.println("익룡이 싼다");
		
	}

	@Override
	public void sound() {
		System.out.println("익룡이 소리낸다");
		
	}//익룡

	
	
}//class end
