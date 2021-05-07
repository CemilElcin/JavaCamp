package business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.GoogleUserDao;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	
	
	
	private ArrayList<String> emailList=new ArrayList<String>();
	private ArrayList<String> passwordList=new ArrayList<String>();
	


	



	public static boolean eMailVerification() {
		
		return true;
	}
	
	
	@Override
	public void add(User user,UserDao userDao) {
		
		String ragex="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
	            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern=Pattern.compile(ragex);
		
		Matcher matcher=pattern.matcher(user.geteMail());
		
		if(matcher.matches()==false) {
			System.out.println("E-mail geçersiz.");
			return;
		}
		else if(user.getPassword().length()<=6) {
			System.out.println("parola en az 6 karakterden oluþmalý.");
			return;
		}
		else if(user.getName().length()<2||user.getSurname().length()<2) {
			System.out.println("isim veya soyisim en az 2 karakter olmalý.");
			return;
		}
		else if(eMailVerification()==false) {
			System.out.println("E-mail adresinizi doðrulayýn.");
			return;
		}
		else if(emailList.contains(user.geteMail())) {
			System.out.println("E-mail kullanýlmakta.");
			return;
		}
		else {
			userDao.add(user);
			emailList.add(user.geteMail());
			passwordList.add(user.getPassword());
			
		}
		
		
		
		
		
	}

	@Override
	public void logIn(String eMail, String password) {
		
		int indexOfUser=emailList.indexOf(eMail);
		if(passwordList.get(indexOfUser)==password) {
			System.out.println("giriþ baþarýlý.");
		}
		else {
			System.out.println("E-mail veya þifre hatalý.");
		}
		
		
	}


	@Override
	public void add(GoogleUserDao googleUserDao) {
		User user=new User("googleUser", "UserGoogle", "google@gmail.com", "google.com");
		googleUserDao.add(user);
		emailList.add(user.geteMail());
		passwordList.add(user.getPassword());
		
	}

}
