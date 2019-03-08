package cn.itcast.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ServletAction3 extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	private static final long serialVersionUID = 2917808792138822021L;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}
	
	public String execute() {
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
