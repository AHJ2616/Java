package ch01;

public class Varialbe {

	public static void main(String[] args) {
		// 변수의 사용범위를 알아보자
		// 변수는 괄호 안에서만 효력이 발생한다. 내부괄호가 있다면 그것도 효력범위 안
		
		    int v1 = 9 ;
		    int v2 ; //초기값은 언제나 아래의 결과에 따라서 덮어질 수 있다 -> 보통 0으로 쓴다.
		    v2 = 0 ; 
		    int v3 = 0;
		    
		    if(v1>=10) {
		    	v2 = v1 + 10 ;	
		    } 
		    
		        v3 = v1 + v2 + 5 ;
		   
		    
		    System.out.println(v1);
		    System.out.println(v2);
		    System.out.println(v3);

	}

}
