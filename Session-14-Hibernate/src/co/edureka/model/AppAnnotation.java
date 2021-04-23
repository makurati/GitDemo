package co.edureka.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AppAnnotation {

	public static void main(String[] args) {
		
		Student s1=new Student(13,"Ron",19,"Magic school");
		System.out.println(s1);

		//save the objects permanently
		
		//AnnotationConfiguration config= null;
		Configuration config=null;
		SessionFactory factory=null;
		Session session=null;
		Transaction transaction=null;
		
		try {
			
			//config=new AnnotationConfiguration();
			config=new Configuration();
			config.configure();
			
			factory=config.buildSessionFactory();
			
			session=factory.openSession();
			
			transaction=session.beginTransaction();
			session.save(s1);
			
			transaction.commit();
			
			System.out.println("Transaction committed.....");
			
			
		} catch (Exception e) {
			System.out.println("some exception"+e);
		}
		finally{
			
			if(session!=null)
				session.close();
		}
		
	}

}
