package awtproject.service;

import awtproject.DAO.UserDao;
import awtproject.bean.User;

public class UserService {
	UserDao userDao =  new UserDao();
	public boolean checkUser(String username, String pass) {
		return userDao.fetchUserByUsernameAndPassword(username,pass);
	}
	public User getUser(String username) {
		return userDao.getUserByUsername(username);
		
	}
	public boolean editUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}
}


