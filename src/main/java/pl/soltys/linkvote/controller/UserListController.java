package pl.soltys.linkvote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import pl.soltys.linkvote.database.UserDao;
import pl.soltys.linkvote.model.User;

@Controller
public class UserListController {

	private UserDao userDao;
		
	@Autowired
	public UserListController(UserDao userDao) {
		this.userDao = userDao;
	}


	@RequestMapping("/user/all")
	public ModelAndView showUserList() {
		List<User> userList = userDao.getAllUsers();

		ModelAndView mv = new ModelAndView("pages/userlist");
		mv.addObject("userList", userList);
		
		return mv;
	}
}
