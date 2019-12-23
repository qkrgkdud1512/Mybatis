package user.main;

import java.util.Scanner;

import user.action.Delete;
import user.action.Insert;
import user.action.Interface;
import user.action.Select;
import user.action.Update;

public class Main {

	Interface in;

	public void call() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("숫자 입력 : ");
			System.out.print("번호를 선택해주세요 : ");
			System.out.print("1.입력");
			System.out.print("2.삭제");
			System.out.print("3.수정");
			System.out.print("4.검색");
			System.out.print("5.종료");
			int select = sc.nextInt();

			if (select == 1) {
				
				System.out.println("==========입력을 시작합니다.==========");
				in = new Insert();
				in.excute();
			} else if (select == 2) {
				System.out.println("==========삭제를 시작합니다.==========");
				in = new Delete();
				in.excute();
			} else if (select == 3) {
				System.out.println("==========수정을 시작합니다.==========");
				in = new Update();
				in.excute();
			} else if (select == 4) {
				System.out.println("==========검색을 시작합니다.==========");
				in = new Select();
				in.excute();
			} else if (select == 5) {
				System.out.println("========종료되었습니다========");
				break;
			} else {

			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.call();
	}

}
