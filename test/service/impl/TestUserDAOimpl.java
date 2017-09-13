package service.impl;

import org.junit.Test;

import entity.User;
import junit.framework.Assert;
import service.UserDAO;

public class TestUserDAOimpl {

	@Test
	public void testUserLogin()
	{
		User u=new User(1,"linjingkai","123","","");
		UserDAO udao=new UserDAOImpl();
		Assert.assertEquals(true, udao.userLogin(u));
	}
}
