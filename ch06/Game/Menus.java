package ch06.Game;
import java.util.*;

public class Menus {
	public static Member member = new Member();
	
	public static Item[] items = new Item[101];
	public static Npc[] npcs = new Npc[10];
	public static Monster[] monsters = new Monster[30];
	
	public static void main(String[] args) {
		// 저장은 불가능한 게임 만들어보기(데이터 적용시키기)
		// 유저가 1명이니까 static으로 데이터 만들어도 상관 x
		Scanner sc = new Scanner(System.in);
		Item item = new Item();
				Npc npc = new Npc();
				Monster monster = new Monster();
		boolean run = true;
		while(run) {
		System.out.println("환영합니다\n\n<1.새로하기>\n<2.이어하기>\n<3.제작자 정보>");
		String select = sc.next();
		switch(select) {
		case "1" : System.out.println("캐릭터 생성으로 넘어갑니다.");
		member.creatCha(member);
		run=false; break;
		case "2" : System.out.println("Sorry\n미구현 상태입니다.");
		break;
		case "3" : System.out.println("=================================");
			System.out.println("제작자 : 안희준\n소속 : MBC아카데미\n문의사항 : 카톡...");
			System.out.println("=================================");
		break;
	default : System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");
		
		
		}//switch end
		}//while end
		//게임정보 load 시키기 (npc, 아이템, 몬스터 배열) 
		npc.inventedNpc(npcs);
		item.inventedItem(items);
		monster.invertedMonster(monsters);
		
		System.out.println("스토리는 생각할 겨를이 없습니다. 아이템이 캐릭터에 잘 적용되는지 알고 싶으니까");
		System.out.println("얼른 몬스터를 잡고 돈을 모아서 상점에서 아이템을 구매하여 장착해주세요");
		System.out.println("\n\n************************************************\n"
				+ "*신규 용사 이벤트로 초보자팩을 받았습니다. 인벤토리를 확인해주세요*");
		System.out.println("************************************************\n\n");
		
		npc.town(member,items,npcs,monsters);

		
	}//main method end

}//class end
