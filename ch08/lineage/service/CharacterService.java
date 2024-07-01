package ch08.lineage.service;

import java.util.*;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.Elf;
import ch08.lineage.DTO.Human;
import ch08.lineage.DTO.Knight;

public class CharacterService {
	private static Scanner sc = new Scanner(System.in);

	public static Account menu(Account loginAccount,Human human,Knight knight,Elf elf) {
		System.out.println("1.기사\n2.요정");
		String select = sc.next();
		switch (select) {
		case "1" : System.out.println("기사");
		loginAccount.setHuman(knight);
		System.out.println(loginAccount.getNick()+"님"+loginAccount.getHuman().getName()+"을 선택하였습니다.");
			break;
		case "2" : System.out.println("요정");
			break;
			default : System.out.println("다시 선택해주세요");

		
		}// switch end

		return loginAccount;
	}//메뉴 method end

}// class end
