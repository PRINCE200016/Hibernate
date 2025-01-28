package HIbernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.itrainu.User.UserDTO;
import java.util.List;

public class Searchdata {
	public static void main(String[] args) {
		// Create SessionFactory
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		// Open Session
		Session session = sf.openSession();

		// Begin Transaction
		session.beginTransaction();

		// Fetch by First Name
		String firstName = "Ram";
		String hql = "FROM UserDTO WHERE firstName = :firstName";
		List<UserDTO> usersByName = session.createQuery(hql, UserDTO.class).setParameter("firstName", firstName)
				.getResultList();

		System.out.println("Fetched by Name:");
		for (UserDTO user : usersByName) {
			String userByNameDetails = String.join("\n", "ID: " + user.getId(),
					"Name: " + user.getFirstName() + " " + user.getLastName(), "Login ID: " + user.getLoginId());
			System.out.println(userByNameDetails);
			System.out.println();
		}

		// Commit Transaction
		session.getTransaction().commit();

		// Close Session
		session.close();

		// Close SessionFactory
		sf.close();
	}
}
