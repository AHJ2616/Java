package ch06.Game;
import java.util.*;
public class Monster {
String name;
String intro; // 몬스터 정보 , 아이템 드랍등
int num,maxHp,hp,att,shd,exp,money;
Scanner sc = new Scanner(System.in);

public void invertedMonster(Monster[] monsters) {//몬스터 정보
	//1렙탑 몬스터 
	Monster monster0 = new Monster();
	monster0.name = "검은 슬라임";
	monster0.intro = "이세계에서 가장약한 슬라임, 드랍아이템 : [노말]롱소드";
	monster0.hp = 10;
	monster0.maxHp = 10;
	monster0.att = 4;
	monster0.shd = 1;
	monster0.exp = 8;
	monster0.money = 1;
	monster0.num =2;
	monsters[0]=monster0;
	
	Monster monster1 = new Monster();
	monster1.name = "검은뿔 슬라임";
	monster1.intro = "검은탑에 서식하는 뿔달린 슬라임, 드랍아이템 : [노말]검은탑 갑옷";
	monster1.hp = 15;
	monster1.maxHp = 15;
	monster1.att = 5;
	monster1.shd = 1;
	monster1.exp = 10;
	monster1.money = 2;
	monster1.num =41;
	monsters[1]=monster1;
	
	Monster monster2 = new Monster();
	monster2.name = "검은 해골";
	monster2.intro = "검은탑에 서식하는 해골, 드랍아이템 : [레어]롱소드";
	monster2.hp = 50;
	monster2.maxHp = 50;
	monster2.att = 12;
	monster2.shd = 3;
	monster2.exp = 15;
	monster2.money = 5;
	monster2.num =3;
	monsters[2]=monster2;
	
	Monster monster3 = new Monster();
	monster3.name = "[BOSS} 대왕 슬라임";
	monster3.intro = "검은탑에 Boss, 드랍아이템 : [레어]검은탑 갑옷 , [유니크] 검은 수정팬던트";
	monster3.hp = 300;
	monster3.maxHp = 300;
	monster3.att = 30;
	monster3.shd = 5;
	monster3.exp = 50;
	monster3.money = 50;
	monster3.num =82;
	monsters[3]=monster3;
	
	
	
	
	
	
}//몬스터 method end

void tower1(Member member,Item[] items,Npc[] npcs,Monster[] monsters) {//1렙탑
	Npc npc = new Npc();
	Monster monster = new Monster();
	npc.floor=1;
	boolean run = true;
	while(run) {
		if(npc.floor==11) {
			System.out.println("축하합니다!\n검은탑 보스를 무찔렀습니다.\n마을로 귀환합니다");
			member.bossKill+=1;//보스킬
			run=false;}else {
	System.out.println("=================================");
	System.out.println("검은 탑"+npc.floor+"층>");
	System.out.println("현재 나의 남은 체력 : "+member.hp);
	System.out.println("현재 포션 갯수 : "+member.portion);
	System.out.println("0.포션 회복하기\n1.탐색\n2.내 상태보기\n3.마을로 이동");
	System.out.println("=================================");
	String select = sc.next();
	switch(select) {
	case "0" : System.out.println("포션으로 체력을 회복합니다");
	member.portion-=1;
	member.hp=member.maxHp;
	break;
	case "1" :
		int monNum=monster.explore1(member,items,npcs,monsters,npc);
		monster.battle1(member, items, npcs, monsters, npc, monNum);
	
		break;
	case "2" : member.state(member);
		break;
	case "3" : run=false;
	System.out.println("초보자마을로 돌아갑니다");
	npc.town(member, items, npcs, monsters);
		break;
	
	
	}//switch end
			}//if end 10층 다깨면 복귀
	}//while end
}//1렙탑 method end

int explore1(Member member,Item[] items,Npc[] npcs,Monster[] monsters,Npc npc) {//검은탑 탐색
	
	System.out.println("=================================");
	System.out.println("         탐색을 시작합니다");
	System.out.println("=================================\n\n\n\n\n\n\n");
	int monNum =0;
	if(npc.floor<=5) {
	monNum = (int) (Math.random()*2);
	}//if end
	else if(npc.floor<=9) {
	monNum = (int) (Math.random()*3);
	
	}//if end
	else if(npc.floor==10) {
		monNum=3;
		
	}//if end
	return monNum;
}//검은탑 탐색 method end

void battle1(Member member,Item[] items,Npc[] npcs,Monster[] monsters,Npc npc,int monNum) {//검은탑 전투
	System.out.println("=================================");
	System.out.println(monsters[monNum].name+"(이)가 나타났습니다!");
	System.out.println("=================================");
	for(int i =1;i<50;i++) {//배틀 턴
		if(member.hp>0) {if(monsters[monNum].hp>0){//캐릭이 살아 있다면
			System.out.println("----------------------------");
			System.out.println("용사의 제 "+i+"턴 입니다.");
			System.out.println("용사가 공격을 하였습니다!");
			monsters[monNum].hp=(monsters[monNum].hp+monsters[monNum].shd-member.att);
			System.out.println("남은"+monsters[monNum].name+"의 체력 : "+monsters[monNum].hp);
			
			System.out.println(monsters[monNum].name+"(이)가 공격을 하였습니다!");
			member.hp = (member.hp+member.shd-monsters[monNum].att);
			System.out.println("남은 용사의 체력 :"+member.hp);
			System.out.println("----------------------------");
		}//if전투중 end
		
		else {System.out.println(monsters[monNum].name+"(을)를 물리쳤습니다!");
		npc.floor+=1;
		monsters[monNum].hp=monsters[monNum].maxHp; //몬스터 초기화
		System.out.println("획득 경험치 : "+monsters[monNum].exp);
		member.exp+=monsters[monNum].exp;//경험치 올려주기
		System.out.println("획득 보상 : "+(monsters[monNum].money+(int)(Math.random()*3) )+"원 ");
		int x=(int) (Math.random()*100+1);
		if(x>=91) {
		System.out.println(items[monNum].name);
		items[monNum].quantity+=1;}
		int y=(int) (Math.random()*100+1);
		if(y>=91) { System.out.println(" [포션]");
		member.portion +=1;
		}
		member=member.levelGrade(member);//레벨업 여부 확인하기
		member.kill+=1;
		
		
		
		
		break;
		}//사냥완료 end
		}//if end
		else if(member.hp<=0){
			System.out.println("=================================");
			System.out.println("당신은 사망했습니다...");
		System.out.println("마을로 돌아갑니다");
		member.hp=member.maxHp;
		System.out.println("=================================");
		npc.town(member, items, npcs, monsters);
			break;
			}
	}//for end
	
}//검은탑 전투 method end

void tower2(Member member,Item[] items,Monster[] monsters) {//11렙탑
	System.out.println("=================================");
	System.out.println("푸른 탑 1층>");
	
}//11렙탑 method end



}//class end

