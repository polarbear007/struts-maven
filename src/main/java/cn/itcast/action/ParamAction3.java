package cn.itcast.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ParamAction3 extends ActionSupport{
	private static final long serialVersionUID = 7794769124134090336L;
	
	private int num;
	private double num2;
	private Date date;
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void testAutoConvertor() {
		System.out.println("num :　" + num);
		System.out.println("num2 :　" + num2);
	}
	
	/**
	 * 注意，如果我们自定义了转换器类型的话，那么配置这个转换器的方式有3种：
	 * 1： 直接在 struts.xml 里面的对应的action 标签添加  converter (定义义转换器的全路径名)（只对这个action类有效）
	 * 2： 在src 目录下创建       action类名-conversion.properties(只对这个action 类有效)
	 * 3： 在src 目录下创建       xwork-conversion.properties(对全局的转换都有效)
	 */
	public void testDateConvertor() {
		System.out.println("Date: "  + date);
	}
}
