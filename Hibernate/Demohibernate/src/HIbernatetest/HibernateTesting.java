package HIbernatetest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.itrainu.User.UserDTO;

public class HibernateTesting {
    public static void main(String[] args) {
        try {
            // Create SessionFactory
            SessionFactory sf = new Configuration().configure().buildSessionFactory();
            
            // Open Session
            Session session = sf.openSession();
            
            // Begin Transaction
            Transaction tx = session.beginTransaction();
            
            // Example entity creation to trigger table creation
            UserDTO user = new UserDTO();
            user.setId(4);
            user.setFirstName("krish");
            user.setLastName("Singh");
            user.setAddress("manali");
            user.setLoginId("krish123");
            user.setPassword("krish123");
            session.save(user);
            
            // Commit Transaction
            tx.commit();
            
            // Close Session
            session.close();
            
            // Close SessionFactory
            sf.close();
        } catch (Throwable ex) {
            ex.printStackTrace();
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
