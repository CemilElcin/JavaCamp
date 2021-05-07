package business.abstracts;


import dataAccess.abstracts.GoogleUserDao;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public interface UserService {
	
	void add(User user,UserDao userDao);
	void add(GoogleUserDao googleUserDao);
	void logIn(String eMail,String password);
	
	
}
