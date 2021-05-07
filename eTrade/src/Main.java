import business.concretes.UserManager;
import dataAccess.concretes.AbcUserDao;
import dataAccess.concretes.GoogleHibernateUserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user0=new User("cemil", "elçin", "cemilelcin1233@gmail.com", "cemilelcin");
		User user1=new User("ahmet","elçin", "f191213064@ktun.edu.tr", "ahmet123");
		
		UserManager userManager=new UserManager();
		
		userManager.add(user0,new HibernateUserDao());
		System.out.println("\n");
		userManager.add(new GoogleHibernateUserDao());
		System.out.println("\n");
		userManager.add(user1,new AbcUserDao());
		System.out.println("\n");
		userManager.logIn("cemilelcin1233@gmail.com", "cemilelcin");
		
		
		

	}

}
