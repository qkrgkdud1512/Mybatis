package user.action;

import java.util.Scanner;

import user.bean.Dto;
import user.dao.Makedao;

public class Select implements Interface {

	@Override
	public void excute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력해주세요 : ");
		String id = sc.next();
		System.out.println("PW를 입력해주세요 : ");
		String pw = sc.next();
		
		Dto d = new Dto();
		d.setId(id);
		d.setPw(pw);
		
		Dto bb = Makedao.getInstance().Se(d);//싱글톤 객체
		System.out.print("Id :");
		System.out.println(bb.getId());
		System.out.print("Name :");
		System.out.println(bb.getName());
		System.out.print("PW :");
		System.out.println(bb.getPw());
		System.out.print("=========================================");
		
	}
}
