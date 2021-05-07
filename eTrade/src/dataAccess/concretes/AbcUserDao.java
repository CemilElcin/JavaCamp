package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class AbcUserDao implements UserDao{

	@Override
	public void add(User user) {
		

		System.out.println("AbcUserDao ile Kayýt tamamlandý.");
		System.out.println("Ad:"+user.getName());
		System.out.println("Soyad:"+user.getSurname());
		System.out.println("E-mail:"+user.geteMail());
		
	}

}
