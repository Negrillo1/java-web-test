package service;

import java.util.List;

import entity.Student;

public interface StudentDAO {
	//查询所有学生资料
	public List<Student> queryAllStudent();
	//根据学号查询学生资料
	public Student queryStudentByidI(String Sno);
	//添加学生资料
	public boolean addStudent(Student s);
	//修改学生资料
	public boolean updateStudent(Student s);
	//删除学生资料
	public boolean deleteStudent(String Sno);
	//
	public boolean queryStudentByid(Student s);
}
