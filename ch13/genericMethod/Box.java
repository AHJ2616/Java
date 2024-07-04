package ch13.genericMethod;

public class Box<T> {
	//필드
	private T t;
	
	
	//메서드
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
}//class end
