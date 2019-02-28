package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {

	public static void main(String[] main) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.println("=========================================================");
			System.out.println(" 환영합니다.");
			System.out.println(" 아래에서 아이디를 입력해보아요.");
			System.out.println("=========================================================");
			System.out.print("아이디 : ");
			String id = scan.nextLine();

			if ("osfu".equals(id)) { // (id.equls("osfu")
				System.out.println("비밀번호 : ");
				String pwd = scan.nextLine();
				if ("12345678".equals(pwd)) {
					BoardService bs = new BoardService();
					System.out.println("환영합니다. osfu님!! 서비스를 맘껏 이용해주세요!");
					while (!"q".equals(cmd)) {
						System.out.println("1. 게시물 등록");
						System.out.println("2. 게시물 삭제");
						System.out.println("3. 게시물 조회");
						System.out.println("4. 게시물 수정");
						System.out.println("q. 종료");
						System.out.println("원하시는 번호를 눌러주세요.");
						System.out.println("번호 : ");
						cmd = scan.nextLine();
						if ("3".equals(cmd)) {
							bs.selectBoard();
						} else if ("1".equals(cmd)) {
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내용 : ");
							String content = scan.nextLine();
							bs.insertBoard(title, content);
						} else if ("2".equals(cmd)) {
							System.out.print("삭제할 번호를 입력해주세요 : ");
							String bi_num = scan.nextLine();
							bs.deleteBoard(bi_num);

						} else if ("4".equals(cmd)) {
							System.out.print("bi_num : ");
							String bi_num = scan.nextLine();
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내용 : ");
							String content = scan.nextLine();
							bs.updateBoard(bi_num, title, content);
						}
					}
				} else
					System.out.println("비밀번호가 틀렸습니다");
			} else {
				System.out.println("없는 아이디 입니다!!");
			}
		} while (!"q".equals(cmd));
		System.out.println("바이, 즐거웠다.");

	}
}