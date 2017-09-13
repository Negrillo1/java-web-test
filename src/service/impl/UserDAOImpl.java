package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.User;
import service.UserDAO;

public class UserDAOImpl implements UserDAO{

	public boolean userLogin(User u){
		//ÊÂÎñ
		Transaction tx=null;
		String hql="";
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from User where username=? and pwd=?";
			Query query= session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPwd());
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
}
