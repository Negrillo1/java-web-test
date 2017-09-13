package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Student;
import service.StudentDAO;

//学生实现类
public class StudentDAOImpl implements StudentDAO{

	@Override
	public List<Student> queryAllStudent() {
		// TODO 自动生成的方法存根
		Transaction tx=null;
		List<Student> list=null;
		String hql="";
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Student";
			Query query=session.createQuery(hql);
			list=query.list();
			tx.commit();
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.commit();
			return list;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public Student queryStudentByidI(String Sno) {
		// TODO 自动生成的方法存根
		Transaction tx=null;
		Student s=null;
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			s=(Student)session.get(Student.class,Sno);
			tx.commit();
			return s;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.commit();
			return s;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
		
	}

	@Override
	public boolean addStudent(Student s) {
		// TODO 自动生成的方法存根
		s.setSname(getNewSno());
		Transaction tx=null;
		
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			session.save(s);
			tx.commit();
			return true;
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO 自动生成的方法存根
		Transaction tx=null;
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			session.update(s);
			tx.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}

	@Override
	public boolean queryStudentByid(Student u)
	{
		Transaction tx=null;
		String hql="";
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Student where Sno=?";
			Query query=session.createQuery(hql);
			query.setParameter(0, u.getSno());
			List list=query.list();
			tx.commit();
			if(list.size()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
		
	}
	@Override
	public boolean deleteStudent(String Sno) {
		// TODO 自动生成的方法存根
		Transaction tx=null;
		Student s=null;
		
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			s=(Student)session.get(Student.class,Sno);
			if(s!=null)
			{
				session.delete(s);
			}
			tx.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}
	private String getNewSno()
	{
		Transaction tx=null;
		String hql="";
		String sno=null;
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			
			hql="select max(Sname) from Student";
			Query query=session.createQuery(hql);
			sno=(String)query.uniqueResult();
			if(sno==null||"".equals(sno))
			{
				sno="S0000001";
			}
			else
			{
				String temp=sno.substring(1);
				int i=Integer.parseInt(temp);
				i++;
				temp=String.valueOf(i);
				int len=temp.length();
				for(int j=0;j<7-len;j++)
				{
					temp="0"+temp;
				}
				sno="S"+temp;
			}
			tx.commit();
			return sno;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.commit();
			return null;
		}
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
	}
	
}
