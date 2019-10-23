package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entities.Admin;
import com.nt.entities.HardwareEmployee;
import com.nt.entities.SoftwareEmployee;

public class InheritanceClassTest {

	public static void main(String[] args) {
		SoftwareEmployee semp=new SoftwareEmployee();
		semp.setEmail("laxminarayana@gmail.com");
		semp.setId(1);
		semp.setName("Laxmi");
		semp.setSalary(35000);
		semp.setTool("Restful Webservice");
		
		HardwareEmployee hemp= new HardwareEmployee();
		hemp.setEmail("nagababu@gmail.com");
		hemp.setId(2);
		hemp.setName("Nagababu");
		hemp.setSalary(20000);
		hemp.setWorkingHours(10);
		
	    Admin admin=new Admin();
	    admin.setEmail("praveen@gmail.com");
	    admin.setId(3);
	    admin.setName("Praveen");
	    admin.setSalary(25000);
	    admin.setBranchName("MADHAPUR");
		
		
		Configuration configuration = new Configuration().configure("/com/nt/cfgs/hibernate.cfg.xml");
		
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session =factory.getCurrentSession();
		
		Transaction transaction =session.beginTransaction();
		 Integer no1=(Integer)session.save(semp);
		 Integer no2=(Integer)session.save(hemp);
		 Integer no3=(Integer)session.save(admin);
		 
	     session.getTransaction().commit();
	    
	}
	

}
