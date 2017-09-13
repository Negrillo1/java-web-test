package service.impl;

import java.util.List;

import org.junit.Test;

import entity.Student;
import junit.framework.Assert;
import service.StudentDAO;

public class TestStudentDAOimpl {
	@Test
	public void testQueryAllStudent()
	{
		StudentDAO sdao=new StudentDAOImpl();
		List<Student> list=sdao.queryAllStudent();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	/*@Test
	public void testGetNewSno()
	{
		StudentDAOImpl sdao=new StudentDAOImpl();
		System.out.println(sdao.getNewSno());
	}*/
	@Test
	public void testAddStudent()
	{
		Student s =new Student();
		s.setSno("asd");
		s.setSdep("计算机");
		s.setSnav("上海");
		s.setSphone("122222222");
		s.setSemail("123@qq.com");
		s.setSsex("男");
		StudentDAO sdao=new StudentDAOImpl();
		Assert.assertEquals(true, sdao.addStudent(s));
	}
}
