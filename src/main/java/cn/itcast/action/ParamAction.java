package cn.itcast.action;

import java.util.Arrays;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.Student;

public class ParamAction extends ActionSupport implements ModelDriven<Student>{
	private static final long serialVersionUID = 7156709789119816898L;
	
	private Student stu = new Student();
	
	@Override
	public Student getModel() {
		return stu;
	}
	
	private int luckyNum;
	
	public void setLuckyNum(int luckyNum) {
		this.luckyNum = luckyNum;
	}
	
	private int[] array;

	public void setArray(int[] array) {
		this.array = array;
	}
	
	public void testParam0() {
		System.out.println("luckyNum: " + luckyNum);
	}
	
	public void testParam1() {
		if(stu != null) {
			System.out.println("name : " + stu.getName());
			System.out.println("age  : " + stu.getAge());
		}else {
			System.out.println("modeldriven 封装失败！！");
		}
	}
	
	
	public void testArrayParam() {
		System.out.println(Arrays.toString(array));
	}
	
	

}
