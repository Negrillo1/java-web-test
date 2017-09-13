package action;

import java.util.List;

import entity.Student;
import service.StudentDAO;
import service.impl.StudentDAOImpl;

//ѧ��Action��
public class StudentAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//��ѯ����ѧ���Ķ���
	public String query()
	{
		StudentDAO sdao=new StudentDAOImpl();
		List<Student> list=sdao.queryAllStudent();
		//�Ž�session��
		if(list!=null&&list.size()>0)
		{
			session.setAttribute("student_list", list);
		}
		return "query_success";
	}
	//��ѧ�Ų�ѯѧ��
	
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
	//ɾ��ѧ���Ķ���
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
			System.out.println("snameΪ��");
		}
		return "delete_success";
		
	}
	//���ѧ��
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
	//�޸�ѧ��
	public String modify()
	{
		String sname=request.getParameter("Sno");
		StudentDAO sdao=new StudentDAOImpl();
		Student S=sdao.queryStudentByidI(sname);
		//���浽�Ự��
		session.setAttribute("modify_student", S);
		return "modify_success";
	}
	//�����޸ĺ��ѧ������
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
