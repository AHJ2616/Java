package ch06.Shop;

import java.util.Scanner;

public class Pay {

	String name; // 상품이름
	int num; // 상품번호
	int price; // 가격
	int quantity; // 수량
	public static Scanner scInt = new Scanner(System.in);

	public void pocketShow(Scanner sc, Member member, Pay[] pays, Item[] items) {// 장바구니 메뉴
		System.out.println("-----------------------");
		System.out.println(member.nick + "님의 장바구니 목록 입니다.>");
		for (int i = 0; i < pays.length; i++) {
			if (pays[i].quantity != 0) {
				System.out.println("상품명 : " + pays[i].name);
				System.out.println("상품가격 : " + pays[i].price);
				System.out.println("상품수량 : " + pays[i].quantity);
				System.out.println("-----------------------");
				System.out.println("| 1. 장바구니 수정 | 2. 구매하기 | 3. 장바구니 종료");
				String select = sc.next();
				switch(select) {
				case "1" :System.out.println("미구현 상태입니다 sorry");
					break;
				case "2" :System.out.println("미구현 상태입니다 sorry");
					break;
				case "3" :
					break;
				
				default: System.out.println("다시 입력해주세요");
				
				}//switch end
				break;
			} // if end

		} // for end
	}// 장바구니 보기 method end

	public void pocketIn(Scanner sc, Member member, Item item, Pay[] pays, Item[] items, Pay pay) {// 장바구니

		for (int i = 0; i < pays.length; i++)
			if (pays[0] == null) {
				pays[0] = pay;
			}
		System.out.println("장바구니에 담기 성공하였습니다.");

	}// 장바구니담기 method end

	public void pocketIn2(Scanner sc, Member member, Item item, Pay[] pays, Item[] items, Pay pay) {// 장바구니
		System.out.println("장바구니에 담을 수량을 입력해주세요");
		pay.quantity = sc.nextInt();
		pay.name = item.name;
		pay.price = item.price;
		pay.num = item.itemNum;
		for (int i = 0; i < pays.length; i++)
			if (pays[0] == null) {
				pays[0] = pay;
			}
		System.out.println("장바구니에 담기 성공하였습니다.");

	}// 장바구니담기 method end

	public Member recharge2(Scanner sc, Member member) {// 유저가 원하는 금액만큼 머니충전
		System.out.println("충전하기 메뉴>\n보유머니 : " + member.money);
		System.out.print("충전할 금액을 입력해주세요 : ");
		int addMoney = sc.nextInt();
		System.out.println("결재방식을 선택해 주세요/n| 1. 카드\n| 2. 계좌이체 \n| 3.카카오페이(5%적립 이벤트중)\n | 4. 네이버페이\n| 5. 토스페이");// 미구현

		member.money += addMoney;
		System.out.println("결제가 정상 처리 되었습니다.");
		return member;
	}

	public Member recharge(Member member, int result) {// 구매에 필요한 금액만큼 머니충전(결과값이 마이너스이다)
		System.out.println("충전하기 메뉴>\n보유머니 : " + member.money);
		System.out.println("충전할 금액 : " + (-result));
		System.out.println("결재방식을 선택해 주세요/n| 1. 카드\n| 2. 계좌이체 \n| 3.카카오페이(5%적립 이벤트중)\n | 4. 네이버페이\n| 5. 토스페이");// 미구현

		member.money -= result;
		System.out.println("결제가 정상 처리 되었습니다.");
		return member;
	}

	public void purchase(Scanner sc, Member member, Item item, Pay[] pays, Item[] items, Pay pay) {// 구매하기

		System.out.println(member.nick + "님의 결제창>\n\n");
		System.out.print("구매하시려는 " + item.name + "의 갯수를 입력하세요 :");
		int select = sc.nextInt();

		System.out.println("결제할 금액은 " + (item.price * select) + "입니다");
		System.out.println("결제 하시겠습니까?");
		System.out.println("| 1. 예 \n| 2. 아니오");
		String select2 = sc.next();
		switch (select2) {
		case "1":// 결제
			int result = 0;
			pay.quantity = select;
			pay.price = item.price;
			pay.num = item.itemNum; // 0부터 시작하므로 그대로 쓰면됨
			boolean run = true;
			while (run) {
				result = member.money - (pay.price * pay.quantity);
				if (result < 0) {
					System.out.println("보유하고 계신 충전머니가 부족합니다");
					System.out.println("필요한 잔액만큼 충전하고 계속 결제 하시겠습니까?");
					System.out.println("충전할 금액 : " + (-result));
					System.out.print("| 1. 충전하기\n| 2. 결제취소\n\n>>>");
					String select3 = sc.next();
					switch (select3) {
					case "1":// 충전하기
						member = pay.recharge(member, result);
						break;
					case "2":
						run = false;
						break;
					default:
						System.out.println("다시 입력해주세요");

					}// switch end
				} // if end
				else {
					member.money = result;
					System.out.println("결제가 완료 되었습니다\n구매해 주셔서 감사합니다");
					System.out.println(member.address + "로 배송준비를 시작합니다");
					run = false;

				}
			} // while end

			break;
		case "2":
			break;
		default:
			System.out.println("다시 입력해주세요");

		}// switch

	}// 구매 method end

	public void purchase2(Scanner sc, Member member, Item item, Pay[] pays, Item[] items, Pay pay) {// 구매하기
		boolean run = true;
		System.out.println(member.nick + "님의 결제창>\n\n");
		System.out.println("결제할 금액은 " + (pay.price * pay.quantity) + "입니다");
		System.out.println("결제 하시겠습니까?");
		System.out.println("| 1. 예 \n| 2. 아니오");
		String select2 = sc.next();
		switch (select2) {
		case "1":// 결제
			while (run) {
				price = member.money - (pay.price * pay.quantity);
				if (price < 0) {
					System.out.println("보유하고 계신 충전머니가 부족합니다");
					System.out.println("필요한 잔액만큼 충전하고 계속 결제 하시겠습니까?");
					System.out.println("충전할 금액 : " + (-price));
					System.out.print("| 1. 충전하기\n | 2. 결제취소\n\n>>>");
					String select3 = sc.next();
					switch (select3) {
					case "1":// 충전하기
						member = pay.recharge(member, price);
						break;
					case "2":
						run = false;
						break;
					default:
						System.out.println("다시 입력해주세요");

					}// switch end
				} // if end
				else {
					member.money = price;
					
					System.out.println("결제가 완료 되었습니다\n구매해 주셔서 감사합니다");
					System.out.println(member.address + "로 배송준비를 시작합니다");
					run = false;

				}

				break;
			}
		case "2":
			break;
		default:
			System.out.println("다시 입력해주세요");

		}// switch

	}// 구매 method end

}// class end
