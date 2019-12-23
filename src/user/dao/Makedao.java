package user.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

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
		sqlsession.insert("getid",d); // file에서 지정한 id입력
		sqlsession.commit();
		sqlsession.close();
		
	}
	public void De(Dto d) {
		SqlSession sqlsession = factory.openSession();
		sqlsession.delete("del",d);// file에서 지정한 id입력
		sqlsession.commit();
		sqlsession.close();

	}
	public void UP(Dto d) {
		SqlSession sqlsession = factory.openSession();
		sqlsession.update("upd",d);// file에서 지정한 id입력
		sqlsession.commit();
		sqlsession.close();
		
	}
	public Dto Se(Dto d) {
		SqlSession sqlsession = factory.openSession();
		Dto aa=sqlsession.selectOne("sel",d);// file에서 지정한 id입력
		sqlsession.commit();
		sqlsession.close();
		return aa;
		
	}
	public int jungbok(Dto d) {
		int i=0;
		SqlSession sqlsession = factory.openSession();

		if(sqlsession.selectOne("jungbok",d)==null) {
			i=1;
		}
		
		sqlsession.commit();
		sqlsession.close();
		return i;
		
	}
}
