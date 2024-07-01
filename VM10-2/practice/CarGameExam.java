package practice;

import java.util.*;

public class CarGameExam {

	public static void main(String[] args) {
		String idInfo = "ID", pass = "passwords", car = "캐스퍼";
		// idInfo : 사용자 ID 입력받기 , pass : 사용자 비밀번호 입력받기 , car : 사용자 자동차이름
		Scanner s1 = new Scanner(System.in); // s1 : String 입력기
		Scanner s2 = new Scanner(System.in); // s2 : int 입력기
		Scanner s3 = new Scanner(System.in); // s3 : int 입력기(2)
		Scanner s4 = new Scanner(System.in); // s3 : String 입력기(2)
		boolean run = true, run2 = true; // run : 로그인 화면 while문 , run2 : 자동차 선택 메뉴 while문
		int pstimes = 0, carnum = 0, cartype = 0; // pstimes : 비밀번호 입력 횟수, carnum : 자동차 선택 메뉴 while문에서 선택지 입력받기 ,
												// cartype : 차 선택기(초기값0)) 

		
		System.out.printf(//엔터 누르고 띄어쓰기 하고 하면 훨씬 이쁘지만 귀찮아서 길게 늘여씀
				"<<시작전 주의사항>>\n본 게임은 빈약한 VM콘솔로 돌려야하는 환경속에서 만들어져서 제약이 많이 따릅니다.\n게임에는 인터넷용어, 버그등이 포함되어있습니다. \n게임이 선생님의 제작의도와 다른거 같습니다.\n선처부탁드립니다.\n버그제보는 Insta: IneedU22\n들어오셔서 팔로우 눌러주시면 고쳐지는게 대부분입니다.\n그 외 버그는 디엠보내주세요!\n게임이 어렵지 않으니까 제발 엔딩까지 봐주세요!\n\n스크롤 위로 올려서 공지사항 확인!\n");

		System.out.println("================================================");
		System.out.println("ID를 설정해주세요 >.<");
		System.out.print("입력칸 >>");
		idInfo = s1.next();

		while (run) { // 로그인 화면 시나리오1.
			System.out.println("==========시나리오1. 비밀번호를 입력해주세요 >.< ==========");
			System.out.println("==================================================");
			System.out.println("==================================================");
			System.out.println("비밀번호 오류 횟수 : " +pstimes);
			System.out.println("String id >> " + idInfo);
			System.out.print("String ps >>");
			
			pass = s1.next();
			System.out.println("비밀번호 오류 횟수 : " +pstimes);
			
			/* 1번 */if (!idInfo.equals(pass)) {
				pstimes++;
				
				
				/* 2번 */if (pstimes >= 5) {
					System.out.println("================================================");
					System.out.println("ps hint : id.equals(\"ps\") = true");
				} // 2번.if end

			} // 1번.if end

			else {
				run = false;
			} // else문 end

		} // while end
		System.out.println("로그인 성공!");

		// 변수 설명 : <run2 : boolean, while문용> <car : string, 자동차 모델이름> <carnum : int,
		// 1,2,3 선택 입력기> <cartype : int, 차 선택기(초기값0)>
		final int MAXCAR = 4, MINCAR = -3; // 차선택 최대 최소치
		while (run2) { // 자동차 선택 메뉴
			System.out.println("====================시나리오2. 자동차선택====================");
			System.out.println("========================================================");
			System.out.println("========================================================");
			System.out.println("     " + idInfo + "님의 자동차 : " + car);
			System.out.println();
			System.out.println("1.선택하기		2.업그레이드	3.다운그레이드");
			System.out.println("========================================================");
			System.out.println("========================================================");
			System.out.print("입력칸 >>");
			carnum = s2.nextInt();
			switch (carnum) {
			case 1: // 선택하기
				run2 = false;
				break;
			case 2: // 업그레이드
				cartype += 1;
				if (cartype > 4) {
					cartype = MAXCAR;
				}

				switch (cartype) { // 차종 선택
				case (-3):
					car = "킥보드";
					break;
				case (-2):
					car = "베스파";
					break;
				case (-1):
					car = "모닝";
					break;
				case 0:
					car = "캐스퍼";
					break;
				case 1:
					car = "아반떼";
					break;
				case 2:
					car = "G80";
					break;
				case 3:
					car = "람보르기니";
					break;
				case 4:
					car = "부가티";
					break;

				}// cartype의 switch end
				break;

			case 3: // 다운그레이드
				cartype -= 1;
				if (cartype < (-3)) {
					cartype = MINCAR;
				}

				switch (cartype) { // 차종 선택
				case (-3):
					car = "킥보드";
					break;
				case (-2):
					car = "베스파";
					break;
				case (-1):
					car = "모닝";
					break;
				case 0:
					car = "캐스퍼";
					break;
				case 1:
					car = "아반떼";
					break;
				case 2:
					car = "G80";
					break;
				case 3:
					car = "람보르기니";
					break;
				case 4:
					car = "부가티";
					break;

				}// cartype의 switch end
				break;
			default:
				System.out.println("숫자를 잘못 입력하셨습니다");

			}// switch end

		} // while(자동차선택 메뉴) end
		String s2Start = "NoWhile"; // 시나리오2 시작번호입력기

		System.out.println("     " + idInfo + "님의 자동차 : " + car);
		switch (cartype) {// 시나리오2.
		case (-3):
			System.out.println("참가하려는 자동차대회의 자격 미달입니다.");
			System.out.println("사유 : " + car + "는 자동차가 아닙니다;;");
			System.out.println("다시시작 : \"f11\"키");
			break;
		case (-2):
			System.out.println("참가하려는 자동차대회의 자격 미달입니다.");
			System.out.println("사유 : " + car + "는 자동차가 아닙니다;;");
			System.out.println("다시시작 : \"f11\"키");
			break;
		case (-1):
			System.out.println("참가하려는 자동차대회의 자격 미달입니다.");
			System.out.println("사유 : 배기량 조건 미달(최소 이상 2,000cc)");
			System.out.println("다시시작 : \"f11\"키");
			break;
		case 0:
			System.out.println("참가하려는 자동차대회의 자격 미달입니다.");
			System.out.println("사유 : 배기량 조건 미달(최소 이상 2,000cc)");
			System.out.println("다시시작 : \"f11\"키");
			break;
		case 1:
			System.out.println("참가하려는 자동차대회의 자격 미달입니다.");
			System.out.println("사유 : 배기량 조건 미달(최소 이상 2,000cc)");
			System.out.println("다시시작 : \"f11\"키");
			break;
		case 2:
			System.out.println("참가하려는 자동차대회의 자격 미달입니다.");
			System.out.println("사유 : 수동 변속기어 차량만 가능");
			System.out.println("다시시작 : \"f11\"키");
			break;
		case 3: // 람보르기니 > 시나리오3
			System.out.println("==============시나리오3. 자동차구입====================");
			System.out.println("내이름은" + idInfo + ", 나는 많고많고, 많고많고, 많은차 중 " + car + ", " + car + " 오너이다!");
			System.out.println("차 구매를 위해 은행에서 10억을 대출받았다... 자동차 대회에서 꼭 우승해서");
			System.out.println("대출금을 모두 상환해보도록 하자");
			System.out.println();
			System.out.println("계속 진행하려면 Java 기본자료형중에 참과 거짓을 의미하는 데이터 타입을 입력하세요");
			System.out.println("========이거 while아님 기회 딱1번임 ㅋㅋㅋㅋㅋ======================");
			System.out.print("입력칸 >>");
			break;
		case 4: // 부가티 > 시나리오3
			System.out.println("====================시나리오3. 자동차구입====================");
			System.out.println("내 이름은" + idInfo + "이다. 나는 많고많고, 많고많고, 많은차 중 " + car + ", " + car + "오너이다!");
			System.out.println("차 구매를 위해 은행에서 10억을 대출받았다... 자동차 대회에서 꼭 우승해서");
			System.out.println("대출금을 모두 상환해보도록 하자");
			System.out.println();
			System.out.println("!!계속 진행하려면 Java 기본자료형중에 참과 거짓을 의미하는 데이터 타입을 입력하세요!!");
			System.out.println("========이거 while아님 기회 딱1번임 ㅋㅋㅋㅋㅋ======================");
			System.out.print("입력칸 >>");
			break;

		}// stich end

		s2Start = s3.next(); // s3 : string입력기 , s2Start : string, 시나리오3 정답(boolean)
		boolean run3 = true; // 시나리오4 while용
		String korean = "속도"; // 속도 입력받기
		int speed = 0; // 자동차 현재 속도
		final int MAX = 400;

		switch (s2Start) {
		case "boolean":
			System.out.println("=================시나리오4. 드디어 대회참가====================");
			System.out.println("아니 본게임 시작하기 전까지 잡다한 과정이 왜이렇게 많은거야!!");
			System.out.println("새로산 자동차 메뉴얼을 읽어보니 차에 최첨단 AI가 들어가있어서");
			System.out.println("악셀, 브레이크가 전부 음성인식이 된다네?!?!");
			System.out.println("하지만 이런이런... 나는 키보드 입력기가 전부구나");
			System.out.println("속도 가속 = 영차  /  속도 떡락 = 견뎌");
			System.out.println();
			System.out.println("//equals가 한국어도 잘 이해하는지 보려고 <- 이래놓고 switch씀 ㄷㄷ");
			System.out.println("=========================================================");
			System.out.println("가속 하시려면 \"영차\" , 감속 하시려면 \"견뎌\" 를 입력해주세요");
			System.out.print("입력칸 >>");
			while (run3) {
				korean = s4.next(); //윗 단계에서 입력을 이미 받았으므로 switch문보다 선행되야한다?
				/* 속도조절 */switch (korean) {
				case "영차":
					speed += 100;
					if (speed > MAX) {
						speed = MAX;
						run3 = false;
					}//if end. 400초과 금지 if문, 풀악셀 밟으면 while문 탈출하기
					

					System.out.println("=====================================");
					System.out.println();
					System.out.println("    현재속도 : " + speed + "km/h");
					System.out.println();
					System.out.println("=====================================");
					System.out.print("입력칸 >>");
					break;
				case "견뎌":
					System.out.println("AI :대회를 이기기 위해서는 감속하시면 안됩니다. 닝겐.");
					System.out.println("다시시작 : \"f11\"키");
					run3 = false;
					break;
				default:
					System.out.println("머하셈... 영차 , 가속 중에 입력해야한다니까");

				}// switch end

			} // 속도조절 while end
			if(speed==400) {
				System.out.println();
			System.out.println("=====================GAME END===========================");
			System.out.println();
			System.out.println("    현재속도 : " + speed + "km/h");
			System.out.println();
			System.out.println("악셀에서 한 순간도 입을 떼지 않고 끝까지 달린 당신, 대회 우승!! (+10억 인마이 포켓)");
			System.out.println();
			System.out.println("                    -END-");

			}
			break;//모든게임 끝까지 탈출하면 안된다. 이 위에 작성하기!
		default:
			System.out.println("다시시작 : \"f11\"키");
		}// 시나리오4. switch end

		s1.close();
		s2.close();
		s3.close();
		s4.close(); //노란색 뜨는거 방지용 스캐너 종료문
	}// main end

}// class end
