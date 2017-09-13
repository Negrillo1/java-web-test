package action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ModelDriven;

import entity.User;
import service.UserDAO;
import service.impl.UserDAOImpl;

public class UserAction extends SuperAction implements ModelDriven<User>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user=new User();
	public	String login()
	{
		UserDAO udao=new UserDAOImpl();
		if(udao.userLogin(user))
		{
			session.setAttribute("loginUserName", user.getUsername());
			return "login_success";
		}
		else
		{
			return "login_failure";
		}
	}
	@SkipValidation
	//注销
	public String logout(){
		if(session.getAttribute("loginUserName")!=null)
		{
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	
	
	
	@Override
	public void validate() {
		// TODO 自动生成的方法存根
		if("".equals(user.getUsername().trim()))
		{
			this.addFieldError("usernameError", "用户名不能为空");
		}
		if(user.getPwd().length()<3)
		{
			this.addFieldError("passwordError", "密码长度不少于3");
		}
	}
	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
		return this.user;
	}

	

	
}
