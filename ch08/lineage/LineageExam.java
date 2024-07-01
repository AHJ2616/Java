package ch08.lineage;
import java.util.*;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.Elf;
import ch08.lineage.DTO.Human;
import ch08.lineage.DTO.Knight;
import ch08.lineage.service.CharacterService;
import ch08.lineage.service.LoginService;

//객체간의 상속을 알아본다.
//부모 객체는 자식객체에게 모든정보를 상속시켜준다
//자식은 부모객체의 정보를 받아 사용하고 추가적으로 정보를 생셩할 수 있다.

public class LineageExam {
	private static Scanner sc = new Scanner(System.in);
	public static Account loginAccount;
	public static Knight knight;
	public static Elf elf;
	public static Human human= null;
	
	
	static {//스태틱 블럭 (초기값 생성)
		
		knight.setSword("양손검");
		knight.setShield("갑옷");
		knight.setArmor("갑옷");
		knight.setName("기기사");
		knight.setSex("남자");
		knight.setHp(100);
		knight.setMp(50);
		knight.setMoney(10_000);
		knight.setLevel(1);
		knight.setKnights(knight);
		
		Elf elf = new Elf();
		elf.setArrow("화살");
		elf.setBow("양손활");
		elf.setDress("옷옷");
		elf.setName("요오정");
		elf.setSex("여자");
		elf.setHp(200);
		elf.setMp(1_000);
		elf.setMoney(30_000);
		elf.setLevel(1);
		Account account = new Account();
		account.setId("q");
		account.setPw("q");
		account.setNick("하이");
		account.setAccounts(account);//배열에 저장시킴	
		
		
		
	}//스태틱 블럭 end
	

	public static void main(String[] args) {
		System.out.println("리니지 시작합니다");
		boolean run=true;
		while(run) {
			System.out.println("1.로그인\n2.캐릭터 선택\n3.게임 실행\n4.게임 종료");
			String select=sc.next();
			switch(select) {
			case "1" : System.out.println("로그인");
			
			LoginService.menu(loginAccount);
				break;
			case "2" : System.out.println("캐릭터 선택");
			loginAccount=CharacterService.menu(loginAccount,human,knight,elf);
				break;
			case "3" : System.out.println("게임 실행");
				break;
			case "4" : run=false;
				break;
			default : System.out.println("다시 입력해 주세요");
			}//switch end
			
		}//while end
		

	}// main method end

}// class end
