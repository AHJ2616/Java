package ch14.collection.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class JDBCExam {
//properties 는 txt문서를 자바 코드의 key,value 형태로 불러 온다.
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties properties = new Properties(); //인스턴스 생성
	String path = JDBCExam.class.getResource("jdbc.properties").getPath();
	//파일의 위치정보를 path 변수에 넣음
	System.out.println(path);
	
	path = URLDecoder.decode(path,"utf-8");
	//path 경로중에 한글이 있을 수 있으니 or 마이크로소프트 언어로 저장되어있으니까 utf-8 언어코드로 변환
	properties.load(new FileReader(path));
	// properties로 작성한 파일을 불러온다.
	
	String driver = properties.getProperty("driver"); //getProperty = getValue
	System.out.println("오라클 드라이버 : " +driver);
	
	}//main method end

}//class end
