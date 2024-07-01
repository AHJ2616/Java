package car;

import java.util.*;

public class Car {// 자동차 객체 , 게임의 전반적인 부분을 다룸
	private static Scanner sc = new Scanner(System.in);
	String brand;// 브랜드
	String model;// 모델명
	int price;// 가격 , 사용한 돈
	int engine;// 엔진 마력
	int speed;// 최고속도
	int corner;// 코너링 점수 100점 만점
	int satis; // 만족도 점수 100점 만점
	boolean used;// 사용여부

	int aeroPart = 0;// 바람 저항 줄여줌 (속도상승) , 만족도 상승
	int rearWing = 0;// 코너링값 증가 , 만족도 상승
	int color = 0;// 색상 만족도 상승
	int engineUp = 0;// 엔진단계 향상 속도 상승, 만족도 상승

	void carSet(Car[] cars) {// 자동차 기초값 생성
		Car car0 = new Car();
		car0.brand = "부가티";
		car0.model = "시론";
		car0.engine = 1_500;// 엔진 마력수
		car0.speed = 420;// 최고속도
		car0.corner = 95;// 코너링점수
		car0.satis = 150;// 차량 만족도 점수
		car0.price = 320_000; // int범위 밖이니까 단위를 만원 단위로
		car0.used = false;
		cars[0] = car0;

		Car car1 = new Car();
		car1.brand = "부가티";
		car1.model = "배이론";
		car1.engine = 1_000;// 엔진 마력수
		car1.speed = 407;// 최고속도
		car1.corner = 90;// 코너링점수
		car1.satis = 120;// 차량 만족도 점수
		car1.price = 250_000; // int범위 밖이니까 단위를 만원 단위로
		car1.used = false;
		cars[1] = car1;

		Car car2 = new Car();
		car2.brand = "벤틀리";
		car2.model = "플라잉 스퍼 V8";
		car2.engine = 550;// 엔진 마력수
		car2.speed = 318;// 최고속도
		car2.corner = 80;// 코너링점수
		car2.satis = 90;// 차량 만족도 점수
		car2.price = 32_000; //
		car2.used = false;
		cars[2] = car2;

		Car car3 = new Car();
		car3.brand = "벤틀리";
		car3.model = "벤테이가";
		car3.engine = 542;// 엔진 마력수
		car3.speed = 290;// 최고속도
		car3.corner = 80;// 코너링점수
		car3.satis = 88;// 차량 만족도 점수
		car3.price = 30_000; //
		car3.used = false;
		cars[3] = car3;

		Car car4 = new Car();
		car4.brand = "아우디";
		car4.model = "R8 V10";
		car4.engine = 536;// 엔진 마력수
		car4.speed = 331;// 최고속도
		car4.corner = 75;// 코너링점수
		car4.satis = 80;// 차량 만족도 점수
		car4.price = 25_000; //
		car4.used = false;
		cars[4] = car4;

		Car car5 = new Car();
		car5.brand = "제네시스";
		car5.model = "G90";
		car5.engine = 300;// 엔진 마력수
		car5.speed = 300;// 최고속도
		car5.corner = 70;// 코너링점수
		car5.satis = 60;// 차량 만족도 점수
		car5.price = 9_000; //
		car5.used = false;
		cars[5] = car5;

		Car car6 = new Car();
		car6.brand = "현대";
		car6.model = "그랜저";
		car6.engine = 220;// 엔진 마력수
		car6.speed = 240;// 최고속도
		car6.corner = 50;// 코너링점수
		car6.satis = 50;// 차량 만족도 점수
		car6.price = 4_000; //
		car6.used = false;
		cars[6] = car6;

	}// 자동차 기초값 method end

	void ep1Day1(User user, Man[] mans, Car[] cars) {// ep1.첫날 진행
		Car car = new Car();
		boolean run = true;
		while (run) {
			System.out.println("=====================================");
			System.out.println("의뢰를 받은 첫날입니다!");
			System.out.println("오늘은 자동차의 브랜드와 모델을 선택해 주문을 해야합니다");
			System.out.println("\n1.자동차 주문하기 \n2.고객의 요구사항 확인하기\n3.나의상태 확인");
			System.out.println("=====================================");
			String select = sc.next();
			switch (select) {
			case "1":
				orderCar(user, mans, cars);
				run = false;
				break;
			case "2": // 메서드로 만들어도 되는데 귀찮아서...
				System.out.println("=====================================");
				System.out.println("설명 : " + mans[0].story);
				System.out.println("예산 : 5억원");
				System.out.println("기한 : " + mans[0].expire + "일");
				System.out.println("=====================================");
				System.out.print("'press any key' 다음>>>");
				String skip = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
				break;
			case "3":
				switch (user.level) {
				case 1:
					System.out.println("난이도 : 쉬움");
					break;
				case 0:
					System.out.println("난이도 : 보통");
					break;
				case (-1):
					System.out.println("난이도 : 어려움");
					break;

				}
				System.out.println("자금 : " + user.money + "만원");
				System.out.print("'press any key' 다음>>>");
				String skip1 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
				break;
			default:
				System.out.println("다시 입력해주세요");

			}// switch

		} // while end
	}// day1 method end

	void orderCar(User user, Man[] mans, Car[] cars) {// 차량주문 method
		boolean a1=false;
		boolean a2=false;
		boolean a3=false;
		boolean a4=false;//user값 초기화
		Car car = new Car();
		System.out.println("=====================================");
		System.out.println("이제 당신은 차량을 주문해야합니다.");
		System.out.println("한 번 차량을 정하면 에피소드 내내 수정할 수 없습니다.");
		System.out.println("한 번 선택된 차량은 다음 에피소드에서 다시는 선택할 수 없습니다.");
		System.out.println("=====================================");
		System.out.print("'press any key' 다음>>>");
		String skip = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기

		System.out.println("차량목록>");
		for (int i = 0; i <= 6; i++) {
			if (cars[i].used == false) {
				System.out.println("=====================================");
				System.out.println((i + 1) + "번");
				System.out.println("브랜드 : " + cars[i].brand);
				System.out.println("모델명 : " + cars[i].model);
				System.out.println("엔진 : " + cars[i].engine + "마력");
				System.out.println("최고속도 : " + cars[i].speed + "km/h");
				System.out.println("코너링 점수 : " + cars[i].corner + "점");
				System.out.println("기본 만족도 점수 : " + cars[i].satis + "점");
				System.out.println("만족도가 100점 이상이면 손님이 예산보다 더 지불 할 수도 있습니다.");
				System.out.println("-------------------------------------");
				System.out.println("가격 : " + cars[i].price + "만원");
				System.out.println("=====================================");

			} // if end
		} // for end
		boolean run = true;
		while (run) {
			System.out.println("주문할 차량의 번호를 입력해 주세요");
			int carS = sc.nextInt();
			if (user.money >= cars[(carS - 1)].price) {

				user.money -= cars[(carS - 1)].price;
				user.num = carS - 1;
				System.out.println(cars[user.num].brand + " " + cars[(carS - 1)].model + "의 주문이 완료 되었습니다");
				System.out.print("'press any key' 다음날>>>");
				String skip1 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
				run = false;

			} else {
				System.out.println("예산을 초과한 금액입니다.\n다시 선택해 주세요.");
			}
		} // while end

	}// 차량 주문 method end

	void ep1DayN(User user, Man[] mans, Car[] cars) {// 다음날 진행
		Car car = new Car();
		for (int i = 2; i <= 9; i++) {
			System.out.println("=============================================");
			System.out.println(i + "일차 입니다.");
			// 컨디션 값 조정
			int c = (int) (Math.random() * 15 + 1) + user.level + user.condition2; // 컨디션랜덤값 + 난이도값
			if (c <= 2) {
				user.condition = -2;
				System.out.println("어제 과음으로 컨디션이 최악의 상태입니다.\n오늘 작업을 진행하면 차량파손 사고가 날 수도 있습니다");

			} // 컨디션 최악
			else if (c >= 3 && c <= 5) {
				user.condition = -1;
				System.out.println("너무더워서 잠을 설치고 말았습니다. 컨디션이 나쁜 상태입니다.\n오늘 작업을 진행하면 결과가 안좋을 수도 있습니다.");

			} // 컨디션 나쁨
			else if (c >= 6 && c <= 10) {
				user.condition = 0;
				System.out.println("컨디션이 좋지도 나쁘지도 않은 보통입니다");

			} // 컨디션 보통
			else if (c >= 11 && c <= 13) {
				user.condition = 1;
				System.out.println("8시간 이상 숙면을 취해서 컨디션이 좋습니다.");

			} // 컨디션 좋음
			else if (c >= 14) {
				user.condition = 2;
				System.out.println("몸의 통증이 하나도 안느껴집니다. 컨디션이 최고상태입니다.");

			} // 컨디션 최상

			System.out.println("현재 남은 자금은 " + user.money + "원 입니다.");
			System.out.println("튜닝시킬 차량은 " + cars[user.num].brand + " " + cars[user.num].model + "입니다");
			System.out.println("=====================================");
			System.out.print("'press any key' 다음>>>");
			String skip1 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
			boolean run = true;
			while (run) {
				System.out.println("=============================================");
				System.out.println("오늘은 무엇을 할까요?");
				System.out.println("1. 에어로 파츠 교체 : 바람의 저항을 줄여 차량의 속도를 올립니다."); // 2진수 1자리
				System.out.println("2. 레어 윙 교체 : 바람의 저항을 줄여 코너링에 안전감을 올립니다."); // 2진수 2자리
				System.out.println("3. 차량 도색 : 사용자가 원하는 색을 고르게 된다면 만족감이 크게 상승합니다.");// 2진수 3자리
				System.out.println("4. 엔진 교체 : 엔진을 교체햐여 차량의 속도를 올립니다.");// 2진수 4자리
				System.out.println("5. 휴일 선언 : 하루동안 집에서 쉬고 컨디션을 회복합니다.");
				System.out.println("===============================================");
				String select = sc.next();
				switch (select) {// char c1 = s1.charAt(x);
				case "1":
					if (user.a1==false) {// 에어로 파츠를 교체한 적이 없다면 true 진행
						System.out.println("에어로 파츠 교체에 예산을 얼마나 사용할 건가요?");
						System.out.println("현재 남은 자금은 " + user.money + "원 입니다.");
						System.out.print("금액 입력(만원 단위) :");
						int select1 = sc.nextInt();
						user.money -= select1;
						if (user.money >= 0) {
						System.out.println("파츠교체를 시작합니다!");
						System.out.print("'press any key' 다음>>>");
						String skip2 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기

						if (select1 >= 10000) {
							System.out.println("최고의 팀의 지원을 받아서 최상의 결과를 낼 수 있을거같습니다.");
							System.out.println("소요시간은 2일 입니다.");
							System.out.print("'press any key' 다음>>>");
							String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
							i += 1;
							user.a1=true;
							car.aeroPart += 3 + user.condition;
							run = false;
						} else if (select1 <= 9999 & select1 >= 5001) {
							System.out.println("전문 팀의 지원을 받아서 만족할만한 결과를 낼 수 있을거같습니다.");
							System.out.println("소요시간은 2일 입니다.");
							System.out.print("'press any key' 다음>>>");
							String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
							i += 1;user.a1=true;
							car.aeroPart += 2 + user.condition;
							run = false;

						} else if (select1 <= 5000 & select1 >= 2001) {
							System.out.println("혼자서 고군분투합니다. 그래도 만족할만한 결과를 낼 수 있을거같습니다.");
							System.out.println("소요시간은 3일 입니다.");
							System.out.print("'press any key' 다음>>>");
							String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
							i += 2;user.a1=true;
							car.aeroPart += 2 + user.condition;
							run = false;
						} else {
							System.out.println("좋은 품질은 기대 못해도 열심히 해봅니다.");
							System.out.println("소요시간은 3일 입니다.");
							System.out.print("'press any key' 다음>>>");
							String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
							i += 2;user.a1=true;
							car.aeroPart += 1 + user.condition;
							run = false;
						}
					}else {System.out.println("소지금이 부족합니다");}
					} // if end

					// if end
					else if (user.a1==true) {
						System.out.println("이미 에어로 파츠를 교체하였습니다.");
					}

					break;
				case "2":
					if (user.a2==false) {// 레어 윙을 교체한 적이 없다면 true 진행
						System.out.println("레어 윙 교체에 예산을 얼마나 사용할 건가요?");
						System.out.println("현재 남은 자금은 " + user.money + "원 입니다.");
						System.out.print("금액 입력(만원 단위) :");
						int select1 = sc.nextInt();
						user.money -= select1;
						if (user.money >= 0) {
							System.out.println("파츠교체를 시작합니다!");
							System.out.print("'press any key' 다음>>>");
							String skip2 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기

							if (select1 >= 10000) {
								System.out.println("최고의 팀의 지원을 받아서 최상의 결과를 낼 수 있을거같습니다.");
								System.out.println("소요시간은 2일 입니다.");
								System.out.print("'press any key' 다음>>>");
								String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
								i += 1;user.a2=true;
								car.aeroPart += 3 + user.condition;
								run = false;
							} else if (select1 <= 9999 & select1 >= 5001) {
								System.out.println("전문 팀의 지원을 받아서 만족할만한 결과를 낼 수 있을거같습니다.");
								System.out.println("소요시간은 2일 입니다.");
								System.out.print("'press any key' 다음>>>");
								String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
								i += 1;user.a2=true;
								car.aeroPart += 2 + user.condition;
								run = false;

							} else if (select1 <= 5000 & select1 >= 2001) {
								System.out.println("혼자서 고군분투합니다. 그래도 만족할만한 결과를 낼 수 있을거같습니다.");
								System.out.println("소요시간은 3일 입니다.");
								System.out.print("'press any key' 다음>>>");
								String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
								i += 2;user.a2=true;
								car.aeroPart += 2 + user.condition;
								run = false;
							} else {
								System.out.println("좋은 품질은 기대 못해도 열심히 해봅니다.");
								System.out.println("소요시간은 3일 입니다.");
								System.out.print("'press any key' 다음>>>");
								String skip3 = sc.next(); // 글 읽어보고 준비가 된다면 넘어가기
								i += 2;user.a2=true;
								car.aeroPart += 1 + user.condition;
								run = false;
							}
						}else {System.out.println("소지금이 부족합니다");}
					} // if end

					// if end
					else if (user.a2==true) {
						System.out.println("이미 레어 윙을 교체하였습니다.");
					}

					break;
				case "3":
					System.out.println("미구현 상태입니다 sorry");
					break;
				case "4":
					if(user.a4==false) {System.out.println("미구현 상태입니다 sorry");}

					
					else if (user.a4==true) {
						System.out.println("이미 엔진을 교체하였습니다.");

					}
					break;
				case "5":
					user.condition2 += 3;
					run = false;
					break;
				default:
					System.out.println("다시 입력해주세요");

				}// switch end

			} // while end
		} // for end

	}// 다음날 method end
}// class end
