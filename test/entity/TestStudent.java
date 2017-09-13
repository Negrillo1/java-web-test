package entity;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestStudent {
	//@Test
	//public void testSchemaExport(){
		//Configuration config=new Configuration().configure();
		
		//ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		
		//SessionFactory sessionFactory =config.buildSessionFactory(serviceRegistry);
		
		//Session session=sessionFactory.getCurrentSession();
		
		//SchemaExport export= new SchemaExport(config);
		
		//export.create(true, true);
	//}
	@Test
	public void testSaveStudent()
	{
		Configuration config=new Configuration().configure();
		
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		
		SessionFactory sessionFactory =config.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		Student s1=new Student("S0000001","张三","男","计算机学院","珠海","163.email","132222");
		Student s2=new Student("S0000002","张四","男","计算机学院","深圳","164.email","133222");
		Student s3=new Student("S0000003","张五","男","计算机学院","汕头","165.email","134222");
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		tx.commit();
		sessionFactory.close();
	}
}
