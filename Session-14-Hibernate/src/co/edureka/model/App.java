package co.edureka.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Employee emp1= new Employee(14,"bob",45500);
		Employee emp2= new Employee(13,"johnny",4500);
		
		System.out.println(emp1);
		System.out.println(emp2);
		

		Configuration config= null;
		SessionFactory factory=null;
		Session session=null;
		Transaction transaction=null;
		
		try {
			config= new Configuration();
			config.configure();  // read the xml file // Hibernate.cfg.xml
			
			factory=config.buildSessionFactory();
			//factory can cache data for multiple session objects
			
			session= factory.openSession(); //create connection to DB
			transaction=session.beginTransaction(); // start a transaction 
			
			//1.Inserting data in to DB
			//session.save(emp1);
			//session.save(emp2);
			
			//2.get a single record from DB
			Employee emp3=(Employee)session.get(Employee.class,2);
			Employee emp4=(Employee)session.get(Employee.class,3);
			System.out.println(emp3);
			System.out.println(emp4);
			
			System.out.println("..Re Reading........");
			
			Employee emp5=(Employee)session.get(Employee.class,2);
			Employee emp6=(Employee)session.get(Employee.class,3);
			System.out.println(emp5);
			System.out.println(emp6);
			
			
			//3. update a record in DB
			/*Employee emp3=(Employee)session.get(Employee.class,3);
					
			emp3.setSalary(20000);
			session.update(emp3); */
			
			//4.delete from DB
			/*Employee emp=new Employee();
			emp.setEid(4);
			session.delete(emp);*/
			
			//5.Retrieve all records from DB
			//Hibernate query language
			/*String hql="From Employee where name='bob'";
			List<Employee> emplist=session.createQuery(hql).list();
			for(Employee emp:emplist)
			{
				System.out.println(emp);
				
			}*/
			
			//Another way copied from HQL tutorials point
			/*String hql1 = "FROM Employee";
			Query query = session.createQuery(hql1);
			List results = query.list();
			System.out.println(results);*/
			
			//session.createSQLQuery(arg0);
			
			/*Criteria criteria=session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("name", "bob"));
			List<Employee> emplist1=criteria.list();
			for(Employee emp4:emplist)
			{
				System.out.println(emp4);
			}*/
			
		/*	for(int i=0;i<10;i++)
			{
				Employee emp=new Employee(null,"Employee"+i,3000+i);
				session.save(emp);
			}
			*/
			
			transaction.commit(); // Fire a transaction
			System.out.println("Transaction committed");
		} catch (Exception e) {
		
			System.out.println("Some exeption"+e);
		}
		finally{{
		
			if(session!=null){
				session.close(); // releasing the session
			}
		}
		}

	}

}
