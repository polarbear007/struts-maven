package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestExceptionAction extends ActionSupport{
	private static final long serialVersionUID = -3553954854328259489L;
	
	private Integer num;

	public void setNum(Integer num) {
		this.num = num;
	}


	// 页面传进来一个 num 值，我们用 10 去除这个数
	// 当num = 0 的时候，就会出现除0异常，我们看一下struts 的 ExceptionMappingInterceptor 在异常发生的时候
	//  是如何处理的
	public String count() {
		System.out.println(10/num);
		if(num % 2 == 0) {
			throw new RuntimeException("自己抛的异常");
		}
		return "success";
	}
}
