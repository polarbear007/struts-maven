package cn.itcast.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	public String execute() {
		// 获取参数   parameters 域
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> parameters = actionContext.getParameters();
		String[] values = (String[])parameters.get("name");
		System.out.println(values[0]);
		
		// ActionContext.put()     /   ActionContext.get()  本身就是从request 域里面存取数据
		actionContext.put("requestScope", "requestScope-value");
		
		// 获取session 域
		Map<String, Object> session = actionContext.getSession();
		session.put("sessionScope", "sessionScope-value");
		
		// 获取 application 域
		Map<String, Object> application = actionContext.getApplication();
		application.put("applicationScope", "applicationScope-value");
		return "test-servlet";
	}
}
