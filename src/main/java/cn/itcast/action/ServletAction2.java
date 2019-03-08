package cn.itcast.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ServletAction2 extends ActionSupport{
	private static final long serialVersionUID = 2917808792138822021L;
	
	public String execute() {
		// 直接获取 request 对象
		HttpServletRequest request = ServletActionContext.getRequest();
		
		// 跟servlet 一样，通过 request 获取参数
		String value = request.getParameter("name");
		System.out.println(value);
		
		// 把数据保存到 request 域
		request.setAttribute("requestScope", "requestScope-value"); 
		
		// 把数据保存到 session 域
		request.getSession().setAttribute("sessionScope", "sessionScope-value");
		// 把数据保存到 application 域
		request.getServletContext().setAttribute("applicationScope", "applicationScope-value");
		return "test-servlet";
	}
}
