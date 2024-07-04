package ch13.genericMethod;

public class Util {
	//메서드
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
	
	
}//class end
