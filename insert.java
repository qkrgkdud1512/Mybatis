package user.action;

import java.util.Scanner;

import user.bean.Dto;
import user.dao.Makedao;

public class Insert implements Interface { // Interface클래스의 excute를 상속받기위해 implements함


	@Override
	public void excute() {
		Dto d = new Dto(); //setid,setname,setpw메소드를 사용하기위해 d로 객체화해줌
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		String username=sc.next();
		System.out.println("이름을 입력하세요 : 123123");
		String username1=sc.next();
		System.out.println("패스워드를 입력하세요 : 123");
		String userpassword=sc.next();
		
		d.setId(username);
		d.setName(username1);
		d.setPw(userpassword);
		int  i= Makedao.getInstance().jungbok(d);
		System.out.println(i);
		if(i==1) {
			Makedao.getInstance().In(d); 	// makedao에서 만들어준 메소드명 In
		}else  if (i!=1){
			System.out.println("중복된 ID입니다.");
		}
	
		
	}
	
	
}
