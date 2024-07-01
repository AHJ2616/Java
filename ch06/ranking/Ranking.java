package ch06.ranking;

public enum Ranking {//열거 타입을 생성한다.
	//상수를 생성하여 열거한다.한정된 값을 갖는것 EX) 요일,직채,1-12월 등등...
	//자동으로 번호가 들어간다(위에서 아래, 왼쪽에서 오른쪽)
	//자동으로 숫자판단이 가능한 코드이다.
	//제한도니 문자열을 숫자로 판단하는 역할을 한다
	GUEST,
	MEMBER,
	VIP,VVIP,VVVIP,ROYAL_MEMBER
//열거 상수명이 여러단어로 구성될 경우에는 밑줄(_)을 쓴다.
	
}