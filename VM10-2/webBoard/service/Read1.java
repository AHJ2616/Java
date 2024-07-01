package webBoard.service;

import webBoard.DTO.Board2;
import webBoard.DTO.Board3;
import webBoard.DTO.Board4;
import webBoard.DTO.Member;
import java.util.*;

public class Read1 {// 베스트 게시판 서비스
	Scanner sc = new Scanner(System.in);

	public void menu(Member user, Board2[] boards2, Board3[] boards3, Board4[] boards4) {// 메뉴
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("http://버블.com/베스트 게시판\n");
			System.out.println("0. 뒤로가기");
			try {
				for (int i = 0; i < 100; i++) {
					if (boards2[i].getTitle() != null) {
						if (boards2[i].getViews() >= 10) {
							System.out.println("글번호 : " + (boards2[i].getNum()) + "    글제목 : " + boards2[i].getTitle()
									+ "    조회수 : " + boards2[i].getViews());
						}
					}
				}
			} catch (NullPointerException e) {
			}

			try {
				for (int i = 0; i < 100; i++) {
					if (boards3[i].getTitle() != null) {
						if (boards3[i].getViews() >= 10) {
							System.out.println("글번호 : " + (boards3[i].getNum()) + "    글제목 : " + boards3[i].getTitle()
									+ "    조회수 : " + boards3[i].getViews());
						}
					}
				}
			} catch (NullPointerException e) {
			}

			try {
				for (int i = 0; i < 100; i++) {
					if (boards4[i].getTitle() != null) {
						if (boards4[i].getViews() >= 10) {
							System.out.println("글번호 : " + (boards4[i].getNum()) + "    글제목 : " + boards4[i].getTitle()
									+ "    조회수 : " + boards4[i].getViews());
						}
					}
				}
			} catch (NullPointerException e) {
			}

			System.out.println("=======================================");
			System.out.print("글 선택 : ");
			int x = sc.nextInt();
			if(x==0) {run=false;}
			try {
				for (int i = 0; i < 100; i++) {
					if (boards2[i].getNum() == x) {
						boards2[i].setViews(boards2[i].getViews() + 1);// 조회수 올리기
						System.out.println("작성자 : " + boards2[i].getWriter() + "    글제목 : " + boards2[i].getTitle()
								+ "    조회수 : " + boards2[i].getViews());
						System.out.println("---------------------------------------------------------");
						System.out.println(boards2[i].getContents());
						System.out.println("---------------------------------------------------------");
						break;
					} // for end

					if (boards3[i].getNum() == x) {
						boards3[i].setViews(boards3[i].getViews() + 1);// 조회수 올리기
						System.out.println("작성자 : " + boards3[i].getWriter() + "    글제목 : " + boards3[i].getTitle()
								+ "    조회수 : " + boards3[i].getViews());
						System.out.println("---------------------------------------------------------");
						System.out.println(boards3[i].getContents());
						System.out.println("---------------------------------------------------------");
					}

					if (boards4[i].getNum() == x) {
						boards4[i].setViews(boards4[i].getViews() + 1);// 조회수 올리기
						System.out.println("글번호 : " + (boards4[i].getNum()) + "    글제목 : " + boards4[i].getTitle()
								+ "    조회수 : " + boards4[i].getViews());
						break;
					} // if end
				} // for end
			} // try end
			catch (NullPointerException e) {
			}
		} // while(run)

	}// 메뉴 method end

	public void search(Member user, Board2[] boards2, Board3[] boards3, Board4[] boards4) {// 검색
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("http://버블.com/검색\n");
			System.out.print("검색을 위해 작성자 이름을 입력해주세요 : ");
			System.out.println("0. 뒤로가기");
			String x = sc.next();
			try {if(x.equals("0")) {run=false;break;}
				for (int i = 0; i < 100; i++) {
					if (boards2[i].getWriter().equals(x)) {
						System.out.println("글번호 : " + (boards2[i].getNum()) + "    글제목 : " + boards2[i].getTitle()
								+ "    조회수 : " + boards2[i].getViews());}}

				for (int i = 0; i < 100; i++) {
					if (boards2[i].getWriter().equals(x)) {
						System.out.println("글번호 : " + (boards3[i].getNum()) + "    글제목 : " + boards3[i].getTitle()
								+ "    조회수 : " + boards3[i].getViews());}}
				for (int i = 0; i < 100; i++) {
					System.out.println("글번호 : " + (boards4[i].getNum()) + "    글제목 : " + boards4[i].getTitle()
							+ "    조회수 : " + boards4[i].getViews());}} 
			catch (NullPointerException e) {
			}

			System.out.println("=======================================");
			System.out.print("글 선택 : ");
			int y = sc.nextInt();
			try {
				for (int i = 0; i < 100; i++) {
					if (boards2[i].getNum() == y) {
						boards2[i].setViews(boards2[i].getViews() + 1);// 조회수 올리기
						System.out.println("작성자 : " + boards2[i].getWriter() + "    글제목 : " + boards2[i].getTitle()
								+ "    조회수 : " + boards2[i].getViews());
						System.out.println("---------------------------------------------------------");
						System.out.println(boards2[i].getContents());
						System.out.println("---------------------------------------------------------");
						break;
					} // for end

					if (boards3[i].getNum() == y) {
						boards3[i].setViews(boards3[i].getViews() + 1);// 조회수 올리기
						System.out.println("작성자 : " + boards3[i].getWriter() + "    글제목 : " + boards3[i].getTitle()
								+ "    조회수 : " + boards3[i].getViews());
						System.out.println("---------------------------------------------------------");
						System.out.println(boards3[i].getContents());
						System.out.println("---------------------------------------------------------");
					}

					if (boards4[i].getNum() == y) {
						boards4[i].setViews(boards4[i].getViews() + 1);// 조회수 올리기
						System.out.println("글번호 : " + (boards4[i].getNum()) + "    글제목 : " + boards4[i].getTitle()
								+ "    조회수 : " + boards4[i].getViews());
						break;
					} // if end
				} // for end
			} // try end
			catch (NullPointerException e) {
			}
			System.out.print("메뉴로 가시려면 아무버튼이나 입력해 주세요 : ");
			String skip = sc.next();
		} // while(run)

	}// 검색 method end
}// class end
