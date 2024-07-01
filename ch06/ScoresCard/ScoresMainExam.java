package ch06.ScoresCard;

import java.util.*;

public class ScoresMainExam {
	// 필드 : 맴버 변수로 main에서 사용할 배열이나 객체등을 생성한다.
	private static Scanner input = new Scanner(System.in); // class에 Scanner생성하면 class안에 있는 모든 method에서 사용가능하다
	// private: 해당class에서만 쓸 수 있음. static : 프로그램 실행시 메모리에 할당됨.
	private static Student[] st = new Student[5];// st라는 객체 생성. 객체배열
	// String[] str = new String[5];

	// 생성자 : 인스턴스일때 사용. main인 경우 new 사용 X (메인은 static이다.)

	// method

	public static void main(String[] args) {
		// 주실행 클래스로 메뉴와 클래스.메서드 호출용
		// 객체 : 학생, 성적, 통계 + a
		boolean run = true;
		while (run) {
			System.out.println("====================학생 관리 프로그램====================");
			System.out.println("1. 학생관리 | 2. 성적관리 | 3. 통계 | 4. 종료\n");
			System.out.println("====================================================");
			System.out.print(">>>");
			String select = input.next();
			switch (select) {

			case "1":
				System.out.println("학생관리 class로 진입합니다"); // method.보낼 변수명
				boolean runSt = true;
				while (runSt) {
					System.out.println("====================학생 관리 프로그램====================");
					System.out.println("1. 학생등록 | 2. 학생보기 | 3. 학생수정 | 4. 학생삭제 | 5. 뒤로가기");
					System.out.println("=====================================================");
					System.out.print(">>>");
					String userSt = input.next();
					switch (userSt) {
					case "1":
						System.out.println("학생등록 메뉴 입니다.");
						Student regStudent = new Student(); // 객체 생성 : Student클래스의 인스턴스 변수를 불러온다
						System.out.println("이름 : : ");
						regStudent.name = input.next(); // 이름 받아서 Student class에 저장
						System.out.println("성별 : : ");
						regStudent.sex = input.next();
						System.out.println("학년 : : ");
						regStudent.grade = input.nextByte();
						System.out.println("반 : : ");
						regStudent.classRoom = input.nextByte();
						System.out.println("학번 : : ");
						regStudent.num = input.nextByte();
						System.out.println("---------- 객체 생성 및 입력 완료 ---------------");
						// next step.배열 빈칸을 찾아서 저장시킨다. (y축을 받음)
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) {
								st[i] = regStudent;
								System.out.println("저장 되었습니다.");
								break;
							} // if문 end

						} // for문 end

						break;
					case "2":
						System.out.println("전체 학생 보기");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) {
								System.out.println("--------------------");
								System.out.println("| 이름 : " + st[i].name);
								System.out.println("| 성별 : " + st[i].sex);
								System.out.println("| 학년 : " + st[i].grade);
								System.out.println("| 반 : " + st[i].classRoom);
								System.out.println("| 학번 : " + st[i].num);

							} // if문 end

						} // for문 end
						break;
					case "3":
						System.out.print("수정할 학생명을 입력하세요 : ");
						String searchName = input.next();
						Student findStudent = find(searchName);
						if (findStudent == null) {
							System.out.println("찾은 학생이 없습니다.");
						} else {
							System.out.print("수정할 학생 번호를 입력하세요 : ");
							findStudent.num = input.nextByte();
						}

						break;
					case "4":
						System.out.print("삭제할 학생명을 입력하세요 : ");
						String searchDelName = input.next();
						Student delStudent = find(searchDelName);
						if (delStudent == null) {
							System.out.println("삭제할 학생이 없습니다.");
						} else {
							for (int i = 0; i < st.length; i++) {
								if (st[i].name.equals(delStudent.name)) {
									st[i] = null;
									break;
								}

							} // for end

							System.out.print("학생 데이터가 삭제 되었습니다.");

						}

						break;
					case "5":
						runSt = false;
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");

					}// switch(userSt) end

				} // while(runSt) end
				break;
			case "2":
				System.out.println("성적관리 class로 진입합니다");

				break;
			case "3":
				System.out.println("통계 class로 진입합니다");

				break;
			case "4":
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("다시 입력해 주세요");
				break;

			}// switch(user) end

		} // while(run) end

	}// main method end

	private static Student find(String name) {
		// String name으로 찾아서 Student 객체를 리턴한다.
		Student student = null;// 빈 객체 생성
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name; // 배열에 있는 이름을 가져온다.
				if (arrayName.equals(name)) {
					student = st[i]; // 찾은 객체를 빈 객체에 넣는다
					break;
				}

			} // if문 종료
		} // for end

		return student; // return에 빈 객체 입력

	}// find methood 종료

}// class end
