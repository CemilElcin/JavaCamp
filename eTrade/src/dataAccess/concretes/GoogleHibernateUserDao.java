package dataAccess.concretes;

import dataAccess.abstracts.GoogleUserDao;
import entities.concretes.User;

public class GoogleHibernateUserDao implements GoogleUserDao{

	@Override
	public void add(User user) {
		System.out.println("GoogleHibernateUserDao ile Kay�t tamamland�.");
		System.out.println("Ad:"+user.getName());
		System.out.println("Soyad:"+user.getSurname());
		System.out.println("E-mail:"+user.geteMail());
		
	}

}
