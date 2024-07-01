package ch06.Game;
import java.util.*;
public class Npc {
	Scanner sc = new Scanner(System.in);
	String name; // 사냥터 이름 , 마을이름 등
	int lv,money; //사냥터 레벨제한과 마을 이동시 필요한 돈 넣을 용도
	int floor;
	
	public void inventedNpc(Npc[] npcs) {//마을 사냥터 설정
		//사냥터
		Npc npc0 = new Npc();
		npc0.name="검은 탑 1층";
		npc0.lv=1;
		npc0.money=0;
		npcs[0]=npc0;
		
		Npc npc1 = new Npc();
		npc1.name="푸른 탑 1층";
		npc1.lv=11;
		npc1.money=0;
		npcs[1]=npc1;
		
		Npc npc2 = new Npc();
		npc2.name="푸른빛 섬";
		npc2.lv=11;
		npc2.money=500;
		npcs[2]=npc2;
		
		//마을
	}//마을 사냥터 설정 method end
	
	
	
	public void shop1(Member member,Item[] items) {//초보자마을 상점
		boolean run = true;
		Npc npc=new Npc();
		while(run) {
		System.out.println("=================================");
		System.out.println("초보자상점>/n무엇을 도와 드릴까요?/n1.아이템 구매/n2.아이템 판매\n3.아이템 강화\n4.나가기");
		System.out.println("=================================");
		String select = sc.next();
		switch(select) {
		case "1" : npc.shop1Buy(member, items);
			break;
		case "2" : System.out.println("Sorry\n미구현 상태입니다");break;
		case "3" : System.out.println("Sorry\n미구현 상태입니다");break;
			
		case "4" :run=false;
			break;
		default : System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");
		
		
		}//switch end
		}//while end
	}//초보자마을 상점 method end
	
	public void buy(Member member,Item[] items,int buyNum) {//아이템 구매
		if(member.money>=items[buyNum].money) {
			member.money-=items[buyNum].money;
			items[buyNum].quantity +=1;
			
			System.out.println("=================================");
			System.out.println(items[buyNum].name+" 구매에 성공 하셨습니다");
			System.out.println("=================================");
		}//if end
		else {System.out.println("=================================");
			System.out.println("돈이 부족합니다...");
			System.out.println("=================================");}
		
	}//아이템 구매 method end
	
	public void shop1Buy(Member member,Item[] items) {//초보자마을 아이템 목록
		Npc npc = new Npc();
		boolean run=true;
		while(run) {
		System.out.println("=================================");
		System.out.println("초보자상점> 아이템 구매>/n어떤 아이템을 드릴까요?");
		System.out.println("/n장비번호:"+1+" 장비 : "+items[1].grade+" "+items[1].name+" "+items[1].intro);
		System.out.println("착용가능 레벨 : "+items[1].lv+" 공격력 : "+items[1].att+" 가격 :"+items[1].money+"원");
		System.out.println("/n장비번호:"+42+" 장비 : "+items[42].grade+" "+items[42].name+" "+items[42].intro);
		System.out.println("착용가능 레벨 : "+items[42].lv+"방어력 : "+items[42].att+" 추가체력 : "+items[42].maxHp+" 가격 :"+items[42].money+"원");
		System.out.println("=================================");
		System.out.println("구매할 장비번호를 입력해주세요./n상점 나가기 :0");
		int buyNum=sc.nextInt();
		switch(buyNum) {
		case 0 : run=false; break;
		case 1 : npc.buy(member, items, buyNum);
			break;
		case 42 : npc.buy(member, items, buyNum);
			break;
		default : System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");
			
			
		
		}//switch end
		}//while end
	}//초보자마을 상점구매 method end
	
public void Sell(Member member,Item[] items) {//상점판매
		
	}//상점판매 method end
void map1(Member member,Item[] items,Npc[] npcs,Monster[] monsters) {//지역이동1
	boolean run = true;
	Npc npc = new Npc();
	Monster monster = new Monster();
	while(run) {
	System.out.println("=================================");
	System.out.println("이동할 지역을 선택해 주세요\n");
	System.out.println("0."+npcs[0].name+" 이동가능 레벨 : "+npcs[0].lv+" 소요경비 : "+npcs[0].money+"원" );
	System.out.println("1."+npcs[1].name+" 이동가능 레벨 : "+npcs[1].lv+" 소요경비 : "+npcs[1].money+"원"  );
	System.out.println("2."+npcs[2].name+" 이동가능 레벨 : "+npcs[2].lv+" 소요경비 : "+npcs[2].money+"원"  );
	System.out.println("3.초보자마을로 돌아가기");
	System.out.println("=================================");
	int moveNum=sc.nextInt();
	if(moveNum==3) {run=false;
	System.out.println("=================================");
	System.out.println("초보자마을로 돌아갑니다.");
	System.out.println("=================================");
			} else if(moveNum>=0&&moveNum<=2) {//1-3선택지 실행 메서드
				if(member.lv>=npcs[(moveNum)].lv)//가능 레벨 확인
				{if(member.money>=npcs[moveNum].money){
					member.money -=npcs[moveNum].money;
					System.out.println(npcs[moveNum].name+"(으)로 이동합니다.");
					switch(moveNum) {
					case 0:
						monster.tower1(member, items, npcs, monsters);
						run=false;break;
					case 1:run=false;break;
					case 2:run=false;
					System.out.println("Sorry\n미구현 상태입니다");break;
					}//switch end
					}else {System.out.println("경비가 부족합니다.");}
				}//if end
				
					
				else {System.out.println("입장가능한 레벨이 아닙니다.");}
			}
	
	}//while end
	
}	//지역이동1 method end


	void town(Member member,Item[] items,Npc[] npcs,Monster[] monsters) {//마을
		Item item = new Item();
		Npc npc = new Npc();
		boolean run=true;
		
		while(run) {
			System.out.println("=================================");
			System.out.println("초보자마을에 오신것을 환영합니다. 원하시는 동작을 선택해주세요\n\n");
			System.out.println("1.캐릭터 상태 확인\n2.인벤토리 확인\n3.장비창 확인\n4.상점으로 가기\n5.체력 회복\n6.마을 나가기");
			System.out.println("=================================");
			String select=sc.next();
			switch(select) {
			case "1" : member.state(member);
				break;
			case "2" : member.inventory(item,member,items);
				break;
			case "3" : item.equipment(member,items);
				break;
			case "4" :
			    npc.shop1(member, items);
				break;
			case "5" :
				System.out.println("=================================");
				System.out.println("힐러가 당신을 치료하였습니다");
				member.hp=member.maxHp;
				System.out.println("=================================");
				break;
			case "6" : System.out.println("초보자마을을 떠납니다...");
			npc.map1(member, items, npcs, monsters);
				break;
			default : System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");
			}
		}//while(run) end
		}//town method end

	
	

void upgrade(Member member,Item[] items) {//아이템 강화
boolean run = true;
while(run) {
	System.out.println("=================================");
	System.out.println("아이템 강화>");
	System.out.println("강화비용 : 50원");
	System.out.println("0-5강 성공확률 : 70%");
	System.out.println("6-10강 성공확률 : 40%");
	System.out.println("11-15강 성공확률 : 20%, 장비가 파괴될 수도 있습니다.");
	System.out.println("무기 1강 : 공격력 +3");
	System.out.println("방어구 1강 : 방어력 +1");
	System.out.println("악세사리 1강 : 공격력 +5");
	System.out.println("강화할 아이템의 번호를 입력해주세요");
	System.out.println("강화종료 = \"-1\"");
	System.out.println("=================================");
	System.out.println(name +" 용사의 인벤토리>\n");
	for(int i=0;i<=40;i++) {
		if(items[i].quantity>=1) {
			System.out.println("장비번호:"+i+" 장비명 : "+items[i].name+items[i].upG+" 보유수량 : "+items[i].quantity+"개" );
		break;}//if end
		
	}//for end
	for(int i=41;i<=80;i++) {
		if(items[i].quantity>=1) {
			System.out.println("장비번호:"+i+" 장비명 : "+items[i].name+items[i].upG+" 보유수량 : "+items[i].quantity+"개" );
		break;}//if end
		
	}//for end
	for(int i=81;i<=99;i++) {
		if(items[i].quantity>=1) {
			System.out.println("장비번호:"+i+" 장비명 : "+items[i].name+items[i].upG+" 보유수량 : "+items[i].quantity+"개" );
		break;}//if end
		System.out.println("=================================");}
	String select = sc.next();
	int i = Integer.parseInt(select);
	if(i>=0&&i<=99) {
		System.out.println("=================================");
	System.out.println(items[i].name+"(을)를 강화 하시겠습니까?");
	System.out.println("1. 네\n2. 아니오");
	String select2 = sc.next();
	switch(select2) {
	case "1" : 
		System.out.println("아이템 강화를 시작합니다");
		if(member.money>=50) {
		if(items[i].upG>=0&&items[i].upG<=5) {
			member.money -=50;
			int goodLuck = (int)(Math.random()*100+1);
			if(goodLuck<=70) {
				items[i].upG+=1;
				if(i>=0&&i<=40) {//무기
					items[i].att=+3;
					
				}//if end
				if(i>=41&&i<=80) {//무기
					items[i].shd=+1;
					
				}//if end
				if(i>=81&&i<=90) {//무기
					items[i].att=+5;
					
				}//if end
				System.out.println("축하합니다 강화에 성공하였습니다!");
			}
			else if(goodLuck>70) {
				System.out.println("강화실패!");
			}
			
		}//if end
		else if(items[i].upG>=6&&items[i].upG<=10);
		}//돈 50원 충분한지 묻는 if end
		else {System.out.println("소지금이 부족합니다...(50원 필요)");}
		break;
	case "2" : run=false;
		break;
	default : System.out.println("선택 가능한 범위가 아닙니다.\n다시 입력해 주세요.");
	
	}//switch end
	
	
	}//if end 
	else if(i==(-1)) {run=false;}
	else {System.out.println("잘못 입력하셨습니다");}
	}//while(run) end
}//강화 method end
}//clasee end


