package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected HttpSession session;
	protected ServletContext application;
	@Override
	public void setServletContext(ServletContext application) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO 自动生成的方法存根
		this.response=response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO 自动生成的方法存根
		this.request=request;
		this.session=this.request.getSession();
	}

	
	
}
