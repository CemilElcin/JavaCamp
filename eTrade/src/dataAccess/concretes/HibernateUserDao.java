package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	
	
	@Override
	public void add(User user) {
		
		System.out.println("HibernateUserDao ile Kayýt tamamlandý.");
		System.out.println("Ad:"+user.getName());
		System.out.println("Soyad:"+user.getSurname());
		System.out.println("E-mail:"+user.geteMail());
		
	}

	
	

}
