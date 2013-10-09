package pl.soltys.linkvote.database;

import java.util.List;

import pl.soltys.linkvote.model.User;

public interface UserDao {
	 public List<User> getAllUsers();  
	 public User getUserByUserName(String userName);  
	 public void createUser(User user);  
}
