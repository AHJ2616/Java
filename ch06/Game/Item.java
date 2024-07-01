package ch06.Game;

import java.util.*;

public class Item {
	Scanner sc = new Scanner(System.in);
	String name;
	String intro;
	String grade;
	int att, shd, maxHp, money, lv, quantity;
	int upG; // 무기 강화
	boolean set = false;


	public void inventedItem(Item[] items) {// 아이템 설정
		// 무기 0~40
		Item item0 = new Item();
		item0.name = "[초보자 검]";
		item0.intro = "초보자에게 주는 무기, 한개는 null에러 방지로 꼭 남겨주세요!";
		item0.grade = "[노말]";
		item0.lv = 1;
		item0.att = 2;
		item0.shd = 0;
		item0.maxHp = 0;
		item0.money = 0;
		item0.quantity = 3;
		items[0] = item0;
		
		Item item1 = new Item();
		item1.name = "[초보상점 검]";
		item1.intro = "초보자 상점에서 구매가능한 무기";
		item1.grade = "[노말]";
		item1.lv = 3;
		item1.att = 5;
		item1.shd = 0;
		item1.maxHp = 0;
		item1.money = 100;
		item1.quantity = 0;
		items[1] = item1;
		
		Item item2 = new Item();
		item2.name = "[롱소드]";
		item2.intro = "검은탑에서 획득 가능한 무기";
		item2.grade = "[노말]";
		item2.lv = 2;
		item2.att = 7;
		item2.shd = 0;
		item2.maxHp = 0;
		item2.money = 20;
		item2.quantity = 0;
		items[2] = item2;
		
		Item item3 = new Item();
		item3.name = "[롱소드]";
		item3.intro = "검은탑에서 획득 가능한 무기";
		item3.grade = "[레어]";
		item3.lv = 5;
		item3.att = 10;
		item3.shd = 0;
		item3.maxHp = 0;
		item3.money = 60;
		item3.quantity = 0;
		items[3] = item3;
		
		
		// 방어구 41~80
		Item item41 = new Item();
		item41.name = "[초보자 갑옷]";
		item41.intro = "초보자에게 주는 방어구, 한개는 null에러 방지로 꼭 남겨주세요!";
		item41.grade = "[노말]";
		item41.lv = 1;
		item41.att = 0;
		item41.shd = 1;
		item41.maxHp = 10;
		item41.money = 0;
		item41.quantity = 3;
		items[41] = item41;
		
		Item item42 = new Item();
		item42.name = "[초보상점 갑옷]";
		item42.intro = "초보자 상점에서 구매가능한 방어구";
		item42.grade = "[노말]";
		item42.lv = 3;
		item42.att = 0;
		item42.shd = 2;
		item42.maxHp = 30;
		item42.money = 100;
		item42.quantity = 0;
		items[42] = item42;
		
		Item item43 = new Item();
		item42.name = "[겁은탑 갑옷]";
		item42.intro = "검은탑에서 획득 가능한 방어구";
		item42.grade = "[노말]";
		item42.lv = 3;
		item42.att = 0;
		item42.shd = 4;
		item42.maxHp = 30;
		item42.money = 100;
		item42.quantity = 0;
		items[42] = item42;
		
		
		// 악세 81~90
		Item item81 = new Item();
		item81.name = "[초보자 팬던트]";
		item81.intro = "초보자에게 주는 팬던트, 성능은 엄청나다, 한개는 null에러 방지로 꼭 남겨주세요!";
		item81.grade = "[레어]";
		item81.lv = 6;
		item81.att = 5;
		item81.shd = 10;
		item81.maxHp = 100;
		item81.money = 0;
		item81.quantity = 2;
		items[81] = item81;
		
		Item item82 = new Item();
		item82.name = "[검은 수정팬던트]";
		item82.intro = "검은탑 보스 대왕 슬라임의 팬던트";
		item82.grade = "[유니크]";
		item82.lv = 5;
		item82.att = 10;
		item82.shd = 10;
		item82.maxHp = 200;
		item82.money = 150;
		item82.quantity = 0;
		items[82] = item82;

		// 칭호 91~99

	}

	public void equipmentSetAtt(int j, Item[] items, Member member) {// 무기착용
		if (member.wW==false) { // 무기 착용
			if (items[j].quantity > 0) {
				if (items[j].lv >= member.lv) {

					items[j].quantity -= 1;
					member.wW = true;
					items[j].set = true;
					member.att += items[j].att;
					member.shd += items[j].shd;
					member.maxHp += items[j].maxHp;
					
					System.out.println("=================================");
					System.out.println(items[j].name + "이(가) 착용 되었습니다");
					System.out.println("=================================");
				} else {
					System.out.println("=================================");
					System.out.println("착용가능레벨이 아닙니다.");
					System.out.println("=================================");
				}
			} // if end

			else {
				System.out.println("=================================");
				System.out.println("장비수량이 부족합니다. 다시 확인해주세요.");
				System.out.println("=================================");
			}
		} else {
			System.out.println("=================================");
			System.out.println("착용중인 무기가 있습니다. 해체 후 다시 시도해주세요");
			System.out.println("=================================");
		}
		

	}// 무기착용 method end
	
	public void equipmentSetShd(int j, Item[] items, Member member) {// 방어구착용
		if (member.wS==false) {
			if (items[j].quantity > 0) {
				if (items[j].lv >= member.lv) {

					items[j].quantity -= 1;
					items[j].set = true;
					member.wS = true;
					member.att += items[j].att;
					member.shd += items[j].shd;
					member.maxHp += items[j].maxHp;
					System.out.println("=================================");
					System.out.println(items[j].name + "이(가) 착용 되었습니다");
					System.out.println("=================================");
				} else {
					System.out.println("=================================");
					System.out.println("착용가능레벨이 아닙니다.");
					System.out.println("=================================");
				}
			} // if end

			else {
				System.out.println("=================================");
				System.out.println("장비수량이 부족합니다. 다시 확인해주세요.");
				System.out.println("=================================");
			}
		} else {
			System.out.println("=================================");
			System.out.println("착용중인 방어구가 있습니다. 해체 후 다시 시도해주세요");
			System.out.println("=================================");
		}
	}//방어구착용 method end
		public void equipmentSetAcc(int j, Item[] items, Member member) {// 악세착용
			if (member.wA==false) {
				if (items[j].quantity > 0) {
					if (items[j].lv <= member.lv) {

						items[j].quantity -= 1;
						items[j].set = true;
						member.wA = true;
						member.att += items[j].att;
						member.shd += items[j].shd;
						member.maxHp += items[j].maxHp;
						System.out.println("=================================");
						System.out.println(items[j].name + "이(가) 착용 되었습니다");
						System.out.println("=================================");
					} else {
						System.out.println("=================================");
						System.out.println("착용가능레벨이 아닙니다.");
						System.out.println("=================================");
					}
				} // if end

				else {
					System.out.println("=================================");
					System.out.println("장비수량이 부족합니다. 다시 확인해주세요.");
					System.out.println("=================================");
				}
			} else {
				System.out.println("=================================");
				System.out.println("착용중인 악세서리가 있습니다. 해체 후 다시 시도해주세요");
				System.out.println("=================================");
			}
		}// 악세착용 method end

	public void equipment(Member member, Item[] items) {// 장비창
		Item item = new Item();
		boolean run = true;
		while (run) {
			System.out.println("=================================");
			System.out.println(member.name + " 용사의 장비창>\n");
			System.out.println("<무기>");
			if (member.wW == true) {
				for (int i = 0; i <= 40; i++) {
					if (items[i].set == true) {
						System.out.println("등급 : " + items[i].grade);
						System.out.println("이름 : " + items[i].name+items[i].upG);
						System.out.println("공격력 : " + items[i].att);
						System.out.println("방어력 : " + items[i].shd);
						System.out.println("체력 : " + items[i].maxHp);
						break;
					}

				} // for end
			} // if end
			else {
				System.out.println("미착용");
			}

			System.out.println("<방어구>");
			if (member.wS == true) {
				for (int i = 41; i <= 80; i++) {
					if (items[i].set == true) {
						System.out.println("등급 : " + items[i].grade);
						System.out.println("이름 : " + items[i].name+items[i].upG);
						System.out.println("공격력 : " + items[i].att);
						System.out.println("방어력 : " + items[i].shd);
						System.out.println("체력 : " + items[i].maxHp);
						break;
					}

				} // for end
			} // if end
			else {
				System.out.println("미착용");
			}

			System.out.println("<악세사리>");
			if (member.wA == true) {
				for (int i = 81; i <= 90; i++) {
					if (items[i].set == true) {
						System.out.println("등급 : " + items[i].grade);
						System.out.println("이름 : " + items[i].name+items[i].upG);
						System.out.println("공격력 : " + items[i].att);
						System.out.println("방어력 : " + items[i].shd);
						System.out.println("체력 : " + items[i].maxHp);
						break;
					}

				} // for end
			} // if end
			else {
				System.out.println("미착용");
			}

			System.out.println("=================================");

			System.out.println("1.장비 상세정보 확인\n2.장비 착용해체\n3.인벤토리 나가기");
			String select = sc.next();
			switch (select) {
			case "1":
				System.out.println("=================================");
				System.out.println("확인할 장비부위의 번호를 입력해 주세요");
				System.out.println("1.무기\n2.방어구\n3.악세사리");
				String select1 = sc.next();
				switch (select1) {
				case "1":
					item.checkAtt(member, items);

					break;
				case "2":
					item.checkShd(member, items);
					break;
				case "3":
					item.checkAcc(member, items);
					break;
				default:
					System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");

				}
				break;// 얘 오류 일으키는지??
			case "2":
				System.out.println("해체할 장비부위의 번호를 입력해 주세요");
				System.out.println("1.무기\n2.방어구\n3.악세사리");
				String j = sc.next();
				switch(j) {
				case "1" :
					item.dissAtt(member, items);
					break;
				case "2" :
					item.dissShd(member, items);
					break;
				case "3" :
					item.dissAcc(member, items);
					break;
				default:
					System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");
				
				}//switch end
				break;
			case "3":
				run = false;
				break;
			default:
				System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");

			}// switch end

		} // while end
	}// 장비창 method end
	
	public void checkAtt(Member member, Item[] items) {//착용중인 무기 확인
		if (member.wW == true) {
			for (int i = 0; i <= 40; i++) {
				if (items[i].set == true) {
					System.out.println("=================================");
					System.out.println("등급 : " + items[i].grade);
					System.out.println("이름 : " + items[i].name+items[i].upG);
					System.out.println("설명 : " + items[i].intro);
					System.out.println("착용가능 레벨 : " + items[i].lv);
					System.out.println("공격력 증가 : " + items[i].att);
					System.out.println("방어력 증가 : " + items[i].shd);
					System.out.println("체력 증가 : " + items[i].maxHp);
					System.out.println("상점판매가 : " + items[i].money+"원");
					System.out.println("=================================");
					break;
				}

			} // for end
		} // if end
		else {
			System.out.print("미착용");
		}
		
	}// 무기확인 method end
	
	public void checkShd(Member member, Item[] items) {//착용중인 방어구 확인
		if (member.wS == true) {
			for (int i = 41; i <= 80; i++) {
				if (items[i].set == true) {
					System.out.println("=================================");
					System.out.println("등급 : " + items[i].grade);
					System.out.println("이름 : " + items[i].name+items[i].upG);
					System.out.println("설명 : " + items[i].intro);
					System.out.println("착용가능 레벨 : " + items[i].lv);
					System.out.println("공격력 증가 : " + items[i].att);
					System.out.println("방어력 증가 : " + items[i].shd);
					System.out.println("체력 증가 : " + items[i].maxHp);
					System.out.println("상점판매가 : " + items[i].money+"원");
					System.out.println("=================================");
					break;
				}

			} // for end
		} // if end
		else {
			System.out.print("미착용");
		}
		
	}// 무기확인 method end
	
	public void checkAcc(Member member, Item[] items) {//착용중인 악세사리 확인
		if (member.wA == true) {
			for (int i = 81; i <= 90; i++) {
				if (items[i].set == true) {
					System.out.println("=================================");
					System.out.println("등급 : " + items[i].grade);
					System.out.println("이름 : " + items[i].name+items[i].upG);
					System.out.println("설명 : " + items[i].intro);
					System.out.println("착용가능 레벨 : " + items[i].lv);
					System.out.println("공격력 증가 : " + items[i].att);
					System.out.println("방어력 증가 : " + items[i].shd);
					System.out.println("체력 증가 : " + items[i].maxHp);
					System.out.println("상점판매가 : " + items[i].money+"원");
					System.out.println("=================================");
					break;
				}

			} // for end
		} // if end
		else {
			System.out.print("미착용");
		}
		
	}// 무기확인 method end

public void dissAtt(Member member, Item[] items) {//무기 해체
	if (member.wW==true) {
		for(int i =0; i<=40;i++) {
			if (items[i].set == true) {//착용중인 item 번호 찾기

				items[i].quantity += 1;
				member.wW = false;
				items[i].set = false;
				member.att -= items[i].att;
				member.shd -= items[i].shd;
				member.maxHp -= items[i].maxHp;
				
				System.out.println("=================================");
				System.out.println(items[i].name + "이(가) 착용 해제 되었습니다");
				System.out.println("=================================");
			} //if
		} // for end

	} else {
		System.out.println("=================================");
		System.out.println("착용중인 무기가 없습니다");
		System.out.println("=================================");
	}
}

public void dissShd(Member member, Item[] items) {//방어구 해체
	if (member.wS==true) {
		for(int i =41; i<=80;i++) {
			if (items[i].set == true) {//착용중인 item 번호 찾기

				items[i].quantity += 1;
				member.wS = false;
				items[i].set = false;
				member.att -= items[i].att;
				member.shd -= items[i].shd;
				member.maxHp -= items[i].maxHp;
				
				System.out.println("=================================");
				System.out.println(items[i].name + "이(가) 착용 해제 되었습니다");
				System.out.println("=================================");
			} //if
		} // for end

	} else {
		System.out.println("=================================");
		System.out.println("착용중인 방어구가 없습니다");
		System.out.println("=================================");
	}
}

public void dissAcc(Member member, Item[] items) {//악세 해체
	if (member.wA==true) {
		for(int i =81; i<=90;i++) {
			if (items[i].set == true) {//착용중인 item 번호 찾기

				items[i].quantity += 1;
				member.wA = false;
				items[i].set = false;
				member.att -= items[i].att;
				member.shd -= items[i].shd;
				member.maxHp -= items[i].maxHp;
				
				System.out.println("=================================");
				System.out.println(items[i].name + "이(가) 착용 해제 되었습니다");
				System.out.println("=================================");
			} //if
		} // for end

	} else {System.out.println("=================================");
		System.out.println("착용중인 무기가 없습니다");
		System.out.println("=================================");
	}
}
}// class end
