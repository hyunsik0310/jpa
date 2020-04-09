import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hs.manage.entity.User_Info;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
		EntityManager em = emf.createEntityManager();
		
		User_Info result1 = em.find(User_Info.class, 1); 

		System.out.println(result1);

	}

}
