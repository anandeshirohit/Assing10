import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class InsertEmployee {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee e = new Employee();
		e.setEno(1265);
		e.setEname("rohit");
		e.setEdept("CSE");
		e.setEsalary(25000);
		s.save(e);
		s.flush();
		tx.commit();
		s.close();

	}
}
