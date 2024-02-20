package qlsv.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import qlsv.dao.UserDao;
import qlsv.entity.User;
import qlsv.view.*;

public class LoginController {
	private UserDao userDao;
	private LoginView loginView;
	private StudentView studentView;
	
	public LoginController(LoginView view)
	{
		this.loginView = view;
		this.userDao = new UserDao();
		view.addLoginListener(new LoginListener());
	}
	
	public void showLoginView()
	{
		loginView.setVisible(true);
	}
	
	//Chứa cài đặt cho sự kiện click button "Login"
	class LoginListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			User user = loginView.getUser();
			if (userDao.checkUser(user))
			{
				studentView = new StudentView();
				StudentController studentController = new StudentController(studentView);
				studentController.showStudentView();
				loginView.setVisible(false);
			} else
			{
				loginView.showMessage("Username hoặc password không đúng!");
			}
		}
		
	}
	
}
