package com.digital.dao;

import java.util.List;

import com.digital.model.User;

public interface UserDao {

	public List<User> getAllUsers();

	public User getUser(int id);

	public void updateUser(User user);

	public void deleteUser(User user);

}
