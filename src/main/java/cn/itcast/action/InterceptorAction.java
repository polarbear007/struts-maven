package cn.itcast.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class InterceptorAction extends ActionSupport{
	private static final long serialVersionUID = 1331881437443310093L;
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() {
		Map<String, Object> parameters = ActionContext.getContext().getParameters();
		String[] param = (String[])parameters.get("name");
		System.out.println(param[0]);
		return NONE;
	}
	
}
