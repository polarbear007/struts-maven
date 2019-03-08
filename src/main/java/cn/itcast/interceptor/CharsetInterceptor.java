package cn.itcast.interceptor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CharsetInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = -2612527612679364884L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		// 先判断请求的类型，如果是get 请求，那么parameters 域里面的中文参数都已经乱码了
		String method = request.getMethod();
		if("get".equalsIgnoreCase(method)) {
			// 我们首先通过 request 对象获取 parameterMap 对象
			Map<String, String[]> parameters = request.getParameterMap();
			// 注意： servlet 获取的那个 map 集合是不可修改的，如果你试图修改，会报异常：
			// No modifications are allowed to a locked ParameterMap
			// 所以我们不能直接修改那个map 集合里面的数据
			// 以前我们是通过把 request对象替换成一个它的包装类，重写了  getParameter(String name) 方法
			// 现在我们是在struts 框架里面处理，反正我们以后也不用 servlet 的 getParameter() 方法
			// 而是使用struts 的ActionContext的方法去获取，我们又知道其实ActionContext 是通过ThreadLocal保存一份 servlet
			// 里面的 parameterMap 的复制品， 我们可以用另一个map 集合去替换这个复制品
			Map<String, Object> parameterMap = new HashMap<>();
			if(parameters != null || parameters.size() != 0) {
				Set<String> keySet = parameters.keySet();
				for (String key : keySet) {
					String[] values = (String[])parameters.get(key);
					String[] newValues = new String[values.length];
					for (int i = 0; i < values.length; i++) {
						newValues[i] = new String(values[i].getBytes("iso-8859-1"), "utf-8");
					}
					parameterMap.put(key, newValues);
				}
			}
			
			// ActionContext 里面直接提供  setparameters()  方法对参数集合进行修改
			ActionContext.getContext().setParameters(parameterMap);
		}
		return invocation.invoke();
	}

}
