package ch02;

public class ByteExam {

	public static void main(String[] args) {
		// Byte 타입은 8bit 처리용 타입으로 -128 ~ 127까지의 범위를 처리한다.
		
		byte var1 = -128 ;
		byte var2 = 127 ;
		byte var3 = 0 ;
		// byte 타입명은 색상정보(RGB),CMYK,파일 업로드or다운로드,그림서식,영상서식,사운드 등을 처리할때 사용한다.
		
		
		// 값이 127을 초과하는 계산을 하면 -128으로 lotation된다.
		byte var4 = 125 ;
		int var5 = 125 ;
		int var6 = 100 ;
		
		for(int i=0 ; i<5 ; i++ ) { //0부터 5까지 1씩 증가(0~4까지 5회 반복)
			var4++ ;  // var4값에 1씩 증가
			var5++ ;  // var5값에 1씩 증가
			var6-- ;  // var6값에 1씩 감소
			System.out.println("var4값 : " + var4 + "    var5값 : " + var5 + "    var6값 : " + var6);
			
		}  
		
		

	}

}
