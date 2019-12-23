package user.action;

import java.util.Scanner;

import user.bean.Dto;
import user.dao.Makedao;

public class Delete implements Interface  {

	@Override
	public void excute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 필드의 id를 입력해주세요 : ");
		String s = sc.next(); // 입력받을 string s지정
		
		Dto d = new Dto();
		d.setId(s); // setid에 입력받은 string넣어줌
		
		Makedao.getInstance().De(d);// Makedao에서 getInstance메소드 .기능 메소드 명
		
	}
	
	
	
}
