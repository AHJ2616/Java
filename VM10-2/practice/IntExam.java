package practice;

public class IntExam {

	public static void main(String[] args) {
    
		int v1,v2,v3,v4 ;
		v1 = 10 ;
		v2 = 0+0 ;
		v3 = 757 ;
		v4 = 312 ;
		
		if(v1>8) {
			v2 = v1 + 20 ;
		
		}
		if((30>v2) & (v2 > 10)) {
			v4 = v3 + 23 ; 
		}

		if(v1>8) {
			v2 = v1 + 40 ;
		} //항상 아래에 있는 조건문이 최종적으로 실행된다.
		
		

		
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		
	}

}
