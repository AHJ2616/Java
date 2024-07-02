package ch09.interfaceExam.extend;

public class Flamingo implements Bird {// 홍학

	@Override
	public void land() {
		System.out.println("홍학이 착륙한다");

	}

	@Override
	public void flying() {
		System.out.println("홍학이 난다");

	}

	@Override
	public void glide() {
		System.out.println("홍학이 이륙한다");

	}

	@Override
	public void eat() {
		System.out.println("홍학이 먹는다");

	}

	@Override
	public void breath() {
		System.out.println("홍학이 숨쉰다");

	}

	@Override
	public void feces() {
		System.out.println("홍학이 싼다");

	}

	@Override
	public void sound() {
		System.out.println("홍학이 소리낸다");

	}// 홍학

}// class end
