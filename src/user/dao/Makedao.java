package user.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import user.bean.Dto;

public class Makedao {
	
	public Makedao() {
		
		try {
			Reader reader = Resources.getResourceAsReader("set.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Makedao mini; //싱글톤 객체 :공간을 하나만써서 돌려쓰는의미
	private SqlSessionFactory factory;
	
	public static Makedao getInstance() {
		if (mini == null) {
			synchronized (Makedao.class) {
				mini = new Makedao();
			}
		}
		return mini;
	}
	
	public void In(Dto d) {
		SqlSession sqlsession =factory.openSession();
		sqlsession.insert("getid",d);
		sqlsession.commit();
		sqlsession.close();
		
	}
	public void De() {
		
	}
	public void UP() {
		
	}
	public void Se() {
		
	}
}
