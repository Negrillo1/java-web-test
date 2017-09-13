package action;

import java.util.List;

import entity.Student;
import service.StudentDAO;
import service.impl.StudentDAOImpl;

//学生Action类
public class StudentAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//查询所有学生的动作
	public String query()
	{
		StudentDAO sdao=new StudentDAOImpl();
		List<Student> list=sdao.queryAllStudent();
		//放进session中
		if(list!=null&&list.size()>0)
		{
			session.setAttribute("student_list", list);
		}
		return "query_success";
	}
	//按学号查询学生
	
	public String querybyid()
	{
		String no=request.getParameter("Sno");
		StudentDAO sdao=new StudentDAOImpl();
		Student S=sdao.queryStudentByidI(no);
		session.setAttribute("query_student", S);
		if(S!=null)
		{
			return "querybyid_success";
		}
		else
		{
			return "querybyid_failure";
		}
	}
	//删除学生的动作
	public String delete()
	{
		StudentDAO sdao=new StudentDAOImpl();
		String sname=request.getParameter("Sno");
		if(sname!=null)
		{
			sdao.deleteStudent(sname);
		}
		if(sname==null)
		{
			System.out.println("sname为空");
		}
		return "delete_success";
		
	}
	//添加学生
	public String add() throws Exception
	{
		Student s=new Student();
		s.setSno(request.getParameter("Sno"));
		s.setSdep(request.getParameter("Sdep"));
		s.setSnav(request.getParameter("Snav"));
		s.setSsex(request.getParameter("Ssex"));
		s.setSphone(request.getParameter("Sphone"));
		s.setSemail(request.getParameter("Semail"));
		StudentDAO sdao=new StudentDAOImpl();
		sdao.addStudent(s);
		return "add_success";
		
	}
	//修改学生
	public String modify()
	{
		String sname=request.getParameter("Sno");
		StudentDAO sdao=new StudentDAOImpl();
		Student S=sdao.queryStudentByidI(sname);
		//保存到会话中
		session.setAttribute("modify_student", S);
		return "modify_success";
	}
	//保存修改后的学生资料
	public String save() throws Exception
	{
		Student s=new Student();
		s.setSname(request.getParameter("sname"));
		s.setSno(request.getParameter("sno"));
		s.setSdep(request.getParameter("sdep"));
		s.setSnav(request.getParameter("snav"));
		s.setSsex(request.getParameter("ssex"));
		s.setSphone(request.getParameter("sphone"));
		s.setSemail(request.getParameter("semail"));
		StudentDAO sdao=new StudentDAOImpl();
		sdao.updateStudent(s);
		return "save_success";
	}
}
