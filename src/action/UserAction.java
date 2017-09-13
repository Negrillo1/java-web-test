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
	//ע��
	public String logout(){
		if(session.getAttribute("loginUserName")!=null)
		{
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	
	
	
	@Override
	public void validate() {
		// TODO �Զ����ɵķ������
		if("".equals(user.getUsername().trim()))
		{
			this.addFieldError("usernameError", "�û�������Ϊ��");
		}
		if(user.getPwd().length()<3)
		{
			this.addFieldError("passwordError", "���볤�Ȳ�����3");
		}
	}
	@Override
	public User getModel() {
		// TODO �Զ����ɵķ������
		return this.user;
	}

	

	
}
