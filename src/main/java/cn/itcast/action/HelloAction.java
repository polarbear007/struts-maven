package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.User;

public class HelloAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		System.out.println("HelloAction 被访问了.....");
		return SUCCESS;
	}

	public String login() {
		if(user != null && "eric".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
			System.out.println("用户名： " + user.getUsername());
			System.out.println("密    码： " + user.getPassword());
			return "login-success";
		}else {
			this.addActionError("用户名或者密码错误");
			return "login";
		}
		
	}
}
