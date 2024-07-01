package ch05;

import java.util.*;

public class GradeCardExam {
//학생이름 테이블 String[]
	// 과목 표시( 0-언어 1-수학 2-영어 ...) 2차배열 가보자구!
	// 점수 테이블 byte[]
	// 총점 테이블 int[]
	// 평균 테이블 double[]

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		boolean run1 = true;

		System.out.println("초기작업 : 학생수를 입력하세요");
		int count = scInt.nextInt();// count = 학생수
		String[] name = new String[count];
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] ave = new double[count];
		String student = null;

		while (run1) {
			boolean run = true;
			System.out.println("============ M B C 성적 관리 프로그램 =============");
			System.out.println("\n1. 학생관리 | 2.성적관리 | 3. 통계 |4. 출력 |5.종료\n");
			System.out.println("=============================================");
			System.out.print(">>>");
			int select = scInt.nextInt();
			switch (select) {
			default:
				System.out.println("다시 입력해주세요.");
				break;
			case 1:
				System.out.println("학생관리 메서드로 진입합니다.");
				student(name);
				break;
			case 2:
				System.out.println("성적관리 메서드로 진입합니다.");
				score(engScores, korScores);
				for (int i = 0; i < count; i++) {
					totalScores[i] = (engScores[i] + korScores[i]);
					ave[i] = totalScores[i] / 2;
				}
				break;
			case 3:
				if (name[0] != null & korScores[0] != 0) {
					System.out.println("통계 메서드로 진입합니다.");
					average(engScores, korScores, totalScores, ave);
				} else {
					System.out.println("학생등록과 성적등록을 먼저 해주세요");
				}
				break;
			case 5:
				System.out.println("시스템을 종료합니다");
				run1 = false;
				break;

			case 4:
				while (run) {
					System.out.println("================= 출력 메뉴 ==================");
					System.out.println("조회하실 학생의 이름을 입력하세요.\n뒤로가기 : \"탈출\"입력");
					System.out.println("=============================================");
					System.out.print("학생이름 >>>");
					student = scInt.next();
					for (int i = 0; i < count; i++) {
						int q = 0, x = 1;
						if (name[i].equals(student)) {
							q = i;
							System.out.println("학생명 : " + student);
							System.out.println("한국어점수 : " + korScores[q]);
							System.out.println("영어점수 : " + engScores[q]);
							System.out.println("과목총점 : " + totalScores[q]);
							System.out.println("평균점수 : " + ave[q]);

							for (int j = 0; j < count; j++) {
								if (ave[q] < ave[j]) {
									x++;
								}

							}

							System.out.println("등수 : " + count + "명 중, " + x + "등 입니다.");
							break;

						}
					}

					if (student.equals("탈출")) {
						run = false;
					}

				}
				break;

			}// switch(select) end

		} // while(run1) end

	}// main method end

	private static void average(byte[] engScores, byte[] korScores, int[] totalScores, double[] ave) {
		int kk = 0;
		int ee = 0;

		for (int i = 0; i < ave.length; i++) {
			kk += korScores[i];
		}
		for (int i = 0; i < ave.length; i++) {
			ee += engScores[i];
		}
		double aveK = kk / ave.length;
		double aveE = ee / ave.length;

		boolean run1 = true;
		Scanner sc = new Scanner(System.in);
		while (run1) {
			System.out.println("================= 성적 통계 메뉴 ==================");
			System.out.println("\n|1. 한국어 총점 보기 | 2. 영어 총점 보기 | 3. 전과목 총점 보기\n"
					+ "| 4. 한국어 평균 보기 | 5. 영어 평균 보기 | 6. 전과목 평균 보기\n7. 뒤로가기");
			System.out.println("==============================================");
			int select = sc.nextInt();
			switch (select) {
			default:
				System.out.println("다시 입력해주세요.");
				break;
			case 1:
				System.out.println("학생들의 한국어 총점은" + kk + "점 입니다");
				break;
			case 2:
				System.out.println("학생들의 영어 총점은" + ee + "점 입니다");
				break;
			case 3:
				System.out.println("학생들의 전과목 총점은" + (kk + ee) + "점 입니다");
				break;
			case 4:
				System.out.println("학생들의 한국어 평균은" + aveK + "점 입니다");
				break;
			case 5:
				System.out.println("학생들의 영어 평균은" + aveE + "점 입니다");
				break;
			case 6:
				System.out.println("학생들의 전과목 평균은" + (aveK + aveE) + "점 입니다");
				break;
			case 7:
				run1 = false;
				break;

			}

		} // while end

	}// average method end

	public static void score(byte[] engScores, byte[] korScores) {
		boolean run = true;
		boolean run2 = false;
		if (korScores[0] != 0) {
			run2 = true;
		}
		boolean run3 = true;
		if (korScores[0] != 0) {
			run3 = false;
		}
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		while (run) {

			System.out.println("================= 성적관리 메뉴 ==================");
			System.out.println("\n1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 이전메뉴로");
			System.out.println("==============================================");
			System.out.print(">>>");
			int select = scInt.nextInt();
			switch (select) {
			default:
				System.out.println("다시 입력해주세요.");
				break;
			case 1:
				if (run3 == true) {
					System.out.println("성적 등록을 시작합니다.");
					System.out.println("총 학생수는 : " + engScores.length + "명 입니다.");
					for (int i = 0; i < engScores.length; i++) {
						System.out.print((i + 1) + "번 학생의 한국어성적 입력해주세요 : ");
						korScores[i] = scInt.nextByte(); // 학생이름 입력받기
						System.out.print((i + 1) + "번 학생의 영어성적 입력해주세요 : ");
						engScores[i] = scInt.nextByte(); // 학생이름 입력받기
					} // for end
					System.out.println("등록이 정상적으로 처리되었습니다");
					run2 = true;
					run3 = false;
				} else {
					System.out.println("이미 등록이 완료되었습니다.");
					System.out.print("전체 수정을 하시겠습니까?\n1. 수정하기 2. 취소\n\n>>>");
					int select2 = scInt.nextInt();
					switch (select2) {
					default:
						System.out.println("다시 입력해주세요.");
						break;
					case 1:
						run3 = true;
						run2 = false;
						break;
					case 2:
						break;

					}
				}
				break;
			case 2:
				if (run2 == true) {
					System.out.println("등록된 성적은 다음과 같습니다");
					for (int i = 0; i < engScores.length; i++) {
						System.out.println((i + 1) + "번 학생의 한국어 점수: " + korScores[i] + "   " + (i + 1) + "번 학생의 영어 점수"
								+ engScores[i]);
					}
				} else {
					System.out.println("성적 등록을 먼저 해주세요");
				}
				break;
			case 3:
				if (run2 == true) {
					System.out.println("수정할 학생의 번호를 입력해주세요");
					System.out.print(">>>");
					int select2 = scInt.nextInt();
					if (select2 <= engScores.length) {
						System.out.println("현재 등록된" + select2 + "번 학생의 한국어 점수 : " + korScores[select2 - 1]
								+ "\n수정할 학생의 한국어점수를 입력해주세요\n>>>");
						byte korScoresMOD = scString.nextByte();
						korScores[select2 - 1] = korScoresMOD;
						System.out.println("현재 등록된" + select2 + "번 학생의 한국어 점수 : " + engScores[select2 - 1]
								+ "\n수정할 학생의 한국어점수를 입력해주세요\n>>>");
						byte engScoresMOD = scString.nextByte();
						engScores[select2 - 1] = engScoresMOD;

						System.out.println("수정완료 되었습니다");

					} else {
						System.out.println("학생수를 초과한 번호입니다.\n다시 입력해주세요");
					}
				} else {
					System.out.println("성적 등록을 먼저 해주세요");
				}
				break;
			case 4:
				if (run2 == true) {
					System.out.println("삭제할 학생 번호를 입력하세요");
					System.out.print(">>>");
					int select2 = scInt.nextInt();
					if (select2 <= engScores.length) {
						System.out.println(select2 - 1 + "번학생 한국어,영어 점수가 정상적으로 삭제되었습니다");
						engScores[select2 - 1] = 0;
						korScores[select2 - 1] = 0;

					} else {
						System.out.println("학생수를 초과한 번호입니다.\n다시 입력해주세요");
					}
				} else {
					System.out.println("성적 등록을 먼저 해주세요");
				}
				break;
			case 5:
				run = false;

			}// switch(select) end

		} // while(run) end

	}// score method end

	public static String[] student(String[] name) {// 학생이름 관리용 메서드
		boolean run = true;
		boolean run2 = false;
		if (name[0] != null) {
			run2 = true;
		}
		boolean run3 = true;
		if (name[0] != null) {
			run3 = false;
		}
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		while (run) {

			System.out.println("================= 학생관리 메뉴 ==================");
			System.out.println("\n1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 이전메뉴로");
			System.out.println("==============================================");
			System.out.print(">>>");
			int select = scInt.nextInt();
			switch (select) {
			default:
				System.out.println("다시 입력해주세요.");
				break;
			case 1:
				if (run3 == true) {
					System.out.println("학생 등록을 시작합니다.");
					System.out.println("총 학생수는 : " + name.length + "명 입니다.");
					for (int i = 0; i < name.length; i++) {
						System.out.print((i + 1) + "번 학생명을 입력해주세요 : ");
						name[i] = scString.next(); // 학생이름 입력받기
					} // for end
					System.out.println("등록이 정상적으로 처리되었습니다");
					run2 = true;
					run3 = false;
				} else {
					System.out.println("이미 등록이 완료되었습니다.");
				}
				break;
			case 2:
				if (run2 == true) {
					System.out.println("등록된 학생은 다음과 같습니다");
					for (int i = 0; i < name.length; i++) {
						System.out.println((i + 1) + "번 : " + name[i] + " ");
					}
				} else {
					System.out.println("학생 등록을 먼저 해주세요");
				}
				break;
			case 3:
				if (run2 == true) {
					System.out.println("수정할 학생의 번호를 입력해주세요");
					System.out.print(">>>");
					int select2 = scInt.nextInt();
					if (select2 <= name.length) {
						System.out.println("수정할 학생의 이름을 입력하세요");
						System.out.println("현재 등록된 이름 : " + name[select2 - 1] + "\n>>>");
						String nameMOD = scString.next();
						name[select2 - 1] = nameMOD;
						System.out.println("수정완료 되었습니다");

					} else {
						System.out.println("학생수를 초과한 번호입니다.\n다시 입력해주세요");
					}
				} else {
					System.out.println("학생 등록을 먼저 해주세요");
				}
				break;
			case 4:
				if (run2 == true) {
					System.out.println("삭제할 학생 번호를 입력하세요");
					System.out.print(">>>");
					int select2 = scInt.nextInt();
					if (select2 <= name.length) {
						System.out.println(select2 - 1 + "번학생 " + name[select2 - 1] + "의 이름이 정상적으로 삭제되었습니다");
						name[select2 - 1] = null;

					} else {
						System.out.println("학생수를 초과한 번호입니다.\n다시 입력해주세요");
					}
				} else {
					System.out.println("학생 등록을 먼저 해주세요");
				}
				break;
			case 5:
				run = false;

			}// switch end
		} // while end
		return name;
	}// 학생관리 method end

}// class end
