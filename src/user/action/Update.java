package user.action;

import java.util.Scanner;

import user.bean.Dto;
import user.dao.Makedao;

public class Update implements Interface  {

	@Override
	public void excute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 필드의 ID를 입력해주세요 : ");
		String s = sc.next();
		
		System.out.println("변경할 pw를 입력해주세요 : ");
		String a = sc.next();
		
		Dto d = new Dto();
		d.setId(s);
		d.setPw(a);
		
		Makedao.getInstance().UP(d);// Makedao에서 getInstance메소드.기능 메소드 명
		
		
	}

}
