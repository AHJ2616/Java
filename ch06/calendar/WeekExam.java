package ch06.calendar;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		// calendar enum으로 날짜 처리
		// 윈도우에서 알려주는 달력에서 데이터를 읽어온다.
		Calendar cal = Calendar.getInstance();
		//getInstance(); -> java util.Calendar
		//Calendar는 전부 int형 데이터이다

		
		//Calendar 사용 예시
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE); //date = day_of_month
		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int hour1 = cal.get(Calendar.HOUR_OF_DAY);
		int minute=cal.get(Calendar.MINUTE);
		int week = cal.get(Calendar.DAY_OF_WEEK);//요일은 숫자로 반환되어 나온다. 일요일=1 월요일=2 토요일=7

		System.out.println("현재 년도 : "+year);
		System.out.println("현재월 : "+(month+1)); // 0부터 시작해서 +1을 해줘야한다... 개발자 누구냐...
		System.out.println("일 : "+day); // day는 또 잘나옴 month만 이상함
		
		
		
		//eNum 사용 예시
		Week wk = null; // Week enum 인스턴스 생성
		switch(week) {
		case 1 : wk = Week.일요일; break;
		case 2 : wk = Week.월요일; break;
		case 3 : wk = Week.화요일; break;
		case 4 : wk = Week.수요일; break;
		case 5 : wk = Week.목요일; break;
		case 6 : wk = Week.금요일; break;
		case 7 : wk = Week.토요일; break;
		
		
		
		
		}//switch end

		System.out.println("현재요일 : "+wk);
	
		System.out.println(hour+"시 "+minute+"분");
		
		
	}//main method end

}
