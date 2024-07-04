package ch13.multiType;

public class Product<T,M> {//파라미터명은 아무거나 써도 상관 없다.
	//필드
	private T kind; // Car 또는 Tv가 될 수 있다.
	private M model; //
	
	
	
	//생성자
	
	
	//메서드
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}//class end
