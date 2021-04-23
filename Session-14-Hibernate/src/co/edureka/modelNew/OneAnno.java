package co.edureka.modelNew;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneAnno {

	public static void main(String[] args) {
		
		Address address=new Address();
		address.setAdrsline("wizard lane");
		address.setCity("london");
		address.setState("Brits");
		address.setZipcode(500203);
		
		User u=new User();
		u.setName("Ron");
		u.setEmail("Ron@Example.com");
		
		//Linked both ways
		u.setAddress(address);
		address.setUser(u);
		
		Configuration config= null;
		SessionFactory factory=null;
		Session session=null;
		Transaction transaction=null;
		
		try {
			
			config= new Configuration();
			config.configure();
			
			factory=config.buildSessionFactory();
			session=factory.openSession();
			transaction=session.beginTransaction();
			
			session.save(u); // saving user alone shall also save address linked to it!!
			
		} catch (Exception e) {
			System.out.println("Some exception"+e);
		}

	}

}

