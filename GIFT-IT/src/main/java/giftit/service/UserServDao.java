package giftit.service;

import java.util.List;

import giftit.model.User;

public interface UserServDao {
	public void addUser(User u);
	public void updateUser(User u);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public int check(String em,String pwd);
}
