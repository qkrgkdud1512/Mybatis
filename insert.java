package user.action;

import java.util.Scanner;

import user.bean.Dto;
import user.dao.Makedao;

public class Insert implements Interface {


	@Override
	public void excute() {
		Dto d = new Dto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		String username=sc.next();
		System.out.println("이름을 입력하세요 : ");
		String username1=sc.next();
		System.out.println("패스워드를 입력하세요 : ");
		String userpassword=sc.next();
		
		d.setId(username);
		d.setName(username1);
		d.setPw(userpassword);
		
		Makedao.getInstance().In(d); // makedao에서 만들어준 메소드명 In
		
	}
}
