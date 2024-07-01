package ch06.Shop;

import java.util.*;//스캐너 import

public class Item {
	Scanner scInt = new Scanner(System.in);
	String name; // 상품명
	String intro; // 상품 기초설명
	String detail;// 상품상세설명
	int price; // 가격
	int quantity; // 수량
	int itemNum; // 상품번호

	public void menu1(Scanner sc, Item[] items) {// 상품관리메뉴
		Item item = new Item();
		boolean run = true;
		while (run) {
			System.out.print("상품관리 메뉴>\n| 1. 상품등록 | 2. 상품수정 | 3. 상품삭제 | 4. 뒤로가기\n\n>>>");
			String select = sc.next();
			switch (select) {
			case "1": // 등록
				item.addItem(sc, items);
				break;
			case "2":// 수정
				item.editItem(sc, items);
				break;
			case "3":// 삭제
				item.delItem(sc, items);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요");

			}// switch end

		} // 상품관리 메뉴 while(run) end

	}// 상품관리 method end

	public void addItem(Scanner sc, Item[] items) {// 상품등록
		Item item = new Item();
		boolean run = true;
		while (run) {
			System.out.println("상품등록>\n");
			System.out.print("등록할 상품의 이름을 입력하세요 : ");
			item.name = sc.next();
			System.out.print(item.name + "의 기본정보를 입력하세요 : ");
			item.intro = sc.next();
			System.out.print(item.name + "의 디테일정보를 입력하세요 : ");
			item.detail = sc.next();
			System.out.print(item.name + "의 가격을 입력하세요(숫자만 입력가능) : ");
			item.price = sc.nextInt();
			System.out.print(item.name + "의 수량을 입력하세요(숫자만 입력가능) : ");
			item.quantity = sc.nextInt();
			for (int i = 0; i < items.length; i++) {
				if (items[i] == null) {
					item.itemNum = i; // 상품 통계에 쓰일 상품고유넘버 부여하기
					items[i] = item;
					System.out.println("상품이 정상 등록 되었습니다");
					break;
				} // if end

			} // for end
			System.out.println("\n| 1. 추가등록 | 2. 뒤로가기");
			String select2 = sc.next();
			switch (select2) {
			case "1":
				break;
			case "2":
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요");

			}// switch end

		} // while(run) end
	}// 상품등록 method end

	public void editItem(Scanner sc, Item[] items) {// 상품수정
		Item item = new Item();
		boolean run = true;
		while (run) {
			System.out.println("상품수정>\n");
			System.out.print("기존 상품의 이름을 입력하세요 : ");
			String search = sc.next();
			System.out.print("수정할 상품의 이름을 입력하세요 : \n스킵 : \"스킵\"");
			item.name = sc.next();
			System.out.print(search + "의 기본정보를 입력하세요 : \n스킵 : \"스킵\"");
			item.intro = sc.next();
			System.out.print(search + "의 디테일정보를 입력하세요 : \n스킵 : \"스킵\"");
			item.detail = sc.next();
			System.out.print(search + "의 가격을 입력하세요(숫자만 입력가능) : \n스킵 : \"-1 + 엔터\"");
			item.price = sc.nextInt();
			System.out.print(search + "의 수량을 입력하세요(숫자만 입력가능) : \n스킵 : \"-1 + 엔터\"");
			item.quantity = sc.nextInt();
			for (int i = 0; i < items.length; i++) {
				if (items[i] != null) {

					if (search.equals(items[i].name)) {
						System.out.println("상품수정이 되었습니다");
						if (!item.name.equals("스킵")) {
							items[i].name = item.name;
						} // if end
						if (!item.intro.equals("스킵")) {
							items[i].intro = item.intro;
						} // if end
						if (!item.detail.equals("스킵")) {
							items[i].detail = item.detail;
						} // if end
						if (item.price != (-1)) {
							items[i].price = item.price;
						} // if end
						if (item.quantity != (-1)) {
							items[i].quantity = item.quantity;
						} // if end

						break;
					} // if end

				} // if end

			} // for end
			System.out.println("\n| 1. 추가수정 | 2. 뒤로가기");
			String select2 = sc.next();
			switch (select2) {
			case "1":
				break;
			case "2":
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요");

			}// switch end

		} // while(run) end

	}// 상품수정 method end

	public void delItem(Scanner sc, Item[] items) {// 상품삭제
		System.out.println("미구현 상태입니다 sorry");

	}// 상품삭제 method end

	public void userMenu1(Scanner sc, Member member, Pay[] pays, Item[] items) {// 유저 구매메뉴
		Item item = new Item();
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println(member.nick + "님의 구매 메뉴>");
			System.out.print("\n| 1. 상품 검색\n| 2. Best 상품 보기\n| 3. 전체상품 목록 보기\n| 4. 뒤로가기\n\n>>>");
			String select = sc.next();
			switch (select) {
			case "1":
				item.search(sc, member, items, pays);
				break;
			case "2":
				item.bestItem(sc, member, pays, items);
				;
				break;
			case "3":
				item.allItem(sc, member, pays, items);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요");

			}// switch end
		} // while(run) end

	}// 유저 구매메뉴 method end

	public void search(Scanner sc, Member member, Item[] items, Pay[] pays) {// 상품검색

		Item item = new Item();
		Pay pay = new Pay();
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("찾으실 상품의 이름을 검색해 주세요");// 비슷한 이름을 검색하려면 char단위로 기능을 만들어야 할듯...
			System.out.println("\n검색창 종료 : \"종료\"");
			String askItem = sc.next();
			if (askItem.equals("종료")) {
				run = false;
				break;
			} else {
				for (int i = 0; i < items.length; i++) {
					if (items[i] != null) {

						if (items[i].name.equals(askItem)) {
							System.out.println("======" + askItem + "의 검색 결과 =====");// 상품 보여주기
							System.out.println("상품명 : " + items[i].name);
							System.out.println("상품설명 : " + items[i].intro + "\n" + items[i].detail);
							System.out.println("상품가격 : " + items[i].price + "원");
							System.out.println("상품재고 : " + items[i].quantity + "개 남았습니다");
							item = items[i];
							break;
						
					}

				} // for end
				
						
					}
				}//else end
				System.out.println("=========================");
				System.out.println("| 1. 구매하기\n| 2. 장바구니 담기\n| 3. 뒤로가기");
				String select = sc.next();
				switch (select) {
				case "1":
					pay.purchase(sc, member, item, pays, items, pay);
					break;
				case "2":
					pay.pocketIn2(sc, member, item, pays, items, pay);
					break;
				case "3":
					run = false;
					break;
				default:
					System.out.println("다시 입력해주세요");

				}// switch end
			
		} // while end
	}// 상품검색 method end

	public void bestItem(Scanner sc, Member member, Pay[] pays, Item[] items) {// Best 상품
		Item item = new Item();
		Pay pay = new Pay();
		System.out.println("베스트상품>");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + ". " + items[i].name);
			System.out.println(items[i].intro);
			System.out.println(items[i].detail);
			System.out.println(items[i].price);
			System.out.println("-----------------------");
		} // for end
		System.out.println("구매하고 싶은 상품번호를 입력해주세요.");
		int a = scInt.nextInt();
		pay.num = a - 1;
		if (pay.num >= 0 && pay.num < 4) {
			System.out.print(items[pay.num].name + "의 수량을 입력해주세요 : ");
			pay.quantity = sc.nextInt();
			pay.price = items[pay.num].price;
			pay.name = items[pay.num].name;

			System.out.println("| 1. 구매하기\n| 2. 장바구니 담기");
			String select = sc.next();
			switch (select) {
			case "1":
				pay.purchase2(sc, member, item, pays, items, pay);
				break;
			case "2":
				pay.pocketIn(sc, member, item, pays, items, pay);
				break;
			default:
				System.out.println("다시 입력해주세요");
			}// switch end

		} // if end
		else {
			System.out.println("다시 입력해주세요");
		}

	}// Best 상품 method end

	public void allItem(Scanner sc, Member member, Pay[] pays, Item[] items) {// 전체상품
		Pay pay = new Pay();
		Item item = new Item();
		System.out.println("전체상품 목록>\n");
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				System.out.println((i + 1) + ". " + items[i].name);
				System.out.println(items[i].intro);
				System.out.println(items[i].detail);
				System.out.println(items[i].price);
				System.out.println("-----------------------");
			}
		}
		System.out.println("구매하고 싶은 상품번호를 입력해주세요.");
		int a = scInt.nextInt();
		pay.num = a - 1;
		if (pay.num >= 0 && pay.num < 4) {
			System.out.print(items[pay.num].name + "의 수량을 입력해주세요 : ");
			pay.quantity = sc.nextInt();
			pay.price = items[pay.num].price;

			System.out.println("| 1. 구매하기\n| 2. 장바구니 담기");
			String select = sc.next();
			switch (select) {
			case "1":
				pay.purchase2(sc, member, item, pays, items, pay);
				break;
			case "2":
				pay.pocketIn(sc, member, item, pays, items, pay);
				break;
			default:
				System.out.println("다시 입력해주세요");
			}// switch end

		} // if end
		else {
			System.out.println("다시 입력해주세요");
		}
	}// 전체상품 method end

}// class end
