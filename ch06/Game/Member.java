package ch06.Game;

import java.util.*;

public class Member {
	String title;// 칭호
	String name;// 이름
	int lv, exp, maxExp;
	int hp, maxHp, att, shd;
	int money, kill, bossKill;
	int portion;// 포션갯수

	boolean wW = false, wS = false, wA = false, wT = false;
	// wW :무기 착용, wS:방어구 착용,wA:악세 착용,wT : 칭호 착용 유무 초기값 false
	Scanner sc = new Scanner(System.in);

	public void creatCha(Member memeber) {// 캐릭터생성

		boolean run = true;
		while (run) {
			System.out.println("용사의 이름을 입력해주세요 (띄어쓰기 금지!)");
			System.out.print("너의 이름은 : ");
			name = sc.next();
			System.out.println("용사의 이름은 다시 바꿀 수 없습니다.");
			System.out.println("정말 " + name + "(으)로 하시겠습니까?");
			System.out.println("1.네/n2.아니오");
			String select = sc.next();
			switch (select) {
			case "1":
				run = false;
				// 캐릭터 초기 state
				lv = 1;
				exp = 0;
				maxExp = 100;
				hp = 50;
				maxHp = 50;
				att = 2;
				shd = 0;
				money = 0;
				kill = 0;
				bossKill = 0;
				portion = 3;
				title = "없음";
				break;
			case "2":
				System.out.print("다시 생각해본 ");
				break;
			default:
				System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");

			}// siwtch end
		} // while end
	}// 캐릭터 생성 method end

	public void state(Member member) {// 캐릭터 스텟확인
		System.out.println("=================================");
		System.out.println(name + " 용사의 상태>\n");
		System.out.println("칭호 : " + title);
		System.out.println("레벨 : " + lv);
		System.out.println("체력 : " + hp + " / " + maxHp);
		System.out.println("경험치 : " + exp + " / " + maxExp);
		System.out.println("공격력 : " + att);
		System.out.println("방여력 : " + shd);
		System.out.println("몬스터 사냥수 : " + kill);
		System.out.println("보스몬스터 사냥수 : " + bossKill);
		System.out.println("=================================");

	}// 캐릭터창 method end

	public void inventory(Item item, Member member, Item[] items) {// 인벤토리
		boolean run = true;
		while (run) {
			System.out.println("=================================");
			System.out.println(name + " 용사의 인벤토리>\n");
			try {
				for (int i = 0; i <= 40; i++) {
					if (items[i].quantity >= 1) {
						System.out.println("장비번호:" + i + " 장비명 : " + items[i].name + items[i].upG + " 보유수량 : "
								+ items[i].quantity + "개");
					} // if end

				} // for end
			} catch (NullPointerException e) {
				break;
			}
			;
			try {
				for (int i = 41; i <= 80; i++) {
					if (items[i].quantity >= 1) {
						System.out.println("장비번호:" + i + " 장비명 : " + items[i].name + items[i].upG + " 보유수량 : "
								+ items[i].quantity + "개");
					}
				}
			} // if end
			catch (NullPointerException e) {
				break;
			}

			try {
				for (int i = 81; i <= 99; i++) {
					if (items[i].quantity >= 1) {
						System.out.println("장비번호:" + i + " 장비명 : " + items[i].name + items[i].upG + " 보유수량 : "
								+ items[i].quantity + "개");
					} // if end
				}
			} // for end
			catch (NullPointerException e) {
				break;
			}
			System.out.println("포션 갯수 : " + member.portion);
			System.out.println("소지금 : " + member.money);
			System.out.println("=================================");
			System.out.println("1.장비 상세정보 확인\n2.장비 착용\n3.인벤토리 나가기");
			String select = sc.next();
			switch (select) {
			case "1":
				System.out.println("=================================");
				System.out.println("확인할 장비 번호를 입력해 주세요");
				int i = sc.nextInt();
				System.out.println("=================================");
				System.out.println("등급 : " + items[i].grade);
				System.out.println("이름 : " + items[i].name);
				System.out.println("설명 : " + items[i].intro);
				System.out.println("착용가능 레벨 : " + items[i].lv);
				System.out.println("공격력 증가 : " + items[i].att);
				System.out.println("방어력 증가 : " + items[i].shd);
				System.out.println("체력 증가 : " + items[i].maxHp);
				System.out.println("상점판매가 : " + items[i].money);
				System.out.println("=================================");
				break;
			case "2":
				System.out.println("착용할 장비 번호를 입력해 주세요");
				int j = sc.nextInt();
				if (j >= 0 & j <= 40) {
					item.equipmentSetAtt(j, items, member);
				}
				if (j >= 41 & j <= 80) {
					item.equipmentSetShd(j, items, member);
				}
				if (j >= 81 & j <= 90) {
					item.equipmentSetAcc(j, items, member);
				}

				break;
			case "3":
				run = false;
				break;
			default:
				System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");

			}// switch end

		} // while end
	}// 인벤토리 method end

	Member levelGrade(Member member) {
		if (member.exp >= maxExp) {
			member.exp -= maxExp; // (현재 - 최대)
			member.maxExp += 50 * member.lv; // 최대경험치 증가
			member.lv += 1; // 레벨 증가
			member.att += 1;
			member.maxHp += 10;
			System.out.println("레벨이 올랐습니다!");
			System.out.println("현재레벨 : " + member.lv);
			System.out.println("공격력이 1, 최대체력이 10 증가하였습니다.");

		} // if
		return member;

	}// 레벨표
}// class
