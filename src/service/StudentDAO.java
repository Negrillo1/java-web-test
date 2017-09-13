package service;

import java.util.List;

import entity.Student;

public interface StudentDAO {
	//��ѯ����ѧ������
	public List<Student> queryAllStudent();
	//����ѧ�Ų�ѯѧ������
	public Student queryStudentByidI(String Sno);
	//���ѧ������
	public boolean addStudent(Student s);
	//�޸�ѧ������
	public boolean updateStudent(Student s);
	//ɾ��ѧ������
	public boolean deleteStudent(String Sno);
	//
	public boolean queryStudentByid(Student s);
}
